package com.dbs.twitterdemo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Tweets
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long twitterId;
	 
	@NotBlank(message = "Message cannot be null")
	private String message;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	
	
	public long getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(long twitterId) {
		this.twitterId = twitterId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (int) (twitterId ^ (twitterId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tweets other = (Tweets) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (twitterId != other.twitterId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tweets [twitterId=" + twitterId + ", message=" + message + "]";
	}
	

}
