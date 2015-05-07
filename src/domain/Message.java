package domain;

/**
 * Message entity. @author
 */

public class Message implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phone;
	private String latitude;
	private String longitude;
	private String mac;
	private String time;

	public Message(String phone, String latitude, String longitude, String mac,
			String time) {
		setPhone(phone);
		setLatitude(latitude);
		setLongitude(longitude);
		setPhone(phone);
		setMac(mac);
		setTime(time);

	}

	public Message() {

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}