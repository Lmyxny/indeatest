package com.maina.ainana.server;

import com.google.gson.Gson;
import com.maina.ainana.mapper.MainaSsoMapper;
import com.maina.ainana.pojo.T_MALL_ADDRESS;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.*;
import java.util.List;

/**
 * Title: sso server
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/12/11.
 * type:
 */
@Service
public class MainaRestServerImpl implements MainaRestServer {

    @Resource
    private MainaSsoMapper ssoMapper;

    @Override
    @Path("/rest")
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String rest_select_user_address_info(@FormParam("yh_id") Integer yh_id) {

        List<T_MALL_ADDRESS> t_mall_address = ssoMapper.select_user_address_info(yh_id);

        return new Gson().toJson(t_mall_address);
    }
}
