package com.github.zephyrtoria.xiaozhi.service;

import com.github.zephyrtoria.xiaozhi.entity.Appointment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 23240
* @description 针对表【appointment】的数据库操作Service
* @createDate 2025-08-19 15:54:36
*/
public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
