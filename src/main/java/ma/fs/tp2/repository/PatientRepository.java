package ma.fs.tp2.repository;

import ma.fs.tp2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByMalade(boolean malade);
    List<Patient> findByNomContains(String nom);



}
