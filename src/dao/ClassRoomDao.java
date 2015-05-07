package dao;

import java.util.List;

import domain.ClassRoom;
import domain.User;

public interface ClassRoomDao {
	public boolean insertClassRoom(ClassRoom t);
	
	public boolean checkClassRoom(ClassRoom t);

	public boolean deleteClassRoom(String num);

	public boolean updateClassRoom(ClassRoom t);

	public List queryClassRoom();

}
