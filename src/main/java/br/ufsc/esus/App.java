package br.ufsc.esus;

/**
 * Hello world!
 * 
 */
public class App {

	public static int SIZE = 10;
	public static String TESTE = "";

	public static void foo() {
		System.out.println("foo.. ");
		System.out.println("deu.. ");
	}

	public void foo2() {
		for (int i = 0; i < SIZE; i++) {
			TESTE = String.valueOf(i);
		}
	}

	public void foo3() {
		for (int i = 0; i < SIZE; i++) {
			TESTE = String.valueOf(i);
		}
	}

	public void foo4() {
		if (SIZE <= 10) {
			for (int z = 0; z < SIZE; z++) {
				for (int y = 0; y < SIZE; y++) {
					for (int i = 0; i < SIZE; i++) {
						TESTE = String.valueOf(i);
					}
				}
			}
		}
	}

}
