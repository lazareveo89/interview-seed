import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.pack.AppConfig;

/**
 * Created by max on 7/14/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
