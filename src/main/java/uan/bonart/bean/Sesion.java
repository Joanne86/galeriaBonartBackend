package uan.bonart.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="sesion")
public class Sesion {
	@Id
	@Column (name="idsesion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="username")
	private String user;
	@Column
	private String password;
	
/*	@OneToOne
	@JoinColumn(name = "dperson", referencedColumnName="document")	
	protected Person person;*/
	
	/*@OneToMany(mappedBy = "sesion", fetch=FetchType.EAGER)
	private List<User> users;
	*/
	@JsonIgnore
	@OneToMany
	@JoinColumn (name="idsesion")
	private List<User> users;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	} <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>*/
	
}   
