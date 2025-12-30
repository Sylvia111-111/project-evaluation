package com.example.projectevaluation.controller;

import com.example.projectevaluation.common.ApiResponse;
import com.example.projectevaluation.entity.Evaluation;
import com.example.projectevaluation.service.EvaluationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class EvaluationController extends BaseController {

  private final EvaluationService evaluationService;

  public EvaluationController(EvaluationService evaluationService) {
    this.evaluationService = evaluationService;
  }

  // 添加评价（REST：POST）
  @PostMapping
  public ApiResponse<Evaluation> addEvaluation(@RequestBody Evaluation evaluation) {
    return success(evaluationService.addEvaluation(evaluation));
  }

  // 根据项目ID查询评价（REST：GET）
  @GetMapping("/project/{projectId}")
  public ApiResponse<List<Evaluation>> getEvaluations(@PathVariable Long projectId) {
    return success(evaluationService.getEvaluationsByProjectId(projectId));
  }
}
