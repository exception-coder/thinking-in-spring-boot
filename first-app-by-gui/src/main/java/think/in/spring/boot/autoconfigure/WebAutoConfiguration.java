package think.in.spring.boot.autoconfigure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import think.in.spring.boot.foo.FooConfiguration;

@Configuration
@Import(FooConfiguration.class)
public class WebAutoConfiguration {
}
