package com.asit.bean;

import java.util.List;
public class Parent{
	  private String type; 
	  private Marketplace marketplace; 
	  private ApplicationUuid applicationUuid; 
	  private String flag; 
	  private Creator creator; 
	  private Payload payload; 
	  private ReturnUrl returnUrl; 
	  private List<Links> links;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Marketplace getMarketplace() {
		return marketplace;
	}
	public void setMarketplace(Marketplace marketplace) {
		this.marketplace = marketplace;
	}
	public ApplicationUuid getApplicationUuid() {
		return applicationUuid;
	}
	public void setApplicationUuid(ApplicationUuid applicationUuid) {
		this.applicationUuid = applicationUuid;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Creator getCreator() {
		return creator;
	}
	public void setCreator(Creator creator) {
		this.creator = creator;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	public ReturnUrl getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(ReturnUrl returnUrl) {
		this.returnUrl = returnUrl;
	}
	public List<Links> getLinks() {
		return links;
	}
	public void setLinks(List<Links> links) {
		this.links = links;
	} 
	  
}
  