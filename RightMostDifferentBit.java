package bitsprograms;

/**
 * Created by Goutam on 8/22/2017.
 */
public class RightMostDifferentBit {
    
    public static void main(String args[]) {
        int m = 52;
        int n = 4;
        int result = (m^n);
        int position = 0;
        String binaryno = Integer.toString(result, 2);
        for(int i=binaryno.length()-1; i>=0; i--){
            position++;
            if("1".equals(Character.toString(binaryno.charAt(i)))) {
                System.out.println(position);
                return;
            }
        }
    }
}
