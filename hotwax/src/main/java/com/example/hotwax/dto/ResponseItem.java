package com.example.hotwax.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseItem {

    private String orderId;

    private String orderPartSeqId;
}
