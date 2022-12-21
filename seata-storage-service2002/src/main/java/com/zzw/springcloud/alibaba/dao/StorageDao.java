package com.zzw.springcloud.alibaba.dao;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 18:59
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 18:59
 */
@Mapper
public interface StorageDao {

void decrease(@Param("productId") Long productId,@Param("count") Integer count);

}
