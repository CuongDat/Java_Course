package cuongdat0508hue.gmail.com;

public class GiaiPhuongTrinh {

	public static void  thuchien(float a, float b, float c) {
		float delta = b*b-4*a*c;
		if (a==0)
		{
			if(b==0) 
			{
				System.out.println("Phương trình vô nghiệm");
			}
			else 
			{
				System.out.println("Phường trình có 1 nghiệm duy nhất x= " +(-c/(b)));
			}
		}
		else 
		{
			if(delta > 0)
			{
				System.out.println("phương trình có 2 nghiệm phân biệt: ");
				System.out.println("x1= " +(-b-Math.sqrt(delta)/(2*a*b)));
				System.out.println("x1= " +(-b+Math.sqrt(delta)/(2*a*b)));
			}
			else if (delta == 0)
			{
				System.out.println("Phường trình có nghiệm kép x1 = x2 = " +(-b/(2*a)));			
			}
			else
			{
				System.out.println("Phương trình vô nghiệm");
			}
		}
		
		
	}

}
