package domain;

public class Class {
	private String item_id;//department_english
	private String item_name;//英语系
	private String item_type;//1表示专业，2是系，3是班级
	private String parent_id;//比如说系的父id是1专业
	private String item_mana_name;//辅导员名字

	public String getItemId() {
		return item_id;
	}

	public void setItemId(String item_id) {
		this.item_id = item_id;
	}

	public String getItemName() {
		return item_name;
	}
	public void setItemName(String item_name) {
		this.item_name = item_name;
	}

	public void setItemType(String item_type) {
		this.item_type =item_type;
	}
	public String getItemType() {
		return item_type ;
	}

	public void setParentId(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getParentId() {
		return parent_id;
	}

	public void setItemManaName(String item_mana_name) {
		this.item_mana_name =item_mana_name;
	}
	public String getItemManaName() {
		return item_mana_name;
	}
	

}
