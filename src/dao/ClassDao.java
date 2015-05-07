package dao;

import java.util.List;
import domain.Class;
import domain.User;

public interface ClassDao {
	public boolean insertClass(Class t);
	
	public boolean checkClass(Class t);

	public boolean deleteClass(String item_id);

	public boolean updateClass(Class t);

	public List queryClass();

}
