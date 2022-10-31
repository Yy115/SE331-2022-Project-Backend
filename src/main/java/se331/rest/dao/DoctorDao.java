package se331.rest.dao;

import se331.rest.entity.Doctor;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DoctorDao {
    Integer getDoctorSize();
    Page<Doctor> getDoctors(Integer pagesize,Integer page);
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
    List<Doctor> getDoctors();
}
