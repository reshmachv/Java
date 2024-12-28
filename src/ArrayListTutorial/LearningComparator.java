package ArrayListTutorial;

import java.util.*;

public class LearningComparator {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(4, 3, 1, 6,6));
        List<String> stringList = new ArrayList<>(Arrays.asList("apple","kiwi","banana"));
        intList.sort((a,b)->b-a);
        stringList.sort((s1,s2)->s1.length()-s2.length());
        System.out.println(intList);
        System.out.println(stringList);
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("Rohan",12));
        studentList.add(new Student("Raja",9));
        studentList.add(new Student("kishan",25));
        studentList.add(new Student("Zyan",10));
       // Collections.sort(studentList);
        studentList.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);
    }
}
