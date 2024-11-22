package com.pocket.service;

import com.pocket.dto.DishDTO;
import com.pocket.entity.Dish;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName DishService
 * @description
 * @date 2024-11-22
 */

public interface DishService {

    /**
     * 新增菜品和对应口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);



}
