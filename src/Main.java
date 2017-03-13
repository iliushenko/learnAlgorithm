import java.util.ArrayList;
import java.util.List;

/**
 * Created by odsptc11 on 3/13/2017.
 */
public class Main {
    public static void main(String[] argv){
        System.out.println("1");
        System.out.println(search_3(getList(), 3));
    }

    private static List<Integer> getList(){
        List<Integer> result = new ArrayList<>();
        result.add(3);
        result.add(5);
        result.add(6);
        result.add(1);
        result.add(9);
        return result;
    }

    private static int search_3(List<Integer> list, int key){
        list.add(key);
        int i;
        for (i = 0 ; i<list.size(); i++){
            if (list.get(i).equals(key)){
                break;
            }
        }
        list.remove(list.size()-1);

        if (list.size() != i){
            return i;
        }
        return -1;
    }
}
