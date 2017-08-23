package bitsprograms;

/**
 * Created by Goutam on 8/23/2017.
 */

/*input provided is: 
*  no: the integer number
*  l : leftmost bit position
*  r : rightmost bit position*/

/*ALGO:
1. Calculate int temp = (1<<r)-1^(1<<(l-1)-1)
2. Calculate int result = (no ^ temp)
3. return result
 */
public class ToggleBits {
    
    public static void main(String args[]) {
        int no = 17;
        int l = 2;
        int r = 3;
        int temp = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);
        int result = no ^ temp;
        System.out.println(result);
    }
}
