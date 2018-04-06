package cuongdat0508hue.gmail.com;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Nhập số phần tử cho mảng: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Nhập giá trị của phần tử: ");
		for (i = 0;i < n;i++) {
			System.out.printf("array[%d] = ",i);
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for (i = 0;i < n;i++) {
			sum += array[i];
		}
		System.out.println("Tổng của các phẩn tử: "+sum);
	}

}
