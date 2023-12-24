package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoCollections {

    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(101);
        obj.add(102);
        obj.add(103);
        obj.add(103);

        System.out.println("Print by index number");
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));

        System.out.println("print using for-each loop");

        for (Integer num: obj){
            System.out.println(num);
        }

        System.out.println("print using loop");
        for (int i = 0; i<obj.size(); i++){
            System.out.println(obj.get(i));
        }

        ArrayList<Object> Anything = new ArrayList<>();
        Anything.add("Samyak");
        Anything.add(1,"Rohan");
        Anything.add(123);

        System.out.println(Anything);

        ArrayList Anything1 = new ArrayList<>();
        Anything1.add("Samyak");
        Anything1.add(1,"Rohan");
        Anything1.add(123);

        System.out.println(Anything);

        HashSet<Integer> stdID = new HashSet<>();
        stdID.add(101);
        stdID.add(102);
        stdID.add(103);
        stdID.add(101);
        stdID.add(102);
        stdID.add(103);

        System.out.println(stdID);
    }
}
