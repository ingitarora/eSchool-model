package model;

import enums.Gender;
import lombok.Data;

import java.util.Date;

/**
 * Created by ingit.arora on 16/08/15.
 */


@Data
public abstract class User {
    private String name;
    private Gender gender;
    private Date dateOfBirth;
    private String father_name;
    private String id;
    private String user_id;
    private String password;
    private String permanent_address;
    private String temporary_address;
    private String pic_url;
}
