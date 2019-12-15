package com.huangc.base.studyservice.common.shiro;

import com.meiin.base.core.CommonConstant;
import com.meiin.base.core.LoginUserInfo;
import com.meiin.base.springboot.shiro.oauth2.OAuth2Realm;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

/**
 * @author create By huangj
 * @create 2017-09-02 下午 1:26
 **/
public class MyShiroRealm extends OAuth2Realm {

    public static final String USER_ADMIN = "user:admin";
    public static final String USER_PERSONAL = "user:personal";

    @Value("${application.adminUser}")
    private String adminUser;


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        LoginUserInfo userInfo = LoginUserInfo.getUserPrincipal();
        Map map = (Map) userInfo.getApp();
        if (CommonConstant.YES.equals(map.get("is_admin"))) {
            authorizationInfo.addStringPermission(USER_ADMIN);
        }
        authorizationInfo.addStringPermission(USER_PERSONAL);

        return authorizationInfo;
    }

}
