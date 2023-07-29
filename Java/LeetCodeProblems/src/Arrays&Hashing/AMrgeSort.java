
public class AMrgeSort {
    void merge(int[] nums, int start, int mid, int end) {
        int sizearr1 = mid - start + 1;
        int sizearr2 = end - mid;
        int[] firstarr = new int[sizearr1];
        int[] secondarr = new int[sizearr2];

        for (int i = 0; i < sizearr1; i++) {
            firstarr[i] = nums[start + i];
        }
        for (int i = 0; i < sizearr2; i++) {
            secondarr[i] = nums[mid + 1 + i];
        }
        int i = 0, j = 0;
        while (i < sizearr1 && j < sizearr2) {
            if (firstarr[i] <= secondarr[j]) {
                nums[start] = firstarr[i];
                i++;
            } else {
                nums[start] = secondarr[j];
                j++;
            }
            start++;
        }

        while (i < sizearr1) {
            nums[start] = firstarr[i];
            i++;
            start++;
        }

        while (j < sizearr2) {
            nums[start] = secondarr[j];
            j++;
            start++;
        }

    }

    void sort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(nums, start, mid);
            sort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }

    }

    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {
        int[] nums = new int[100];
        int j = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            nums[j] = i;
            j++;
        }
        AMrgeSort ob = new AMrgeSort();
        ob.sort(nums, 0, nums.length - 1);
        AMrgeSort.printArray(nums);
    }
}
