//Problem 1: Counting DNA Nucleotides

import java.util.Scanner; 
import java.util.*;

class countNucleotides{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String[] dna = input.split("");
    int A = countChar(dna, "A");
    int C = countChar(dna, "C");
    int G = countChar(dna, "G");
    int T = countChar(dna, "T");

    System.out.println(A + " " + C + " " + G + " " + T);  
}

public static int countChar(String[] dna, String letter){

    int count = 0;
    for (int i = 0; i < dna.length; i++){
        if (dna[i].equals(letter)){
            count++;
        }
    }
    return count;
}
    
}