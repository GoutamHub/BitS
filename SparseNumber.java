package bitsprograms;

/**
 * Created by Goutam on 8/27/2017.
 */
public class SparseNumber {
    public static void main(String args[]){
        int n = 72;
        System.out.println(checkSparse(n));
    }
    
    public static boolean checkSparse(int n){
        if((n & n>>1) == 0)
            return true;
        return false;
    }
}
