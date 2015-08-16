package model;

import lombok.Data;

import java.util.List;

/**
 * Created by ingit.arora on 16/08/15.
 */

@Data
public class School{

    private String name;
    private String board;
    private String school_code;
    private String affiliation_code;
    private String id;
    private String address;
    private String google_map_url;
    private List<String> image_gallery_urls;
    private String strength;
    private String description;
    private String highest_grade;
    private String lowest_grade;
    private List<Integer> contacts;
    private String principal_name;
    private String principal_qualification;
    private List<Class> classes;

}
