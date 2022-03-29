 package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.LibraryCardModel;



	@Repository
	public interface BookCardRepository  extends JpaRepository<LibraryCardModel, String>
	{
		@Query("select bdm from LibraryCardModel bdm where libraryCardNo=?1")
		public LibraryCardModel getcardNo(String cardNo);
		
	}
	