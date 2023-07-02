package weee;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String frozen = "frozen";
        String canned = "canned";
        System.out.println(Arrays.asList( frozen,canned ));

        // wk2
        String meat = "meat";
        String care = "care";
        String seasoning = "seasoning";
        System.out.println(Arrays.asList(meat,care,seasoning));
        // wk3
        String green = "green";
        String dried = "dried";
        String bakery = "bakery";

        System.out.println(Arrays.asList(green,dried,bakery));

        //wk4
        String fruits = "fruits";
        String beverages = "beverages";
        String instant = "instant";
        String tofuplantbased = "tofuplantbased";
        System.out.println( Arrays.asList( fruits, beverages, instant, tofuplantbased ) );

        //wk5
        String seafood = "seafood";
        String snack = "snack";
        String dairy = "dairy";
        String grocery = "grocery";
        System.out.println( Arrays.asList(seafood,snack,dairy,grocery) );

    }
}
