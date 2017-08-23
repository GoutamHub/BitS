package bitsprograms;

/**
 * Created by Goutam on 8/23/2017.
 */
public class Powerof2 {
    
    public static boolean arithmaticWay(int n){
        if(n ==0)
            return false;
        while(n!=1){
            if(n%2 !=0)
                return false;
            n = n/2;
        }
        return true;
    }
    
    public static boolean bitWiseWay(int n){
        return(n!=0 && ((n&(n-1))==0));
    }
    
    public static void main(String args[]) {
        int no = 16;
        System.out.println(arithmaticWay(no)?"Yes":"no");
        System.out.println(bitWiseWay(no)?"Yes":"no");
    }
}
