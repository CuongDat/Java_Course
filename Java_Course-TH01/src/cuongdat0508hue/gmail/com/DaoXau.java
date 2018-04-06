package cuongdat0508hue.gmail.com;

import java.util.Scanner;

public class DaoXau {

	public static void main(String[] args) {
		String string;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập xâu cần đảo");
		string = sc.nextLine();
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("Xâu trước khi đảo: "+string);
		System.out.println("Xâu sau khi đảo: "+reverse);
	}

}
