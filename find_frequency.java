/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frequency1.java;

/**
 *
 * @author pc
 */
public class find_frequency{
   //int n;
    int[] z=new int[7];
    int freq[]={1,2,3,4,5,6,6,6,5,3,2};
    
 void calculate_frequency(){
     for(int i=0;i<freq.length;i++){
       z[freq[i]]++;
     }
 }
 void display(){
     System.out.println("rating"+" "+" frequency");
     for(int i=0;i<7;i++){
   if(z[i]!=0){
  
      System.out.println( i + "         " +z[i]);
 
 }
     }
 
}
}
