package swbrf.jvmpractice.oom;

/**
 * jdk：11.0.15
 * VM Args：-Xss180k
 *
 * @author ryan.wang
 */
public class JavaVmStackSof {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVmStackSof oom = new JavaVmStackSof();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }

}
