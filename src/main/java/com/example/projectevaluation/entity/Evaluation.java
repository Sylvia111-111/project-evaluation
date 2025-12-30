package com.example.projectevaluation.entity;

import lombok.Data;

@Data
public class Evaluation {

  private Long id;          // 评价ID
  private Long projectId;   // 被评价的项目ID
  private Integer score;    // 评分（1-5）
  private String comment;   // 评价内容

  // 手写 getter/setter（避免 Lombok 插件问题）
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
