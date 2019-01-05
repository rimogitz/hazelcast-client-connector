
package org.mule.modules.hazelcastclient.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.hazelcastclient.HazelcastClientConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>HazelcastClientConnectorProcessAdapter</code> is a wrapper around {@link HazelcastClientConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2019-01-05T01:47:27+00:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HazelcastClientConnectorProcessAdapter
    extends HazelcastClientConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<HazelcastClientConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HazelcastClientConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HazelcastClientConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HazelcastClientConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HazelcastClientConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HazelcastClientConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
