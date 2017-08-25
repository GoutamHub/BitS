package bitsprograms;

/**
 * Created by Goutam on 8/24/2017.
 */
public class BitRotation {
    public static int BIT_SIZE = 32;
    
    public static int leftRotation(int n, int d){
        return(n<<d | (n>>BIT_SIZE-d));
    }

    public static int rightRotation(int n, int d){
        return(n>>d | (n<<BIT_SIZE-d));
    }
    
    public static void main(String args[]){
        int n = 16;
        int d = 2;
        System.out.println("value after Left-Rotation : " + leftRotation(n,d));
        System.out.println("value after Right-Rotation: " + rightRotation(n,d));
    }
}
