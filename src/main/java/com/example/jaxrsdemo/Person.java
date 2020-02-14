package com.example.jaxrsdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * JAXB required an empty constructor. lombok @Value, @Builder not compatible. Only @Data works.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private String firstName;
    private String lastName;
}
