/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequency1.java;

/**
 *
 * @author pc
 */
import java.util.*;
public class Frequency1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int freq[]={1,2,3,4,5,6,6,6,5,3,2};
        Scanner sc=new Scanner(System.in);
        find_frequency fr=new find_frequency();
        fr.calculate_frequency();
        //System.out.println("enter n:");
       //fr.n=sc.nextInt();
      fr.display();
    }
    
}
