package edu.vtop.MiniProject.Controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.vtop.MiniProject.Dto.StudentDto;

import edu.vtop.MiniProject.Service.StudentDetailService;


@Controller
public class StudentRegistraion {
	@Autowired StudentDetailService  studentDetailService;

	@RequestMapping("/login")
	public String getData (Model model)
	{
		
		model.addAttribute("studto",new StudentRegistraion());
//		System.out.println("hello");
		return "HomePage";
	}

//	//view method
//	@RequestMapping("/finall")
//	public List<StudentDto> findAllStudentDetailInfo()
//	{
//
//		return studentDetailService.getAllStudentInfo();
//	}
	//html display
	
	
	@PostMapping("/getStudentInfo")
	public String getStudentInfo(Model model,  HttpServletRequest request) 
	{
		Integer registerNumber= Integer.parseInt(request.getParameter("SearchStudent")) ;
		StudentDto stuDto = studentDetailService.getStudentRegisterNumber(registerNumber);
		model.addAttribute("stuDto",stuDto);
		return "StudentDetails";
	}

	@PostMapping("/getRegistrationInfo")
    public String studentInfo(Model model, HttpServletRequest request)
{
	
	/*
	 * String mregisterNumber = request.getParameter("registernumber"); String mname
	 * = request.getParameter("Name"); String mGender =
	 * request.getParameter("Gender"); String mphone =
	 * request.getParameter("phone"); String memail = request.getParameter("email");
	 * String mdepartment = request.getParameter("Department");
	 * 
	 * 
	 * StudentDto student =new StudentDto();
	 * student.setRegisterNumber(Integer.parseInt(mregisterNumber));
	 * student.setStudentName(mname); student.setDepartMent(mdepartment);
	 * student.setEmailId(memail); student.setGender(mGender);
	 * student.setPhoneNO(Long.parseLong(mphone));
	 * model.addAttribute("student",student);
	 */
		  model.addAttribute("student",studentDetailService.getAllStudentInfo());

	return "index";
	  
}
	
	@PostMapping("/doStutRegStore")
    public String doStutRegStore(Model model, HttpServletRequest request)
{
		System.out.println("test");

	  String mregisterNumber = request.getParameter("registernumber"); 
	  String mname = request.getParameter("Name"); 
	  String mGender =request.getParameter("Gender"); 
	  String mphone =request.getParameter("phone"); 
	  String memail = request.getParameter("email");
	  String mdepartment = request.getParameter("Department");
	  
		System.out.println("mregisterNumber"+mregisterNumber + mname + mGender + mdepartment + mphone + memail);
	  
	  StudentDto student =new StudentDto();
	  student.setRegisterNumber(Integer.parseInt(mregisterNumber));
	  student.setStudentName(mname); student.setDepartMent(mdepartment);
	  student.setEmailId(memail); student.setGender(mGender);
	  student.setPhoneNO(Long.parseLong(mphone));
	  studentDetailService.saveStudentDetailsModel(student);
	  
	  model.addAttribute("student",studentDetailService.getAllStudentInfo());
	 
	return "index";
	  
}
	
	
}

	
	
	
	
//	//insert for  dto
//	@RequestMapping("/saveStudent/{registerNumber}/{studentName}/{gender}/{emailId}/{departMent}/{phoneNO}")
//	public String  studentinfo(@PathVariable ("registerNumber") Integer registerNumber,
//			@PathVariable("studentName")String studentName,
//			@PathVariable("gender")String gender,
//			@PathVariable("emailId")String emailId,
//			@PathVariable("departMent")String departMent,
//			@PathVariable("phoneNO")Integer phoneNO)
//	{
//		StudentDto dto =new StudentDto();
//		dto.setRegisterNumber(registerNumber);
//		dto.setStudentName(studentName);
//		dto.setGender(gender);
//		dto.setEmailId(emailId);
//		dto.setDepartMent(departMent);
//		dto.setPhoneNO(phoneNO);
//		String result = studentDetailService.saveStudentDetailsModel(dto);
//
//		return result;
//
//	}


