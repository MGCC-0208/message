package org.example.message.service;

import org.example.message.domain.SendRequest;
import org.example.message.domain.SendResponse;

/**
 * 撤回消息Service接口
 * @author zhang
 * @date 2023-08-11
 */
public interface RecallService {

    /**
     * @param sendRequest 撤回消息接口参数
     * @return SendResponse
     *
     * @author zhang
     * @date 2023-08-11
     */
    SendResponse recall(SendRequest sendRequest);
}
