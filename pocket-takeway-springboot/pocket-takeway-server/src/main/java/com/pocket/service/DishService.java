package com.pocket.service;

import com.pocket.dto.DishDTO;
import com.pocket.dto.DishPageQueryDTO;
import com.pocket.entity.Dish;
import com.pocket.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
