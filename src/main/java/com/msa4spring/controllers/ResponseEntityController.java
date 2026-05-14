package com.msa4spring.controllers;

import com.msa4spring.responses.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResponseEntityController {
    @GetMapping("/res")
    public ResponseEntity<ResponseDTO<Integer>> res() {
        ResponseDTO<Integer> responseDTO = ResponseDTO.<Integer>builder()
            .code("00")
            .msg("정상 처리")
            .data(123)
            .build();
        return ResponseEntity.status(300).body(responseDTO);
    }
}
