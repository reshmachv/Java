package HashMapTutorial;

import java.util.*;

public class HashCodeAndEqual {
    public static void main(String[] args){
        Pen p1=new Pen("red",200);
        Pen p2=new Pen("blue",30);
        Pen p3=new Pen("red",200);
        //System.out.println(p1.colour.equals(p3.colour));
/*        System.out.println(p1.equals(p3));
        Set<Pen>set=new HashSet<>();
        set.add(p1);
        set.add(p3);
        set.add(p2);
        System.out.println(set);*/

        HashMap<Integer,Pen>map=new HashMap<>();
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        map.put(4,p1);
        System.out.println(map);

    }
}
