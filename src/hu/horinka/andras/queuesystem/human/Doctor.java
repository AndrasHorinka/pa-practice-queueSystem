package hu.horinka.andras.queuesystem.human;

import hu.horinka.andras.queuesystem.zone.Area;

import java.util.ArrayList;
import java.util.List;


public class Doctor extends User {
    private List<OrderDay> orderDay = new ArrayList<>();
    // TODO:
    //  have even/odd het, have multiple order time within a day
    private String phone;

    public Doctor(String name, Area area, UserType type, String phone) {
        super(name, area, type);
        this.phone = phone;
    }

    public List<OrderDay> getOrderTime() {
        return orderDay;
    }

    public void addOrderTime(OrderDay orderDay) {
        this.orderDay.add(orderDay);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
