package bitsprograms;

/**
 * Created by Goutam on 8/27/2017.
 */
public class AloneInCouple {
    public static void main(String args[]){
        int coupleId[] = new int[]{1,2,3,2,1,3, 5, 7,7};
        System.out.print(findSingleEntry(coupleId));
    }
    
    public static int findSingleEntry(int coupleId[]){
        int matchId = 0;
        for(int i=0; i<coupleId.length; i++)
            matchId = matchId^coupleId[i];
        return matchId;
    }
}
