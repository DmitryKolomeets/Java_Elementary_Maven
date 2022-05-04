package hometask13;

import java.util.Arrays;

public class SquarSort {

    public static int[] squarAndSortNonDecreasing(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] * nums[i];


        for (int i = 0; i < nums.length; i++) {

            int min = nums[i];
            int min_i = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = nums[i];
                nums[i] = nums[min_i];
                nums[min_i] = tmp;


            }


        }
        return nums;
    }


    public static void main(String[] args) {
       int [] arr = {-7,-3,2,3,11};

       squarAndSortNonDecreasing(arr);
        System.out.println(Arrays.toString(arr));

    }
}