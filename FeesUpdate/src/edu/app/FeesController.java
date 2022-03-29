package edu.app;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class FeesController {
	
	public static void main(String[] args) {
		
//first student details and fees:
		
			List<Studentdto> StudentdtoList = new ArrayList<>();
			Studentdto Info = new Studentdto();
			Info.setId(001);
			Info.setName("AkashManavalan");
			Info.setDepartMent("Bcom");
			Info.setAddress("Vaniyambadi");
			
			List<Feesdto> FeesdtoList = new ArrayList<>();
			Feesdto Fees1=new Feesdto();
			Fees1.setFeesCategogry("TutionFees");
			Fees1.setFees(50000);
			FeesdtoList.add(Fees1);
			
			Feesdto Fees2=new Feesdto();
			Fees2.setFeesCategogry("SemFees");
			Fees2.setFees(20000);
			FeesdtoList.add(Fees2);
			
			Feesdto Fees3=new Feesdto();
			Fees3.setFeesCategogry("BusFees");
			Fees3.setFees(10000);
			FeesdtoList.add(Fees3);
			
			
			
//second student details and fees:			
			
			Studentdto Info1 = new Studentdto();
			Info1.setId(002);
			Info1.setName("Shalini");
			Info1.setDepartMent("MCA");
			Info1.setAddress("Ambur");
			
			List<Feesdto> FeesdtoList1 = new ArrayList<Feesdto>();
			Feesdto Fees5=new Feesdto();
			Fees5.setFeesCategogry("TutionFees");
			Fees5.setFees(50000);
			FeesdtoList1.add(Fees5);
			
			Feesdto Fees6=new Feesdto();
			Fees6.setFeesCategogry("SemFees");
			Fees6.setFees(20000);
			FeesdtoList1.add(Fees6);
			
			Feesdto Fees7=new Feesdto();
			Fees7.setFeesCategogry("BusFees");
			Fees7.setFees(10000);
			FeesdtoList1.add(Fees7);
			
			Info.setFeesdtoList(FeesdtoList);
			Info1.setFeesdtoList(FeesdtoList1);
			
			
			StudentdtoList.add(Info);
			StudentdtoList.add(Info1);
			
			CalculationFees cal=new CalculationFees();
			cal.calculatefee(StudentdtoList);
			for(Studentdto sInfo:StudentdtoList)
			{
				System.out.println("Student Information");
				System.out.println("Name"+sInfo.getName());
				System.out.println("Id"+sInfo.getId());
				System.out.println("Department:"+sInfo.getDepartMent());
				
				List<Feesdto>updateList=sInfo.getFeesdtoList();
				for(Feesdto feesdto:updateList) 
				{
					System.out.println(feesdto.getFeesCategogry()+":"+feesdto.getFees());
				}
			
				System.out.println("totalfees:"+sInfo.getTotalfee());
			
			
			
		
			
	 	}
			
			
			
	}
}

