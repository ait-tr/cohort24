package spring.controller.dto;

import lombok.*;
import spring.domain.Event;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EventDTO {
    private Integer id;
    private String name;
    private String city;
    public static EventDTO getInstance(Event event) {
        return new EventDTO(event.getEventId(), event.getName(), event.getCity().getName());
    }
}
