package com.Khodyukevich.credit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditDto {
    private Long creditLimit;
    private Double interestRate;
}
