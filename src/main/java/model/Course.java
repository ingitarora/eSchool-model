package model;

import lombok.Data;

import java.util.List;

/**
 * Created by ingit.arora on 16/08/15.
 */

@Data
public class Course {

    private Syllabus syllabus;
    private List<String> recommendedBooks;
    private String courseId;
    private List<String> subcourseIds;

}
