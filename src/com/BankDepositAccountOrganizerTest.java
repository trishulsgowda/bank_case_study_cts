package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vo.ParentAccountVO;

public class BankDepositAccountOrganizerTest {
	public static void main(String[] args) {
		BankDepositAccountOrganizer organizer = new BankDepositAccountOrganizer();
		Map<String, ArrayList<ParentAccountVO>> result = new HashMap<String, ArrayList<ParentAccountVO>>();
		String filePath = "F:\\accountDetails.txt";
		
		result = organizer.processBankDepositData(filePath);
		
		System.out.println(result);
		
	}
}
