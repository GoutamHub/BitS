package bitsprograms;

/**
 * Created by Goutam on 8/23/2017.
 */
public class BitDifference {
    
    public static void main(String args[]) {
        int m = 10;
        int n = 20;
        int diffbits = m ^ n;
        int count = 0;
        while(diffbits != 0){
            count = count+(diffbits & 1);
            diffbits = diffbits>>1;
        }
        
        System.out.println("No of bits needed to conver m to n is : " + count);
    }
    
}
