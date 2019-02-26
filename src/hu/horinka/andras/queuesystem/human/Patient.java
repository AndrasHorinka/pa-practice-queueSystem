package hu.horinka.andras.queuesystem.human;

import hu.horinka.andras.queuesystem.zone.Area;

import java.time.LocalDate;

public class Patient extends User {
    private static final int VALID_DAYS = 365;
    private boolean paid;
    private LocalDate paymentDate;
    private Doctor doctor;
    //TODO: convert it to Doctor


    public Patient(String name, Area area, UserType type, Doctor doctor) {
        super(name, area, type);
        this.doctor = doctor;
    }

    public void payment() {
        this.paid = true;
        this.paymentDate = LocalDate.now();
    }

    public void setUserPaymentStatus() {
        if (!isPaymentStillValid()) {
            this.paid = false;
            this.paymentDate = null;
        }
    }

    private boolean isPaymentStillValid() {
        int regYear = this.paymentDate.getYear();
        int regMonth = this.paymentDate.getMonthValue();
        int regDay = this.paymentDate.getDayOfMonth();

        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();
        int todayMonth = today.getMonthValue();
        int todayDay = today.getDayOfMonth();

        if (todayYear > regYear && todayMonth > regMonth && todayDay > regDay) {
            return false;
        }
        return todayYear <= regYear + 1;
    }

    public boolean isPaid() {
        return paid;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
