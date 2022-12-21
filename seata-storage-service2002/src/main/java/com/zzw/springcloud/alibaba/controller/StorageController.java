package com.zzw.springcloud.alibaba.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:09
 */

import com.zzw.springcloud.alibaba.domain.CommonResult;
import com.zzw.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:09
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

@RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
    storageService.decrease(productId,count);
    return new CommonResult(200,"扣减库存成功!");
}
}
