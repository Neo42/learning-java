package OOP.Chapter5.Castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String direction, Room room) {
        exits.put(direction, room);
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDescription() {
        StringBuffer result = new StringBuffer();
        for (String direction : exits.keySet()) {
            result.append(direction);
            result.append(" ");
        }
        return result.toString();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
