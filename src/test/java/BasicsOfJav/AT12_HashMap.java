package BasicsOfJav;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class AT12_HashMap {

    @Test
    public void test16(){
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Jasper",1);
        map.put("Ricky",12);
        map.put("Bianca",8);
        System.out.println("Key values in hasmap are : "+map);
        //size of hasmap
        int mapsize= map.size();
        System.out.println("hasmap size is : "+mapsize);
        System.out.println("key value for "+" Bianca is "+map.get("Bianca"));
        if(map.containsKey("Ricky")){
            int keyval= map.get("Ricky");
            System.out.println(" Key value for "+" Ricky is "+keyval);
        }


    }
}
