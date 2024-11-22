package com.pocket.mapper;

import com.pocket.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName DishFlaverMapper
 * @description
 * @date 2024-11-22
 */

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
