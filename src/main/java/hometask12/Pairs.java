package hometask12;

public class Pairs {


    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) result++;
            }
        }
        return result;
    }


}
