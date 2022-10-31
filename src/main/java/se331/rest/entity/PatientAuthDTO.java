package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientAuthDTO {
    Long id;
    String name;
    String sur_name;
    String age;
    String hometown;
    List<String> authorities;
    String vaccined_status;
    String firstdose_name;
    String firstdose_time;
    String seconddose_name;
    String seconddose_time;
    String thirddose_name;
    String thirddose_time;
}
