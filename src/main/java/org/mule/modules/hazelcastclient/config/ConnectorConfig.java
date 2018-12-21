package org.mule.modules.hazelcastclient.config;

import org.mule.api.annotations.components.Configuration;

import java.io.File;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

    /**
     * Greeting message
     */
    
    @Configurable
    private String configFile;
    
    @Configurable
    private String cacheName;


	public String getConfigFile() {
		return configFile;
	}

	public void setConfigFile(String configFile) {
		this.configFile = configFile;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

    
}