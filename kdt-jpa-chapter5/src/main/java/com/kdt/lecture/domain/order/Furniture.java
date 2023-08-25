package com.kdt.lecture.domain.order;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Setter
@Getter
@Entity
@DiscriminatorValue("FURNITURE")
public class Furniture extends Item{
    private int width;
    private int height;
}
