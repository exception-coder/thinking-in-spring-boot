### 理解独立的 Spring 应用 

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

  

  ### 理解自动装配

  

  

