package com.pocket.service;

import com.pocket.dto.DishDTO;
import com.pocket.dto.DishPageQueryDTO;
import com.pocket.entity.Dish;
import com.pocket.result.PageResult;
import com.pocket.vo.DishVO;
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

    /**
     * 根据id查询菜品和对应的口味数据
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);


    /**
     * 根据id修改菜品基本信息和对应的口味信息
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);
}
