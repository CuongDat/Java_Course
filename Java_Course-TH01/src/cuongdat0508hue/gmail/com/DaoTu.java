package cuongdat0508hue.gmail.com;

import java.util.Scanner;

public class DaoTu {

	public static void main(String[] args) {
		String s = new String();
		System.out.println("Nhập vào 1 chuỗi: ");
		s = new Scanner(System.in).nextLine();	
		String s1 = ""; 
		String s2 = ""; 
		for(int i = s.length()-1; i >= 0; i--) 
		{
			if(s.charAt(i) != ' ') 
			{
				s1 = s.charAt(i) +s1;
			}
			else
			{
				s2 += s1 + ' ';
				s1 = "";
			}
			if(i == 0)
			{
				s2 += s1;
			}
		}
		System.out.println(s2);
	}

}
