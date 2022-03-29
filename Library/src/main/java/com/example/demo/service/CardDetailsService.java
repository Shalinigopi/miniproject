package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.CardDetailsDto;
import com.example.demo.model.LibraryCardModel;
import com.example.demo.repository.BookCardRepository;

@Service
public class CardDetailsService {
	@Autowired 
	private BookCardRepository bookCardRepository;

	public List<LibraryCardModel> getLibraryInfo()
	{
		List<LibraryCardModel> cardList=bookCardRepository.findAll();

		return cardList;
	}
	//By using DTO Class findll:
	public List<CardDetailsDto> getAllCardInfo()
	{	
		List<LibraryCardModel> cardList = bookCardRepository.findAll();
		List<CardDetailsDto> cardDtoList= new ArrayList<>();

		for (LibraryCardModel cardDetail : cardList ){
			CardDetailsDto dto=new	CardDetailsDto();
			dto.setLibraryCardNo(cardDetail.getLibraryCardNo());
			dto.setLibraryCardType(cardDetail.getLibraryCardType());
			dto.setLibraryCardIssueDate(cardDetail.getLibraryCardIssueDate());
			dto.setMaxNumberBookAllowed(cardDetail.getMaxNumberBookAllowed());
			dto.setAcTive(cardDetail.getAcTive());
			cardDtoList.add(dto);

		}
		return cardDtoList;
	}

	//using optional method findOne cardNo:

	public  Optional<LibraryCardModel>  getfindOneByNo(String cardNo)
	{	
		Optional <LibraryCardModel> getcardNo = bookCardRepository.findById(cardNo);
		return getcardNo;
	}

	//update code:
	public String updateByCardNo(String cardNo, String libCardType)
	{	
		String msg="Not updated";

		LibraryCardModel libraryCardDetailModel=bookCardRepository.getcardNo(cardNo);                                                                                                                                                              

		if(libraryCardDetailModel!=null)
		{			
			System.out.println("Before "+libraryCardDetailModel.getLibraryCardType());
			libraryCardDetailModel.setLibraryCardType(libCardType);
			bookCardRepository.save(libraryCardDetailModel);
			System.out.println("After "+libraryCardDetailModel.getLibraryCardType());
			msg = "updated";

		}

		return msg;
	}

	//dto for single
	public CardDetailsDto getByCardNoLibraryInfo(String cardNo)
	{
		LibraryCardModel details = bookCardRepository.getcardNo(cardNo);
		CardDetailsDto dto =new CardDetailsDto();
		dto.setLibraryCardNo(details.getLibraryCardNo());
		dto.setLibraryCardType(details.getLibraryCardType());
		dto.setDigitalBooksAllowed(details.getDigitalBooksAllowed());
		dto.setLibraryCardIssueDate(details.getLibraryCardIssueDate());
		dto.setMaxNumberBookAllowed(details.getMaxNumberBookAllowed());
		dto.setAcTive(details.getAcTive());

		return dto;
	}

	//save oprations: 

	public String saveCardDetailsDto(String libraryCardNo, String libraryCardType, Integer maxNumberBookAllowed,  String acTive, String digitaBooksAllowed)
	{
		String msg="Saved";
		LibraryCardModel libraryCard = new LibraryCardModel();
		libraryCard.setLibraryCardNo(libraryCardNo);
		libraryCard.setLibraryCardType(libraryCardType);
		libraryCard.setDigitalBooksAllowed(digitaBooksAllowed);
		libraryCard.setAcTive(acTive);
		libraryCard.setDigitalBooksAllowed(digitaBooksAllowed);
		libraryCard.setLibraryCardIssueDate(LocalDateTime.now());
		libraryCard.setLogUserId("18742");
		libraryCard.setLogTimeStamp(LocalDateTime.now());
		libraryCard.setLogIpAddress("10.10.95.23");
		bookCardRepository.save(libraryCard);

		return msg;
	}
	//dto for Insert
	public String saveLibraryCardModel(CardDetailsDto cardDetailsDto)
	{
		String msg="Saved";
		LibraryCardModel libraryCard = new LibraryCardModel();
		libraryCard.setLibraryCardNo(cardDetailsDto.getLibraryCardNo());
		libraryCard.setLibraryCardType(cardDetailsDto.getLibraryCardType());
		libraryCard.setMaxNumberBookAllowed(cardDetailsDto.getMaxNumberBookAllowed());
		libraryCard.setAcTive(cardDetailsDto.getAcTive());
		libraryCard.setDigitalBooksAllowed(cardDetailsDto.getDigitalBooksAllowed());
		libraryCard.setLibraryCardIssueDate(LocalDateTime.now());
		libraryCard.setLogUserId("18742");
		libraryCard.setLogTimeStamp(LocalDateTime.now());
		libraryCard.setLogIpAddress("10.10.95.23");
		bookCardRepository.save(libraryCard);

		return msg;

	}		


	//Delete operations
	public String deleteByCardNO(String CardNO )
	{
		String msg="not updated";
		Optional<LibraryCardModel> libraryCardModel =this.getfindOneByNo(CardNO);

		boolean result = libraryCardModel.isPresent();
		if(result == true)
		{
			LibraryCardModel libraryCardDetails = libraryCardModel.get();
			System.out.println("Before:" +libraryCardDetails.getLibraryCardNo());
			libraryCardDetails.setLibraryCardNo(CardNO);
			System.out.println("After "+libraryCardDetails.getLibraryCardNo());
			bookCardRepository.save(libraryCardDetails);
			msg="deleted";
		}
		else
		{
			System.out.println("no details found");
			msg ="no details";
		}
		return msg;
	}
}

