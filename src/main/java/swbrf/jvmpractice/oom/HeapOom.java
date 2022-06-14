package swbrf.jvmpractice.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * jdk：11.0.15
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author ryan.wang
 */
public class HeapOom {

    static class OomObject {

    }

    public static void main(String[] args) {
        List<OomObject> list = new ArrayList<>();

        while (true) {
            list.add(new OomObject());
        }
    }

}
