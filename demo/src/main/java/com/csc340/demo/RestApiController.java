package com.csc340.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class RestApiController {

    Map<Integer, Esports> esportsDatabase = new HashMap<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/assignment2")
    public String assignment2() {
        return "I am Yixi Xie. It's my Assignment 2.";
    }

    /**
     * @PostMapping("esports/create")
     * public Object createEsports(@RequestBody Esports esports) {
     *    esportsDatabase.put(esports.getName(), esports);
     *    return esportsDatabase.values();
     * }

     * @GetMapping("esports")
     * public Object getEsports(@RequestParam(value="name", defaultValue="Aa") String esportsName) {

     * }
     */

    @GetMapping("/esports/all")
    public Object getAllEsports() {
        if (esportsDatabase.isEmpty()) {
            esportsDatabase.put(1, new Esports("Aa", "Team A", 4.5));
            esportsDatabase.put(2, new Esports("Bb", "Team B", 4.0));
            esportsDatabase.put(3, new Esports("Cc", "Team C", 5.0));
            esportsDatabase.put(4, new Esports("Dd", "Team D", 4.5));
            esportsDatabase.put(5, new Esports("Ee", "Team E", 3.5));
            esportsDatabase.put(6, new Esports("Ff", "Team F", 3.0));
            esportsDatabase.put(7, new Esports("Gg", "Team G", 2.0));
        }
        return esportsDatabase.values();
    }

    @GetMapping("/esports/{name}")
    public Esports getEsportsByName(@PathVariable String name) {
        return esportsDatabase.get(name);
    }
}
