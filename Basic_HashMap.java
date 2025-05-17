import java.util.*;
class Main{
    public static void main(String []k){
        
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        
        System.out.println("Value for key 1 :- " + map.get(1));
        System.out.println("Value for key 2 :- " + map.get(2));
        
        int keyFind = 5;
        if(map.containsKey(keyFind)){
            System.out.println("Key " + keyFind + " found With value : " + map.get(keyFind));
            
        }else{
            System.out.println("Key" + keyFind + " Not found ");
        }
        
        
        System.out.println("Map Contents :- ");
        
        for(int key : map.keySet()){
            System.out.println("Key " + key + " Value " + map.get(key));
        }
        
        map.remove(3);
        
        System.out.println("Size of map " + map.size());
        
        map.clear();
        
        System.out.println("Size after clearing map " + map.size());
        
    }
}




