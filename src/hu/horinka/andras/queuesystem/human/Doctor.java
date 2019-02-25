package hu.horinka.andras.queuesystem.human;

import hu.horinka.andras.queuesystem.zone.Area;


public class Doctor extends User {
    private OrderTime orderTime;
    private String phone;

    public Doctor(String name, Area area, UserType type, OrderTime orderTime, String phone) {
        super(name, area, type);
        this.orderTime = orderTime;
        this.phone = phone;
    }

    public OrderTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(OrderTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
