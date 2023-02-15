package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTask {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 201));


     //   printInfo2(studentList);
      //  printInfo2(teacherList);

      //  System.out.println(getLastItem(studentList));
     //   System.out.println(getLastItem(teacherList));

     //   MyUtils<Student> obj1 = new MyUtils<>();
      //  obj1.printInfo2(studentList);
      //  System.out.println(obj1.getLastItem(studentList));


    }

    //Write a method that takes a list of students , prints each student and total student count.

    public static void printInfo(List<Student> students) {

        for (Student student : students) {

            System.out.println(student);
        }

        System.out.println(students.size());

    }

    //Write a method that takes a list , prints each item in its total item count.

    public static <T extends Person> void printInfo2(List<T> list) {

        for (T item : list) {

            System.out.println(item);
        }

        System.out.println(list.size());

           //Write a method that takes a list and returns the last item of the list.


    }

    public static <I> I getLastItem(List<I>list){
        return list.get(list.size() - 1);
    }



}
