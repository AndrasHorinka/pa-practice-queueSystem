package hu.horinka.andras.queuesystem;

import hu.horinka.andras.queuesystem.human.Doctor;
import hu.horinka.andras.queuesystem.human.OrderTime;
import hu.horinka.andras.queuesystem.human.Patient;
import hu.horinka.andras.queuesystem.human.UserType;
import hu.horinka.andras.queuesystem.zone.Area;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        QueueSystem queueSystem = new QueueSystem();

//	Create Area
        queueSystem.addArea(new Area("Hungary", "2112", "Veresegyhaz"));
        queueSystem.addArea(new Area("Hungary", "1012", "Budapest"));
        queueSystem.addArea(new Area("Hungary", "1102", "Budapest"));
        queueSystem.addArea(new Area("Hungary", "2042", "Budaors"));

//    Create Doctors
        LocalTime startHour = LocalTime.of(10, 0);
        LocalTime endHour = LocalTime.of(16, 0);
        OrderTime orderTime = new OrderTime(startHour, endHour, startHour, endHour, startHour, endHour,
                startHour, endHour, startHour, endHour, startHour, endHour, startHour, endHour);
        queueSystem.addUser(new Doctor("Doctor1", queueSystem.getAreas().get(0),
                UserType.DOCTOR, orderTime, "003614253654" ));

        startHour = LocalTime.of(9, 30);
        endHour = LocalTime.of(14, 30);
        orderTime = new OrderTime(startHour, endHour, startHour, endHour, startHour, endHour,
                startHour, endHour, startHour, endHour, startHour, endHour, startHour, endHour);
        queueSystem.addUser(new Doctor("Doctor2", queueSystem.getAreas().get(1),
                UserType.DOCTOR, orderTime, "00362098765423" ));

        startHour = LocalTime.of(11, 20);
        endHour = LocalTime.of(18, 30);
        orderTime = new OrderTime(startHour, endHour, startHour, endHour, startHour, endHour,
                startHour, endHour, startHour, endHour, startHour, endHour, startHour, endHour);
        queueSystem.addUser(new Doctor("Doctor3", queueSystem.getAreas().get(2),
                UserType.DOCTOR, orderTime, "0036705556664" ));

        startHour = LocalTime.of(8, 0);
        endHour = LocalTime.of(18, 0);
        orderTime = new OrderTime(startHour, endHour, startHour, endHour, startHour, endHour,
                startHour, endHour, startHour, endHour, startHour, endHour, startHour, endHour);
        queueSystem.addUser(new Doctor("Doctor4", queueSystem.getAreas().get(3),
                UserType.DOCTOR, orderTime, "003630546218" ));

//        create Patients
        List<Doctor> doctors = queueSystem.getDoctorsForArea(queueSystem.getAreas().get(0));
        Patient patient1 = new Patient("patient1", queueSystem.getAreas().get(0), UserType.PATIENT, doctors.get(0).getUserID());
        Patient patient2 = new Patient("patient2", queueSystem.getAreas().get(0), UserType.PATIENT, doctors.get(0).getUserID());
        Patient patient3 = new Patient("patient3", queueSystem.getAreas().get(1), UserType.PATIENT, doctors.get(1).getUserID());
        Patient patient4 = new Patient("patient4", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2).getUserID());
        Patient patient5 = new Patient("patient5", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2).getUserID());
        Patient patient6 = new Patient("patient6", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2).getUserID());
        Patient patient7 = new Patient("patient7", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2).getUserID());
        Patient patient8 = new Patient("patient8", queueSystem.getAreas().get(3), UserType.PATIENT, doctors.get(3).getUserID());

        queueSystem.addUser(patient1);
        queueSystem.addUser(patient2);
        queueSystem.addUser(patient3);
        queueSystem.addUser(patient4);
        queueSystem.addUser(patient5);
        queueSystem.addUser(patient6);
        queueSystem.addUser(patient7);
        queueSystem.addUser(patient8);


    }


}
