package com.maina.ainana.server;

import com.maina.ainana.DataSourceUtil.MyRoutingDataSource;
import com.maina.ainana.mapper.MainaSsoMapper;
import com.maina.ainana.pojo.T_MALL_ADDRESS;
import com.maina.ainana.pojo.T_MALL_USER_ACCOUNT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title:  sso server
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/12/11.
 * type:
 */
@Service
public class MainaSsoServerImpl implements MainaSsoServer {

    @Resource
    private MainaSsoMapper ssoMapper;

    @Override
    public T_MALL_USER_ACCOUNT select_login_user_info(String yh_mch) {

        MyRoutingDataSource.setKey("1");

        return ssoMapper.select_login_user_info(yh_mch);
    }

    @Override
    public T_MALL_USER_ACCOUNT select_Oracle_login_user_info(String yh_mch) {

        MyRoutingDataSource.setKey("2");

        return ssoMapper.select_login_user_info(yh_mch);
    }

    @Override
    public List<T_MALL_ADDRESS> select_user_address_info(Integer yh_id) {

        return ssoMapper.select_user_address_info(yh_id);
    }

    @Override
    public T_MALL_ADDRESS select_user_address_byId(Integer id) {

        return ssoMapper.select_user_address_byId(id);
    }


}
