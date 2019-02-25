package hu.horinka.andras.queuesystem;

import hu.horinka.andras.queuesystem.human.Doctor;
import hu.horinka.andras.queuesystem.human.Patient;
import hu.horinka.andras.queuesystem.human.User;
import hu.horinka.andras.queuesystem.human.UserType;
import hu.horinka.andras.queuesystem.zone.Area;

import java.util.ArrayList;
import java.util.List;

public class QueueSystem {
    private List<Area> areas = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public List<Doctor> getDoctorsForPatientArea(Patient patient) {
        List<Doctor> doctorsForArea = new ArrayList<>();
        for (User user : users) {
            if (user.getType() == UserType.DOCTOR) {
                Doctor doctor = (Doctor) user;
                if (doctor.getArea().equals(patient.getArea())) {
                    doctorsForArea.add(doctor);
                }
            }
        }
        return doctorsForArea;
    }

    public List<Doctor> getDoctorsForArea(Area area) {
        List<Doctor> doctorsForArea = new ArrayList<>();
        for (User user : users) {
            if (user.getType() == UserType.DOCTOR) {
                Doctor doctor = (Doctor) user;
                if (doctor.getArea().equals(area)) {
                    doctorsForArea.add(doctor);
                }
            }
        }
        return doctorsForArea;
    }


    public List<Patient> getAllPatientsForDoctor(Doctor doctor) {
        List<Patient> patientsForDoctor = new ArrayList<>();

        for (User user : users) {
            if (user.getType() == UserType.PATIENT) {
                Patient p = (Patient) user;
                if (p.getDoctorID() == doctor.getUserID()) {
                    patientsForDoctor.add(p);
                }

            }
        }
        return patientsForDoctor;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void addArea(Area area) {
        this.areas.add(area);
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
