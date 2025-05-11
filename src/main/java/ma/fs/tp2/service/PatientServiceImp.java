package ma.fs.tp2.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.fs.tp2.entities.Patient;
import ma.fs.tp2.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class PatientServiceImp implements PatientService {
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient( Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public Patient getPatientById(Long id) {

        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> getPatientsByName(String keyword) {
        return patientRepository.findByNomContains(keyword);
    }

    @Override
    public List<Patient> getPatientByMaladie(boolean malade) {
        return patientRepository.findByMalade(malade);
    }
}
