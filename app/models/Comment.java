package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.jpa.GenericModel;

@Entity
@Table(name="comment")
public class Comment extends GenericModel{
	@Id
	@GeneratedValue
	@Column(name="comment_id")
	public Integer id;
	
	@ManyToOne
	@JoinColumn(name = "comment_post_id",referencedColumnName="post_id")
	public Post owningPost;
	
	@Column(name="post_date")
	public Date date;
	
	@Column(name="post_author")
	public String author;
	
	@Column(name="post_content")
	public String content;
	
}
