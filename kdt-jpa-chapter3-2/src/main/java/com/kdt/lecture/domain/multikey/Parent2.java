package com.kdt.lecture.domain.multikey;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Getter
@Setter
@Entity
public class Parent2 {
    @EmbeddedId
    private ParentId2 id;
}
