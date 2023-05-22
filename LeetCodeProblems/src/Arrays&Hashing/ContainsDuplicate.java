public class ContainsDuplicate {
    public static void main(String args[]) {
        int[] nums = {1,2,3,1};
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            if (answer == true){
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    answer = true;
                    break;
                } else {
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}