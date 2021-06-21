package com.emanueldev.peoplemanagement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneDTO> phones;
}
