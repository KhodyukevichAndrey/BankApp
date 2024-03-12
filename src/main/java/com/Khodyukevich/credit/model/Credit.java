package com.Khodyukevich.credit.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credits")
public class Credit {
    @Id
    private UUID uuid;
    @Column(name = "credit_limit")
    private Long creditLimit;
    @Column(name = "interest_rate")
    private Double interestRate;
}
