package io.github.thesixonenine.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author simple
 * @date 2018/3/21 16:58
 */
@SpringBootApplication
public class Application {

    @Autowired
    private Speakable personSpring;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        System.out.println("******** spring aop ******** ");
        personSpring.sayHi();
        personSpring.sayBye();
        System.exit(0);
        return null;
    }

}