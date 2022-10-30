package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    Long id;

    String name;
    String sur_name;
    String age;
    String hometown;
    String vaccined_status;
    String firstdose_name;
    String firstdose_time;
    String seconddose_name;
    String seconddose_time;
    String thirddose_name;
    String thirddose_time;
    List<String> imageUrl;
    PatientDoctorDTO doctor;
    List<CommentDTO> comments = new ArrayList<>();
}
