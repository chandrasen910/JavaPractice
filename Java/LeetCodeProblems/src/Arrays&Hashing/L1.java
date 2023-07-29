//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

public class L1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = BinarySrch.binarysrch(nums, target - i);
            if (index != 0 && index != -1) {
                System.out.println(index);
                break;
            }
        }
    }

    static int binarysrch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[start] == target) {
                return start;
            } else if (nums[end] == target) {
                return end;
            } else {
                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }
}
