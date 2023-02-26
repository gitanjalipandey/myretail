package com.myretail.product;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.auth.AuthProvider;
import com.datastax.oss.driver.api.core.auth.ProgrammaticPlainTextAuthProvider;
import com.datastax.oss.driver.internal.core.auth.PlainTextAuthProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.KeyspaceOption;
import org.springframework.data.cassandra.core.cql.session.init.KeyspacePopulator;
import org.springframework.data.cassandra.core.cql.session.init.ResourceKeyspacePopulator;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

//@Configuration
//@PropertySource(value = {"classpath:application.properties"})
//@EnableCassandraRepositories
public class CassandraConfig {
        /*
        extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.keyspace-name}")
    private String cassandraKeyspace;

    @Override
    protected String getKeyspaceName() {
        System.out.println("======keyspace=" + this.cassandraKeyspace);
        return this.cassandraKeyspace;
    }
/*
    @Nullable
    @Override
    protected KeyspacePopulator keyspacePopulator() {
        return new ResourceKeyspacePopulator(new ClassPathResource("com/foo/cql/db-schema.cql"),
                new ClassPathResource("com/foo/cql/db-test-data.cql"));
    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        return Collections.singletonList(CreateKeyspaceSpecification.createKeyspace(cassandraKeyspace)
                .ifNotExists()
                .with(KeyspaceOption.DURABLE_WRITES, true)
                .withSimpleReplication());
    }

  //  @Override
    //protected AuthProvider getAuthProvider(){
      //  return new PlainTextAuthProvider("username", "password");
/*
    @Override
    protected List<String> getStartupScripts() {
        return Collections.singletonList("CREATE TABLE IF NOT EXISTS "+cassandraKeyspace+".test(id UUID PRIMARY KEY, greeting text, occurrence timestamp) WITH default_time_to_live = 600;");
    }

    @Bean
    public CqlSession session() {
        AuthProvider authProvider = new ProgrammaticPlainTextAuthProvider("cassandra", "cassandra");

        CqlSession session =
                CqlSession.builder()
                        .withAuthProvider(authProvider)
                        .build();
        return session;
     //   return CqlSession.builder().withKeyspace("myretail").withAuthCredentials("cassandra", "cassandra").build();
    }




 */

}