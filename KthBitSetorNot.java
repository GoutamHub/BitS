package bitsprograms;

/**
 * Created by Goutam on 8/22/2017.
 */
public class KthBitSetorNot {
    
    public static void main(String args[]) {
        int number = 11;
        int position = 3;
        int count=0;
        int result = number & (1 << (position-1));
        String binaryno = Integer.toString(result, 2);
        for(int i=binaryno.length()-1; i>=0; i--){
            count++;
            if(count == position){
                if("1".equals(Character.toString(binaryno.charAt(position-1)))) {
                    System.out.println("SET");
                    return;
                } else {
                    System.out.println("NOT SET");
                }
            }
        }
    }
}
