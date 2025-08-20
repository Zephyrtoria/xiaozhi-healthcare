package com.github.zephyrtoria.xiaozhi.controller;

import com.github.zephyrtoria.xiaozhi.assistant.XiaoZhiAgent;
import com.github.zephyrtoria.xiaozhi.bean.ChatRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Tag(name = "小智医疗")
@RestController
@RequestMapping("xiaozhi")
public class XiaoZhiController {
    @Resource
    private XiaoZhiAgent xiaoZhiAgent;

    @PostMapping(value = "chat", produces = "text/stream;charset=utf-8")
    public Flux<String> chat(@RequestBody ChatRequest form) {
        return xiaoZhiAgent.chat(form.getMemoryId(), form.getMessage());
    }
}
