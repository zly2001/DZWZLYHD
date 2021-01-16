package com.accp.action.zly;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.alipay.AlipayConfig;
import com.accp.biz.zly.CashiersBiz;
import com.accp.entity.Cashiers;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

@RestController
@RequestMapping("/zly/api/AlipayAction")
public class AlipayAction {

	@Resource
	private CashiersBiz biz;

	/**
	 * 新增收银记录
	 * @param session
	 * @param Cashiers
	 */
	public Integer insertSelective(HttpSession session, Cashiers Cashiers) {		
		return biz.insertSelective(Cashiers);
	}

	@RequestMapping("SXZFZLY")
	/**
	 * 张来遇知否宝沙箱支付
	 * 
	 * @return
	 */
	public void SXZFZLY(HttpSession session, HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, AlipayApiException {
		// 创建收银对象
		// 获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);

		// 设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

		// 商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"), "UTF-8");
		// 付款金额，必填
		String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"), "UTF-8");
		// 订单名称，必填
		String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"), "UTF-8");
		// 商品描述，可空
		String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"), "UTF-8");
		// 维修编号
		String inid = new String(request.getParameter("inid").getBytes("ISO-8859-1"), "UTF-8");

		// 收银对象
		Cashiers cashiers = new Cashiers();
		cashiers.setInid(inid);
		cashiers.setCasid(out_trade_no);
		cashiers.setCassprice(Float.parseFloat(total_amount));
		cashiers.setShisprice(Float.parseFloat(total_amount));
		cashiers.setPaymenttemp("支付宝");
		cashiers.setColumn1(subject);
		cashiers.setColumn2(body);		

		this.insertSelective(session, cashiers);

		alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

		// 若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
		// alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
		// + "\"total_amount\":\""+ total_amount +"\","
		// + "\"subject\":\""+ subject +"\","
		// + "\"body\":\""+ body +"\","
		// + "\"timeout_express\":\"10m\","
		// + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

		// 请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();

		// 输出
		// out.println(result);
	}
}
