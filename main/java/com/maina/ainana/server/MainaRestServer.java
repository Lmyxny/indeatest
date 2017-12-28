package com.maina.ainana.server;


import javax.jws.WebService;

/**
 * Title: sso interface
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/12/11.
 * type:
 */
@WebService
public interface MainaRestServer {

    String rest_select_user_address_info(Integer yh_id);
}
