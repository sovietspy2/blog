package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.jpa.GenericModel;

@Entity
@Table(name="pog")
public class Pog extends GenericModel{
	@ManyToOne
	@JoinColumn(name = "pog_post_id",referencedColumnName="post_id")
	public Post owningPost;
	
	@ManyToOne
	@JoinColumn(name = "pog_tag_id",referencedColumnName="tag_id")
	public Tag owningTag;
	
	
}
