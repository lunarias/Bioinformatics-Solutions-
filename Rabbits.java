//Problem 4: Rabbits and Recurrence Relations

import java.util.Scanner; 
import java.util.*;

class Rabbits{

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long k = in.nextLong();

    System.out.println(rabbitk(n, k));  
}

//The int data type is incapable of storing large values, thus must use long
public static long rabbitk(long n, long k) {
     
    if (n == 0){
        return 0; 
    }
    else if (n == 1){
        return 1;
    } 
    else{
       return rabbitk(n-1, k) + rabbitk(n-2, k)*k;
    }
}
    
}