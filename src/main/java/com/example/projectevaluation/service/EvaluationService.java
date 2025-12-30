package com.example.projectevaluation.service;

import com.example.projectevaluation.entity.Evaluation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class EvaluationService {

  private static final List<Evaluation> evaluationList = new ArrayList<>();
  private static final AtomicLong ID_GENERATOR = new AtomicLong(1);

  // 添加评价
  public Evaluation addEvaluation(Evaluation evaluation) {
    evaluation.setId(ID_GENERATOR.getAndIncrement());
    evaluationList.add(evaluation);
    return evaluation;
  }

  // 根据项目ID查询评价
  public List<Evaluation> getEvaluationsByProjectId(Long projectId) {
    return evaluationList.stream()
      .filter(e -> e.getProjectId().equals(projectId))
      .collect(Collectors.toList());
  }
}
