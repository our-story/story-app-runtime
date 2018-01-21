package com.storyapp.runtime.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.net.URL;
import java.util.List;

@Document
@Data
public class Story{
    @Id
    private String id;
    private String title;
    private String content;
    private String size;
    private StoryType type;
    private String[] tags;
    private String image;
    private URL video;
    private List<Writer> writers;
    private List<Comments> comments;

}