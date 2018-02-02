package com.tangjing.athena.common.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {

    //生成的文件路径
    private static final String OUTPUTDIR = "/Users/tangjing/devloper/ideaWorkSpace/athena/athena-uc/src/main/java";
    //数据库连接的地址
    private static final String DBURL = "jdbc:mysql://localhost:3306/athena";
    //数据库用户名
    private static final String DBUSER = "root";
    //数据库密码
    private static final String DBPASS = "root";


    public static void main ( String[] arargsgs ) {
        String packageName = "com.tangjing.athena.uc";
        //user -> UserService, 设置成true: user -> IUserService
        boolean serviceNameStartWithI = true;
        generateByTables(serviceNameStartWithI , packageName , "RELTION_USER_DEPT","RELTION_USER_ROLE");
    }

    private static void generateByTables ( boolean serviceNameStartWithI , String packageName , String... tableNames ) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(DBURL).setUsername(DBUSER).setPassword(DBPASS).setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        //修改替换成你需要的表名，多个表名传数组
        strategyConfig.setCapitalMode(true).setEntityLombokModel(true).setDbColumnUnderline(true).setNaming(NamingStrategy.underline_to_camel).setInclude(tableNames);
        config.setActiveRecord(false).setAuthor("TangJing").setOutputDir(OUTPUTDIR).setFileOverride(true);
        if (!serviceNameStartWithI){
            config.setServiceName("%sService");
        }
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setMapper("dao");
        packageConfig.setXml("mapper");
        new AutoGenerator().setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig).setPackageInfo(new PackageConfig().setParent(packageName).setController("controller").setEntity("entity").setMapper("dao").setXml("dao.mapper")).execute();
    }

}