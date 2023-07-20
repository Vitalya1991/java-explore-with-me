package ru.practicum.event.model;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @NotBlank
    private Float lat;
    @NotBlank
    private Float lon;
}