package com.pocket.service;

import com.pocket.dto.UserLoginDTO;
import com.pocket.entity.User;
import com.pocket.vo.UserLoginVO;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName UserService
 * @description
 * @date 2024-11-25
 */


public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);


}
