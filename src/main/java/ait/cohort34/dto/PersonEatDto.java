package ait.cohort34.dto;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonEatDto {
    String fullName;
    @Singular
    List<String> foods;
}
