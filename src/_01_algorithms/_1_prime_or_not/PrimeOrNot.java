package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String choose=JOptionPane.showInputDialog("choose a number");
		int number= Integer.parseInt(choose);
		for (int i =2;i< number;i++) {
			if(number%i==0){
				System.out.println("is not PRIME ");
				JOptionPane.showMessageDialog(null, number+" is not PRIME ");
				System.exit(0);

			}
		}
		JOptionPane.showMessageDialog(null,number+" It is PRIME");
	}
}