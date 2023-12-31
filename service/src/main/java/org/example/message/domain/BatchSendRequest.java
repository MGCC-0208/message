package org.example.message.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 批量发送消息接口参数
 * @author zhang
 * @date 2023-08-11
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BatchSendRequest {

    /**
     * 执行业务类型
     * send:发送消息
     * recall:撤回消息
     */
    private String code;

    /**
     * 消息模板Id
     * 【必填】
     */
    private Long messageTemplateId;


    /**
     * 消息相关的参数
     * 当业务类型为"send"，必传
     */
    private List<MessageParam> messageParamList;
}
