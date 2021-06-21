package com.jianglinnana.house;

import com.baomidou.mybatisplus.generator.SimpleAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.jianglinnana.house.model.entity.core.BaseEntity;
import com.jianglinnana.house.service.core.BaseService;
import com.jianglinnana.house.service.core.BaseServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisGenerator {

    @Test
    void generator() {
        new SimpleAutoGenerator() {
            /**
             * 全局配置 Builder
             */
            @Override
            public IConfigBuilder<GlobalConfig> globalConfigBuilder() {
                return new GlobalConfig.Builder()
                        .openDir(false)
                        .outputDir("C:\\Users\\jianglinnana\\Desktop\\house\\src\\main\\java")
                        .fileOverride()
                        .enableSwagger()
                        .author("jianglinnana")
                        .dateType(DateType.TIME_PACK)
                        .commentDate("yyyy-MM-dd");
            }

            /**
             * 数据源配置 Builder
             */
            @Override
            public IConfigBuilder<DataSourceConfig> dataSourceConfigBuilder() {
                return new DataSourceConfig.Builder("jdbc:mysql://121.5.156.190:3306/rent_house?" +
                        "serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=true",
                        "root", "jianglin19150.Z");
            }

            /**
             * 代码生成策略配置 Builder
             */
            @Override
            public IConfigBuilder<StrategyConfig> strategyConfigBuilder() {
                return new StrategyConfig.Builder()
                        .enableCapitalMode()
                        .enableSkipView()
                        .disableSqlFilter()
                        .entityBuilder()
                            .superClass(BaseEntity.class)
                            .enableSerialVersionUID()
                            .enableChainModel()
                            .enableLombok()
                            .naming(NamingStrategy.underline_to_camel)
                        .mapperBuilder()
                            .formatMapperFileName("%sMapper")
                            .formatXmlFileName("%sMapper")
                            .enableBaseResultMap()
                        .serviceBuilder()
                            .superServiceClass(BaseService.class)
                            .superServiceImplClass(BaseServiceImpl.class)
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                        .controllerBuilder()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .enableHyphenStyle();
            }

            /**
             * 生成文件包名配置 Builder
             */
            @Override
            public IConfigBuilder<PackageConfig> packageConfigBuilder() {
                return new PackageConfig.Builder()
                        .parent("com.jianglinnana.house.test")
                        .entity("model.entity")
                        .mapper("dao.mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .controller("controller")
                        .xml("dao.xml");
            }
        }.execute();
    }
}
