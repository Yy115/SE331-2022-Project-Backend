package se331.rest.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Comment;
import se331.rest.entity.Doctor;
import se331.rest.entity.Patient;
import se331.rest.repository.CommentRepository;
import se331.rest.repository.DoctorRepository;
import se331.rest.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    CommentRepository commentRepository;

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
                .doctor(doctor3)
                .build());
        patient2 = patientRepository.save(Patient.builder()
                .name("p1Haitao")
                .sur_name("p1Liu")
                .age("22")
                .hometown("ShanXi")
                .doctor(doctor5)
                .build());
        patient3 = patientRepository.save(Patient.builder()
                .name("Yun")
                .sur_name("Han")
                .age("27")
                .hometown("Henan")
                .doctor(doctor1)
                .build());
        patient4 = patientRepository.save(Patient.builder()
                .name("Xixi")
                .sur_name("Lu")
                .age("20")
                .hometown("Ningxia")
                .doctor(doctor2)
                .build());
        patient5 = patientRepository.save(Patient.builder()
                .name("Fan")
                .sur_name("Tao")
                .age("19")
                .hometown("Ningxia")
                .doctor(doctor2)
                .build());
        patient6 = patientRepository.save(Patient.builder()
                .name("Li")
                .sur_name("Ma")
                .age("28")
                .hometown("Ningxia")
                .doctor(doctor2)
                .build());
        patient7 = patientRepository.save(Patient.builder()
                .name("Teng")
                .sur_name("Shen")
                .age("23")
                .hometown("Gansu")
                .doctor(doctor1)
                .build());
        patient8 = patientRepository.save(Patient.builder()
                .name("Haiyin")
                .sur_name("Li")
                .age("23")
                .hometown("Shanghai")
                .doctor(doctor3)
                .build());
        patient9 = patientRepository.save(Patient.builder()
                .name("Lun")
                .sur_name("Ai")
                .age("27")
                .hometown("Guizhou")
                .doctor(doctor3)
                .build());
        patient10 = patientRepository.save(Patient.builder()
                .name("Yuan")
                .sur_name("Chang")
                .age("24")
                .hometown("HuNan")
                .doctor(doctor4)
                .build());
        patient11 = patientRepository.save(Patient.builder()
                .name("ChenSi")
                .sur_name("Wang")
                .age("29")
                .hometown("SiChuan")
                .doctor(doctor4)
                .build());
        patient12 = patientRepository.save(Patient.builder()
                .name("Haibao")
                .sur_name("Gao")
                .age("21")
                .hometown("Shanghai")
                .doctor(doctor5)
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
                .doctor( doctor1)
                .patient(patient2).build());
        comment4 = commentRepository.save(Comment.builder()
                .comment("Don't take a bath")
                .doctor( doctor1)
                .patient(patient2).build());
        comment5 = commentRepository.save(Comment.builder()
                .comment("Take more rest and avoid strenuous exercise")
                .doctor( doctor1)
                .patient(patient2).build());
        comment6 = commentRepository.save(Comment.builder()
                .comment("take medicine on time")
                .doctor( doctor1)
                .patient(patient2).build());
        comment7 = commentRepository.save(Comment.builder()
                .comment("A light diet")
                .doctor( doctor1)
                .patient(patient2).build());
        comment8 = commentRepository.save(Comment.builder()
                .comment("Please drink more water.")
                .doctor( doctor1)
                .patient(patient2).build());
        comment9 = commentRepository.save(Comment.builder()
                .comment("Don't take hormone drugs")
                .doctor( doctor1)
                .patient(patient2).build());
        comment10 = commentRepository.save(Comment.builder()
                .comment("Please eat more fruit.")
                .doctor( doctor1)
                .patient(patient2).build());
        comment11 = commentRepository.save(Comment.builder()
                .comment("Please supplement protein.")
                .doctor( doctor1)
                .patient(patient2).build());
        comment12 = commentRepository.save(Comment.builder()
                .comment("Please drink more water.")
                .doctor( doctor1)
                .patient(patient2).build());
        //四个医生的留言集合。
        List<Comment> commentListP1 = new ArrayList<>();
        List<Comment> commentListP2 = new ArrayList<>();
        List<Comment> commentListP3 = new ArrayList<>();
        List<Comment> commentListP4 = new ArrayList<>();
        //一条留言对应一个接种者。
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
        //添加到对应的医生留言集合。
        commentListP1.add(comment1);
        commentListP1.add(comment2);
        commentListP1.add(comment3);
        commentListP2.add(comment4);
        commentListP2.add(comment5);
        commentListP2.add(comment6);
        commentListP3.add(comment7);
        commentListP3.add(comment8);
        commentListP3.add(comment9);
        commentListP4.add(comment10);
        commentListP4.add(comment11);
        commentListP4.add(comment12);
        //留言添加到对应的接种者中。
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
        //添加留言到接种者对象中
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
        doctor1.setComments(commentListP1);
        doctor1.getPatients().add(patient1);
        doctor1.getPatients().add(patient2);
        doctor2.getPatients().add(patient3);
        doctor2.getPatients().add(patient4);
        doctor2.getPatients().add(patient5);
        doctor2.getPatients().add(patient6);
        doctor3.getPatients().add(patient7);
        doctor3.getPatients().add(patient8);
        doctor3.getPatients().add(patient9);
        doctor4.getPatients().add(patient10);
        doctor5.getPatients().add(patient11);
        doctor5.getPatients().add(patient12);
        //存储接种者的信息。
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
        //存储医生的信息。
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        doctorRepository.save(doctor3);
        doctorRepository.save(doctor4);
    }

}
