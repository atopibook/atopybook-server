package com.atopybook.core.app.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    Long id;

}
