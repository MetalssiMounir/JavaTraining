package org.training.demo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Person {

    private String firstName;
    private String lastName;
}
