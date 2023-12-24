package exception;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        int [] Marks = {30,50,80};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Marks.length==n){

            for (int i = 0; i<Marks.length; i++){
                System.out.println(Marks[i]);
            }
        }else {
            throw new ArrayIndexOutOfBoundsException("Kindly contact your administrator ");
        }


    }
}