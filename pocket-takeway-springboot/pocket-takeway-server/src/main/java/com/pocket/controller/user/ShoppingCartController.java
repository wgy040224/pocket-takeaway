package com.pocket.controller.user;

import com.pocket.dto.ShoppingCartDTO;
import com.pocket.entity.ShoppingCart;
import com.pocket.result.Result;
import com.pocket.service.ShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ShoppingCartController
 * @description
 * @date 2024-11-27
 */


@RestController
@RequestMapping("/user/shoppingCart")
@Slf4j
@Api(tags = "C端购物车接口")
public class ShoppingCartController {


    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/add")
    @ApiOperation("添加购物车")
    public Result add(@RequestBody ShoppingCartDTO shoppingCartDTO) {

        log.info("添加购物车，商品信息为：{}", shoppingCartDTO);
        shoppingCartService.addShoppingCart(shoppingCartDTO);
        return Result.success();
    }

    @PostMapping("/sub")
    @ApiOperation("删除购物车中一个商品")
    public Result sub(@RequestBody ShoppingCartDTO shoppingCartDTO) {

        log.info("删除购物车中一个商品，商品信息为：{}", shoppingCartDTO);
        shoppingCartService.subShoppingCart(shoppingCartDTO);
        return Result.success();
    }

    /**
     * 查看购物车
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查看购物车")
    public Result<List<ShoppingCart>> list() {
        List<ShoppingCart> list = shoppingCartService.showShoppingCart();
        return Result.success(list);
    }

    @DeleteMapping("/clean")
    @ApiOperation("清空购物车")
    public Result clean() {
        shoppingCartService.cleanShoppingCart();
        return Result.success();
    }
}
