package com.zzw.springcloud.entities;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/11/30 21:12
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 * @version 1.0
 * Create by 2022/11/30 21:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
