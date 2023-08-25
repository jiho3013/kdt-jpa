package com.kdt.lecture.domain.order;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("CAR")
public class Car extends Item{
    private long power;
}
