package org.example.message.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送消息接口返回参数
 * @author zhang
 * @date 2023-08-11
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class SendResponse {

    private String code;

    private String message;

}
