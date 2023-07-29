//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

public class L217 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        AMrgeSort ob = new AMrgeSort();
        ob.sort(nums, 0, nums.length - 1);
        boolean answer = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                answer = true;
                break;
            }
        }
        System.out.println(answer);
    }
}
