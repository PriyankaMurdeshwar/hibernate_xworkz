package com.xworkz.tv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tv_info")
@Entity
public class TvEntity {

	@Id
	@Column(name = "brand ")
	private String brand;

	@Column(name = "color")
	private String color;

	@Column(name = "size")
	private int size;

	@Column(name = "price")
	private double price;

	@Column(name = "bluetoothSupported")
	private boolean bluetoothSupported;

	@Column(name = "touchscreen")
	private boolean touchscreen;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBluetoothSupported() {
		return bluetoothSupported;
	}

	public void setBluetoothSupported(boolean bluetoothSupported) {
		this.bluetoothSupported = bluetoothSupported;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}

	public TvEntity() {
		super();
	}

	@Override
	public String toString() {
		return "TvEntity [brand=" + brand + ", color=" + color + ", size=" + size + ", price=" + price
				+ ", bluetoothSupported=" + bluetoothSupported + ", touchscreen=" + touchscreen + "]";
	}

	public TvEntity(String brand, String color, int size, double price, boolean bluetoothSupported,
			boolean touchscreen) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
		this.bluetoothSupported = bluetoothSupported;
		this.touchscreen = touchscreen;
	}

}
