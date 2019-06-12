package think.in.spring.boot.firstappbygui;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Role;


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
@SpringBootApplication(scanBasePackages ={"think.in.spring.boot.config","think.in.spring.boot.controller"})
public class FirstAppByGuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppByGuiApplication.class, args);
	}



	@Bean(name = "user")
    @Role(BeanDefinition.ROLE_APPLICATION)
	public User user(){
	    User user = new User();
	    user.setName("泡泡熊");
	    return user;
    }



	class User{
	    private String name;

	    private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
