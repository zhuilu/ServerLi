package domain;

public class Course {
	private String course_name;
	private String time_start;
	private String time_end;
	private String teacher_name;
	private String item_id;//c201
	private String classroom_num;//class_english_1101
	public String getCourseName() {
		return course_name;
	}

	public void setCourseName(String course_name) {
		this.course_name= course_name;
	}

	public String getItemId() {
		return item_id;
	}
	public void setItemId(String item_id) {
		this.item_id = item_id;
	}

	public void setTimeStart(String time_start) {
		this.time_start =time_start;
	}
	public String getTimeStart() {
		return time_start ;
	}

	public void setTimeEnd(String time_end) {
		this.time_end = time_end;
	}
	public String getTimeEnd() {
		return time_end;
	}

	public void setTeacherName(String teacher_name) {
		this.teacher_name =teacher_name;
	}
	public String getTeacherName() {
		return teacher_name;
	}
	public void setClassRoomNum(String classroom_num) {
		this.classroom_num =classroom_num;
	}
	public String getClassRoomNum() {
		return classroom_num;
	}

}
