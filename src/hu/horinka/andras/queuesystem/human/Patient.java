package hu.horinka.andras.queuesystem.human;

import hu.horinka.andras.queuesystem.zone.Area;

import java.time.LocalDate;

public class Patient extends User {
    private final int validDays = 365;
    private boolean paid;
    private LocalDate paymentDate;
    private int doctorID;


    public Patient(String name, Area area, UserType type, int doctorID) {
        super(name, area, type);
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

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
}
