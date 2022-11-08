package com.saraya.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.net.HttpCookie;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestException extends RuntimeException {
    String message ;
    HttpStatus status;
}
