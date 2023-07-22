package spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.controller.dto.EventDTO;
import spring.domain.City;
import spring.domain.Event;
import spring.repository.CityRepository;
import spring.repository.EventRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    static final Logger log = LoggerFactory.getLogger(EventService.class);

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private CityRepository cityRepository;

    public List<EventDTO> findAll() {
        List<Event> events = eventRepository.findAll();
        List<EventDTO> result = new ArrayList<>();
        events.forEach(e -> result.add(EventDTO.getInstance(e)));
        return result;
    }

    public EventDTO findById(Integer id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {
            return EventDTO.getInstance(event);
        }
        log.error("Event not found evendId: {}", id);
        return null;
    }

    public EventDTO add(EventDTO event) {
        Event newEvent = new Event();
        newEvent.setName(event.getName());
        City city = cityRepository.findByName(event.getCity());
        if (city == null) {
            city = new City();
            city.setName(event.getCity());
            cityRepository.save(city);
        }
        newEvent.setCity(city);
        eventRepository.save(newEvent);
        EventDTO result = EventDTO.getInstance(newEvent);

        log.info("Event added: {}", result);
        return result;
    }

    public EventDTO update(Integer id, EventDTO event) {
        Event updEvent = eventRepository.findById(id).orElse(null);
        if (updEvent != null) {
            updEvent.setName(event.getName());
            City city = cityRepository.findByName(event.getCity());
            if (city == null) {
                city = new City();
                city.setName(event.getCity());
                cityRepository.save(city);
            }
            updEvent.setCity(city);
            eventRepository.save(updEvent);
            return EventDTO.getInstance(updEvent);
        }
        return null;
    }

    public EventDTO delete(Integer id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {
            eventRepository.delete(event);
        }
        return EventDTO.getInstance(event);
    }
}
