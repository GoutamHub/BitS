/**
 * Created by Goutam on 8/1/2017.
 */
public class Ffs {
    
    /*Algo: 
    * 1. For given no X, calculate the (X-1)
    * 2. Calculate ~(X-1)
    * 3. perform '&' operation between X and ~(X-1)
    * 4. Convert the result in Binary
    * 5. Trace the String array[] from right to left and count the position with each iteration and 
    * when get the '1' return the position from String Array[]*/
    
    /*Algo:MSB
    Basically, right-shifting the integer until it become zero. No mask is required.
     */
    
     private static int mostSignificantBit(int myInt){
            int count = 0;
            while (myInt != 0) {
                count++;
                myInt >>>= 1;
            }
            return count;
        }
    
    public static void main(String args[]){
        int k=12;
        int result = (k & (~(k-1)));
        int position = 0;
        String ffsPosition = Integer.toString(result, 2);
        for(int i= ffsPosition.length()-1; i>=0; i--) {
            position++;
            if ("1".equals(Character.toString(ffsPosition.charAt(i)))) {
                System.out.println(position);
                return;
            }
        }
        
        //int msb = mostSignificantBit(8);
        //System.out.println(msb);
    }
    
}
