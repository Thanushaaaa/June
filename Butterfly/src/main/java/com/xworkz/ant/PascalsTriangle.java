package com.xworkz.ant;

// Printing pascal's triangle

public class PascalsTriangle {

	public static void main(String[] args) {
		
		int n = 4; // Change the value of 'n' to the desired number of rows

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

	}

}
