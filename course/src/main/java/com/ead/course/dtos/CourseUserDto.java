package com.ead.course.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CourseUserDto {

    private UUID courseId;

    private UUID userId;

}
