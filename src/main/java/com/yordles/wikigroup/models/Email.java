package com.yordles.wikigroup.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Email {
    private String name;
    private String emitterEmail;
    private String subject;
    private String message;
}
