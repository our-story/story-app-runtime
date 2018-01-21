package com.storyapp.runtime.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by deepas on 21/01/18.
 */
@Document
@Data
public class Writer {

    @Id
    private String id;
    private String emailId;
    private String name;
    private Gender gender;
    private Date dob;
    private List<String> images;
    private List<String> videos;
    private String[] tags;
    private List<Story> stories;
    private List<Comments> writerComments;

}
