import utility.command_info;
import utility.command_manager;
import java.io.BufferedInputStream;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static String[] readLine() {
        StringBuilder response = new StringBuilder();
        String[] str_out = new String[2];
        try {
            BufferedInputStream Buf_in = new BufferedInputStream(in);
            int in;
            char inChar;
            short t = 0;
            do {
                in = Buf_in.read();
                if (in != -1) {
                    if (in==32 || in==10){
                        str_out[t]=response.toString();
                        t++;
                        response = new StringBuilder();
                    }
                    else {
                        inChar = (char) in;
                        response.append(inChar);
                    }
                }
            } while ((in != -1) & (in != 10) & (t!=2));
            return str_out;
        } catch (IOException e) {
            out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] arguments) {
        command_info.initialise();
        while(true) {
           String[] input = readLine();
           command_manager.execute(input);

       }
    }
}