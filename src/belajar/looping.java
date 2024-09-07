/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar;

/**
 *
 * @author hikap
 */
public class looping {
    public static void main(String[] args) {
        
        int bilangan1 = 0;
        int bilangan2 = 1;
        int total = 0;
        
        
        for(; total < 10000; total = bilangan1 + bilangan2){
     
            bilangan1 = bilangan2;
            bilangan2 = total;
            System.out.print(total + ", ");
        }
    }
}
