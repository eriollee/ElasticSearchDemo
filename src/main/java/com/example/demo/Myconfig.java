package com.example.demo;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class Myconfig {
    @Bean
    public TransportClient client() throws UnknownHostException{
        Settings setting = Settings.builder().put("cluster.name","wali").build();

        TransportClient client = new PreBuiltTransportClient(setting) .addTransportAddress(new TransportAddress(InetAddress.getByName("locoalhost"), 9300));
        return  client;
    }
}
