package edu.vtop.MiniProject.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.vtop.MiniProject.Dto.MasterMessDto;
import edu.vtop.MiniProject.Model.MasterMessModel;
import edu.vtop.MiniProject.Repository.MasterRepository;


@Service
public class MasterMessService {
	@Autowired
	private MasterRepository masterRepository;

	//findall
	public List<MasterMessDto> getMasterMessInfo()
	{
		List<MasterMessModel> masterList=masterRepository.findAll();
		List<MasterMessDto> masterMessDtoList=new ArrayList<>();
		for(MasterMessModel masterDetail:masterList)
		{
			MasterMessDto masterDto=new MasterMessDto();
		
			masterDto.setMessName(masterDetail.getMessName());
			masterDto.setDescripTion(masterDetail.getDescripTion());
			masterMessDtoList.add(masterDto);
		}
		return masterMessDtoList;
	}

	//Insert
	public String saveMasterMessModel(MasterMessDto masterMessDto)
	{
		String msg="Saved";
		MasterMessModel masterDetail = new MasterMessModel();
		masterDetail.setMessId(masterMessDto.getMessId());
		masterDetail.setMessName(masterMessDto.getMessName());
		masterDetail.setDescripTion(masterMessDto.getDescripTion());
		masterRepository.save(masterDetail);
		return msg;
	}
	

	
	
	
	
	
	
	
	
}