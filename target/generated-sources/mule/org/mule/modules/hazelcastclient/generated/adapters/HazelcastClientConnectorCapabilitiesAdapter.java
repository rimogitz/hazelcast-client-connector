
package org.mule.modules.hazelcastclient.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.hazelcastclient.HazelcastClientConnector;


/**
 * A <code>HazelcastClientConnectorCapabilitiesAdapter</code> is a wrapper around {@link HazelcastClientConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2019-01-05T01:47:27+00:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HazelcastClientConnectorCapabilitiesAdapter
    extends HazelcastClientConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
