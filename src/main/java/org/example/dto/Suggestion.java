package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor

@ToString
public class Suggestion {

    private int id;
    private String userId;
    private String userName;
    private String movieName;
    private String description;
    private LocalDate date;
    private LocalTime time;

    public Suggestion() {
        loadDateTime();
    }
    private void loadDateTime() {

        this.date=LocalDate.now();
        this.time = LocalTime.now();
    }
}
