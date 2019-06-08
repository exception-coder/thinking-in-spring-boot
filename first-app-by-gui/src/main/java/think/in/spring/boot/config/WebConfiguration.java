package think.in.spring.boot.config;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import think.in.spring.boot.foo.FooConfiguration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration

/**
 *
 * 5.4 @EnableAutoConfiguration 激活自动装配
 */
//@EnableAutoConfiguration
public class WebConfiguration {

    @Bean
    public RouterFunction<ServerResponse> helloworld(){
        return route(GET("/hello-world"),request -> ok().body(Mono.just("Hello,World"),String.class));
    }

    @Bean
    public RouterFunction<ServerResponse> hello(){
        return route(GET("/hello"),request -> ok().body(Mono.just("Hello"),String.class));
    }

    @Bean
    public ApplicationRunner runner(BeanFactory beanFactory){
        return  args -> {
            System.out.println("当前 helloworld Bean 实现为："+
                    beanFactory.getBean("helloworld").getClass().getName());
            System.out.println("当前 WebConfiguration Bean 实现为："+
                    beanFactory.getBean(WebConfiguration.class).getClass().getName());
            System.out.println("当前 FooConfiguration Bean 实现为："+
                    beanFactory.getBean(FooConfiguration.class).getClass().getName());
        };
    }

    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event){
        System.out.println("当前 WebServer 实现类为："+
                event.getWebServer().getClass().getName());
    }


}
