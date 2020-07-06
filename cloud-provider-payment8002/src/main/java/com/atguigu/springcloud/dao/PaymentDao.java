package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version v1.0
 * @ClassName: PaymentDao
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/8 19:51
 */
@Mapper
public interface PaymentDao {
     void create(Payment serial);
}
