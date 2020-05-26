package com.example.demo.entity;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * <p>微信公众号：程序员之路</p>
 * <p>博客：http://www.cnblogs.com/chengxuyuanzhilu</p>
 * @ClassName: CXYZL_RSA
 * @Description: 数组签名算法——RSA
 * @author 付成刚
 * @date 2016年2月17日 上午7:23:02
 */
public class CXYZL_RSA {
    //要签名和验证的签名内容
    private static String src = "chengxuyuanzhilu rsa";

    public static void main(String[] args) {
        jdkRSA();
    }

    public static void jdkRSA(){

        CXYZL_RSA cxyzl_RSA = new CXYZL_RSA();
        try {
            //1.初始化密钥，产生公钥私钥对
            Object[] keyPairArr = cxyzl_RSA.initSecretkey();
            RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPairArr[0];
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPairArr[1];

            //2.执行签名
            byte[] result = cxyzl_RSA.executeSignature(rsaPrivateKey);

            //3.验证签名
            boolean bool = cxyzl_RSA.verifySignature(rsaPublicKey,result);
            System.out.println("RSA-MD5withRSA数字签名算法运算结果："+bool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Title: initSecretkey
     * @Description: 初始化密钥,生成公钥私钥对
     * @return Object[] 0 公钥，1 私钥
     * @author 微信公众号：程序员之路
     * @throws NoSuchAlgorithmException
     * @date 2016年2月17日 上午7:31:06
     */
    private Object[] initSecretkey() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();

        Object[] keyPairArr = new Object[2];
        keyPairArr[0] = rsaPublicKey;
        keyPairArr[1] = rsaPrivateKey;

        return keyPairArr;
    }

    /**
     * @Title: executeSignature
     * @Description: 执行签名
     * @return byte[] 签名后的内容
     * @author 微信公众号：程序员之路
     * @throws InvalidKeyException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws SignatureException
     * @date 2016年2月17日 上午7:44:49
     */
    private byte[] executeSignature(RSAPrivateKey rsaPrivateKey) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, SignatureException{
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(privateKey);
        signature.update(src.getBytes());
        byte[] result = signature.sign();

        return result;
    }

    /**
     * @Title: verifySignature
     * @Description: 验证签名
     * @param rsaPublicKey 公钥
     * @param result 私钥执行签名的结果
     * @return boolean 验证结果
     * @author 微信公众号：程序员之路
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws SignatureException
     * @date 2016年2月17日 上午7:53:37
     */
    private boolean verifySignature(RSAPublicKey rsaPublicKey,byte[] result) throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException{
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(rsaPublicKey.getEncoded());
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(publicKey);
        signature.update(src.getBytes());
        boolean bool = signature.verify(result);

        return bool;
    }


}