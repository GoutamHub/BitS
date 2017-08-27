package bitsprograms;

/**
 * Created by Goutam on 8/27/2017.
 */
public class CountAllSetBits {
    
    public static int countUtil(int i){
        if(i<=0)
            return 0;
        return((i%2==0?0:1) + countUtil(i/2));
    }
    
    public static int count(int n){
        int bitCount=0;
        for(int i=1; i<=n; i++)
            bitCount = bitCount + countUtil(i);
        return  bitCount;
    }
    
    public static void main(String args[]){
        int n = 4;
        System.out.println("Total no of set Bits: " + count(n));
    }
}
