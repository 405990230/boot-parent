package com.myself.platform.http.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by qxr4383 on 2018/12/25.
 */
@Component
@PropertySource(value = {"classpath:properties/httpConfig.properties"})
@ConfigurationProperties(prefix = "http.pool.conn")
@Data
public class HttpPoolProperties {
    private Integer maxTotal;
    private Integer defaultMaxPerRoute;
    private Integer connectTimeout;
    private Integer connectionRequestTimeout;
    private Integer socketTimeout;
    private Integer validateAfterInactivity;
}
