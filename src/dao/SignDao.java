package dao;

import java.util.List;

import domain.Sign;
import domain.User;

public interface SignDao {
	public boolean insertSign(Sign t);
	
	public boolean checkSign(Sign t);

	public boolean deleteSign(String user_name);

	public boolean updateSign(Sign user_name);

	public List querySign();

}
