# 使用IDEA整合Spring、MyBatis

## 目录结构

- src
  - main
    - java
      - com.huang.mybatis
        - domain
          - User.java
        - mapper
          - UserMapper.java
          - UserMapper.xml
    - resources
      - applicationContext.xml
      - db.properties
      - logback.xml
      - mybatis-config.xml
    - webapp
      - WEB-INF
        - web.xml
  - test
- log
- pom.xml

------



## 日志

日志使用：slf4j+logback

[配置使用](https://www.jianshu.com/p/696444e1a352)





## 注意

使用Mapper方式开发

mapper.xml和mapper.java文件要放在一个包下，但在IDEA中目录是普通属性，所以它的（src/main/java）目录中的只有.java文件会默认编译，.xml文件不会被编译。

需要在pom.xml中加入下面，可[参考博客](https://blog.csdn.net/u012685794/article/details/51953237#commentBox)

```xml
<project>
        ......
        <build>
            <resources>
		<resource>
			<directory>src/main/java</directory>
				<includes>
					<include>**/*.xml</include>
				</includes>
				<filtering>true</filtering>
			</resource>
		</resources>
        </build>
</project>
```



















