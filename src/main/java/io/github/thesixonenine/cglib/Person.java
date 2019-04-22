package io.github.thesixonenine.cglib;

import java.util.concurrent.TimeUnit;

/**
 * @author simple
 * @date 2018/3/21 19:08
 */
public class Person {

    public void sayHi() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hi!!");
    }

    public void sayBye() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye!!");
    }
}
