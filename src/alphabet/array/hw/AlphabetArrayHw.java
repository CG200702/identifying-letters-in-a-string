/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet.array.hw;
import java.util.Scanner;
/**
 *
 * @author tim
 */
public class AlphabetArrayHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
                 
        
        System.out.println("Enter a list of letters");
        String str=input.next();
        	int wordCount = 0;
		String word = str.toUpperCase();
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				System.out.print(letter +""+ wordCount+" ");
				wordCount = 0;
			}}
        

    }
    
}
