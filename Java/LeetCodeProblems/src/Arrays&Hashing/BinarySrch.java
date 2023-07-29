
public class BinarySrch {
    static int binarysrch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[start] == target) {
                return start;
            } else if (nums[end] == target) {
                System.out.println(start);
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

    /*
     * public static void main(String[] args) {
     * int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
     * int target = 8;
     * int index = binarysrch(nums, target);
     * System.out.println(index);
     * 
     * }
     */
}
