package org.mule.modules.hazelcastclient;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.hazelcastclient.config.ConnectorConfig;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@Connector(name="hazelcast-client", friendlyName="HazelcastClient")
public class HazelcastClientConnector {

	@Config
	ConnectorConfig config;
	private  HazelcastInstance hzInst ;
	IMap map;

	public  void init() throws Exception {
		if(hzInst == null){
			ClientConfig clientConfig = null;
			String hazelcastConfig = config.getConfigFile();
			if(hazelcastConfig != null || hazelcastConfig.trim().length() > 0){
				clientConfig = new XmlClientConfigBuilder(hazelcastConfig).build();
				hzInst= HazelcastClient.newHazelcastClient(clientConfig);
			}else{
				hzInst= HazelcastClient.newHazelcastClient();
			}
		}
		map=hzInst.getMap(config.getCacheName());
	}


	/**
	 * Custom processor
	 *
	 * @param friend Name to be used to generate a greeting message.
	 * @return A greeting message
	 * @throws Exception 
	 */
	@Processor
	public Object put(String key,String value) throws Exception {
		if(map == null) init();
		return map.put(key, value);
	}

	@Processor
	public Object get(String key) throws Exception {
		if(map == null) init();
		System.out.println("map.get key= "+key);
		return map.get(key);
	}

	@Processor
	public void set(String key,String value) throws Exception {
		if(map == null) init();
		map.set(key, value);
	}

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}