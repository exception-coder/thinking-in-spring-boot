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
