package com.yf.leonadmin.config;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @ClassName CookieUtils
 * @Description TODO
 * @Author 杨非
 * @Date 2026年03月24日 22:12
 */
public class CookieUtils {
        private static final Logger logger = LoggerFactory.getLogger(CookieUtils.class);

        // 设置 Cookie（默认不编码，浏览器关闭失效）
        public static void setCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue) {
            setCookie(request, response, cookieName, cookieValue, -1);
        }

        // 设置 Cookie（可指定有效期，不编码）
        public static void setCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue, int cookieMaxAge) {
            boolean isEncode = false;
            doSetCookie(request, response, cookieName, cookieValue, cookieMaxAge, isEncode);
        }

        // 设置 Cookie（可指定有效期、是否编码）
        private static void doSetCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue, int cookieMaxAge, boolean isEncode) {
            try {
                if (cookieValue == null) cookieValue = "";
                if (isEncode) cookieValue = URLEncoder.encode(cookieValue, "UTF-8");

                Cookie cookie = new Cookie(cookieName, cookieValue);
                if (cookieMaxAge > 0) cookie.setMaxAge(cookieMaxAge);
                if (request != null) {
                    String domainName = getDomainName(request);
                    if (!"localhost".equals(domainName)) {
                        cookie.setDomain(domainName);
                    }
                }
                cookie.setPath("/");
                response.addCookie(cookie);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 获取 Cookie 值（可选是否解码）
        public static String getCookieValue(HttpServletRequest request, String cookieName, boolean isDecoder) {
            Cookie[] cookies = request.getCookies();
            if (cookies == null || cookieName == null) return null;

            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    try {
                        return isDecoder ? URLDecoder.decode(cookie.getValue(), "UTF-8") : cookie.getValue();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }

        // 删除 Cookie
        public static void deleteCookie(HttpServletRequest request, HttpServletResponse response, String cookieName) {
            doSetCookie(request, response, cookieName, null, -1, false);
        }

        // 辅助方法：从请求 URL 提取域名（简化版）
        private static String getDomainName(HttpServletRequest request) {
            String serverName = request.getServerName();
            return serverName.contains(".") ? serverName.substring(serverName.indexOf(".")) : serverName;
        }

}
