package jundl77.izou.izousensors;

import intellimate.izou.output.OutputPlugin;
import intellimate.izou.system.Context;

/**
 * Created by julianbrendl on 12/23/14.
 */
public class SensorsOutputPlugin extends OutputPlugin<String> {
    public static final String ID = SensorsOutputPlugin.class.getCanonicalName();

    public SensorsOutputPlugin(Context context) {
        super(ID, context);
    }

    @Override
    public void renderFinalOutput() {

    }
}
