package collections;

import java.util.ArrayList;

public class DemoArrayList {

    public ArrayList<Integer> M1(){

        ArrayList<Integer> demoList = new ArrayList<>();

        demoList.add(8);
        demoList.add(9);
        demoList.add(10);
        demoList.add(11);

        return demoList;
    }

    public static void main(String[] args) {
        DemoArrayList obj = new DemoArrayList();
        ArrayList<Integer> Demo = obj.M1();

        //Print as List
        System.out.println(Demo);

        //print as index value using loop and obj.get(i)
        System.out.println("Normal Loop");
        for (int i = 0; i<Demo.size(); i++){
            System.out.println(Demo.get(i));
        }

        System.out.println("Advance for loop");
        for (Integer list: Demo){
            System.out.println(list);
        }

    }
}
