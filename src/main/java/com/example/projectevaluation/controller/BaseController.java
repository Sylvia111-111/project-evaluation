package com.example.projectevaluation.controller;

import com.example.projectevaluation.common.ApiResponse;

public class BaseController {

  protected <T> ApiResponse<T> success(T data) {
    return ApiResponse.success(data);
  }

  protected ApiResponse<Void> success() {
    return ApiResponse.success();
  }

  protected ApiResponse<Void> error(String message) {
    return ApiResponse.error(message);
  }
}
