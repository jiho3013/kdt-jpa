package com.kdt.lecture.domain.order;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Setter
@Getter
@Entity
@DiscriminatorValue("FOOD")
public class Food extends Item {
    private String chef;
}
