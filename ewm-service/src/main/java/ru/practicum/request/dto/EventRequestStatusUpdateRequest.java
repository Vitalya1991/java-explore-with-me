package ru.practicum.request.dto;

import lombok.*;
import ru.practicum.request.model.ParticipationRequestState;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestStatusUpdateRequest {
    private List<Long> requestIds;
    private ParticipationRequestState status;
}