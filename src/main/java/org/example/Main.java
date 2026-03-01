package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    // Creates: a single shared mapper instance — construct once, use everywhere
    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("JSON - Serialization & Deserialization");

        Player player = new Player(1, "Alice", 9.2);

        // Converts: Player to a compact (no pretty-print) JSON string
        // note that the name used for each key in the generated json
        // is taken from the field name in the Player class
        String json = JSON_MAPPER.writeValueAsString(player);
        System.out.println(json);

        // {"id":1,"name":"Alice","rating":9.2}

        json = "{\"id\":1,\"name\":\"Alice\",\"rating\":9.2}";

        // Converts: JSON string back to a Player instance
        // again, the names in the json string are matched
        // to the Player class field names
        Player p = JSON_MAPPER.readValue(json, Player.class);

        System.out.println(p.getName()); // Alice
    }
}