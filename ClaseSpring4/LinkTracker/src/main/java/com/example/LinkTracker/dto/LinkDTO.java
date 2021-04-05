package com.example.LinkTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LinkDTO {
    private String url;
    private int id;
    private String password;
}
