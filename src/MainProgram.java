
/**
 * 
 */
import com.zubiri.charSequence.*;

import java.util.Scanner;

/**
 * @author ik013043z1
 *
 */
public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a word");

		CharSequence2 word = new CharSequence2(sc.next());
		sc.nextLine();
		
		System.out.println(word.getSequence());

		System.out.println("What do you want to do? [1-3]\n" + "1- Character of a position\n" + "2- Length of the word\n"
				+ "3- Subsequence of the word\n");

		int option = sc.nextInt();
		sc.nextLine();

		switch (option) {

		default:
			System.out.println("Incorrect option");
			break;

		case 1:

			System.out.println("What position do you want?");
			int index = sc.nextInt();
			sc.nextLine();
			System.out.println(word.charAt(index));
			
			break;

		case 2:

			System.out.println("The lenght of the word " + word.length());
			
			break;
			
case 3:
			
			System.out.println("In wich position does the subsequence start");
			int arg0 = sc.nextInt();
			sc.nextLine();
			System.out.println("In wich position does the subsequence finish");
			int arg1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("The subsequence of the word " + word.getSequence() + " from " + arg0+ " to " + arg1 + " is: " + word.subSequence(arg0, arg1));
			
			break;
		

		}

	}

}
