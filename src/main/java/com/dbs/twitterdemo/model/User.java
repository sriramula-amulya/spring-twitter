package com.dbs.twitterdemo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class User
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long UserId;
	 
	 @NotBlank(message = "Name cannot be null")
	private String uname;
	 
	 @NotBlank(message = "Password cannot be null")
	private String pwd;
	 
	 @NotBlank(message = "Confirm Password cannot be null")
		private String cpwd;
	 
	 
	 private  String emailId;
	 
	 @NotBlank(message = "City cannot be null")
	 private String city;
	 
	 @NotBlank(message = "Street cannot be null")
	 private String street;
	 
	 @NotBlank(message = "State cannot be null")
	 private String state;
	 
	 
	 private Integer zip;

	 @OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Set<Tweets> tweets = new HashSet<>();

	public User(long userId, @NotBlank(message = "Name cannot be null") String uname,
			@NotBlank(message = "Password cannot be null") String pwd,
			@NotBlank(message = "Confirm Password cannot be null") String cpwd,
			@NotBlank(message = "Email cannot be null") String emailId,
			@NotBlank(message = "City cannot be null") String city,
			@NotBlank(message = "Street cannot be null") String street,
			@NotBlank(message = "State cannot be null") String state,
			@NotBlank(message = "Zip cannot be null") Integer zip) {
		super();
		UserId = userId;
		this.uname = uname;
		this.pwd = pwd;
		this.cpwd = cpwd;
		this.emailId = emailId;
		this.city = city;
		this.street = street;
		this.state = state;
		this.zip = zip;
	}

	public User()
	{}
	
	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	
	public void postTweet(Tweets tweet)
    {
    	this.tweets.add(tweet);
    	tweet.setUser(this);
    }
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", uname=" + uname + ", pwd=" + pwd + ", cpwd=" + cpwd + ", emailId="
				+ emailId + ", city=" + city + ", street=" + street + ", state=" + state + ", zip=" + zip + "]";
	}


}