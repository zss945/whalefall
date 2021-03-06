package org.whalefall.stack.framework.ui.vo;

import lombok.NoArgsConstructor;

/**
 * Copyright © 2020 Whale Fall All Rights Reserved
 *
 * @author YaoXiang
 * @description 错误返回
 * @create 2020/5/27 8:48 上午
 */
@NoArgsConstructor
public class ER extends BaseResponseVO {
    public ER(int code, String message) {
        super(code, message);
    }
}
