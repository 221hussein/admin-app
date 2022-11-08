package com.saraya.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIException {
    String message;

    HttpStatus status;

    LocalDateTime timestamp;

}
