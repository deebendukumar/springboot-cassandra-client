package io.cassandra.client.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.cassandra.client")
public class CassandraClientConfiguration {

    @Resource
    private CassandraClientConfig producerConfig;

}
