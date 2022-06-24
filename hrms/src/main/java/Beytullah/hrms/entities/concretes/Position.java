package Beytullah.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity
@Table(name="positions")
public class Position {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="position_id")
	private int positionId;
	
	@Column(name="position_name")
	private String positionName;

	/**
	 * @param positionId
	 * @param positionName
	 */
	
	
	public Position(int positionId, String positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}
	public Position() {}
	public int getPositionId() {
		return positionId;
	}
	
	public void setPositionId(int positionId) {
		this.positionId=positionId;
	}
	
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName=positionName;
	}
	

}
