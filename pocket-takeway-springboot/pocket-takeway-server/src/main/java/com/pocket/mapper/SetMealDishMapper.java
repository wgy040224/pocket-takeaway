package com.pocket.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName SetMealDishMapper
 * @description
 * @date 2024-11-22
 */

@Mapper
public interface SetMealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */

    //select setmeal_id from setmeal dish where dish id in (1,2,3,4)
    List<Long> getSetMealIdsByDishIds(List<Long> dishIds);

}
