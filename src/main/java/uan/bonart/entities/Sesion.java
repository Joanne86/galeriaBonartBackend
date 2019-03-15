package uan.bonart.entities;

import javax.persistence.*;

@Entity
@Table (name="sesion")
public class Sesion {
	@Id
	@Column (name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="username")
	private String user;
	@Column (name="password")
	private String password;

	@ManyToOne(optional = false)
	@JoinColumn(name = "document_seller", referencedColumnName = "document" )
	private Seller seller;

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

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
