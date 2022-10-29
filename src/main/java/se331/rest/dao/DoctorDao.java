package se331.rest.dao;

import se331.rest.entity.Doctor;

public interface DoctorDao {
    Integer getDoctorSize();
    page<Doctor> getDoctors(Integer pagesize,Integer page);
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
}
