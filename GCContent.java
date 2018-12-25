//Problem 5: Computing GC Content
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.*;

class GCContent{

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);  
    //ArrayList<String> dna = new ArrayList<String>(); 
    String line = in.nextLine();    
    String result = "";

    while (!(line.equals(""))){
        result = result + line;
        line = in.nextLine();       
    }
   
    ArrayList<String> dna = new ArrayList<String>(Arrays.asList(result.split(">")));        
    int i = 1;
    double oldGC = calculate(i, dna);    
    double max = oldGC;    
    String id = (dna.get(i)).substring(0, 13);  
    i = i+1;

    while (i < dna.size()){  
        double newGC = calculate(i, dna);
        if (newGC > max){
            max = calculate(i, dna);
            id = (dna.get(i)).substring(0, 13);            
        }       
        i++;
    }
    System.out.println(id);
    System.out.printf("%.6f", max);
    System.out.println(" ");
}

public static double calculate(int position, ArrayList<String> dna){

    double percent = 0;
    double nucleotidesnumber = 0;
    String strand = dna.get(position);    
    String[] nucleotides = strand.split("");

    for (int i = 13; i < nucleotides.length; i++){
        if ((nucleotides[i]).equals("C") || (nucleotides[i]).equals("G")){
            nucleotidesnumber++;
        }
    } 

    percent = (double)((nucleotidesnumber/(nucleotides.length-13))*100);    
    return percent;
    
}
   
}