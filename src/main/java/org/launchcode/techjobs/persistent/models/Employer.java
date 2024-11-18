package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.mapping.List;

import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank")
    @Size(min = 3, max = 100, message = "Location must be between 3 and 100 characters")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(@NotEmpty @Size(max=100) String location) {
        this.location = location;
    }



}
