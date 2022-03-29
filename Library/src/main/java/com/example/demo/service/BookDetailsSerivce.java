package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDetailsDto;

import com.example.demo.model.BookDetailsModel;
import com.example.demo.repository.BookDetailsRepository;


@Service
public class BookDetailsSerivce {

	@Autowired 
	private BookDetailsRepository  bookDetailsRepository;
	
//By using DTO Class 
	public List<BookDetailsDto> getAllBookInfo()
	{	
		List<BookDetailsModel> bookList = bookDetailsRepository.findAll();
		List<BookDetailsDto> bookDtoList= new ArrayList<>();
		
		for (BookDetailsModel bookDetail : bookList) {
			BookDetailsDto dto=new	BookDetailsDto();
			dto.setBookId(bookDetail.getBookId());
			dto.setBookTitle(bookDetail.getBookTitle());
			dto.setAuthorName(bookDetail.getAuthorName());
			dto.setEdition(bookDetail.getEdition());
			dto.setPubYearDate(bookDetail.getPubYearDate());
			bookDtoList.add(dto);

		}
		return bookDtoList;
	}
	
	//using optional 

	public List<BookDetailsModel> getLibraryInfo()
	{
		List<BookDetailsModel> cardList=bookDetailsRepository.findAll();

		return cardList;
	}
	
	public BookDetailsDto getByIdBookDetailsInfo(String id)
	{
		BookDetailsModel details =bookDetailsRepository.getByBookId(id);
		BookDetailsDto dto=new BookDetailsDto();
		dto.setBookId(details.getBookId());
		dto.setBookTitle(details.getBookTitle());
		dto.setBookCategory(details.getBookCategory());
		dto.setEdition(details.getEdition());
		dto.setPubYearDate(details.getPubYearDate());
		
		return dto;
	}

	
	public  Optional<BookDetailsModel>  getfindOneById(String id)
	{	
		Optional <BookDetailsModel> getOneById = bookDetailsRepository.findById(id);
		return getOneById;
	}
	
	
	
	
	// update method
	public String updateById(String id, String bookTitle)
	{	
		String msg="Not updated";

		BookDetailsModel bookDetailsModelOpt=bookDetailsRepository.getByBookId(id);

		if(bookDetailsModelOpt!=null)
		{			
			System.out.println("Before "+bookDetailsModelOpt.getBookTitle());
			bookDetailsModelOpt.setBookTitle(bookTitle);
			bookDetailsRepository.save(bookDetailsModelOpt);
			System.out.println("After "+bookDetailsModelOpt.getBookTitle());
			msg = "updated";

		}

		return msg;
	}

}

