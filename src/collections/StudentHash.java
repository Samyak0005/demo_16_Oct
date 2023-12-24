package collections;

import model.Student;

import java.util.HashSet;

public class StudentHash {

    public HashSet<Student> stdList(){

        HashSet<Student> list = new HashSet<>();
        Student student1 = new Student("Samyak",101,"CS");
        Student student4 = new Student("Samyak",101,"CS");
        Student student2 = new Student("Ritik", 102, "ME");
        Student student3 = new Student("Anuraj",103,"CE");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        return list;
    }

    public static void main(String[] args) {
        StudentHash studentHash = new StudentHash();
       HashSet<Student> result = studentHash.stdList();

       for (Student list: result){
           System.out.println(list.getName()+list.getRoll_no()+list.getSection());
       }
    }
}
