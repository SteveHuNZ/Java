package stringArray;

import java.util.Random;

public class SteveUtil {
    public static String createVerifyCode (int n ){
        String code = " ";
        String data = "abcdefjhijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i <n ; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);

        }
        return code;
    };
}
