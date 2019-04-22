package io.github.thesixonenine.jdk;

import io.github.thesixonenine.direct.Speakable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author simple
 * @date 2018/3/21 19:06
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        // jdk dynamic proxy
        System.out.println("******** jdk dynamic proxy ******** ");
        Speakable jdkProxy = PersonProxyFactory.newJdkProxy();
        jdkProxy.sayHi();
        jdkProxy.sayBye();
        System.exit(0);
        return null;
    }
}
