package com.vo;

import java.util.Date;

public class LinkedDepositVO {

	
	@Override
	public String toString() {
		return ","
				+ linkedDepositAccNumber + "," + depositAmount
				+ "," + depositStartDate
				+ "," + depositMaturityDate;
	}
	private String linkedDepositAccNumber;
	private int depositAmount;
	private Date depositStartDate;
	private Date depositMaturityDate;
	
	public String getLinkedDepositAccNumber() {
		return linkedDepositAccNumber;
	}
	public void setLinkedDepositAccNumber(String linkedDepositAccNumber) {
		this.linkedDepositAccNumber = linkedDepositAccNumber;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	public Date getDepositStartDate() {
		return depositStartDate;
	}
	public void setDepositStartDate(Date depositStartDate) {
		this.depositStartDate = depositStartDate;
	}
	public Date getDepositMaturityDate() {
		return depositMaturityDate;
	}
	public void setDepositMaturityDate(Date depositMaturityDate) {
		this.depositMaturityDate = depositMaturityDate;
	}
	
}
