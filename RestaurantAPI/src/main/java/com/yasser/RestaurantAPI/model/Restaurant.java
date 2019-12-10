package com.yasser.RestaurantAPI.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;
	@Column(name = "enName")
	@NotEmpty(message = "english name can not be empty.")
	@Size(max = 100, message = "english name can not be more than 100 characters.")
	private String enName;
	@Column(name = "arName")
	@NotEmpty(message = "arabic name can not be empty.")
	@Size(max = 100, message = "arabic name can not be more than 100 characters.")
	private String arName;
	@Enumerated(EnumType.ORDINAL)
	private  STATE state ;
	@NotEmpty(message = "logo can not be empty.")
	@Size(max = 100, message = "logo can not be more than 100 characters.")
	private String logo;
	@NotEmpty(message = "cover photo can not be empty.")
	@Size(max = 100, message = "cover photo can not be more than 100 characters.")
	private String coverPhoto;
	private String enDescreption;
	private String arDescreption;
	private String shortNumber;
	private String facebookLink;
	private String twitterLink;
	private String youtubeLink;
	private String website;
	private boolean onlinePayment;
	private boolean client;
	private boolean pendingInfo;
	private boolean pendingMenu;
	private boolean closed;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getArName() {
		return arName;
	}
	public void setArName(String arName) {
		this.arName = arName;
	}
	public STATE getState() {
		return state;
	}
	public void setState(STATE state) {
		this.state = state;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getCoverPhoto() {
		return coverPhoto;
	}
	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}
	public String getEnDescreption() {
		return enDescreption;
	}
	public void setEnDescreption(String enDescreption) {
		this.enDescreption = enDescreption;
	}
	public String getArDescreption() {
		return arDescreption;
	}
	public void setArDescreption(String arDescreption) {
		this.arDescreption = arDescreption;
	}
	public String getShortNumber() {
		return shortNumber;
	}
	public void setShortNumber(String shortNumber) {
		this.shortNumber = shortNumber;
	}
	public String getFacebookLink() {
		return facebookLink;
	}
	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}
	public String getTwitterLink() {
		return twitterLink;
	}
	public void setTwitterLink(String twitterLink) {
		this.twitterLink = twitterLink;
	}
	public String getYoutubeLink() {
		return youtubeLink;
	}
	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean isOnlinePayment() {
		return onlinePayment;
	}
	public void setOnlinePayment(boolean onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	public boolean isClient() {
		return client;
	}
	public void setClient(boolean client) {
		this.client = client;
	}
	public boolean isPendingInfo() {
		return pendingInfo;
	}
	public void setPendingInfo(boolean pendingInfo) {
		this.pendingInfo = pendingInfo;
	}
	public boolean isPendingMenu() {
		return pendingMenu;
	}
	public void setPendingMenu(boolean pendingMenu) {
		this.pendingMenu = pendingMenu;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
}
enum STATE {PUBLISHED , UNPUBLISHED}
