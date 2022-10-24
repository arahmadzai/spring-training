package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "creditAccounts")
@NoArgsConstructor
@AllArgsConstructor
public class CreditAccount extends Account{

    private BigDecimal creditLimit;

}
