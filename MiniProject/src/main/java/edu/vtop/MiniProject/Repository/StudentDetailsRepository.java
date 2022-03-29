package edu.vtop.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.vtop.MiniProject.Model.StudentDetailsModel;
@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetailsModel,Integer>
{
	
//	@Query("select * from  student_details a where register_no=?1")
//	public StudentDetailsModel getByregisterInfo(Integer registerno);
	
	
}
