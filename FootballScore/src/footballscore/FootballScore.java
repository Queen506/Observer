/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballscore;

import java.util.Scanner;

/**
 *
 * @author ntpsm
 */
public class FootballScore {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
	Senior obj1 = new Senior();
	Marketing obj2 = new Marketing();
	HeadQuater obj = new HeadQuater();              
	obj.register((MyObserver) obj1);              
	obj.register((MyObserver) obj2);
              
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            obj.setSomeData(input);
        }


 
}}
