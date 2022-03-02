package Ex40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {

    }
    public static List evenIntegers(List<Integer> integers){
        if (integers == null) return Collections.EMPTY_LIST;

        List<Integer> evens = new ArrayList<Integer>();
        for (var nEven:integers){
            if (nEven != null && nEven % 2 == 0)
                evens.add(nEven);
        }
        return evens;
    }

    public static List evenIntegersII(List<Integer> integers){
        if (Objects.isNull(integers)) return Collections.EMPTY_LIST;
        List<Integer> evens = new ArrayList<>();
        for (var nEven : integers){
            if (Objects.nonNull(nEven) && nEven % 2 == 0)
                evens.add(nEven);
        }
        return evens;
    }
}
