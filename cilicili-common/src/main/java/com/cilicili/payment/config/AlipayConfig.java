package com.cilicili.payment.config;

public class AlipayConfig {
	//以下为支付宝接口配置
	public static String app_id = "2016092900623014";
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC2cVd76w4fetxpww7Lc5pRp5joWWDD5jbJMKcj3g8h63qRs0xfsc+4Xrg0ognHHFkkyWYBcGMkM/hvkD0WwttraNRboVZQ2fpYN6hN+VI/Q0eFmUx/vZjvTwsCFEUbi2l5EUy52g+wX7xZR1EbiGHDI6LHj8DgPGOJIl2WhgnBwcumWVY3Ss3kl5MGIzX7iuvApKzBXDTZdc8LthR69sUyuJLXStLjLRVwF4oaFD7add/jS+553KETQCyZo7+c2MsDducOavKKfSdB52rEperi6kKOqfm1fGHNvah6fd4raKuPN4a9IhSEkHQ4FwK9CQZWrga4MsVTstlUTswK6Z0dAgMBAAECggEASUGLejNw0U0Y8dKjvyelAEKGkE1LIH3w46oIgstoUhtmdNiEwyv3lzVZS7EAshV86duAfPVuqZvAlrNZBCmrxx4pnr1SllZgQkne56hD0Sknr8pVQDmWDgk0B1qyQRQifr1mjH21rQFT9JlBRQfnEV7evrjHHoLBCNBmuckKY+TJvSEfSFRx4r62O5GXNwzBwk7BjCnM63crpiH0l5vQNFG/mlUKHt3gzHnXtq1yN/g6y3tTkJUumr1ocaor3c9bVjY8kn3wRe0r3MakgXRImtaY7sOA4JSEAboU+yZgefkF/ibaetjMrasYvCSfRsVzQ60LsO97+8WTHDQQhcodgQKBgQDrTOexUeDJHCfwq/QK3nDyqCNqd9A4qBXbPUcQLIGAAfJ8k/HzpeUQ6j+Ka/cnx9gGbeTrRCFcn3ztAWuAcS3IlrU47Qmy5tJtUzAa42PS+OSqRNWx14imsDIolRZeT4Lee5EORd7kweDDhZd13UuN6f8bJtVhsCFpLbFOQL2kvQKBgQDGfg2GuWzqZeH2FzdmkReXac8Yrh/OQ1UVsmGQtZzqNdK+hdfwRkeuMMX4avKtAEi9KWxaWNplZxYrq5yoMoi0wiLeMNfHx0ImMvv7NrGvoqmxpYOeAp07IK0zhFxxJ/fRdmdWaPgHyEq+2/xmK8dzh60gaX8eNKQFMMAY+hPP4QKBgQC9kQzMp7lgbMWkuPP42bLHXDyEJxjivFA3fAvHdQOz3F2+jfaMo+eDFCWy4D6TlwZsT5bxD8eM9pTP4Kf6J7SJ+RjxTs7Uie+X0kBcOTwQGSMoJiK/j3RxTlxqo4oM2yQFGCoKBLKJO8VX4EXg2DNpls5G0qdwd1TDhuNktvXSRQKBgBExqCBMfafMTYeQuUbUOLPwAXWE19J5OKyZeCQd50rOgMPqOithGyJ2rR94vC7KQILKTM2CtuBjzqLXyck0H21xB64xku+GTi+a6QL42Ol68LInwT/1wAL4MKiuxYczzB7D3+23SAz8h6UCz1lWX3+deBy/prhKHQ8qCune98phAoGADkVq7HN9M54C9JsbxRrMCnvZUYRNUs0JlltvT/oSClvcKunILlsi3jLpaNk0gxpUy82kV6AVd0RfPSTYWkgfz1ZEFN/0ALT3yejJYEvt+OTz7HzJp6CReir4+PK9j0VVu595AJz3vOgCYzIrNwA2PHHpHS7LKtoX+z7MvXOAqZk=";
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkfIsT0ywlmgakMd+Mka8bCnOi4XWsFiknijpJZ7M6XxcMEuwqzKD2uw5OEUvcYGaSyRekwNTU3B8/dRXu57kODfl9B7AGs70GaQ75C270vwp7TqFMNvLkVW3e/AZOubzZbPM9zAgM/wxVnxDha1YlA8DrI87qrCN13nemCcck0M0ZqM7cGDVyjpqCvtcLBhRlM2MlDrVU7U7YYjq8G22Tb9Ap46J8W8qF/X/03ZYM2ViMn+DVCyqJ1IB31Hmw7LFsyGTebrugca48ejf3IxC2Y2E59tCKVj9gPoFZQNRueFEidTs3DMgBqmvYD+UPgDTlYLepk6FvkxcnkippaZfVQIDAQAB";
	public static String notify_url = "";
	public static String return_url = "http://127.0.0.1/PaymentToAlipay/AlipayReturn";
	public static String sign_type = "RSA2";
	public static String charset = "utf-8";
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
