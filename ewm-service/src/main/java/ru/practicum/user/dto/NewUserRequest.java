package ru.practicum.user.dto;

import lombok.*;

import org.hibernate.validator.constraints.Length;
import ru.practicum.validation.EmailPartsMaxLength;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class NewUserRequest {
    @NotBlank
    @EmailPartsMaxLength
    @Length(min = 6, max = 254)
    private String email;
    @NotBlank
    @Length(min = 2, max = 250)
    private String name;
}