package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.State;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer streetNumber;
    private String street;
    private String city;
    private State state;
}
