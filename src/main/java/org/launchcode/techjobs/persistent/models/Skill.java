package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Description cannot be blank")
    @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters")
    public String description;

    public Skill() {
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
