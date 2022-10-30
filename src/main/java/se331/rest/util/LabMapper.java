package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import se331.rest.entity.*;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(imports = Collectors.class)
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    DoctorDTO getDoctorDTO(Doctor doctor);
    List<DoctorDTO> getDoctorDTO(List<Doctor> doctors);
    PatientDTO getPatientDTO(Patient patient);
    List<PatientDTO> getPatientDTO(List<Patient> patients);
    CommentDTO getCommentDTO(Comment comment);
    List<CommentDTO> getCommentDTO(List<Comment> commentList);
}
