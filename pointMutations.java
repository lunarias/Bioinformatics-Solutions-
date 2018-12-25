//Problem 6: Evolution as a Sequence of Mistakes
import java.util.Scanner; 
import java.util.*;

public class pointMutations{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        String[] sArray = s.split("");
        String[] tArray = t.split("");
    
        System.out.println(countMutatations(sArray, tArray));  
    }

    public static int countMutatations(String[] sArray, String[] tArray){

        int mismatch = 0;
    
        for(int i = 0; i < sArray.length; i++){
            if(!(sArray[i].equals(tArray[i]))){
                mismatch++;
            }
        }

        return mismatch; 
    }

}