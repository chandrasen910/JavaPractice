public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        MrgeSort ob = new MrgeSort();
        ob.sort(nums, 0, nums.length - 1);
        boolean answer = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]){
                answer = true;
                break;
            }
        }
        System.out.println(answer);
    }
    }
