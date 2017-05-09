package org.launchcode.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Debbie on 4/22/2017.
 */

@Entity // tells that we want to write data to db
public class Members {

    @Id
    @GeneratedValue
    private int mem_id;

    @NotNull
    @Size(min =3, max = 15)
    private String lastName;

    @NotNull
    @Size(min =3, max = 15)
    private String firstName;

    private String address;

    private String city;

    private String state;

    @Size(min = 5, max=9)
    private String zipCode;

    private String email;

//    private List<Events> events;

    public Members (String lastName, String firstName, String address,
                    String city, String state, String zipCode,String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
    }

    public Members(){}

    public int getId() {
        return mem_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String state() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    ////    public List<Events> getEvents() {
////        return events;
////    }
//
//    public void setEvents(List<Events> events) {
//        this.events = events;
//    }
}
