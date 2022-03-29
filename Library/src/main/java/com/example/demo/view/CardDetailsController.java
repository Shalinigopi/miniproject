package com.example.demo.view;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CardDetailsDto;
import com.example.demo.model.LibraryCardModel;
import com.example.demo.service.CardDetailsService;


@RestController
@RequestMapping("/libraryCard")
public class CardDetailsController {

		@Autowired CardDetailsService cardDetailsService;
		
//using optional find all card details:
		@RequestMapping("/getAllLibraryCardDetails")
		public List<LibraryCardModel> getAllLibraryCardDetails()
		{
			List<LibraryCardModel> cardDetail= cardDetailsService.getLibraryInfo();
			return cardDetail;
		}
		
		//Single Dto findall:
		
		@RequestMapping("/findOneNo/{CardNo}")
		public CardDetailsDto getOneByCardNo(@PathVariable("CardNo") String  CardNo)
		{
			return cardDetailsService.getByCardNoLibraryInfo(CardNo);
		}
		
		
//using optional find one card details:
		@RequestMapping("/findOneById/{cardNo}")
		public Optional<LibraryCardModel> findOneById(@PathVariable("cardNo") String cardNo)
		{		
			return cardDetailsService.getfindOneByNo(cardNo);
		}
		

		@RequestMapping("/cardNofindBy/{cardNo}")
		public List<CardDetailsDto> findAll1()
		{
			List<CardDetailsDto> cardDetail1= cardDetailsService.getAllCardInfo();
			return cardDetail1;
		}
		
		
//update code:		
		@RequestMapping("/updateByCardNo/{cardNo}/{cardType}")
		public String updateByNo(@PathVariable("cardNo") String cardNo ,
				                 @PathVariable("cardType") String cardType)

		{		
			String result = cardDetailsService.updateByCardNo(cardNo, cardType);
			System.out.println("shalini");
			return result;
		}
//delete code:		
		@RequestMapping("/deletecard/{cardNo}")
		 public String deleteById(@PathVariable("cardNo") String cardNo)
		 {
		  String result =  cardDetailsService.deleteByCardNO(cardNo);
		  return result;
		 }
//Save Code Dto:
		@RequestMapping("/saveLibraryCarddto/{libCardNo}/{libCardType}/{maxNumberBooksAllowed}/"
				   +"{active}/{digitaBooksAllowed}")
				 public String saveBookDetailsDto(
				  @PathVariable("libCardNo") String libCardNo,
				  @PathVariable("libCardType")String libCardType,
				  @PathVariable("maxNumberBooksAllowed")Integer maxNumberBooksAllowed,
				  @PathVariable("active")String active,
				  @PathVariable("digitaBooksAllowed")String digitaBooksAllowed)
				 {
				  CardDetailsDto dto =new CardDetailsDto();
				  dto.setLibraryCardNo(libCardNo);
				  dto.setLibraryCardType(libCardType);
				  dto.setMaxNumberBookAllowed(maxNumberBooksAllowed);
				  dto.setAcTive(active);
				  dto.setDigitalBooksAllowed(digitaBooksAllowed);
				  String result = cardDetailsService.saveLibraryCardModel(dto);
				  return result;
						  }
		
//save code for model:
		@RequestMapping("/saveLibraryCard/{libCardNo}/{libCardType}/{maxNumberBooksAllowed}/"
				   +"{active}/{digitaBooksAllowed}")
				 public String saveBookDetails(
				  @PathVariable("libCardNo") String libCardNo,
				  @PathVariable("libCardType")String libCardType,
				  @PathVariable("maxNumberBooksAllowed")Integer maxNumberBooksAllowed,
				  @PathVariable("active")String active,
				  @PathVariable("digitaBooksAllowed")String digitaBooksAllowed)
				 {
				  String result = cardDetailsService.saveCardDetailsDto(libCardNo, libCardType, maxNumberBooksAllowed, active, digitaBooksAllowed);
				  return result;
				  
				 }
		
}
				  