package cuongdat0508hue.gmail.com;

import java.util.Scanner;

public class KhachHang {
		private String username;
		private String password;
		public String getUsername() 
		{
			return username;
		}

		public void setUsername(String usn) 
		{
			username = usn;
		}

		public String getPassword() 
		{
			return password;
		}

		public void setPassword(String pw) 
		{
			password = pw;
		}

		public KhachHang(String usn, String pw) 
		{
			username = usn;
			password = pw;
		}

		public KhachHang() 
		{
			username = "admin";
			password = "admin";
		}

		public String MuaHang(String th, String nsx, double dg, int sl) 
		{
				HangHoa hh = new HangHoa();
				hh.setTenHang(th);
				hh.setNgaySanXuat(nsx);
				hh.setDonGia(dg);
				hh.setSoLuong(sl);
				hh.TinhTien();
				return hh.toString();
		}

}
