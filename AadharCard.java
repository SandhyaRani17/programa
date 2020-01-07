package com.deloitte.secondmvn.hibfourth.entity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard 
{
	@Id
	int aid;
	String issue_auth;
	Date date_of_issue;
	@OneToOne(mappedBy="acard")
	Person person;
	public AadharCard() {}
	public AadharCard(int aid, String issue_auth, Date date_of_issue) 
	{
		this.aid = aid;
		this.issue_auth = issue_auth;
		this.date_of_issue = date_of_issue;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getIssue_auth() {
		return issue_auth;
	}
	public void setIssue_auth(String issue_auth) {
		this.issue_auth = issue_auth;
	}
	public Date getDate_of_issue() {
		return date_of_issue;
	}
	public void setDate_of_issue(java.sql.Date date_of_issue) {
		this.date_of_issue = date_of_issue;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
