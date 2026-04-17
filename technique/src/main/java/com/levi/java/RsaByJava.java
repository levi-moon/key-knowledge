package com.levi.java;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: RsaByJava
 * @Description: 用Java写RSA工具类
 * @Author: Levi
 * @Date: 2025/12/19 10:55
 */
@Slf4j
public class RsaByJava {

    private static final String RSA_ALGORITHM = "RSA";
    private static final String RSA_PADDING = "RSA/ECB/PKCS1Padding";
    private static PublicKey publicKey;
    private static PrivateKey privateKey;

    private static String publicKeyStr = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu2HpwKGkgdj+1/wLsnE2/QT5u0Y7+sQrpOHrs/zYnKvUbmR4X7URHcgNoZUfHnonZRE8wgBmHPhClZrbR4t3kTVwRMeRblpuTNYoY/S+PyC9J5ECGnOaXSgDAwL+7YfwV8nz3EBb3blPRtPlmlauG0IqO8ZbPuwkkgOoJbYm6TBaPMNdFu3lTfTM8f8i3GjeVBusBJog8aE5bnIAxiPrNOeyDmAvUxzJUUWcmgL2YrdKKg2ONUc6rmp/EREV32uNTuBfytSB0I9FLTvdUz+VjWu6dU5dSb86FQJBTr0EjX+JiXFiP99d6O654DlFv6A45VAarPRjnb/BSMWULividQIDAQAB";
    private static String privateKeyStr = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQC7YenAoaSB2P7X/AuycTb9BPm7Rjv6xCuk4euz/Nicq9RuZHhftREdyA2hlR8eeidlETzCAGYc+EKVmttHi3eRNXBEx5FuWm5M1ihj9L4/IL0nkQIac5pdKAMDAv7th/BXyfPcQFvduU9G0+WaVq4bQio7xls+7CSSA6gltibpMFo8w10W7eVN9Mzx/yLcaN5UG6wEmiDxoTlucgDGI+s057IOYC9THMlRRZyaAvZit0oqDY41Rzquan8RERXfa41O4F/K1IHQj0UtO91TP5WNa7p1Tl1JvzoVAkFOvQSNf4mJcWI/313o7rngOUW/oDjlUBqs9GOdv8FIxZQuK+J1AgMBAAECggEBAJgST4WA6aRjufcJW2jXDtxq5E3DIzxRZmYq34I0CoujvARXT4XEyf5UdBOVlSrD0iLoyVlcv4J1THxjr+AxZLkZGGMJX5Kim2+KQj9Uye0robdxrLZQ6Y7+wOr5zHBzaW+lu14dcTDRinAd2fHWtPf0S5g1U6oONWO2ygjI+m016BA7nZlUI/HpaPGKeigScmjBJILXL3oaHnLYZUdqKfOvK8usYg4O+AfEFSCQPiSjPG4eNHYsLMo5iWHtmIl9UbqR2etzllNYkUIzrCdeMwHUlIsfJ03J+HlG3xDn4yF8mulikXx7lyrFJ2OK36CnSKFKvsOhIciONURnzr6jIEUCgYEA3Xj0JHN+6MENqOrQPySdjCM2ae9QZMuBl10Ynh3NHqMIbhisLSOCvbQ4nCV4CPHc0lpUm9oUzntc6prR3CINhq1Dz/A5Oid/BGZM+fLAj9Q021FGgLqmRnRFJnQe34T72PQ/rMAihNE2ouHsMNk1obaMuuq2puLOe/bHag+NIysCgYEA2JhqRlFcKSd1Qs8KNt+BTR8pOWGGnthArYrpiRZN41n4kPFk/JORLdO3+OGGvc4bgPRuAdG6jgPc4IIhga6rH28tDoztuLpODnc7SpOigiFa1//Xd7Ba+5exaXbefMfxE91mSzuWTjhk+ERu3V4Y4BmXx9P+JeGMmno2LNKOwN8CgYEA04RUL4f6udK++Aei8dtHeHKc4lnD/y/5SZWJEGHH6C2uvG9l6QpUMFeyBTcnx+suidvpmJuUaYuaNxm7ujDvmCNcc3irPyY/gfUuKT01uWfjP18FJaadbQZYkJwwbCs22IKVWah6jzy8oJ2ClTitpw+QomfOH97Xc79BvsKxedcCgYEAgDVQCwmT3QRvQ7mcGTkZp5X/Z+jTr+jf+BnW/P+H4UDbgqhxF5UeBZtiNd8BTA7Zdu64wzjrDa85qmc9AC9tObEsYYWIHaWiGKv5G77iHdcyl9LoLv/kCzMSoBPtxLzxdcnDCFtgMDLviYmwejZ90QE1N+LDeJbXDIW01blZKM8CgYEAgBuTu2DbAAFRy8kBr/nEhNx3HPzIRYXZiOOaDxLJU94HEs2MX8X9Ck0STJyHsBllmcKmtEiku15JoXta4xL6WOQpjqfKhdxhD2dPiwonARW8U1x+4c5dxdFvlCu7Zo1MoneOFUwOQ7umBlAS0EFV6IewYgX1vvBPoBIouiu/7F0=";

