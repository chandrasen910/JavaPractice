import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    static boolean isSameAnagram(String a, String b) {
        if (b.length() == a.length()) {
            HashMap<Character, Integer> hash1 = new HashMap<>();
            HashMap<Character, Integer> hash2 = new HashMap<>();
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            for (int i = 0; i < arr1.length; i++) {
                if (hash1.get(arr1[i]) == null) {
                    hash1.put(arr1[i], 1);
                } else {
                    int count = hash1.get(arr1[i]);
                    hash1.put(arr1[i], ++count);
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                if (hash2.get(arr2[i]) == null) {
                    hash2.put(arr2[i], 1);
                } else {
                    int count = hash2.get(arr1[i]);
                    hash2.put(arr1[i], ++count);
                }
            }
            return  hash1.equals(hash2);
        }
        return false;
    }
        public static void main (String[]args){
            String[] strs = {"","b"};
            List<List<String>> listoflists = new ArrayList<>();

            int[] lengths = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                lengths[i] = strs[i].length();
            }
            for (int j = 0; j < strs.length; j++) {
                List<String> innerList = new ArrayList<>();
                String a = strs[j];
                if (listoflists.size() == 0){
                    innerList.add(a);
                    for (int k = j + 1; k < strs.length; k++) {
                        String b = strs[k];
                        if (isSameAnagram(a, b)) {
                            innerList.add(b);
                        }
                    }
                    listoflists.add(innerList);
                }
                else {
                    int temp =0;
                    for (int i = 0; i < listoflists.size(); i++) {
                        List<String> arr1= listoflists.get(i);
                        if (!arr1.isEmpty() && arr1.get(0) !=""){
                                if (isSameAnagram(a,arr1.get(1))){
                                    temp = 1;
                                    break;
                                }
                        }
                    }
                    if (temp == 0){
                        innerList.add(a);
                        for (int k = j + 1; k < strs.length; k++) {
                            String b = strs[k];
                            if (isSameAnagram(a, b)) {
                                innerList.add(b);
                            }
                        }
                        listoflists.add(innerList);
                    }
                }

            }
            System.out.println(listoflists);
        }
    }