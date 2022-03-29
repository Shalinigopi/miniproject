package edu.vtop.MiniProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.vtop.MiniProject.Service.MessRegistrationService;

@Controller
public class MessRegistration {

	@Autowired
	MessRegistrationService  messRegistrationService;
	
	@RequestMapping("/doRegistration")
	public String getData (Model model)
	{
		
		model.addAttribute("studto",new StudentRegistraion());
		System.out.println("hello");
		return "MessRegistration";
	}
//	@PostMapping("/getRegistrationInfo")
//	public String getRegistrationInfo(Model model,  HttpServletRequest request) 
//	{
//		model.addAttribute("regData",new MessRegistration());
//		return "index";
//	}
	
	
	
//	@RequestMapping("/findAllRegistrationInfo")
//	public List<MessRegistrationDto> findAll()
//	{
//		return messRegistrationService.getRegistrationInfo();
//	}

//	@RequestMapping("/saveMessRegistrationDetails/{registerNo}/{messId}/{fromMonth}/{toMonth}/{amount}/{status}")
//	public String saveIssueCertificateDto
//	(
//			@PathVariable("registerNo") Integer RegisterNo,
//			@PathVariable("messId") Integer MessId,
//			@PathVariable("fromMonth")String FromMonth,
//			@PathVariable("toMonth")String ToMonth,
//			@PathVariable("amount")Integer Amount,
//	        @PathVariable("status")String Status)
//	{
//		MessRegistrationDto dto =new MessRegistrationDto();
//		dto.setRegisterNo(RegisterNo);
//		dto.setMessId(MessId);
//		dto.setFromMonth(FromMonth);
//		dto.setToMonth(ToMonth);
//		dto.setAmount(Amount);
//		dto.setStatus(Status);
//        System.out.println("RegisterNo,MessId,FromMonth,ToMonth,Amount,Status");
//		String result = messRegistrationService.saveMessRegistrationModel(dto);
//        
//		return result;
//	}	 
//	
	
}

