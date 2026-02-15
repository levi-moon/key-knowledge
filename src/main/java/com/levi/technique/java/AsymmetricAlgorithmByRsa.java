package com.levi.technique.java;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.AsymmetricAlgorithm;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import lombok.extern.slf4j.Slf4j;

import java.security.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: AsymmetricAlgorithmByRsa
 * @Description: 非对称加密算法-RSA
 * @Author: Levi
 * @Date: 2025/12/17 15:26
 */
@Slf4j
public class AsymmetricAlgorithmByRsa {

    public static void main(String[] args) {
//        AsymmetricAlgorithmByRsa.generateKeyPairByHutool();
        Map<String,String> map = AsymmetricAlgorithmByRsa.generateKeyPairByJava();
        String pub = map.get("PUB");
        String pri = map.get("PRI");
        log.info("公钥: {}", pub);
        log.info("私钥: {}", pri);

        // 公钥加密，私钥解密
//        String encryptByPublicStr = AsymmetricAlgorithmByRsa.encryptByPublic("我是中国人！", pub);
//        String decryptByPrivateStr = AsymmetricAlgorithmByRsa.decryptByPrivate(encryptByPublicStr,pri);
//        log.info("公钥加密后：{}", encryptByPublicStr);
//        log.info("私钥解密后：{}", decryptByPrivateStr);

        // 私钥加密，公钥解密
        String encryptByPrivateStr = AsymmetricAlgorithmByRsa.encryptByPrivate("我是中国人！", pri);
        String decryptByPublicStr = AsymmetricAlgorithmByRsa.decryptByPublic(encryptByPrivateStr, pub);
        log.info("私钥加密后：{}", encryptByPrivateStr);
        log.info("公钥解密后：{}", decryptByPublicStr);
    }

    /**
     * 生成密钥对-hutool
     * @return
     */
    public static Map<String,String> generateKeyPairByHutool() {
        KeyPair keyPair = SecureUtil.generateKeyPair("RSA");
        // 获取私钥和公钥
        String privateKey = new String(keyPair.getPrivate().getEncoded());
        String publicKey = new String(keyPair.getPublic().getEncoded());
        String privateKeyBase64 = Base64.encode(privateKey);
        String publicKeyBase64 = Base64.encode(publicKey);
        log.info("公钥: {}", publicKeyBase64);
        log.info("私钥: {}", privateKeyBase64);
        Map<String,String> map = new HashMap<>();
        map.put("PUB", publicKeyBase64);
        map.put("PRI", privateKeyBase64);
        return map;
    }

    /**
     * 生成密钥对-Java
     * @return
     */
    public static Map<String,String> generateKeyPairByJava(){
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
            String publicKeyBase64 = Base64.encode(publicKey.getEncoded());
            String privateKeyBase64 = Base64.encode(privateKey.getEncoded());

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
     * 公钥加密（解密就要用到对应的私钥）
     *
     * @param msg    明文信息
     * @param pubKey 公钥，用来加密明文
     * @return
     */
    public static String encryptByPublic(String msg, String pubKey) {
        RSA rsa = new RSA(AsymmetricAlgorithm.RSA_ECB_PKCS1.getValue(), null, pubKey);
        String encryptStr = rsa.encryptBase64(msg, KeyType.PublicKey);
        return encryptStr;
    }

    /**
     * 私钥解密
     *
     * @param encryptMsg 公钥加密的密文
     * @param priKey     私钥，用来解密密文
     * @return
     */
    public static String decryptByPrivate(String encryptMsg, String priKey) {
        RSA rsa = new RSA(AsymmetricAlgorithm.RSA_ECB_PKCS1.getValue(), priKey, null);
        String decryptStr = rsa.decryptStr(encryptMsg, KeyType.PrivateKey);
        return decryptStr;
    }

    /**
     * 私钥加密（解密就要用到对应的公钥）
     *
     * @param msg    明文信息
     * @param priKey 私钥，用来加密明文
     * @return
     */
    public static String encryptByPrivate(String msg, String priKey) {
        RSA rsa = new RSA(AsymmetricAlgorithm.RSA_ECB_PKCS1.getValue(), priKey, null);
        String encryptStr = rsa.encryptBase64(msg, KeyType.PrivateKey);
        return encryptStr;
    }


    /**
     * 公钥解密
     *
     * @param encryptMsg 密文
     * @param pubKey     公钥，用来解密
     * @return
     */
    public static String decryptByPublic(String encryptMsg, String pubKey) {
        RSA rsa = new RSA(AsymmetricAlgorithm.RSA_ECB_PKCS1.getValue(), null, pubKey);
        String decryptStr = rsa.decryptStr(encryptMsg, KeyType.PublicKey);
        return decryptStr;
    }

}
