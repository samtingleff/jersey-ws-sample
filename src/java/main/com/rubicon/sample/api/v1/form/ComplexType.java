package com.rubicon.sample.api.v1.form;

public class ComplexType {

	private String term;

	private int weight;

	public ComplexType(String term, int weight) {
		this.term = term;
		this.weight = weight;
	}

	public ComplexType() {
	}

	public String getTerm() {
		return term;
	}

	public int getWeight() {
		return weight;
	}
}
