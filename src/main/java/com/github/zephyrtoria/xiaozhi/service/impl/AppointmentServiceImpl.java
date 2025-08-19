package com.github.zephyrtoria.xiaozhi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zephyrtoria.xiaozhi.entity.Appointment;
import com.github.zephyrtoria.xiaozhi.service.AppointmentService;
import com.github.zephyrtoria.xiaozhi.mapper.AppointmentMapper;
import org.springframework.stereotype.Service;

/**
 * @author 23240
 * @description 针对表【appointment】的数据库操作Service实现
 * @createDate 2025-08-19 15:54:36
 */
@Service
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment>
        implements AppointmentService {

    @Override
    public Appointment getOne(Appointment appointment) {
        LambdaQueryWrapper<Appointment> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Appointment::getUsername, appointment.getUsername());
        wrapper.eq(Appointment::getIdCard, appointment.getIdCard());
        wrapper.eq(Appointment::getDate, appointment.getDate());
        wrapper.eq(Appointment::getTime, appointment.getTime());
        wrapper.eq(Appointment::getDepartment, appointment.getDepartment());

        return getOne(wrapper);
    }
}




