package com.study.DesignPatten._01_creational_patterns.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance().scheme("http").host("www.whiteship.me").path("java-playlist-ep1").build();
        System.out.println("howToStudyJava = " + howToStudyJava);
    }
}
