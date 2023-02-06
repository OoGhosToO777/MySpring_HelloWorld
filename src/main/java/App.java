import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_2.getMessage());
        Cat bean_3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean_3.getSay());
        Cat bean_4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean_4.getSay());

        System.out.println("bean equals bean_2? Answer:" + bean.equals(bean_2));
        System.out.println("bean_3 equals bean_4? Answer:" + bean_3.equals(bean_4));
    }
}