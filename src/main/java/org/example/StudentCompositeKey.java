package org.example;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StudentCompositeKey implements Serializable {

    private Long studentId;

    private String name;
}
