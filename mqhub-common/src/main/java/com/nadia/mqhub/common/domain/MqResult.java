package com.nadia.mqhub.common.domain;

import lombok.Data;

/**
 * @author xiang.shi
 * @date 2020/4/7 11:32 上午
 */
@Data
public class MqResult {
    private String sendStatus;
    private String msgId;
}
