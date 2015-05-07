package domain;

public class ClassRoom {
	private String address;//c栋201
	private String num;//c201
	private String longitude_a;
	private String longitude_b;
	private String latitude_a;
	private String latitude_b;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getINum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public void setLongitude_A(String longitude_a) {
		this.longitude_a =longitude_a;
	}
	public String getLongitude_A() {
		return longitude_a ;
	}
	public void setLongitude_B(String longitude_b) {
		this.longitude_b =longitude_b;
	}
	public String getLongitude_B() {
		return longitude_b ;
	}

	public void setLatitude_A(String latitude_a) {
		this.latitude_a = latitude_a;
	}
	public String getLatitude_A() {
		return latitude_a;
	}

	public void setLatitude_B(String latitude_b) {
		this.latitude_b = latitude_b;
	}
	public String getLatitude_B() {
		return latitude_b;
	}

}
