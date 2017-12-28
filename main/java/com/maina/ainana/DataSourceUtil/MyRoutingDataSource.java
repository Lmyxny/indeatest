package com.maina.ainana.DataSourceUtil;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/12/11.
 * type:
 */
public class MyRoutingDataSource extends AbstractRoutingDataSource {

    private static String getKey() {
        return key.get();
    }

    public static void setKey(String key_in) {

        key.set(key_in);
    }

    private static ThreadLocal<String> key = new ThreadLocal<>();

    @Override
    protected Object determineCurrentLookupKey() {

        return getKey();
    }
}
