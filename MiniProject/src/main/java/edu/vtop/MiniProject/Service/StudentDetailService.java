package edu.vtop.MiniProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vtop.MiniProject.Dto.StudentDto;
import edu.vtop.MiniProject.Model.StudentDetailsModel;
import edu.vtop.MiniProject.Repository.StudentDetailsRepository;
@Service
public class StudentDetailService {

	@Autowired

	//findall 
	private StudentDetailsRepository studentDetailsRepository;
	public List<StudentDto> getAllStudentInfo()
	{	
		List<StudentDetailsModel> studentList = studentDetailsRepository.findAll();
		List<StudentDto> studentDtoList= new ArrayList<>();
		for (StudentDetailsModel studentDetail : studentList) {
			StudentDto dto=new	StudentDto();
			dto.setRegisterNumber(studentDetail.getRegisterNumber());
			dto.setStudentName(studentDetail.getStudentName());
			dto.setGender(studentDetail.getGender());
			dto.setEmailId(studentDetail.getEmailId());
			dto.setPhoneNO(studentDetail.getPhoneNO());
		}
		return studentDtoList;	
		
	}
	public List<StudentDetailsModel> getByAll(){


		 return studentDetailsRepository.findAll();

		}
	//insert
	public String saveStudentDetailsModel(StudentDto studentDto)
	{
		String msg="Saved";
		StudentDetailsModel studentDetail = new StudentDetailsModel();
		studentDetail.setRegisterNumber(studentDto.getRegisterNumber());
		studentDetail.setStudentName(studentDto.getStudentName());
		studentDetail.setGender(studentDto.getGender());
		studentDetail.setDepartMent(studentDto.getDepartMent());
		studentDetail.setEmailId(studentDto.getEmailId());
		studentDetail.setPhoneNO(studentDto.getPhoneNO());
		studentDetailsRepository.save(studentDetail);
		return msg;
	}
//view data form database in html	
	public StudentDto getStudentRegisterNumber(Integer Id)
	
	{
		StudentDto studentDto=new StudentDto();
		System.out.println("service called"+Id);
		StudentDetailsModel studentModel=studentDetailsRepository.findById(Id).orElse(null);
		System.out.println("studentModel_register"+studentModel.getRegisterNumber());

		studentDto.setRegisterNumber(studentModel.getRegisterNumber());
		studentDto.setStudentName(studentModel.getStudentName());
		studentDto.setDepartMent(studentModel.getDepartMent());
		studentDto.setEmailId(studentModel.getEmailId());
		studentDto.setPhoneNO(studentModel.getPhoneNO());
		studentDto.setGender(studentModel.getGender());
		return studentDto;
	}
//insert data from html

	public StudentDto updateEmpInfo (Integer Id, StudentDto dto)
	{
		StudentDto updateDetailsDto = new StudentDto();
		String message ="Inserted";
		StudentDetailsModel studentDetailsModel= new StudentDetailsModel();
		studentDetailsModel.setRegisterNumber(dto.getRegisterNumber());
		studentDetailsModel.setStudentName(dto.getStudentName());
		studentDetailsModel.setDepartMent(dto.getDepartMent());
		studentDetailsModel.setGender(dto.getGender());
		studentDetailsModel.setEmailId(dto.getEmailId());
		studentDetailsModel.setPhoneNO(dto.getPhoneNO());
		studentDetailsRepository.save(studentDetailsModel);
		
		updateDetailsDto.setRegisterNumber(studentDetailsModel.getRegisterNumber());
		updateDetailsDto.setStudentName(studentDetailsModel.getStudentName());
		updateDetailsDto.setDepartMent(studentDetailsModel.getDepartMent());
		updateDetailsDto.setGender(studentDetailsModel.getGender());
		updateDetailsDto.setEmailId(studentDetailsModel.getEmailId());
		updateDetailsDto.setPhoneNO(studentDetailsModel.getPhoneNO());
		
		
		
		
		return updateDetailsDto;
		 
	}
}














//	public List<StudentDetailsModel> getStudentInfo()
//	{
//		List<StudentDetailsModel> studentlist= studentDetailsRepository.findAll();
//		return studentlist;
//	}





