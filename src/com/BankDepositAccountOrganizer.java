package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.vo.LinkedDepositVO;
import com.vo.ParentAccountVO;

public class BankDepositAccountOrganizer {
	
	Map<String, ArrayList<ParentAccountVO>> output = new HashMap<String, ArrayList<ParentAccountVO>>();
	
	public Map<String, ArrayList<ParentAccountVO>>  processBankDepositData(String filePath){
		
		ParentAccountVO accountVO;
		LinkedDepositVO depositVO;
		String accountType =null;
//		Map<String, List<ParentAccountVO>> output = new HashMap<String, List<ParentAccountVO>>();
		File file = new File(filePath);
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String curLine;
			while((curLine = buffer.readLine())!= null){
				System.out.println(curLine);
				accountVO = new ParentAccountVO();
				depositVO = new LinkedDepositVO();
				List<LinkedDepositVO> deposits = new ArrayList<LinkedDepositVO>();
			//	List<ParentAccountVO> accounts = new ArrayList<ParentAccountVO>();
				StringTokenizer st = new StringTokenizer(curLine,",");
				while(st.hasMoreTokens()){
					accountVO.setParentAccountNumber(st.nextToken());
					accountVO.setName(st.nextToken());
					
					accountType = st.nextToken();
					accountVO.setType(accountType);
					depositVO.setLinkedDepositAccNumber(st.nextToken());
					depositVO.setDepositAmount(Integer.parseInt(st.nextToken()));
					
					String startDate = st.nextToken();
					String maturityDate = st.nextToken();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					Date depositStartDate = sdf.parse(startDate);
					Date depositMaturityDate = sdf.parse(maturityDate);
					depositVO.setDepositStartDate(depositStartDate);
					depositVO.setDepositMaturityDate(depositMaturityDate);
					
					deposits.add(depositVO);
					accountVO.setLinkedDeposits(deposits);
				//	accounts.add(accountVO);
					produceResult(accountType, accountVO);
				}
			//	output.put(accountType, accounts);
				
			}
			
			//System.out.println(output);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		return output;
	}
	
	private void produceResult(String accountType,ParentAccountVO accountVO) {
	//	Map<String, ArrayList<ParentAccountVO>> output = new HashMap<String, ArrayList<ParentAccountVO>>();
		
		ArrayList<ParentAccountVO> temp ;
		if(output.containsKey(accountType)){
			temp = output.get(accountType);
			temp.add(accountVO);
		}else{
			temp = new ArrayList<ParentAccountVO>();
			temp.add(accountVO);
		}
		output.put(accountType, temp);
		//System.out.println(output);
	}

	public Float calculateMaturityAmount(Date DepositStartDate ,Date DepositMaturityDate,int DepositAmount){
		return null;
	}
}
