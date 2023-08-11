package org.example.message.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 业务类型枚举
 * @author zhang
 * @date 2023-08-11
 */
@Getter
@ToString
@AllArgsConstructor
public enum BusinessCode {

    /** 普通发送流程 */
    COMMON_SEND("send", "普通发送"),

    /** 撤回流程 */
    RECALL("recall", "撤回消息");


    /** code 关联着责任链的模板 */
    private String code;

    /** 类型说明 */
    private String description;


}
