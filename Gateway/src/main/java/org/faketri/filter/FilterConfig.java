package org.faketri.filter;


import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;


@Component
public class FilterConfig extends AbstractGatewayFilterFactory<FilterConfig.Config> {

    public FilterConfig() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            // Pre-processing
            if (!exchange.getRequest().getHeaders().containsKey("X-Request-Id")) {
                exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
                return exchange.getResponse().setComplete();
            }

            // Post-processing
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                exchange.getResponse().getHeaders().add("X-Response-Default-Foo", "Default-Bar");
            }));
        };
    }
    public static class Config {
        // Put the configuration properties for your filter here
    }
}
