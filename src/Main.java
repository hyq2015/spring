import com.atricky.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * 前两步可以交给spring来完成
         */
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("ricky");
//        helloWorld.hello();

        // 1.创建Spring 的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        // 3.调用helloWorld 的 hello方法
        helloWorld.hello();

    }
}
