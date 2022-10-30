package se331.rest.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Doctor;
import se331.rest.repository.DoctorRepository;

@Repository
public class DoctorDaoImpl implements DoctorDao{
    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public Integer getDoctorSize() {
        return Math.toIntExact(doctorRepository.count());
    }

    @Override
    public Page<Doctor> getDoctors(Integer pagesize, Integer page) {
        return doctorRepository.findAll(PageRequest.of(page-1,pagesize));
    }

    @Override
    public Doctor getDoctor(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

}
