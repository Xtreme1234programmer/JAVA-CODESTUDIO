import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        if(type.equals("Integer")) return (int)4;
        else if(type.equals("Long"))return (int)8;
        else if(type.equals("Float")) return (int) 4;
        else if(type.equals("Double")) return (int)8;
        else return (int)1;
    }
}
