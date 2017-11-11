package tabian.com.instagramclone.Utils;

/**
 * Created by cheungwilson on 11/11/2017.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" ", ".");
    }
}
