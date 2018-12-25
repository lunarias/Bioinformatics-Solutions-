//Problem 3: Complementing a Strand of DNA

import java.util.Scanner; 
import java.util.*;

class reverseComplement{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String[] dna = input.split("");
    String reversed = reverse(dna);   
    String[] dnaReversed = reversed.split("");
    String complemented = complement(dnaReversed);
    System.out.println(complemented);  

}

public static String reverse(String[] dna){

    String reversed = "";
    for (int i = dna.length-1; i >= 0; i--){
        reversed = reversed + dna[i];
    }
    return reversed; 
}

public static String complement(String[] dna){

    String result = "";
    for (int i = 0; i < dna.length; i++){
        if (dna[i].equals("T")){
            result = result + "A";
        }
        else if (dna[i].equals("A")){
            result = result + "T";
        }
        else if (dna[i].equals("C")){
            result = result + "G";
        }
        else if (dna[i].equals("G")){
            result = result + "C";

        }
       
    }
    return result;
}
    
}