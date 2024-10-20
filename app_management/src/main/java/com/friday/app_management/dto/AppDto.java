package com.friday.app_management.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class AppDto implements Serializable{
	
	private String serviceName;
	
	private String url;
	
	private String status;
	
	private Date createdDate;
	
	private String createdBy;
	
	private Date modifiedDate;
	
	private String modifiedBy;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	
	
}

//import java.time.LocalDate;
//import java.time.LocalTime;
//
//public class LocalDateImp {
//
//	public static void main(String[] args) {
//	System.out.println(LocalDate.of(2012,8,8));
//	System.out.println(LocalDate.now());
//	System.out.println(LocalDate.now());
////	System.out.println();
////	LocalDate d=new LocalDate(2012,8,8);
//	System.out.println(LocalTime.now());
//	}
//
//}
