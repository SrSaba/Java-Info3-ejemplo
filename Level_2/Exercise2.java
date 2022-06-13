package Level_2;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String [] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        System.out.println(nums.size());
        nums.add(0, 8);
        nums.add(9);
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
