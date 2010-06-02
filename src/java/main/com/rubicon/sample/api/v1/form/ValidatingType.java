package com.rubicon.sample.api.v1.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ValidatingType {

	@NotNull
	@Size(max = 64)
	private String name;

	private String address;

	@NotNull
	private String city;

	@NotNull
	@Size(min = 2, max = 2)
	private String state;

	@NotNull
	@Size(min = 5, max = 5)
	@Pattern(regexp = "[0-9]{5}")
	private String zip;

	@Min(0)
	@Max(100)
	private int weight;

	public ValidatingType(String name, String address, String city,
			String state, String zip, int weight) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.weight = weight;
	}

	public ValidatingType() {
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public int getWeight() {
		return weight;
	}
}
