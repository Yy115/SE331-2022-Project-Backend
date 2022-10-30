package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.events.Event;
import se331.rest.entity.Patient;

import javax.transaction.Transactional;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findAll();

    Page<Patient> findByDoctorId(Long doctor_id,Pageable pageRequest);

    @Modifying
    @Transactional
    @Query(value = "update patient set user_id = ?1 where id = ?2",nativeQuery = true)
    void AddUser(Long user_id,Long id);
}