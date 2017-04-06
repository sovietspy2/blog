package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;


@Entity //Entitásként megjelöljük
@Table(name = "uzer") //Tábla neve
public class User extends GenericModel{
	@Id
	@GeneratedValue
	@Column(name="uzer_id")
	public Integer Id;
	
	@Column(name="uzer_name")
	public String name;
	
	@Column(name="uzer_name")
	public String password;
}
