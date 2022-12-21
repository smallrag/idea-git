package com.zzw.springcloud.alibaba.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:23
 */

import com.zzw.springcloud.alibaba.domain.CommonResult;
import com.zzw.springcloud.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:23
 */
@RestController
public class AccountController {
    @Autowired
private AccountService accountService;
@RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId,
                                 @RequestParam("money")BigDecimal money){
    accountService.decrease(userId,money);
    return new CommonResult(200,"扣减账户余额成功");
}

}
