package edu.vtop.MiniProject.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vtop.MiniProject.Dto.MessRegistrationDto;
import edu.vtop.MiniProject.Model.MessRegistrationModel;
import edu.vtop.MiniProject.Model.MessRegistrationModelPK;
import edu.vtop.MiniProject.Repository.MessRegistrationRepository;
import edu.vtop.MiniProject.util.PaymentTestConstants;


@Service
public class MessRegistrationService {
	@Autowired
	private MessRegistrationRepository messRegistrationRepository;

	//findall
	public List<MessRegistrationDto> getRegistrationInfo()
	{
		List<MessRegistrationModel> registrationList = messRegistrationRepository.findAll();
		List<MessRegistrationDto> registrationDtoList= new ArrayList<>();
		for (MessRegistrationModel registrationDetail : registrationList) {
			MessRegistrationDto regdto=new	MessRegistrationDto();
			regdto.setRegisterNo(registrationDetail.getId().getRegisterNo());
			regdto.setMessId(registrationDetail.getId().getMessId());
			regdto.setFromMonth(registrationDetail.getFromMonth());
			regdto.setToMonth(registrationDetail.getToMonth());
			regdto.setAmount(registrationDetail.getAmount());
			regdto.setStatus(registrationDetail.getStatus());
			registrationDtoList.add(regdto);
			
		}
		return registrationDtoList;
	}

	//dto for Insert
	public String saveMessRegistrationModel(MessRegistrationDto messRegistrationDto)
	{
		String msg = PaymentTestConstants.SUCCESS;
		MessRegistrationModel registerData = new MessRegistrationModel();
		
		MessRegistrationModelPK pk = new MessRegistrationModelPK();
		pk.setMessId(messRegistrationDto.getMessId());
		pk.setRegisterNo(messRegistrationDto.getRegisterNo());
		
		registerData.setId(pk);
		
		registerData.setFromMonth(registerData.getFromMonth());
		registerData.setToMonth(registerData.getToMonth());
		registerData.setAmount(registerData.getAmount());
        registerData.setStatus(registerData.getStatus());
		messRegistrationRepository.save(registerData);
		return msg;

	}
}