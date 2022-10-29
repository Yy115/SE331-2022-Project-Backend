package se331.rest.dao;

import se331.rest.entity.Doctor;
import org.springframework.data.domain.Page;

public interface DoctorDao {
    Integer getDoctorSize();
    Page<Doctor> getDoctors(Integer pagesize,Integer page);
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
}
