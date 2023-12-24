package exception;

import java.util.Scanner;

public class ValidateException {

    public String Validate() throws CustomException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age<18){

            throw new CustomException("You are not eligible for voting try next time");
        }
        else{
            System.out.println("you are eligible for voting");
        }

        return "program is working fine";
    }

    public static void main(String[] args) {
        ValidateException obj = new ValidateException();
        try {
            String validate = obj.Validate();
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }
}
