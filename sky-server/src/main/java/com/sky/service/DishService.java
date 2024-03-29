package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    @Transactional //事务注解
    public void  saveWitFlavor(DishDTO dishDTO);

}
