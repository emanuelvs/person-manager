package com.emanueldev.peoplemanagement.entity;

import com.emanueldev.peoplemanagement.enums.PhoneType;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Phone {

    @Id
    private UUID id = UUID.randomUUID();
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)

    private PhoneType type;
    @Column(nullable = false)
    private String number;

    public Phone(PhoneType type, String number) {
        this.type = type;
        this.number = number;
    }
}
