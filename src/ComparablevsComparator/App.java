package ComparablevsComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
       ArrayList<Student> comparableStudentList=new ArrayList<>();
        comparableStudentList.add(new Student(1,"YAMINI",78,30));
        comparableStudentList.add(new Student(2,"CHAITANYA",80,40));
        comparableStudentList.add(new Student(3,"SONALI",76,70));
        comparableStudentList.add(new Student(4,"SANJANA",90,45));
        comparableStudentList.add(new Student(5,"SANJAYYADAV",100,200));
        //*** Comparable Example *************//
//        Collections.sort(comparableStudentList);
//        for(Student s : comparableStudentList)
//        {
//            System.out.print(s.name+" ");
//
//        }
        //*** Student Comparator based on PSP Example *************//
//        Collections.sort(comparableStudentList,new StudentComparator());
//        for(Student s : comparableStudentList)
//        {
//            System.out.print(s.name+" ");
//
//        }
        Collections.sort(comparableStudentList,new StudentNameComparator());
        for(Student s : comparableStudentList)
        {
            System.out.print(s.name+" ");

        }


    }
}
