package io.cassandra.client.annotations;

import io.cassandra.client.config.CassandraClientConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CassandraClientConfiguration.class)
@EnableScheduling
public @interface EnableCassandraClient {
}
