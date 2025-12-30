package com.example.projectevaluation.service;

import com.example.projectevaluation.entity.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProjectService {

  private static final List<Project> projectList = new ArrayList<>();
  private static final AtomicLong ID_GENERATOR = new AtomicLong(1);

  // 新增项目
  public Project addProject(Project project) {
    project.setId(ID_GENERATOR.getAndIncrement());
    projectList.add(project);
    return project;
  }

  // 查询所有项目
  public List<Project> getAllProjects() {
    return projectList;
  }
}
