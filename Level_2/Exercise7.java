package Level_2;

import java.util.*;

public class Exercise7 {
    public static void main(String [] args){
        fizzBuzzFuncion(1, 8);
    }


    public static void fizzBuzzFuncion(int n1, int n2){
        List<String> fizzBuzz = new ArrayList<>();
        String j = "";
        for (int i = n1; i < n2; i++) {
            if (((i % 2) == 0) && ((i % 3) == 0)) 
                fizzBuzz.add("fizzbuzz");
            else if ((i % 2) == 0) 
                fizzBuzz.add("fizz");
            else if ((i % 3) == 0) 
                fizzBuzz.add("buzz");
            else{
                j = String.valueOf(i);
                fizzBuzz.add(j);}
        }
        System.out.println(fizzBuzz);
    }
}

