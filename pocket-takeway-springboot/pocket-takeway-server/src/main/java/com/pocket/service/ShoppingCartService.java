package com.pocket.service;

import com.pocket.dto.ShoppingCartDTO;
import com.pocket.entity.ShoppingCart;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName ShoppingCartService
 * @description
 * @date 2024-11-27
 */



public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();


    /**
     * 清空购物车
     */
    void cleanShoppingCart();
}
