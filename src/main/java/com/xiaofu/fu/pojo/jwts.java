package com.xiaofu.fu.pojo;

import java.util.Date;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Jwts;

public class jwts {

    // HS256 要求密钥 ≥ 256 位 = 32 字节11111111111111111111111111111111111111111111111111111111111111111111111111111
    private static final byte[] SECRET_BYTES =
            "xiaofu-2026-secret-key-must-32bytes!".getBytes();  // 正好 32 字节

    private static final SecretKey SECRET_KEY =
            new SecretKeySpec(SECRET_BYTES, "HmacSHA256");

    private static final long EXPIRATION = 60 * 60 * 1000; // 1 小时

    public static String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .claims(claims)                                     // ← 不是 addClaims
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION)) // ← 不是 setExpiration
                .signWith(SECRET_KEY)                               // ← 只传 Key
                .compact();
    }

    public static Map<String, Object> parseToken(String token) {
        return Jwts.parser()
                .verifyWith(SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}