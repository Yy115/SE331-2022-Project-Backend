package se331.rest.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import se331.rest.entity.Comment;
import se331.rest.entity.Doctor;
import se331.rest.entity.Patient;
import se331.rest.repository.CommentRepository;
import se331.rest.repository.DoctorRepository;
import se331.rest.repository.PatientRepository;
import se331.rest.security.entity.Authority;
import se331.rest.security.entity.AuthorityName;
import se331.rest.security.entity.User;
import se331.rest.security.repository.AuthorityRepository;
import se331.rest.security.repository.UserRepository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    UserRepository userRepository;
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Doctor doctor1,doctor2,doctor3,doctor4,doctor5;
        doctor1 = doctorRepository.save(Doctor.builder()
                .name("d1Yang")
                .sur_name("d1Chen")
                .age("34")
                .hometown("YunNan")
                .build());
        doctor2 = doctorRepository.save(Doctor.builder()
                .name("d2Haitao")
                .sur_name("d2Liu")
                .age("34")
                .hometown("ShanXi")
                .build());
        doctor3 = doctorRepository.save(Doctor.builder()
                .name("d3Tao")
                .sur_name("d3Liang")
                .age("45")
                .hometown("Shanghai")
                .build());
        doctor4 = doctorRepository.save(Doctor.builder()
                .name("Fu")
                .sur_name("Zhang")
                .age("47")
                .hometown("Beijing")
                .build());
        doctor5 = doctorRepository.save(Doctor.builder()
                .name("Gong")
                .sur_name("Liang")
                .age("37")
                .hometown("Shanghai")
                .build());
        Patient patient1,patient2,patient3,patient4,patient5,patient6,patient7,patient8,patient9,patient10,patient11,patient12;
        patient1 = patientRepository.save(Patient.builder()
                .name("p1Yang")
                .sur_name("P1Chen")
                .age("21")
                .hometown("YunNan")
                .firstdose_name("inactivated vaccine")
                .firstdose_time("02-19,2020")
                .vaccined_status("FirstDose")
                .doctor(doctor3)
                .build());
        patient2 = patientRepository.save(Patient.builder()
                .name("p1Haitao")
                .sur_name("p1Liu")
                .age("22")
                .hometown("ShanXi")
                .firstdose_name("vector vaccine")
                .firstdose_time("09-23,2021")
                .seconddose_name("vector vaccine")
                .seconddose_time("11-21,2021")
                .thirddose_name("vector vaccine")
                .thirddose_time("03-24,2022")
                .vaccined_status("ThirdDose")
                .doctor(doctor5)
                .build());
        patient3 = patientRepository.save(Patient.builder()
                .name("Yun")
                .sur_name("Han")
                .age("27")
                .hometown("Henan")
                .firstdose_name("live attenuated vaccine")
                .firstdose_time("05-14,2022")
                .seconddose_name("live attenuated vaccine")
                .seconddose_time("08-20,2022")
                .vaccined_status("SecondDose")
                .doctor(doctor1)
                .build());
        patient4 = patientRepository.save(Patient.builder()
                .name("Xixi")
                .sur_name("Lu")
                .age("20")
                .hometown("Ningxia")
                .firstdose_name("inactivated vaccine")
                .firstdose_time("06-19,2022")
                .vaccined_status("FirstDose")
                .doctor(doctor2)
                .build());
        patient5 = patientRepository.save(Patient.builder()
                .name("Fan")
                .sur_name("Tao")
                .age("19")
                .hometown("Ningxia")
                .vaccined_status("Not Vaccinated")
                .doctor(doctor2)
                .build());
        patient6 = patientRepository.save(Patient.builder()
                .name("Li")
                .sur_name("Ma")
                .age("28")
                .hometown("Ningxia")
                .vaccined_status("Not Vaccinated")
                .doctor(doctor2)
                .build());
        patient7 = patientRepository.save(Patient.builder()
                .name("Teng")
                .sur_name("Shen")
                .age("23")
                .hometown("Gansu")
                .firstdose_name("live attenuated vaccine")
                .firstdose_time("08-29,2021")
                .seconddose_name("live attenuated vaccine")
                .seconddose_time("11-11,2021")
                .vaccined_status("SecondDose")
                .doctor(doctor1)
                .build());
        patient8 = patientRepository.save(Patient.builder()
                .name("Haiyin")
                .sur_name("Li")
                .age("23")
                .hometown("Shanghai")
                .firstdose_name("inactivated vaccine")
                .firstdose_time("04-15,2021")
                .seconddose_name("inactivated vaccine")
                .seconddose_time("07-26,2021")
                .thirddose_name("inactivated vaccine")
                .thirddose_time("07-26,2022")
                .vaccined_status("ThirdDose")
                .doctor(doctor3)
                .build());
        patient9 = patientRepository.save(Patient.builder()
                .name("Lun")
                .sur_name("Ai")
                .age("27")
                .hometown("Guizhou")
                .firstdose_name("live attenuated vaccine")
                .firstdose_time("05-10,2021")
                .seconddose_name("live attenuated vaccine")
                .seconddose_time("08-19,2021")
                .vaccined_status("SecondDose")
                .doctor(doctor3)
                .build());
        patient10 = patientRepository.save(Patient.builder()
                .name("Yuan")
                .sur_name("Chang")
                .age("24")
                .hometown("HuNan")
                .firstdose_name("vector vaccine")
                .firstdose_time("07-15,2022")
                .seconddose_name("vector vaccine")
                .seconddose_time("09-13,2022")
                .thirddose_name("inactivated vaccine")
                .thirddose_time("10-26,2022")
                .vaccined_status("ThirdDose")
                .doctor(doctor4)
                .build());
        patient11 = patientRepository.save(Patient.builder()
                .name("ChenSi")
                .sur_name("Wang")
                .age("29")
                .hometown("SiChuan")
                .firstdose_name("RNA vaccine")
                .firstdose_time("03-7,2022")
                .seconddose_name("RNA vaccine")
                .seconddose_time("09-29,2022")
                .thirddose_name("inactivated vaccine")
                .thirddose_time("10-29,2022")
                .vaccined_status("ThirdDose")
                .doctor(doctor4)
                .build());
        patient12 = patientRepository.save(Patient.builder()
                .name("Haibao")
                .sur_name("Gao")
                .age("21")
                .hometown("Shanghai")
//                .firstdose_name("live attenuated vaccine")
//                .firstdose_time("06-23,2022")
                .vaccined_status("Not Vaccinated")
//                .doctor(doctor5)
                .build());



        Comment comment1,comment2,comment3,comment4,comment5,comment6,comment7,comment8,comment9,comment10,comment11,comment12;
        comment1 = commentRepository.save(Comment.builder()
                .comment("Don't eat seafood")
                .doctor( doctor1)
                .patient(patient1).build());
        comment2 = commentRepository.save(Comment.builder()
                .comment("Take more rest and avoid strenuous exercise")
                .doctor( doctor1)
                .patient(patient2).build());
        comment3 = commentRepository.save(Comment.builder()
                .comment("No drinking")
                .doctor( doctor2)
                .patient(patient3).build());
        comment4 = commentRepository.save(Comment.builder()
                .comment("Don't take a bath")
                .doctor( doctor2)
                .patient(patient4).build());
        comment5 = commentRepository.save(Comment.builder()
                .comment("Take more rest and avoid strenuous exercise")
                .doctor( doctor3)
                .patient(patient5).build());
        comment6 = commentRepository.save(Comment.builder()
                .comment("take medicine on time")
                .doctor( doctor3)
                .patient(patient6).build());
        comment7 = commentRepository.save(Comment.builder()
                .comment("A light diet")
                .doctor( doctor4)
                .patient(patient7).build());
        comment8 = commentRepository.save(Comment.builder()
                .comment("Please drink more water.")
                .doctor( doctor4)
                .patient(patient8).build());
        comment9 = commentRepository.save(Comment.builder()
                .comment("Don't take hormone drugs")
                .doctor( doctor5)
                .patient(patient9).build());
        comment10 = commentRepository.save(Comment.builder()
                .comment("Please eat more fruit.")
                .doctor( doctor5)
                .patient(patient10).build());
        comment11 = commentRepository.save(Comment.builder()
                .comment("Please supplement protein.")
                .doctor( doctor5)
                .patient(patient11).build());
        comment12 = commentRepository.save(Comment.builder()
                .comment("Please drink more water.")
                .doctor( doctor5)
                .patient(patient12).build());
        //??????????????????????????????
        List<Comment> commentListd1 = new ArrayList<>();
        List<Comment> commentListd2 = new ArrayList<>();
        List<Comment> commentListd3 = new ArrayList<>();
        List<Comment> commentListd4 = new ArrayList<>();
        List<Comment> commentListd5 = new ArrayList<>();
        //????????????????????????????????????
        List<Comment> commentList1 = new ArrayList<>();
        List<Comment> commentList2 = new ArrayList<>();
        List<Comment> commentList3 = new ArrayList<>();
        List<Comment> commentList4 = new ArrayList<>();
        List<Comment> commentList5 = new ArrayList<>();
        List<Comment> commentList6 = new ArrayList<>();
        List<Comment> commentList7 = new ArrayList<>();
        List<Comment> commentList8 = new ArrayList<>();
        List<Comment> commentList9 = new ArrayList<>();
        List<Comment> commentList10 = new ArrayList<>();
        List<Comment> commentList11 = new ArrayList<>();
        List<Comment> commentList12 = new ArrayList<>();
        //???????????????????????????????????????
        commentListd1.add(comment1);
        commentListd1.add(comment2);

        commentListd2.add(comment3);
        commentListd2.add(comment4);

        commentListd3.add(comment5);
        commentListd3.add(comment6);

        commentListd4.add(comment7);
        commentListd4.add(comment8);

        commentListd5.add(comment9);
        commentListd5.add(comment10);

        commentListd5.add(comment11);
        commentListd5.add(comment12);
        //???????????????????????????????????????
        commentList1.add(comment1);
        commentList2.add(comment2);
        commentList3.add(comment3);
        commentList4.add(comment4);
        commentList5.add(comment5);
        commentList6.add(comment6);
        commentList7.add(comment7);
        commentList8.add(comment8);
        commentList9.add(comment9);
        commentList10.add(comment10);
        commentList11.add(comment11);
        commentList12.add(comment12);
        //?????????????????????????????????
        patient1.setComments(commentList1);
        patient2.setComments(commentList2);
        patient3.setComments(commentList3);
        patient4.setComments(commentList4);
        patient5.setComments(commentList5);
        patient6.setComments(commentList6);
        patient7.setComments(commentList7);
        patient8.setComments(commentList8);
        patient9.setComments(commentList9);
        patient10.setComments(commentList10);
        patient11.setComments(commentList11);
        patient12.setComments(commentList12);

        doctor1.setComments(commentListd1);
        doctor2.setComments(commentListd2);
        doctor3.setComments(commentListd3);
        doctor4.setComments(commentListd4);
        doctor5.setComments(commentListd5);

        doctor1.getPatients().add(patient1);
        doctor1.getPatients().add(patient2);

        doctor2.getPatients().add(patient3);
        doctor2.getPatients().add(patient4);

        doctor3.getPatients().add(patient5);
        doctor3.getPatients().add(patient6);

        doctor4.getPatients().add(patient7);
        doctor4.getPatients().add(patient8);

        doctor5.getPatients().add(patient9);
        doctor5.getPatients().add(patient10);
        doctor5.getPatients().add(patient11);
