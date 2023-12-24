package collections;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoHashMap {

    public HashMap<String, ArrayList<Student>> StudentList(){

        HashMap<String, ArrayList<Student>> kpiTlIST= new HashMap<>();

        ArrayList<Student> arrayList = new ArrayList<>();

        Student student1 = new Student("Samyak",101,"CS");
        Student student2 = new Student("Ritik", 102, "ME");
        Student student3 = new Student("Anuraj",103,"CE");

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);


        HashMap<String, ArrayList<Student>> jslIST= new HashMap<>();

        ArrayList<Student> arrayList1 = new ArrayList<>();

        Student student6 = new Student("rITZ",101,"CS");
        Student student4 = new Student("Ritik", 901, "ME");
        Student student5 = new Student("Anuraj",103,"pHYSICS WALA");

        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);
//
        kpiTlIST.put("LIST1",arrayList);
        kpiTlIST.put("List2",arrayList1);


        return kpiTlIST ;

    }

    public static void main(String[] args) {

        DemoHashMap demo = new DemoHashMap();
        HashMap<String, ArrayList<Student>> kpiTlIST = demo.StudentList();

        for (Student var : kpiTlIST.get("LIST1")){
            System.out.println(var.getName()+var.getSection()+var.getRoll_no());
        }

        for (Student var : kpiTlIST.get("List2")){
            System.out.println(var.getName()+var.getSection()+var.getRoll_no());
        }
    }
}
