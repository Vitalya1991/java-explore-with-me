package ru.practicum.request.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountEventRequests {
    private Long requests;
    private Long eventId;

}