package think.in.spring.boot.foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 *
 * 5.7 自动装配
 */
@Configuration
public class FooConfiguration {

    @Bean
    public RouterFunction<ServerResponse> foo(){
        return route(GET("/foo"),request -> ok().body(Mono.just("Foo"),String.class));
    }


}
