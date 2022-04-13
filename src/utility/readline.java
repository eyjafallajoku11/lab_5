package utility;

import java.io.BufferedInputStream;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;

public class readline {
    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try {
            BufferedInputStream Buf_in = new BufferedInputStream(in);
            int in;
            char inChar;
            do {
                in = Buf_in.read();
                if (in != -1 && in != 10)  {
                    inChar = (char) in;
                    response.append(inChar);
                }
            } while ((in != -1) & (in != 10));
            return response.toString();
        } catch (IOException e) {
            out.println("Exception: " + e.getMessage());
            return null;
        }
    }

}
