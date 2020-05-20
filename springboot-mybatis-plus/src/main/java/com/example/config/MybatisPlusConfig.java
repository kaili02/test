package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By kaili
 * Date: 2020/05/17
 * Description: TODO
 */
//@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

//    /**
//     * SQL执行效率插件
//     * 性能分析拦截器，用于输出每条 SQL 语句及其执行时间
//     * 参数：maxTime SQL 执行最大时长，超过自动停止运行，有助于发现问题。
//     * 参数：format SQL SQL是否格式化，默认false。
//     * 该插件只用于开发环境，不建议生产环境使用。
//     */
//    @Bean
//    @Profile({"dev","test"})// 设置 dev test 环境开启
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
}
