package io.github.thesixonenine.direct;

/**
 * @author simple
 * @date 2018/3/21 18:17
 */
public class MethodMonitor {

    private long start;

    private String method;

    public MethodMonitor(String method) {
        this.method = method;
        System.out.println("begin monitor..");
        this.start = System.currentTimeMillis();
    }

    public void log() {
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("end monitor..");
        System.out.println("Method: " + method + ", execution time: " + elapsedTime + " milliseconds.");
    }
}
