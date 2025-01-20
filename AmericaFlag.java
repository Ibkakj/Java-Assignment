/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nigeriaflag;

/**
 *
 * @author Akeju Ibukun
 */
public class AmericaFlag {
  public static void main(String[]args){
      int rowsStars=9;
      int starsPerRow = 9;
      int totalstripes =18;
      for(int i=0; i< rowsStars; i++){
          for(int j= 0; j < starsPerRow; j++){
              if(j%2 ==i%2){
                  System.out.print("*");
                }else{
                  System.out.print(" ");
                }
            }
            System.out.print("= = = = = = = = = = = = = ");
            System.out.println();
        }
         for(int i=0; i<totalstripes-rowsStars; i++){
          System.out.println("= = = = = = = = = = = = =");
    }
  }  
}
