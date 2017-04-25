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
    private int id;

    @NotNull
    @Size(min =3, max = 15)
    private String lastName;

    @NotNull
    @Size(min =3, max = 15)
    private String firstName;

    private String address;

    private String cityState;

    @Size(min = 5, max=9)
    private String zipCode;

//    private List<Events> events;

    public Members (String lastName, String firstName, String address,
                    String cityState, String zipCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.cityState = cityState;
        this.zipCode = zipCode;
    }

    public Members(){}

    public int getId() {
        return id;
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

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

////    public List<Events> getEvents() {
////        return events;
////    }
//
//    public void setEvents(List<Events> events) {
//        this.events = events;
//    }
}
