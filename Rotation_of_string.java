public class Solution {
    public static int isCyclicRotation(String p, String q)  {
        
        if((p+p).contains(q)){
        return 1;
        }
        return 0;
    }
}
