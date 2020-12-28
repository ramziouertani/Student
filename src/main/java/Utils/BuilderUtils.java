package Utils;

import java.util.Arrays;
import java.util.List;

public class BuilderUtils {
    //store static variable or method or block in NameSpace (Native Heap)
    public static Long getSum(String val){
         return val.chars().count();
    }

    //Non Static-Method cannot referenced from Static Context
    public static Long getValues(String... args){
        List<String> values = Arrays.asList(args);
        return values.stream().map(BuilderUtils::getSum).count();    }
}
