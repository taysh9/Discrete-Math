package sets;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetOper {

    @SuppressWarnings("unused")
    private static HashSet<Integer> set;
    @SuppressWarnings("unused")
    private static HashSet<Integer> set2;


    public SetOper() {

        Integer arr[] = { 1, 2, 3, 4, 5 };
        set = new HashSet<>(Arrays.asList(arr));
        Integer arr2[] = { 1, 2, 3, 4 };
        set2 = new HashSet<>(Arrays.asList(arr2));
        System.out.println("SET 1 " + set);
        System.out.println("SET 2 " + set2);
        

    }


    public void union() {
        HashSet<Integer> toReturn = new HashSet<>();
        for (int i : set) {
            toReturn.add(i);
        }
        for (int x : set2) {
            toReturn.add(x);
        }
        System.out.println(toReturn);

    }


    public void intersection() {
        HashSet<Integer> toReturn = new HashSet<>();
        for (int i : set) {
            if (set2.contains(i)) {
                toReturn.add(i);
            }
        }
        System.out.println(toReturn);

    }


    public void set1subtractset2() {
        HashSet<Integer> toReturn = new HashSet<>();
        for(int i : set)
        {
            if(!set2.contains(i))
            {
                toReturn.add(i);
            }
        }
        System.out.println(toReturn);

    }
    
    
    public void set2subtractset1() {
        HashSet<Integer> toReturn = new HashSet<>();
        for(int i : set2)
        {
            if(!set.contains(i))
            {
                toReturn.add(i);
            }
        }
        System.out.println(toReturn);

    }
    
    public void isSubSet(HashSet<Integer> set, HashSet<Integer> set2)
    {
        String result = "true";
        for(int i: set)
        {
            if(!set2.contains(i))
            {
                result = "false";
            }
        }
        
        System.out.println(result) ;
        
    }

    
    public void cartesian(HashSet<Integer> set , HashSet<Integer> set2)
    {    
      
        
    }

    public static void main(String[] args) {
        SetOper op = new SetOper();
        op.union();
        op.intersection();
        op.set1subtractset2();
        op.set2subtractset1();
        op.isSubSet(set2, set);
        
    }
}
