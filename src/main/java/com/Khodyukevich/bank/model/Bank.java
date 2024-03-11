package com.Khodyukevich.bank.model;

import com.Khodyukevich.client.model.Client;
import com.Khodyukevich.credit.model.Credit;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uuid;
    @OneToMany
    private List<Credit> credits;
    @OneToMany
    private List<Client> clients;

}
