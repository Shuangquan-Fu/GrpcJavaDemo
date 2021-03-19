package com.quan.user.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@Data
public class User {
    @Id
    private String lgoin;
    private String name;
    private String genre;
}
