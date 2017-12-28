package com.maina.ainana.server;

import com.maina.ainana.pojo.T_MALL_ADDRESS;
import com.maina.ainana.pojo.T_MALL_USER_ACCOUNT;
import javax.jws.WebService;
import java.util.List;

/**
 * Title:  sso interface
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/12/11.
 * type:
 */
@WebService
public interface MainaSsoServer {

    T_MALL_USER_ACCOUNT select_login_user_info(String yh_mch);

    T_MALL_USER_ACCOUNT select_Oracle_login_user_info(String yh_mch);

    List<T_MALL_ADDRESS> select_user_address_info(Integer yh_id);

    T_MALL_ADDRESS select_user_address_byId(Integer id);
}
