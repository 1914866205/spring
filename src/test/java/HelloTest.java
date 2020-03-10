import com.spring.hello.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        //读取beans.xml配置文件
        //得到上下文————bean工厂的容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) ac.getBean("hello");
        hello.sayHello();
        //控制反转的bean
    }
}
