package com.github.zephyrtoria.xiaozhi.bean;

import lombok.Data;

@Data
public class ChatRequest {
    private Long memoryId;

    private String message;
}
