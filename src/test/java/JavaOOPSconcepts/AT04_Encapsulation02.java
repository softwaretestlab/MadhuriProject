package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(10,20);
        int m = obj.envMethod02(20,30);
        System.out.println("returned value is : "+(m+20));
    }
}
