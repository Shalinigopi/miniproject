package edu.vtop.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.vtop.MiniProject.Model.MessRegistrationModel;


@Repository
public interface MessRegistrationRepository extends JpaRepository<MessRegistrationModel, Integer> {

}
