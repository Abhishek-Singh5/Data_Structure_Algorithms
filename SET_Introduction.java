import java.util.*;

class Main{
    public static void main(String []k){
        Set<Integer> set = new HashSet<>();
        // set store only unique value ignore duplicate value
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        
        
        set.remove(1); // delete the element
        
       System.out.println(set);
        
        for(int num : set){
            System.out.println(num + " ");
        }
        
        
        System.out.println(set.contains(3));
        System.out.println(set.contains(10));
    }
}




OUTPUT :- 
            [2, 3]
            2 
            3 
            true
            false











import java.util.*;

class Main{
    public static void main(String []k){
        Set<Integer> set = new TreeSet<>();
        // set store only unique value ignore duplicate value
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        
        
        set.remove(1); // delete the element
        
       System.out.println(set);
        
        for(int num : set){
            System.out.println(num + " ");
        }
        
        
        System.out.println(set.contains(3));
        System.out.println(set.contains(10));
    }
}


OUTPUT :- 
            [2, 3]
            2 
            3 
            true
            false