    // 静态初始化块，从配置文件加载密钥
    static {
        try {
//            Map<String,String> map = generateKeyPair();
//            String publicKeyStr = map.get("PUB");
//            String privateKeyStr = map.get("PRI");
//            log.info("公钥: {}", publicKeyStr);
//            log.info("私钥: {}", privateKeyStr);

            publicKey = getPublicKey(publicKeyStr);
            privateKey = getPrivateKey(privateKeyStr);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load RSA keys from config file", e);
        }
    }

    public static void main(String[] args) throws Exception {
        String miwen = encrypt("admin@123");
        log.info("密文：{}", miwen);
        // IavagqoCRl5ntblg1fWw9sAwy1pxILHcWuuVcqewP9w0+sCH1cnwkSP/+GNFnZuwhzBLTHbmmFNIj/k+Ok/xibm9qroQ53m9axV8sE2F8J5+THnc/BwuW/V98RiHuvUEySQjOJ0EqBHeNVLXkV+859b/BpqSNwrw0rq1akYq+oCZPWuScQOG+jMtT8sgzuAdoqFOHT8E3IYhV24VELyu48kYp3fSwWZoNERVsy4baZI32EvNj9frX1bE+eMLdEgHnCgh7x9CDTf/a2AJieLARUgvHXjl11UZTTKGfCzkHDKEhcBwc7W8IPCYlMAUZ1uMp7XNsChIJnslZ/ZHMgxing==
        String mingwen = decrypt(miwen);
        log.info("明文：{}",mingwen);
    }

    /**
     * 生成密钥对-Java
     * @return
     */
    public static Map<String,String> generateKeyPair(){
        Map<String,String> map = new HashMap<>();
        try {
            // 1. 初始化RSA密钥生成器
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); // 设置密钥长度为2048位

            // 2. 生成密钥对
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            // 3. 将密钥转换为Base64编码字符串
            String publicKeyBase64 = cn.hutool.core.codec.Base64.encode(publicKey.getEncoded());
            String privateKeyBase64 = cn.hutool.core.codec.Base64.encode(privateKey.getEncoded());

            // 4. 输出密钥
//            log.info("公钥: {}", publicKeyBase64);
//            log.info("私钥: {}", privateKeyBase64);
            map.put("PUB", publicKeyBase64);
            map.put("PRI", privateKeyBase64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 从字符串获取公钥对象
     *
     * @param publicKeyStr Base64编码的公钥字符串
     * @return PublicKey对象
     * @throws Exception 解码异常
     */
    public static PublicKey getPublicKey(String publicKeyStr) throws Exception {
        byte[] keyBytes = Base64.getDecoder().decode(publicKeyStr);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        return keyFactory.generatePublic(spec);
    }

    /**
     * 从字符串获取私钥对象
     *
     * @param privateKeyStr Base64编码的私钥字符串
     * @return PrivateKey对象
     * @throws Exception 解码异常
     */
    public static PrivateKey getPrivateKey(String privateKeyStr) throws Exception {
        byte[] keyBytes = Base64.getDecoder().decode(privateKeyStr);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        return keyFactory.generatePrivate(spec);
    }

    /**
     * 使用公钥加密数据
     *
     * @param data 待加密的原始数据
     * @return 加密后的Base64字符串
     * @throws Exception 加密异常
     */
    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_PADDING);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    /**
     * 使用私钥解密数据
     *
     * @param encryptedData 加密后的Base64字符串
     * @return 解密后的原始数据
     * @throws Exception 解密异常
     */
    public static String decrypt(String encryptedData) throws Exception {
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        Cipher cipher = Cipher.getInstance(RSA_PADDING);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedData = cipher.doFinal(decodedData);
        return new String(decryptedData, "UTF-8");
    }

    /**
     * 获取当前加载的公钥
     *
     * @return PublicKey对象
     */
    public static PublicKey getCurrentPublicKey() {
        return publicKey;
    }

    /**
     * 获取当前加载的私钥
     *
     * @return PrivateKey对象
     */
    public static PrivateKey getCurrentPrivateKey() {
        return privateKey;
    }

}
