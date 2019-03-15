package uan.bonart.bean;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="seller")
@Access(AccessType.FIELD)
public class Seller extends ParentEntity{


}
