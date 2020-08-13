/*
package com.zy.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

*/
/**
 * <ul>
 * <li>文件包名 : com.zy.interceptor</li>
 * <li>创建时间 : 2020/7/20 11:01</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 *//*

@Intercepts(
        {
            @Signature(method = "query",
                    type = Executor.class,
                    args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
            ),
            @Signature(method = "update",
                    type = Executor.class,
                    args = {MappedStatement.class, Object.class}

            )
        }
)
// 这个意思就是说  Intercepts 的数组都可以生效
public class MyInterceptor implements Interceptor {

    private String name;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("被拦截方法执行之前，做的辅助服务······" + name);
        Object proceed = invocation.proceed();
        System.out.println("被拦截方法执行之后，做的辅助服务······");
        return proceed;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
*/
