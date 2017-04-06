package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
@Entity
@Table(name="post")
public class Post extends GenericModel{
	@Id
	@GeneratedValue
	@Column(name="post_id")
	public Integer id;
	
	@ManyToOne
	@JoinColumn(name="post_uzer_id",referencedColumnName="uzer_id")
	public User owningUser;
	
	@Column(name="post_name")
	public String name;
	
	@Column(name="post_content")
	public String content;
	
	@Column(name="post_date")
	public Date date;
	
	@OneToMany(mappedBy="owningTag")
	public List<Tag> tagList;
	
}
