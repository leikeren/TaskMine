package com.mutesaid.service;
import com.mutesaid.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getByName(String name);

    Student getById(long id);

    Student getByOnlineId(String onlineId);

    Long insert(Student stu);

    Boolean delete(String onlineId);

    Boolean update(String onlineId, String key, Object value, long currentTime);
}
