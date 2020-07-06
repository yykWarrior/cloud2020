package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @ClassName: PaymentServiceImpl
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/8 20:28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public void add(Payment payment) {
        System.out.println(payment+":服务器8001");
        paymentDao.create(payment);
    }
}
