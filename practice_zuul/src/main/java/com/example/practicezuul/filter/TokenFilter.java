package com.example.practicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TokenFilter
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/20
 **/
@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext= RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        String token=request.getParameter("token");
        if(null==token||token.isEmpty()){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("token is empty");
        }
        return null;
    }
}
