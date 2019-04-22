package io.github.thesixonenine.jdk;

import io.github.thesixonenine.direct.Speakable;

import java.util.concurrent.TimeUnit;

/**
 * @author simple
 * @date 2018/3/21 19:02
 */
public class PersonImpl implements Speakable {
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
