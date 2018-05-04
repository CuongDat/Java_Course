package cuongdat0508hue.gmail.com;

public class Round {
	private float R;// Bán kính
	private Point O;// Tâm

	public Round() {
		this.setR(Math.round(Math.random() * 100));
		this.setO(new Point());
	}

	
	//Tạo getters và setters cho R và O
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {

		return 0;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}
	// Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A){
		float result = (float) Math.sqrt(Math.pow(A.getX()-O.getX(),2)+Math.pow(A.getY()-O.getY(),2));
		if (KQ == R) {
			return 0;
		} else if (KQ < R) {
			return -1;
		} else if (KQ > R) {
			return 1;
		}
		return 0;
	}
}
