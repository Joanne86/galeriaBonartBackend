package uan.lrodriguez52.bean;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	//private static final long serialVersionUID = 3081012522118407604L;

	@Id
    @Column (name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column (name="address")
	private String address;

	
	@Column (name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="idsesion")
	private Sesion sesion;
	//hacer el join de este lado , referencedColumnName = "idsesion"
	
	public int getId() {
		return id;
	}
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
