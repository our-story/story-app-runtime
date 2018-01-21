package com.storyapp.runtime.entity;

import lombok.Data;

/**
 * Created by deepas on 21/01/18.
 */
@Data
public class Comments {

    // TODO: 21/01/18 check the association with story and writer
    private String id;
    private String user;
    private String content;


}
