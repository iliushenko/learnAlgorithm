import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * pppppp
 * Created by odsptc11 on 3/13/2017.
 */
public class Main {
    public static void main(String[] argv) {
        int key = 3;
//        System.out.println("1");
//        System.out.println(search_3(getList(), key));
//
//        System.out.println(binarySearch(getSortedList(), key));
//        System.out.println(lower_bound(getSortedList(), key));
//        System.out.println(upper_bound(getSortedList(), key));
        int[] arr = {1, 3, 5, 3, 8, 2, 3, 0, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(minElement(getList()));
    }

    private static void bubbleSort(int[] arr) {
        boolean changeFlag;
        do {
            changeFlag = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int buff = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buff;
                    changeFlag = true;
                }
            }
        } while (changeFlag);
    }

    private static int minElement(List<Integer> list) {

        return 0;
    }

    private static int upper_bound(List<Integer> list, int key){
        int begin = 0;
        int end = list.size();
        while (end < begin){
            int m = (end + begin) / 2;
            if (list.get(m) < key) {
                begin = m;
            } else {
                end--;
            }
        }
        if (list.size() == end){
            return list.size();
        }
        return begin;
    }

    private static int lower_bound(List<Integer> list, int key){
        int begin = 0;
        int end = list.size();
        while (end < begin){
            int m = (end + begin) / 2;
            if (list.get(m) < key) {
                begin++;
            } else {
                end = m;
            }
        }
        if (list.size() == end){
            return list.size();
        }
        return end;
    }

    private static List<Integer> getList() {
        List<Integer> result = new ArrayList<>();
        result.add(3);
        result.add(5);
        result.add(6);
        result.add(1);
        result.add(9);
        return result;
    }

    private static List<Integer> getSortedList() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(2);
        result.add(2);
        result.add(2);
        result.add(3);
        result.add(3);
        result.add(3);
        result.add(4);
        result.add(5);
        return result;
    }

    private static int search_3(List<Integer> list, int key) {
        list.add(key);
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).equals(key)) {
                break;
            }
        }
        list.remove(list.size() - 1);

        if (list.size() != i) {
            return i;
        }
        return -1;
    }

    private static int binarySearch(List<Integer> sortedList, int key) {
        int begin = 0;
        int end = sortedList.size() - 1;

        while (true) {
            int m = (end - begin) / 2 + begin;
            if (sortedList.get(m) < key) {
                begin = m + 1;
            } else if (sortedList.get(m) > key) {
                end = m - 1;
            } else if (sortedList.get(m) == key) {
                return m;
            } else {
                return -1;
            }
        }
    }
}
