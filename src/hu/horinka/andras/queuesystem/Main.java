package hu.horinka.andras.queuesystem;

import hu.horinka.andras.queuesystem.human.Doctor;
import hu.horinka.andras.queuesystem.human.OrderDay;
import hu.horinka.andras.queuesystem.human.Patient;
import hu.horinka.andras.queuesystem.human.UserType;
import hu.horinka.andras.queuesystem.zone.Area;

import java.time.DayOfWeek;
import java.time.LocalTime;
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
        Doctor d = new Doctor("Doctor1", queueSystem.getAreas().get(0),
                UserType.DOCTOR, "003614253654" );
        OrderDay orderTime = new OrderDay(DayOfWeek.MONDAY, startHour, endHour);
        d.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.TUESDAY, startHour, endHour);
        d.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.WEDNESDAY, startHour, endHour);
        d.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.THURSDAY, startHour, endHour);
        d.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.FRIDAY, startHour, endHour);
        d.addOrderTime(orderTime);
        queueSystem.addUser(d);

        startHour = LocalTime.of(9, 30);
        endHour = LocalTime.of(14, 30);
        Doctor d2 = new Doctor("Doctor2", queueSystem.getAreas().get(1),
                UserType.DOCTOR, "00362098765423" );
        orderTime = new OrderDay(DayOfWeek.MONDAY, startHour, endHour);
        d2.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.TUESDAY, startHour, endHour);
        d2.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.WEDNESDAY, startHour, endHour);
        d2.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.THURSDAY, startHour, endHour);
        d2.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.FRIDAY, startHour, endHour);
        d2.addOrderTime(orderTime);
        queueSystem.addUser(d2);

        startHour = LocalTime.of(11, 20);
        endHour = LocalTime.of(18, 30);
        Doctor d3 = new Doctor("Doctor3", queueSystem.getAreas().get(2),
                UserType.DOCTOR, "0036705556664" );
        orderTime = new OrderDay(DayOfWeek.MONDAY, startHour, endHour);
        d3.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.TUESDAY, startHour, endHour);
        d3.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.WEDNESDAY, startHour, endHour);
        d3.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.THURSDAY, startHour, endHour);
        d3.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.FRIDAY, startHour, endHour);
        d3.addOrderTime(orderTime);
        queueSystem.addUser(d3);

        startHour = LocalTime.of(8, 0);
        endHour = LocalTime.of(18, 0);
        Doctor d4 = new Doctor("Doctor4", queueSystem.getAreas().get(3),
                UserType.DOCTOR, "003630546218" );
        orderTime = new OrderDay(DayOfWeek.MONDAY, startHour, endHour);
        d4.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.TUESDAY, startHour, endHour);
        d4.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.WEDNESDAY, startHour, endHour);
        d4.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.THURSDAY, startHour, endHour);
        d4.addOrderTime(orderTime);
        orderTime = new OrderDay(DayOfWeek.FRIDAY, startHour, endHour);
        d4.addOrderTime(orderTime);
        queueSystem.addUser(d4);
        queueSystem.addUser(d4);

//        create Patients
        List<Doctor> doctors = queueSystem.getDoctorsForArea(queueSystem.getAreas().get(0));
        Patient patient1 = new Patient("patient1", queueSystem.getAreas().get(0), UserType.PATIENT, doctors.get(0));
        Patient patient2 = new Patient("patient2", queueSystem.getAreas().get(0), UserType.PATIENT, doctors.get(0));
        Patient patient3 = new Patient("patient3", queueSystem.getAreas().get(1), UserType.PATIENT, doctors.get(1));
        Patient patient4 = new Patient("patient4", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2));
        Patient patient5 = new Patient("patient5", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2));
        Patient patient6 = new Patient("patient6", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2));
        Patient patient7 = new Patient("patient7", queueSystem.getAreas().get(2), UserType.PATIENT, doctors.get(2));
        Patient patient8 = new Patient("patient8", queueSystem.getAreas().get(3), UserType.PATIENT, doctors.get(3));

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
