package org.example.message.service;

import org.example.message.domain.SendRequest;
import org.example.message.domain.SendResponse;
import org.example.message.domain.BatchSendRequest;

/**
 * 发送消息Service接口
 * @author zhang
 * @date 2023-08-11
 */
public interface SendService {

    /**
     * 单文案发送接口
     *
     * @param sendRequest 发送消息接口参数
     * @return SendResponse
     */
    SendResponse send(SendRequest sendRequest);


    /**
     * 批量发送消息接口
     * @param batchSendRequest 批量发送消息接口
     * @return SendResponse
     *
     * @author zhang
     * @date 2023-08-11
     */
    SendResponse batchSend(BatchSendRequest batchSendRequest);

}
