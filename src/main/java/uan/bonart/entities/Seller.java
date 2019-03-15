package uan.bonart.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="seller")
@Access(AccessType.FIELD)
public class Seller extends ParentEntity{


}
