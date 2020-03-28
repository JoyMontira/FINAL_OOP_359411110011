package Final_359411110011;

import java.util.List;

public interface PatientDAO {
    public List <Patient> getAllPAT();
    public void addPAT (Patient PAT);
    public Patient findPAT (int id);
    public void updatePAT (Patient PAT);
    public void deletePAT (int id);

}
