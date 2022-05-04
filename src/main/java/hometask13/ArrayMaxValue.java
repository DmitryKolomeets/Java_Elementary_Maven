package hometask13;

public class ArrayMaxValue {

    public static int sortAscendingThenMax(int[] nums) {
        int maxValue;
        for (int i = 0; i < nums.length; i++) {

            int max = nums[i];
            int max_i = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    max_i = j;
                }
            }

            if (i != max_i) {
                int tmp = nums[i];
                nums[i] = nums[max_i];
                nums[max_i] = tmp;


            }


        }
        maxValue = (nums[0] - 1) * (nums[1] - 1);
        System.out.println(maxValue);

        return maxValue;

    }}



