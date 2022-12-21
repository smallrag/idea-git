package com.zzw.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:20
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
