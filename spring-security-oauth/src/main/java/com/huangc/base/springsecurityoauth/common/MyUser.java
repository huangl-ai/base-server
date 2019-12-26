package com.huangc.base.springsecurityoauth.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: huangl
 * @Date: 2019/12/26 14:38
 * @Description:
 */
@Data
public class MyUser  implements Serializable {

    private static final long serialVersionUID = 3497935890426858541L;

    private String userName;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
