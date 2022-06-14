package swbrf.jvmpractice.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * jdk：1.8.0_162
 * VM Args：-Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * @author ryan.wang
 */
public class DirectMemoryOom {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }

}
