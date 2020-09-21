package Problem3;

import java.util.Scanner;

public class Fpb {

    public static int fpb(int p, int q) {
        if (q == 0) return p;
        else return fpb(q, p % q);
    }

	public static int fpb2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
	
	public static String isiBox(int c, int a, int f) {
		return "Masing-masing Box berisi " + c/f + " Cakes dan "+ a/f + " Apples." ;
	}

    public static void main(String[] args) {
		int cakes, apples;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Cakes: ");
        cakes = keyboard.nextInt();

        System.out.print("Apples: ");
        apples = keyboard.nextInt();
		
        int f  = fpb(cakes, apples);
		
        System.out.println("Jumlah Box Yang Dibutuhkan = " + f);
		System.out.println(isiBox(cakes, apples, f));
		
    }
}