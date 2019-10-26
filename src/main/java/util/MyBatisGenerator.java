package util;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 逆向工程生成器
 */
public class MyBatisGenerator {

	//根据配置文件,生成相应的model实体类,mapper接口,mapperXMl文件
	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			//注意:使用绝对路径 请根据自己本机的具体路径重新配置 否则运行不成功
			File configFile = new File("E:\\MyFile\\Idea_WorkSpace\\mybatis-generator\\src\\main\\resources\\mybatis-generator\\generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			org.mybatis.generator.api.MyBatisGenerator myBatisGenerator = new org.mybatis.generator.api.MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
