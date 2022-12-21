package com.zzw.springcloud.alibaba.service;

/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:00
 */
public interface StorageService {


    void decrease(Long productId,Integer count);
}
