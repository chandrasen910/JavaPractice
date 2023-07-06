import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 3, 4, 5};
        Arrays.sort(arr);
        int[] arr1 = new int[arr.length];
        int temp =0;
        int temp1 = 0;
        for(int i = 0 ; i< arr.length-1; i++){

            if(arr[i] == arr[i+1]){
                temp++;
            }
            else{
                temp++;
                arr1[i] = temp;
                temp = 0;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        int temp2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[i]>arr[j]){
                    temp2 = arr[i];
                }
            }}
        System.out.println(arr[temp2]);
        int temp3 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[i]>=arr1[j] && arr[i]!=arr[temp2]){
                    temp3 = arr[i];
                }
            }
        }
        System.out.println(arr[temp3]);

    }
}
