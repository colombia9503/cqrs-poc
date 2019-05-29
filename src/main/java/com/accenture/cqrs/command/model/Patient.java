package com.accenture.cqrs.command.model;

import lombok.Data;

@Data
public class Patient {
    private String name;
    private String idDocument;
    private Long id;
}
