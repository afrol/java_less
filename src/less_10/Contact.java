package less_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String name;
    private LocalDate dateOfBirth;
    ArrayList<String> phones = new ArrayList<>();
    private String address;
    private LocalDateTime updatedDate;

    public Contact() {
    }

    public Contact(String name, LocalDate dateOfBirth, ArrayList<String> phones, String address, LocalDateTime updatedDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phones = phones;
        this.address = address;
        this.updatedDate = updatedDate;
    }

    public Contact(String name, LocalDate dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        updatedDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

    public void removePhone(String phone) {
        this.phones.remove(phone);
    }

    public String getPhone(Integer id) {
        return this.phones.get(id);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phones=" + phones +
                ", address='" + address + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
