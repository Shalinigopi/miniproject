package com.example.demo.view;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDetailsDto;
import com.example.demo.model.BookDetailsModel;
import com.example.demo.service.BookDetailsSerivce;


@RestController
@RequestMapping("/lib")
public class BookDetailsController {

	@Autowired BookDetailsSerivce bookDetailsSerivce;

	//using optional find all card details:
	@RequestMapping("/lib/getall3")
	public List<BookDetailsModel>findAll()
	{
		List<BookDetailsModel> bookdetail1= bookDetailsSerivce.getLibraryInfo();
		return bookdetail1;
	}

	// using dto findall:
	@RequestMapping("/lib/findall")
	public List<BookDetailsDto>findAll1()
	{
		List<BookDetailsDto> bookdetail= bookDetailsSerivce.getAllBookInfo();
		return bookdetail;
	}

	//using single dto findone id:
	@RequestMapping("/findOneBy/{id}")
	public BookDetailsDto getByIdBookDetailsInfo(@PathVariable("id") String id)
	{		
		return bookDetailsSerivce.getByIdBookDetailsInfo(id);
	}



	//using optional find one :
	@RequestMapping("/findOne/{id}")
	public Optional<BookDetailsModel> findOneById(@PathVariable("id") String id)
	{		
		return bookDetailsSerivce.getfindOneById(id); 	
	}

	//update code:
	@RequestMapping("/updateById/{id}/{bookTitle}")
	public String updateById(@PathVariable("id") String id, 
			@PathVariable("bookTitle") String bookTitle)

	{		
		String result = bookDetailsSerivce.updateById(id, bookTitle);
		//bookDetailsService.updateById(id,bookTit);	
		System.out.println("shalini");
		return result;
	}
}