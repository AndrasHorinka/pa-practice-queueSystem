package hu.horinka.andras.queuesystem.zone;

public class Area {
    private String country;
    private String postalCode;
    private String city;

    public Area(String country, String postalCode, String city) {
        this.country = country;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Area area = (Area) o;

        if (!country.equals(area.country)) return false;
        if (!postalCode.equals(area.postalCode)) return false;
        return city.equals(area.city);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + postalCode.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }
}
