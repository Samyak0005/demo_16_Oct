package exception;

import java.util.Scanner;

public class DemoException {
    public void divide(int a, int b){

        //we used one try & multiple catch block used
        try {
            int div = a/b ;
            System.out.println(div);
        }catch (ArithmeticException e) {
            System.out.println("Please contact to Administrator" + e);
        }
        catch (Exception e){
            System.out.println("please handle exception" +e);
        }
        finally{
            System.out.println(" This is block of code always execution when exp occur" );
        }


    }

    public static void main(String[] args) {
        DemoException obj = new DemoException();
        obj.divide(4,0);

    }
}
