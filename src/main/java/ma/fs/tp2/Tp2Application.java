package ma.fs.tp2;

import ma.fs.tp2.entities.Patient;
import ma.fs.tp2.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp2Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientService patientService) {
        return args -> {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            // Patient 1
            Date date1 = sdf.parse("2000-01-12");
            Patient patient1 = new Patient();
            patient1.setNom("Med");
            patient1.setMalade(true);
            patient1.setScore(9);
            patient1.setDateNaissance(date1);
            patientService.addPatient(patient1);

            // Patient 2
            Date date2 = sdf.parse("2000-06-21");
            Patient patient2 = new Patient();
            patient2.setNom("Sara");
            patient2.setMalade(false);
            patient2.setScore(12);
            patient2.setDateNaissance(date2);
            patientService.addPatient(patient2);

            // Patient 3
            Date date3 = sdf.parse("1999-03-15");
            Patient patient3 = new Patient();
            patient3.setNom("Youssef");
            patient3.setMalade(true);
            patient3.setScore(1);
            patient3.setDateNaissance(date3);
            patientService.addPatient(patient3);

            // Patient 4
            Date date4 = sdf.parse("2010-08-08");
            Patient patient4 = new Patient();
            patient4.setNom("Dina");
            patient4.setMalade(false);
            patient4.setScore(7);
            patient4.setDateNaissance(date4);
            patientService.addPatient(patient4);

            // Afficher tous les patients
            System.out.println("Liste de tous les patients :");
            List<Patient> allPatients = patientService.getAllPatients();
            allPatients.forEach(System.out::println);

            // Rechercher un patient par ID
            System.out.println("Patient avec ID = 1 :");
            System.out.println(patientService.getPatientById(1L));

            // Chercher les patients malades
            System.out.println("Patients malades :");
            patientService.getPatientByMaladie(true).forEach(System.out::println);

            // Chercher par nom contenant une lettre
            System.out.println("Patients contenant 'a' dans le nom :");
            patientService.getPatientsByName("a").forEach(System.out::println);

            // Mise à jour d'un patient
            System.out.println("Mise à jour du score du patient ID=1 :");
            Patient p = patientService.getPatientById(1L);
            p.setScore(20);
            patientService.updatePatient(p);
            System.out.println(patientService.getPatientById(1L));

            // Suppression d'un patient
            System.out.println("Suppression du patient ID=2");
            patientService.deletePatient(2L);
            System.out.println("Liste après suppression :");
            patientService.getAllPatients().forEach(System.out::println);
        };
    }

}
