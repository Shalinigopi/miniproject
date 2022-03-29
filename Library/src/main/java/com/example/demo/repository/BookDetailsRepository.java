package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.BookDetailsModel;

@Repository
public interface BookDetailsRepository  extends JpaRepository<BookDetailsModel, String>{
	@Query("select bdm from BookDetailsModel bdm where bookId=?1")
	public BookDetailsModel getByBookId(String bookId);
	

	

}
                                 