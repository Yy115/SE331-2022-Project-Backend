package se331.rest.entity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;

    String name;
    String sur_name;
    String age;
    String hometown;
    @ElementCollection
    List<String> imageUrl;

    String vaccined_status;
    String firstdose_name;
    String firstdose_time;
    String seconddose_name;
    String seconddose_time;

    @ManyToOne
    Doctor doctor;

    @OneToMany
    @Builder.Default
    List<Comment> comments = new ArrayList<>();


}
