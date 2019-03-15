package uan.bonart.entities;


import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity {

	@Id
	@Column (name = "document")
	private String document;
	@Column (name = "name")
	private String name;

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
