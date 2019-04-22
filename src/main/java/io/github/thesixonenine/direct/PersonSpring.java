package io.github.thesixonenine.direct;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author simple
 * @date 2018/3/21 18:14
 */
@Service
public class PersonSpring implements Speakable {
    /**
     * sayHi
     */
    @Override
    public void sayHi() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hi!!");
    }

    /**
     * sayBye
     */
    @Override
    public void sayBye() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye!!");
    }
}
