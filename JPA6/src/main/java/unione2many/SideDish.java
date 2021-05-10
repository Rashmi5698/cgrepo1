package unione2many;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.CascadeType;
@Entity
@Table(name="side_dish")
	
public class SideDish {
	@Id
	private int SideDishId; 
	private String SideDishName;
	public int getSideDishId() {
		return SideDishId;
	}
	public void setSideDishId(int sideDishId) {
		SideDishId = sideDishId;
	}
	public String getSideDishName() {
		return SideDishName;
	}
	public void setSideDishName(String sideDishName) {
		SideDishName = sideDishName;
	}
	

}
