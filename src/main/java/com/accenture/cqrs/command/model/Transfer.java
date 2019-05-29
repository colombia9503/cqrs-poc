package com.accenture.cqrs.command.model;

import lombok.Data;

@Data
public class Transfer {
    private String before;
    private String after;
    private Patient patient;
}
