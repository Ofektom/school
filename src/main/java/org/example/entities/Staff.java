package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Performance;
import org.example.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Staff extends User{
    private Long staffId;
    private BigDecimal salary;
    private Long bvn;
    private String Rank;
    private Role role;
    private Performance performance;
    private LocalDate appointmentDate;
    private LocalDate lastPromotionDate;
    private Map<Long, String> accountDetails;
    private String qualification;
    public static final BigDecimal SALARY_1 = new BigDecimal(50000);
    public static final BigDecimal SALARY_2 = new BigDecimal(150000);
    public static final BigDecimal SALARY_3 = new BigDecimal(500000);
}
