package collections;

import model.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {

    public ArrayList<Student> StudentList(){


        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("Samyak",101,"CS");
        Student student2 = new Student("Ritik", 102, "ME");
        Student student3 = new Student("Anuraj",103,"CE");

        list.add(student1);
        list.add(student2);
        list.add(student3);

        return list;
    }

    public static void main(String[] args) {
        ArrayListStudent obj = new ArrayListStudent();
        ArrayList<Student> arrayList = obj.StudentList();
        for (Student list: arrayList){

            if (list.getName().equals("Samyak")) {

                list.setName("Raj");
            }
            System.out.println(list.getName()+list.getRoll_no()+list.getSection());
        }

//        Different way to Arraylist

        Iterator<Student> iterator = arrayList.iterator();
// iterator
        while(iterator.hasNext()){
           Student next =iterator.next();
            System.out.println(next.getName()+next.getRoll_no()+next.getSection());
        }

        //next-iterator
       iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName()+iterator.next().getSection()+iterator.next().getRoll_no());
        }

        //Foreach method
        arrayList.forEach(e -> {
            System.out.println(e.getName()+e.getRoll_no()+e.getSection());
            //other statements
        });



        }
    }

