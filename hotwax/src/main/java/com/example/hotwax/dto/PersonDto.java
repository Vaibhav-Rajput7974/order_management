package com.example.hotwax.dto;

import com.example.hotwax.entity.Person;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDto {
    private String partyId;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private Character gender;
    private Date birthDate;
    private String maritalStatusEnumId;
    private String employmentStatusEnumId;
    private String occupation;



    public PersonDto(Person person) {
        this.partyId = person.getPartyId();
        this.salutation = person.getSalutation();
        this.firstName = person.getFirstName();
        this.middleName = person.getMiddleName();
        this.lastName = person.getLastName();
        this.gender = person.getGender();
        this.birthDate = person.getBirthDate();
        this.maritalStatusEnumId = person.getMaritalStatusEnumId();
        this.employmentStatusEnumId = person.getEmploymentStatusEnumId();
        this.occupation = person.getOccupation();
    }

    // Optionally, you can create methods to convert the DTO back to the entity if needed
    public Person toEntity() {
        Person person = new Person();
        person.setPartyId(this.partyId);
        person.setSalutation(this.salutation);
        person.setFirstName(this.firstName);
        person.setMiddleName(this.middleName);
        person.setLastName(this.lastName);
        person.setGender(this.gender);
        person.setBirthDate(this.birthDate);
        person.setMaritalStatusEnumId(this.maritalStatusEnumId);
        person.setEmploymentStatusEnumId(this.employmentStatusEnumId);
        person.setOccupation(this.occupation);
        return person;
    }
}
