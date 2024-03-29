package com.sky.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "oss")
public class AliOssProperties {
  
    private String endpoint;  
    private String bucketName;
    private String credentialsProviderType;
    // 这里需要定义与 credentialsProvider 相关的类，并根据实际使用的凭证提供者库进行适配
// 添加CredentialsProvider字段
    // 例如，如果您使用的是阿里云 SDK，可能需要定义阿里云特定的凭证提供者类

  
    // 省略 getter 和 setter 方法  
}