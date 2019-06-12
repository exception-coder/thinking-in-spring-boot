# 总览Spring Boot

## 初览Spring Boot

## 理解独立的 Spring 应用 

```bash
$ cd /Users/zhangkai/exception-coder/thinking-in-spring-boot/
# 使用 maven archetype 插件创建 maven 工程
$ mvn archetype:generate -DgroupId=thinking-in-spring-boot -DartifactId=first-spring-boot-application -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false -Dpackage=thinking.in.spring.boot
$ cd first-spring-boot-application
$ tree
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── thinking
    │           └── in
    │               └── spring
    │                   └── boot
    │                       └── App.java
    └── test
        └── java
            └── thinking
                └── in
                    └── spring
                        └── boot
                            └── AppTest.java
# 对 pom.xml 文件进行编辑 
$ vim pom.xml
$ mvn dependency:tree -Dincludes=org.springframework*
# 编辑引导类
$ vim src/main/java/thinking/in/spring/boot/App.java 
$ mvn spring-boot:run

```



### 相关配置文件内容

- pom.xml

  - ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
      <modelVersion>4.0.0</modelVersion>
      
        <!-- 增加 Spring Boot Parent POM -->
         <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.1.5.RELEASE</version>
        </parent>
      
      <groupId>thinking-in-spring-boot</groupId>
      <artifactId>first-spring-boot-application</artifactId>
      <packaging>jar</packaging>
      <version>1.0.0-SNAPSHOT</version>
      <name>first-spring-boot-application</name>
      <url>http://maven.apache.org</url>
      <dependencies>
                <!--  增加 Spring Boot Web 依赖-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.1.5.RELEASE</version>
    </dependency>
          
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>3.8.1</version>
          <scope>test</scope>
        </dependency>
      </dependencies>
    </project>
    
    
    ```



- App.java

  ```java
  package thinking.in.spring.boot;
  
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RestController;
  
  /**
   * Hello world!
   *
   */
  @RestController
  @SpringBootApplication
  public class App 
  {
  
      @RequestMapping("/")
      public String index(){
          return  "Weclome,My Buddy!" ;
      }
  
      public static void main( String[] args )
      {
          System.out.println( "Hello World!" );
      }
  }
  
  ```

  // TODO

# 走向自动装配

## 走向注解驱动编程

### 注解驱动发展史

#### 注解驱动启蒙时代：Spring Framworl 1.x

分水岭：Spring Framework 1.2.0。

支持注解：@ManagedResource 、 @Transactional 等

配置方式：XML

#### 注解驱动过度时代：Spring Framework 2.x

分水岭：Spring Framework 2.5

支持注解：@Repository、@Aspect、@Autowired、@Qualifier、@Component、@Service、@Controller、@RequestMapping、@ModelAttribute

配置方式：注解+XML

#### 注解驱动黄金时代：Spring Framework 3.x

分水岭：Spring Framework 3.1

支持注解：@ImportResource、@Import、@Bean、@DependsOn、@Primary、@ComponentScan、@RequestHeader、@CookieValue、@RequestPart、@PathVariable、@ResponseBody、@ResponseStatus、@PropertySource、@Async、@Scheduled

#### 注解驱动完善时代：Spring Framework 4.x

支持注解：@Conditional（@Profile的重新声明）、@ConditionalOn*（@Conditional
"派生"注解）、@PropertySource（被@Repeatable提升为可重复标注的注解）、@ComponentScans（@ComponentScan的提升）、@EventListener（作为ApplicationListener接口编程的第二选择）

#### 注解驱动当下时代：Spring Framework 5.x

支持注解：@Indexed（pom.xml依赖 org.springframework:spring-context-indexer）

### Spring 核心注解场景分类

- Spring 模式注解

  | Spring 注解 | 场景说明         | 起始版本 |
  | ----------- | ---------------- | -------- |
  | @Repository | 数据仓储模式注解 | 2.0      |
  |             |                  |          |
  |             |                  |          |
  |             |                  |          |
  |             |                  |          |

  

- 装配注解
- 依赖注入注解
- Bean定义注解
- Spring条件装配注解
- 配置属性注解
- 生命周期回调注解
- 注解属性注解
- 性能注解

### Spring 注解编程模型

#### 元注解

#### Spring 模式注解

#### Spring 组合注解

#### Spring 注解属性别名和覆盖

## Spring 注解驱动设计模式

### Spring @Enable 模块驱动

### Spring Web 自动装配

### Spring 条件装配

## Spring Boot自动装配











