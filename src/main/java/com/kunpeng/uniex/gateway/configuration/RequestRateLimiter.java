package com.kunpeng.uniex.gateway.configuration;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * Project: uniex-gateway
 *
 * @author cua0702
 * @date 2018/12/9
 * Desc:
 */
@Configuration
public class RequestRateLimiter {

	/**
	 * IP限流
	 *
	 * @return
	 */
	@Bean
	public KeyResolver ipKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
	}

	/**
	 * 用户限流
	 *
	 * @return
	 */
	@Bean
	public KeyResolver ipKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
	}

	/**
	 * 接口限流
	 *
	 * @return
	 */
	@Bean
	public KeyResolver ipKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getPath().value());
	}
}
