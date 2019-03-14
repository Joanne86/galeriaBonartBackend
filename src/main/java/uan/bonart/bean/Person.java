package uan.bonart.bean;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="person")
@Access(AccessType.FIELD)
public class Person extends ParentEntity{
	
	@Id
	@Column (name="document")
	private int document;
	
	
	public int getDocument() {
		return document;
	}
	public void setDocument(int document) {
		this.document = document;
	}

}
