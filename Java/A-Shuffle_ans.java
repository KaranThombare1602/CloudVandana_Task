import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            list.add(num);
        }
        
        Collections.shuffle(list);
        
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
