package cuongdat0508hue.gmail.com;

public class Round {
	private float R;//Bán kính
	private Point O;//Tâm
	
	public Round() {
		this.R = Math.round(Math.random()*100);
		this.O = new Point();
	}
	
	//Tạo getters và setters cho R và O
	public float getR() {
		return R;
	}
	public void setR(float R) {
		this.R = R;
	}
	public Point getO() {
		return O;
	}
	public void setO() {
		this.O = O;
	}
	//Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		
		
		
		return 0;
	}
}
