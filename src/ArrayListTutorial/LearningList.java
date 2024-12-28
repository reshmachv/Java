package ArrayListTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearningList {
    public static void main(String[] args){
        List<String>list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        String[] arrays=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arrays));

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list1.add(6);
        System.out.println(list1);


    /*List<Integer> list = Arrays.asList(1,2,3,4,5);
    ArrayList<Integer>List=new ArrayList<>(list);
    System.out.println(list);
    List.addAll(list);
    System.out.println(List);
    List.remove(Integer.valueOf(2));
    System.out.println(List);*/
}

}
