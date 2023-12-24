package collections;

import java.util.HashSet;

public class DemoHashSet {

 public HashSet<Integer> list(){

     HashSet<Integer> stdID = new HashSet<>();
     stdID.add(101);
     stdID.add(102);
     stdID.add(103);
     stdID.add(101);
     stdID.add(102);
     stdID.add(103);


     return stdID;


 }

    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet<Integer> result = obj.list();

        // Hashset have not get method
        for (Integer list: result){
            System.out.println(list);
        }
    }
}
