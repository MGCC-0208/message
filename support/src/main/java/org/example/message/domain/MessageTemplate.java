package org.example.message.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 消息模板
 * @author zhang
 * @date 2023-08-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MessageTemplate implements Serializable {
}
