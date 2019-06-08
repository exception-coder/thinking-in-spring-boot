package think.in.spring.boot.firstappbygui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import think.in.spring.boot.config.WebConfiguration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


//@Configuration
//@ComponentScan
//@EnableAutoConfiguration

/**
 *
 * 5.1 理解@SpringBootApplication 注解语义
 * 被用于激活 @EnableAutoConfiguration(负责激活Spring Boot自动装配机制)、
 * @ComponentScan（激活 @Component 扫描）、
 * @Configuration（申明标注为配置类，等同于 @EnableConfiguration 和 @ComponentScan 注解）
 */
@SpringBootApplication(scanBasePackages = "think.in.spring.boot.config")
public class FirstAppByGuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppByGuiApplication.class, args);
	}



}
