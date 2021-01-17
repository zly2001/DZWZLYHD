package com.accp.alipay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000117600319";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKRicjeT7r35NtdEssmkgPZXuLFjnMXWfqOINk0M0pXy0bvj06grKv42iRLm5W5BGtTwzOOxWGwl9P3ZMe2kKUOU7WGuV3jL75NmtnivuQYVegcT/ybJ3Hc5nTAPfBeqK6VJFMWgFSgfVr9Gjadz4x62MRHpwFQWv7agrHZfN/uLAgMBAAECgYBycT9HRiw+AhSWBfPawjYuSqAAj3MDoPMFcr0rIzQwxJ4Tiuc9+t+xn9IKYMl12smNWh+qnTsL/9jyKZXC9jjq+y6qwzSEPot4ia7F/jFdVbZlHWNkgOIdUGITlYikx21b1UZ8TcfqNw7mvKyBVBKHIpNXmdhqijR5qE6pU4qvkQJBAPfcYXIH+YUq+yE/QNDwnENpIxkDYBbCURbaynHzKDNzVrkTz7P0UWteJZvfPF9xJWXTwGSd0U+NkeOngjO5IKcCQQCpyFRmGqVsliooZ8pOwZ2dH6dUF4oIoVi4ZH6B2Yn2nNFkdj2du4HLXK0govYAPFx2YYDNMGav0MBbKiIcO+Z9AkEAnUVIz4If4U+UaVQpXGpPvLZJfuWVYtuJeGb7bbJMH9lffbAEarrrrqTeWDkdpbG1eRcTTMSWu1Oo7jqrcwZUoQJAKAR+2B4ZtZFjWGi2R3/dPYaTcv+lWkllVvjg1IxIt2bY99vixAXJHvy2FcYzQ3T2ujRbHoH1AiWq4RH6PjtkJQJAO+xcjNiK2psWSUfoSlLTvFbfEPR6elbp5kghF4QSE4z40199G5vr8GrHrU6lQbfTFN2nRd9wadyRJQ9450KOXA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://127.0.0.1:8080/DZWWeb/zly/api/AlipayAction/insert";//alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

