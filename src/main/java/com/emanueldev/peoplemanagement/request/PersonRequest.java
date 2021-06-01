package com.emanueldev.peoplemanagement.request;

import com.emanueldev.peoplemanagement.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonRequest {
    private final String firstName;
    private final String lastName;
    private final String cpf;
    private final String birthDate;
    private final List<Phone> phones;

}
