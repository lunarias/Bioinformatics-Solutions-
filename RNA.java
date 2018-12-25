//Problem 2: Transcribing DNA into RNA 

import java.util.Scanner; 
import java.util.*;

class RNA{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String[] dna = input.split("");
    String rna = convertDNA(dna); 
    System.out.println(rna);  
}

public static String convertDNA(String[] dna){

    String result = "";
    for (int i = 0; i < dna.length; i++){
        if (dna[i].equals("T")){
            result = result + "U";
        }
        else{
            result = result + dna[i];
        }
    }
    return result;
}
    
}