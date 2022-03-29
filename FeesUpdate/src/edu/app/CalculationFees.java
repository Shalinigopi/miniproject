package edu.app;


import java.util.List;

public class CalculationFees {

	public void calculatefee(List<Studentdto> StudentdtoList)
	{
		
		
		for(Studentdto sInfo:StudentdtoList) {
			
			
			List<Feesdto>updateList= sInfo.getFeesdtoList();
			
			

			double totalfees=0;

			for(Feesdto Feesdto:updateList)
			{
				totalfees=	totalfees+Feesdto.getFees();

			}
			sInfo.setTotalfee(totalfees);
		}
	}
}


