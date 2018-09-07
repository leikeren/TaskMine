package com.mutesaid.mapper;

import com.mutesaid.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    Long insert(Student record);

    Student getById(Long id);

    List<Student> getByName(String name);

    Student getByOnlineId(String onlineId);

    void delete(String onlineId);

    void update(@Param("onlineId") String onlineId, @Param("key") String key,
                @Param("value") Object value, @Param("currentTime") long currentTime);
}