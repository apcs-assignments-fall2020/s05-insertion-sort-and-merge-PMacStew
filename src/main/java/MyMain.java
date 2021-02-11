import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> last = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (last.size() == 0)
                last.add(list.get(0));
            for (int j = 0; j < last.size(); j++) {
                if (list.get(i) < last.get(j))
                    last.add(list.get(i), j);
                if (j == last.size() - 1) 
                    last.add(list.get(i));
            }
        }
        return last;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] list = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int val1 = 0;
        int val2 = 0;
        int max = 0;
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (index1 < arr1.length) 
                val1 = arr1[index1];
            else 
                val1 = Integer.MAX_VALUE;
            if (index2 < arr2.length) 
                val2 = arr2[index2];
            else 
                val2 = Integer.MAX_VALUE;
            max = Math.min(val1, val2);
            index1 += (max == val1) ? 1 : 0;
            index2 += (max == val2) ? 1 : 0;
            list[i] = max;
        }
        return list;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
