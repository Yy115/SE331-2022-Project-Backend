package se331.rest.service;


import org.springframework.data.domain.Page;
import se331.rest.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Integer getDoctorSize();
    Page<Doctor> getDoctors(Integer pageSize, Integer page);
    List<Doctor> getDoctors();
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
}
