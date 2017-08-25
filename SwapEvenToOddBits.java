package bitsprograms;

/**
 * Created by Goutam on 8/24/2017.
 */
public class SwapEvenToOddBits {
    
    public static int swapOddEven(int x){
        int evenBits = x & 0xAAAAAAAA;/*To get all the EVEN bits as SET*/
        int oddBits = x & 0x55555555;/*To get all the ODD bits as SET*/
        evenBits = evenBits >> 1;
        oddBits = 1 << oddBits;
        return(evenBits | oddBits);
        
    }
    
    public static void main(String args[]){
        int x = 23;
        System.out.println("Integer no after the Swap operation: " + swapOddEven(x));
    }
}
