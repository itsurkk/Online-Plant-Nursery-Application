package com.sprint.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;

	@NotBlank(message = "House Number can't be null")
	private String houseNo;

	@NotBlank(message = "Colony can't be null")
	private String colony;

	@NotBlank(message = "City can't be null")
	private String city;

	@NotBlank(message = "State can't be null")
	private String State;

	@Min(value = 1, message = "Pincode can't be zero")
	private int pincode;

	public Address() {
		super();
	}

	public Address(int addressId, @NotBlank(message = "House Number can't be null") String houseNo,
			@NotBlank(message = "Colony can't be null") String colony,
			@NotBlank(message = "City can't be null") String city,
			@NotBlank(message = "State can't be null") String state,
			@Min(value = 1, message = "Pincode can't be zero") int pincode) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.colony = colony;
		this.city = city;
		State = state;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", colony=" + colony + ", city=" + city
				+ ", State=" + State + ", pincode=" + pincode + "]";
	}
	
}
