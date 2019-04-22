package io.github.thesixonenine.direct;

/**
 * @author simple
 * @date 2018/3/21 18:18
 */
public class MonitorSession {

    private static ThreadLocal<MethodMonitor> monitorThreadLocal = new ThreadLocal<>();

    public static void begin(String method) {
        MethodMonitor logger = new MethodMonitor(method);
        monitorThreadLocal.set(logger);
    }

    public static void end() {
        MethodMonitor logger = monitorThreadLocal.get();
        logger.log();
    }

    public static void remove() {
        monitorThreadLocal.remove();
    }
}
