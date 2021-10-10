package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message="Invalid email.  Try again.")
    private String  contactEmail;

    @NotBlank(message = "Location is required")
    @NotNull(message = "Location is required")
    private String location;

    @AssertTrue(message = "Must be marked true for this exercise")
    @NotNull(message = "Must be marked true for this exercise")
    private boolean requiresRegistration;

    @Positive(message = "Must have at least 1 attendee")
    @NotNull(message = "Must have at least 1 attendee")
    private int numberOfAttendees;

    @Min(value = 1, message = "You can't hold the event less than 1 day per week!")
    @Max(value = 7, message = "You can't hold the event more than 7 days per week!")
    private int timesPerWeek;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRequiresRegistration() {
        return requiresRegistration;
    }

    public void setRequiresRegistration(boolean requiresRegistration) {
        this.requiresRegistration = requiresRegistration;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public int getTimesPerWeek() {
        return timesPerWeek;
    }

    public void setTimesPerWeek(int timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public Event(String name, String description, String contactEmail, String location, boolean requiresRegistration, int numberOfAttendees, int timesPerWeek) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.requiresRegistration = requiresRegistration;
        this.numberOfAttendees = numberOfAttendees;
        this.timesPerWeek = timesPerWeek;

        this.id = nextId;
        nextId ++;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
