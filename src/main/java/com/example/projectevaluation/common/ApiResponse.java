package com.example.projectevaluation.common;

import lombok.Data;

@Data
public class ApiResponse<T> {

  private Integer code;
  private String message;
  private T data;

  public ApiResponse(Integer code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static <T> ApiResponse<T> success(T data) {
    return new ApiResponse<>(200, "成功", data);
  }

  public static <T> ApiResponse<T> success() {
    return new ApiResponse<>(200, "成功", null);
  }

  public static <T> ApiResponse<T> error(String message) {
    return new ApiResponse<>(500, message, null);
  }
}
