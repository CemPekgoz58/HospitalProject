/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Cem
 */
public class Patients {

    private int ID;
    private String PatientName;
    private String PatientSurname;

    public Patients(int ID, String PatientName, String PatientSurname) {
        this.ID = ID;
        this.PatientName = PatientName;
        this.PatientSurname = PatientSurname;
    }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientSurname() {
        return PatientSurname;
    }

    public void setPatientSurname(String PatientSurname) {
        this.PatientSurname = PatientSurname;
    }

}
