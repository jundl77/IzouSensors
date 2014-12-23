package jundl77.izou.izousensors;

import ro.fortsoft.pf4j.PluginWrapper;

/**
 * Created by julianbrendl on 12/23/14.
 */
public class ZipFileManager extends intellimate.izou.addon.ZipFileManager {

    /**
     * Constructor to be used by plugin manager for plugin instantiation.
     * Your plugins have to provide constructor with this exact signature to
     * be successfully loaded by manager.
     *
     * @param wrapper the PluginWrapper to assign the ZipFileManager to
     */
    public ZipFileManager(PluginWrapper wrapper) {
        super(wrapper);
    }
}
