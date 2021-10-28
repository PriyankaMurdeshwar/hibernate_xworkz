package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mobile_table")
@Entity
public class MobileEntity {

	@Id
	@Column(name = "MOBILE_ID")
	private int mobileID;

	@Column(name = "MOBILE_BRAND")
	private String mobileBrand;

	@Column(name = "MOBILE_PRICE")
	private double mobilePrice;

	@Column(name = "ROM")
	private String rom;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "CAMERA_SIZE")
	private int cameraSize;

	@Column(name = "IS_FINGER_PRINT_SUPPORTED")
	private boolean isFingerPrintSupported;

	@Column(name = "OS_TYPE")
	private String osType;

	public MobileEntity(int mobileID, String mobileBrand, double mobilePrice, String rom, String color, int cameraSize,
			boolean isFingerPrintSupported, String osType) {
		super();
		this.mobileID = mobileID;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
		this.rom = rom;
		this.color = color;
		this.cameraSize = cameraSize;
		this.isFingerPrintSupported = isFingerPrintSupported;
		this.osType = osType;
	}

	public int getMobileID() {
		return mobileID;
	}

	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCameraSize() {
		return cameraSize;
	}

	public void setCameraSize(int cameraSize) {
		this.cameraSize = cameraSize;
	}

	public boolean isFingerPrintSupported() {
		return isFingerPrintSupported;
	}

	public void setFingerPrintSupported(boolean isFingerPrintSupported) {
		this.isFingerPrintSupported = isFingerPrintSupported;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

}
