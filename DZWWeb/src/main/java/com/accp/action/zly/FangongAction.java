package com.accp.action.zly;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zly.FangongBiz;
import com.accp.entity.Fangong;
import com.accp.entity.Wugongtype;

@RestController
@RequestMapping("/zly/api/FangongAction")
public class FangongAction {

	@Resource
	private FangongBiz biz;
	
	@GetMapping("/selectByAllByFangong")
	/**
	 *  张来遇写的查询所有返工记录表
	 * @return
	 */
	public List<Fangong> selectByAllByFangong() {
		return biz.selectByAllByFangong();
	}
	
	public String ssss() {
		//获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
		
		//设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		
		//商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//付款金额，必填
		String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
		//订单名称，必填
		String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
		//商品描述，可空
		String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
		
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
				+ "\"total_amount\":\""+ total_amount +"\"," 
				+ "\"subject\":\""+ subject +"\"," 
				+ "\"body\":\""+ body +"\"," 
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		
		//若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
		//alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
		//		+ "\"total_amount\":\""+ total_amount +"\"," 
		//		+ "\"subject\":\""+ subject +"\"," 
		//		+ "\"body\":\""+ body +"\"," 
		//		+ "\"timeout_express\":\"10m\"," 
		//		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		//请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
		
		//请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		
		//输出
		out.println(result);
	}
	
	@GetMapping("/selectAllByWugongtype")
	/**
	 * 张来遇写的查询所有返工类型
	 * @return
	 */
	public List<Wugongtype> selectAllByWugongtype() {
		return biz.selectAllByWugongtype();
	}
	
	@GetMapping("{fid}")
	/**
	 * 根据返工记录号查询维修
	 * @param fid
	 * @return
	 */
	public Fangong selectByPrimaryKey(@PathVariable Integer fid) {
		return biz.selectByPrimaryKey(fid);
	}
	
	@PostMapping
	/**
	 * 新增返工记录
	 * @param Fangong
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Fangong Fangong) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Fangong) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;	
	}
	
	@PutMapping
	/**
	 * 修改返工记录
	 * @param Fangong
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Fangong Fangong) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Fangong) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	
	@DeleteMapping
	/**
	 * 删除返工记录
	 * @param fid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer fid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(fid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
