package com.zzw.springcloud.alibaba.service.impl;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:01
 */

import com.zzw.springcloud.alibaba.dao.StorageDao;
import com.zzw.springcloud.alibaba.service.StorageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:01
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);
    @Autowired
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
