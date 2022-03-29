package edu.vtop.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.vtop.MiniProject.Model.MasterMessModel;


@Repository
public interface MasterRepository extends JpaRepository<MasterMessModel, String>
{
	@Query("select bdm from MasterMessModel bdm where messId=?1 ")
	public MasterMessModel getcardNo(Integer messId);

}


