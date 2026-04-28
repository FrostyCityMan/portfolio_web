package com.frostycityman.sqlannotator.portfolio_web.common.exception;

import org.springframework.http.HttpStatus;

public class PortfolioException extends RuntimeException {

    private final HttpStatus status;

    public PortfolioException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