//        doctor5.getPatients().add(patient12);
        //???????????????????????????
        patientRepository.save(patient1);
        patientRepository.save(patient2);
        patientRepository.save(patient3);
        patientRepository.save(patient4);
        patientRepository.save(patient5);
        patientRepository.save(patient6);
        patientRepository.save(patient7);
        patientRepository.save(patient8);
        patientRepository.save(patient9);
        patientRepository.save(patient10);
        patientRepository.save(patient11);
        patientRepository.save(patient12);
        //????????????????????????
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        doctorRepository.save(doctor3);
        doctorRepository.save(doctor4);
        doctorRepository.save(doctor5);

        addUser();
        doctor1.setUser(user1);
        user1.setDoctor(doctor1);

        doctor2.setUser(user2);
        user2.setDoctor(doctor2);

        patient1.setUser(user3);
        user3.setPatient(patient1);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        doctorRepository.AddUser(user1.getId(),doctor1.getId());

        doctorRepository.AddUser(user2.getId(),doctor2.getId());
        patientRepository.AddUser(user3.getId(),patient1.getId());
    }
    private void addUser(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Authority authDoctor = Authority.builder().name(AuthorityName.ROLE_DOCTOR).build();
        Authority authPatient = Authority.builder().name(AuthorityName.ROLE_PATIENT).build();
        Authority authAdmin = Authority.builder().name(AuthorityName.ROLE_ADMIN).build();
        user1 = User.builder()
                .username ( "admin")
                .password ( encoder.encode ( "admin" ) )
                .firstname ( "admin" )
                .lastname ( "admin")
                .email ( "admin@admin.com" ).enabled (true)
                .lastPasswordResetDate(Date.from(LocalDate.of (2021,01,
                        01).atStartOfDay(ZoneId.systemDefault ()).toInstant()))
                .build();


        user2 = User.builder()
                .username ( "doctor")
                .password ( encoder.encode ( "doctor" ) )
                .firstname ( "doctor" )
                .lastname ( "doctor")
                .email ( "enabled@doctor.com" ).enabled (true)
                .lastPasswordResetDate(Date.from(LocalDate.of (2021,01,
                        01).atStartOfDay(ZoneId.systemDefault ()).toInstant()))
                .build();

        user3 = User.builder()
                .username ( "patient")
                .password ( encoder.encode ( "patient" ) )
                .firstname ( "patient" )
                .lastname ( "patient")
                .email ( "enableUser@patient.com" ).enabled (true)
                .lastPasswordResetDate(Date.from(LocalDate.of (2021,01,
                        01).atStartOfDay(ZoneId.systemDefault ()).toInstant()))
                .build();
        authorityRepository.save(authAdmin);
        authorityRepository.save(authDoctor);
        authorityRepository.save(authPatient);
        user1.getAuthorities().add(authAdmin);
        user1.getAuthorities().add(authDoctor);
        user1.getAuthorities().add(authPatient);
        user2.getAuthorities().add(authDoctor);
        user3.getAuthorities().add(authPatient);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}
