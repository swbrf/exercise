package swbrf.jvmpractice.oom;

import java.util.HashSet;
import java.util.Set;

/**
 * jdk：11.0.15
 * VM Args：-Xms6m -Xmx6m
 *
 * @author ryan.wang
 */
public class RuntimeConstantPoolOom {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }

}
