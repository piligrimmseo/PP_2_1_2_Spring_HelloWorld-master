import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBbean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloWorldBeanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("Переменные helloWorldbean и helloWorldbeanTwo ссылаются на один объект? " +
                (helloWorldBbean == helloWorldBeanTwo));

        Cat catOne = (Cat) applicationContext.getBean("cat");

        Cat catTwo = (Cat) applicationContext.getBean("cat");

        System.out.println("Переменные catOne и catTwo ссылаются на один объект? " +
                (catOne == catTwo));
    }


}