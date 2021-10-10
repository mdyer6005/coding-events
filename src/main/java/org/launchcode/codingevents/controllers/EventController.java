package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    //private static List<String> events = new ArrayList<>();
    private static HashMap<String, String> events = new HashMap<>();


    @GetMapping
    public String displayAllEvents(Model model) {
        //model.addAttribute("events", events);
        //return "events/index";
        model.addAttribute("events", events);
        events.put("1 Name","1 Desc");
        events.put("2 Name","2 Desc");
        events.put("3 Name","3 Desc");
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String redderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, String eventDesc) {
        events.put(eventName, eventDesc);
        return "redirect:";
    }

}
