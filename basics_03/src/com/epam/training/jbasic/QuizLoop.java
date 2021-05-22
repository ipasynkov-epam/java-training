package com.epam.training.jbasic;

public class QuizLoop {

	private int j;
	void showJ() {
		while (j < 5) {
			for (int j = 1; j <= 5;) {
				System.out.println(j + " ");
				j++;
			}
			j++;
		}
	}

	public static void main(String[] args) {
		new QuizLoop().showJ();
	}
}
