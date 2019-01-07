package Item9_try_with_resaource;

import java.io.*;
import java.math.BigInteger;

public class Ex {

    private static final int BUFFER_SIZE = 16;
    BigInteger t = null;

    //try-with-resources on multiple resources
    static void copy(String src, String dst) throws IOException {
        try(InputStream in   = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[BUFFER_SIZE];

            int n;

            while ((n = in.read(buf)) >= 0){
                out.write(buf, 0, n);
            }
        }
    }
}
