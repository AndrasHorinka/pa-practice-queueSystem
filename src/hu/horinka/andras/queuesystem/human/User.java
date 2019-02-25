package hu.horinka.andras.queuesystem.human;

import hu.horinka.andras.queuesystem.zone.Area;

public abstract class User {
    private static int counter = 0;
    protected String name;
    protected Area area;
    protected int userID;
    protected UserType type;

    public User(String name, Area area, UserType type) {
        this.name = name;
        this.area = area;
        this.userID = counter;
        this.type = type;
        User.counter += 1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userID == user.userID;
    }

    @Override
    public int hashCode() {
        return userID;
    }

    public UserType getType() {
        return type;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public Area getArea() {
        return area;
    }
}
