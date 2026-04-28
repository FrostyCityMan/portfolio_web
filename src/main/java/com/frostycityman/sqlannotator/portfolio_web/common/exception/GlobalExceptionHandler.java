package com.frostycityman.sqlannotator.portfolio_web.common.exception;

import com.frostycityman.sqlannotator.portfolio_web.common.response.ApiResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PortfolioException.class)
    public ResponseEntity<ApiResponse<?>> handlePortfolioException(PortfolioException exception) {
        return ResponseEntity.status(exception.getStatus())
                .body(ApiResponse.fail(exception.getMessage()));
    }

    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            ConstraintViolationException.class,
            BindException.class,
            MethodArgumentTypeMismatchException.class
    })
    public ResponseEntity<ApiResponse<?>> handleBadRequest(Exception exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ApiResponse.fail(resolveMessage(exception)));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleUnexpectedException(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ApiResponse.fail("일시적인 오류가 발생했습니다. 잠시 후 다시 시도해 주세요."));
    }

    private String resolveMessage(Exception exception) {
        if (exception instanceof MethodArgumentNotValidException methodArgumentNotValidException
                && methodArgumentNotValidException.getBindingResult().hasFieldErrors()) {
            return methodArgumentNotValidException.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
        }
        if (exception instanceof BindException bindException && bindException.hasFieldErrors()) {
            return bindException.getFieldErrors().get(0).getDefaultMessage();
        }
        if (exception instanceof ConstraintViolationException constraintViolationException
                && !constraintViolationException.getConstraintViolations().isEmpty()) {
            return constraintViolationException.getConstraintViolations().iterator().next().getMessage();
        }
        if (exception instanceof MethodArgumentTypeMismatchException) {
            return "요청 파라미터 형식이 올바르지 않습니다.";
        }
        return "잘못된 요청입니다.";
    }
}
