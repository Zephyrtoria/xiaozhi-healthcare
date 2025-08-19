package com.github.zephyrtoria.xiaozhi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {
    // 映射到 mongoDB 文档的唯一标识
    @Id
    private ObjectId id;

    private Integer memoryId;

    // 聊天记录
    private String content;
}
