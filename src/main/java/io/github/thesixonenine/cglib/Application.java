package io.github.thesixonenine.cglib;

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
        // cglib dynamic proxy
        System.out.println("******** cglib proxy ******** ");
        Person cglibProxy = PersonProxyFactory.newCglibProxy();
        cglibProxy.sayHi();
        cglibProxy.sayBye();
        System.exit(0);
        return null;
    }
}
