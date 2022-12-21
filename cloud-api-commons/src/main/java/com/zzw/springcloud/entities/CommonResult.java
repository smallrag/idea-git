package com.zzw.springcloud.entities;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/11/30 21:14
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @version 1.0
 * Create by 2022/11/30 21:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code,String message){
     this(code,message,null);
    }

}
