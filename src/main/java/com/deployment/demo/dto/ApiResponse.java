package com.deployment.demo.dto;

public record ApiResponse<T>(int code, T data, String message) {
}
