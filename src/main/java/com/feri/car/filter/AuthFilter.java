package com.feri.car.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: CarSys
 * @description: 实现用户是否登录校验处理 认证过滤器
 * @author: Feri
 * @create: 2019-12-16 11:52
 */
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
