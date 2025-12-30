package com.example.projectevaluation.controller;

import com.example.projectevaluation.entity.Project;
import com.example.projectevaluation.service.ProjectService;
import com.example.projectevaluation.common.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController extends BaseController {

  private final ProjectService projectService;

  public ProjectController(ProjectService projectService) {
    this.projectService = projectService;
  }

  // 新增项目（REST：POST）
  @PostMapping
  public ApiResponse<Project> addProject(@RequestBody Project project) {
    return success(projectService.addProject(project));
  }

  // 查询项目列表（REST：GET）
  @GetMapping
  public ApiResponse<List<Project>> getProjects() {
    return success(projectService.getAllProjects());
  }
}
