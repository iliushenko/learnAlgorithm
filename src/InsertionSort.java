/**
 * Created by odsptc11 on 3/30/2017.
 */
public class InsertionSort {

    public static int[] getSortirovochka(int[] source){
        int sourceArraySize = source.length;
        int[] sortedArray = new int[sourceArraySize];
        for (int i=0; i<sourceArraySize; i++){
            int currElement = source[i];
            int insertIndex = getInsertIndex(sortedArray, currElement);
            sortedArray = insertInArrayPosition(sortedArray, currElement, insertIndex);
        }
        return sortedArray;
    }

    private static int[] insertInArrayPosition(int[] sortedArray, int currElement, int insertIndex) {
        for (int i=insertIndex;i<sortedArray.length-1;i++){
            sortedArray[i] = currElement;
            currElement = sortedArray[i+1];
        }
        return sortedArray;
    }

    private static int getInsertIndex(int[] sortedArray, int currElement) {
        int index = 0;
        for (int i = 0; i<sortedArray.length - 1;i++){
            if (sortedArray[i]<currElement){
                index = i+1;
                break;
            }
        }
        return index;
    }
}
