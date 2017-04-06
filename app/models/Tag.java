package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.db.jpa.GenericModel;

@Entity
@Table(name="tag")
public class Tag extends GenericModel{
	
	@Id
	@GeneratedValue
	@Column(name="tag_id")
	public Integer id;
	
	@OneToMany(mappedBy="owningPost")
	public Post owningPost;
	
	@Column(name="tag_name")
	public String name;
}
