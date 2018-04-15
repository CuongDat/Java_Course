package cuongdat0508hue.gmail.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {

	public static void main(String[] args) throws IOException {
		//Nhập xâu để đảo xâu và đảo từ 
		System.out.println("Nhập xâu ký tự: ");
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		//Gọi hàm đảo xâu
		System.out.println(DaoXau.thuchien(s));
		//Gọi hàm đảo từ 
		System.out.println(DaoTu.thuchien(s));
		
		
		//Nhập vào mảng theo định dạng các phần tử cách nhau bằng kt trắng 1 2 3 
		String input = br.readLine();
		
		//Tách các phần tử bằng cách chia nhỏ xâu theo dấu hiệu là kt trắng
		String[] input_element = input.split(" ");//chứa các phần tử ở dạng xâu kt
		float arr[] = new float[input_element.length];
		for(int i=0; i<arr.length; i++)
			arr[i] = Float.parseFloat(input_element[i]);//chứa các phần tử dạng số
		System.out.println("Tổng mảng là: "+TinhTong.thuchien(arr));
		
		//Nhập hệ số a, b, c của phương trình bậc 2 theo dạng a b c
		float a, b, c;
		String input2 = br.readLine();
		String[] input_element2 = input2.split(" ");
		a = Float.parseFloat(input_element2[0]);
		b = Float.parseFloat(input_element2[1]);
		c = Float.parseFloat(input_element2[2]);
		GiaiPhuongTrinh.thuchien(a, b, c);
		
		
			
	}

}
