package homework.classes_homework.equals_hashcode.task_2;

import java.util.Objects;

public class Adress {
    private String street;
    private String city;
    private String zipCode;

    public Adress(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(street, adress.street) && Objects.equals(city, adress.city) && Objects.equals(zipCode, adress.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zipCode);
    }
}
