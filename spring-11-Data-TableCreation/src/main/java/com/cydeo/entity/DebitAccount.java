package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "debitAccounts")
@AllArgsConstructor
@NoArgsConstructor
public class DebitAccount extends Account{

    private BigDecimal overDraftFee;

}
