package think.in.spring.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import think.in.spring.boot.foo.FooConfiguration;

@ConditionalOnWebApplication
@Configuration
@Import(FooConfiguration.class)
public class WebAutoConfiguration {
}
