package com.itheima.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置
@Configuration
//<context:component-scan base-package="com.itheima.*"/>
@ComponentScan("com.itheima")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
