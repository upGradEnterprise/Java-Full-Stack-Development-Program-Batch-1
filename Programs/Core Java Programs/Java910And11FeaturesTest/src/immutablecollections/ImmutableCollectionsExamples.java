package immutablecollections;

import java.util.*;

public class ImmutableCollectionsExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("C");
        names.add("C");
        //names = Collections.unmodifiableList(names);
        names.add("D");
        // factory method provided to achieve immutable collection
        List ll1 = List.of("A","B","C");
        Set ss1 = Set.of("A","B","C");
        Map mm1 = Map.of("key1","value1","key2","value2");

    }
}
