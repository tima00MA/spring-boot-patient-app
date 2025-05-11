package ma.fs.tp2.service;

import ma.fs.tp2.entities.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(Long id);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    List<Patient> getPatientsByName(String keyword);
    List<Patient> getPatientByMaladie(boolean malade);
}
