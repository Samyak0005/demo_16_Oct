package exception;

import java.util.Locale;

public class RunTimeExcept {
    public static void main(String[] args) {


//        String name = null;
//        try {
//            System.out.println(name.length());
//        }catch (Exception e){
//            System.out.println(" Please Contact Administrator " +e);
//        }

        String str = "name";// it takes inter value then this not happen "123"
        try {
            int number = Integer.parseInt(str);
            System.out.println(number+str);
        }catch (Exception e){
            System.out.println(" Do no used "+e);
        }



    }
}
