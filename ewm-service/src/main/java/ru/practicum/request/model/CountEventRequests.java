package ru.practicum.request.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountEventRequests {
    private Long requests;
    private Long eventId;

}