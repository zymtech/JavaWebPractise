package org.smart4j.framework.proxy;

/**
 * Created by Administrator on 10/27/2016.
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
