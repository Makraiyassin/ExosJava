package com.bxlFormation.coursAlex.coursJDBC.models;

import java.time.LocalDate;

public class Student {
    private final int student_id;
    private final String first_name;
    private final String  last_name;
    private final LocalDate birth_date;
    private final String  login;
    private final Section section;
    private final int  year_result;
    private final String   course_id;

    public Student(int student_id, String first_name, String last_name, LocalDate birth_date, String login, Section section, int year_result, String course_id) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.login = login;
        this.section = section;
        this.year_result = year_result;
        this.course_id = course_id;
    }


    public int getStudent_id() {
        return student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public String getLogin() {
        return login;
    }

    public Section getSection() {
        return section;
    }

    public int getYear_result() {
        return year_result;
    }

    public String getCourse_id() {
        return course_id;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "student_id=" + student_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", login='" + login + '\'' +
                ", Section=" + section +
                ", year_result=" + year_result +
                ", course_id='" + course_id + '\'' +
                '}';
    }
}
