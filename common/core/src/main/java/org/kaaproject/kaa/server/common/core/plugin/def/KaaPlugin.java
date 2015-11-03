package org.kaaproject.kaa.server.common.core.plugin.def;

import org.kaaproject.kaa.server.common.core.plugin.instance.KaaPluginMessage;

public interface KaaPlugin {

    void init(PluginInitContext context);
    
    void onMessage(KaaPluginMessage msg, PluginExecutionContext ctx);
    
}
