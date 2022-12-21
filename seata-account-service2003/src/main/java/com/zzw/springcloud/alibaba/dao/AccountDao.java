package com.zzw.springcloud.alibaba.dao;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:18
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:18
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
