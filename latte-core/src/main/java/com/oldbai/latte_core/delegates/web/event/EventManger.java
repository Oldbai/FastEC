package com.oldbai.latte_core.delegates.web.event;

import java.util.HashMap;
import java.util.Map;

public class EventManger {

    private static final HashMap<String, Event> EVENTS = new HashMap<>();

    private EventManger() {
    }

    private static class Holder {
        private static final EventManger INSTANCE = new EventManger();
    }

    public static EventManger getInstance() {
        return Holder.INSTANCE;
    }

    public EventManger addEvent(String name, Event event) {
        EVENTS.put(name, event);
        return this;
    }

    public Event createEvent(String action){
        final Event event= EVENTS.get(action);
        if (event == null){
            return new UndefineEvent();
        }
        return event;
    }
}
