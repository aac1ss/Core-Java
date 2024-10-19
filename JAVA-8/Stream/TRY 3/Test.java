import java.util.*;
import java.util.stream.*;

class Test {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(1,2,3,4,5,6,1,232,0,201,2,3,0);
// Converting  "List" to "Stream" to "List"
        List<Integer> myArrStream=lst.stream()
                                    .filter(i->i%2==0)
                                    .map(m->m/2)
                                    .distinct()
                                    .sorted((a,b)->(b-a))
                                    .limit(4)
                                    .skip(1)
                                    .collect(Collectors.toList());
        System.out.println(myArrStream);

       List<Integer> collect= Stream.iterate(0,x->x+1)
                                    .limit(101)
                                    .skip(1)
                                    .filter(x->x%2==0)
                                    .map(x->x/10)
                                    .distinct()
                                    .sorted()
                                    .collect(Collectors.toList());
                                    System.out.println(collect);
    }
}