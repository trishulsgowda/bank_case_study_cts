package com.vo;

import java.util.List;

public class ParentAccountVO {

	 private String parentAccountNumber;
	 
	 private String name;
	 
	 private String type;
	 
	 private List<LinkedDepositVO> linkedDeposits;

	@Override
	public String toString() {
		return "{" + parentAccountNumber
				+ "," + name + "," + type + ","
				+ linkedDeposits;
	}

	public String getParentAccountNumber() {
		return parentAccountNumber;
	}

	public void setParentAccountNumber(String parentAccountNumber) {
		this.parentAccountNumber = parentAccountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<LinkedDepositVO> getLinkedDeposits() {
		return linkedDeposits;
	}

	public void setLinkedDeposits(List<LinkedDepositVO> linkedDeposits) {
		this.linkedDeposits = linkedDeposits;
	}
	 
}
