package com.zzw.springcloud.service.Impl;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/11/30 21:40
 */

import com.zzw.springcloud.dao.PaymentDao;
import com.zzw.springcloud.entities.Payment;
import com.zzw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * Create by 2022/11/30 21:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
