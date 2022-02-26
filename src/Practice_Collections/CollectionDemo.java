package Practice_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void show(){

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a", "b", "c");
        for (var e : collection)
            System.out.println(e);

        var stringArray = collection.toArray(new String[0]);
        int arrSize = stringArray.length;
        System.out.println(arrSize);

        //List interface cares about index
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        list.add(0, 100); //we don't have access to index in the Collection interface but in List we have...
        //for primitive type we use...
        int[] numList = new int[list.size()];
        for (int i = 0; i < list.size();i++){
            numList[i] = list.get(i);
        }
        for (var ele : numList)
            System.out.println(ele);


    }
}
