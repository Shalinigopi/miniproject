package edu.vtop.MiniProject.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.vtop.MiniProject.Dto.MasterMessDto;
import edu.vtop.MiniProject.Service.MasterMessService;

@RestController
@RequestMapping("/masterData")
public class MasterMess {

	@Autowired 
	MasterMessService masterMessService;

	@RequestMapping("/findAllMasterMessInfo")
	public List<MasterMessDto>findAll()
	{
		return masterMessService.getMasterMessInfo();
	}

	@RequestMapping("/saveMessRegistrationDetails/{messId}/{messName}/{descripTion}")
	public String saveMasterMessDto
	(
			@PathVariable("messId") Integer MessId,
			@PathVariable("messName") String MessName,
			@PathVariable("descripTion") String Description)
	{
		MasterMessDto messDto=new MasterMessDto();
		messDto.setMessId(MessId);
		messDto.setMessName(MessName);
		messDto.setDescripTion(Description);
		String result=masterMessService.saveMasterMessModel(messDto);
		return result;
	}
	@PostMapping("/doMastermess")
	public String messInfo()
	{
		
		return "messRegistration";

	}
}
