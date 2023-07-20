package ru.practicum.request.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestStatusUpdateResult {
    private List<ParticipationRequestDto> confirmedRequests = new ArrayList<>();
    private List<ParticipationRequestDto> rejectedRequests = new ArrayList<>();
}