package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Event
{
    public Event(String name, String city)
    {
        this.name = name;
        this.city = city;
    }
    private String name;
    private String city;

    public String getName()
    {
        return name;
    }

    public String getCity()
    {
        return city;
    }
}

@RestController // = @Controller + @ResponseBody for every method
public class EventsController {
    static final ArrayList<Event> events = new ArrayList<Event>(){{
        add(new Event("Opera", "London"));
        add(new Event("Violin concert", "Prague"));
        add(new Event("Jazz concert", "Berlin"));
        add(new Event("Art exhibition", "London"));
    }};

    //  @GetMapping(value = "/events")
    //  http://localhost:8080/events?city=Berlin
    //  http://localhost:8080/events

    // Resource - events
    // URL : http://localhost:8080/events
    // Representation: JSON
    // Method: GET
    @GetMapping(value = "/events")
    public List<Event> listEvents(@RequestParam(name = "city", required = false, defaultValue = "all") String city)
    {
        List<Event> result = events;

        if (!city.equals("all")) {
            result = events.stream().filter(e -> e.getCity().equals(city)).collect(Collectors.toList());
        }
        return result; // Response itself
    }

    // Resource: Event
    // URL: http://localhost:8080/events/{id}
    // Representation: "{"name":"Jazz concert","city":"Berlin"}"
    // Method: GET
    @GetMapping(value = "/events/{eventId}")
    public Event getEvent(@PathVariable int eventId)
    {
        Event event = events.get(eventId);
        return event;
    }

    // Delete
    @DeleteMapping(value = "/events/{eventId}")
    public Event deleteEvent(@PathVariable int eventId)
    {
        // TODO: Add real remove
        Event event = events.get(eventId);
        return event;
    }

    // Update
    @PutMapping(value = "/events/{eventId}")
    public Event updateEvent(@PathVariable int eventId, @RequestBody Event newEvent)
    {
        Event event = events.get(eventId);
        // TODO: update event in database
        event = newEvent; // useless. just for example
        return event;
    }

}
