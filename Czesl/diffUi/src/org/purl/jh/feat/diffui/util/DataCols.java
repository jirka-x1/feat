package org.purl.jh.feat.diffui.util;

import cz.cuni.utkl.czesl.data.layerl.Edge;
import cz.cuni.utkl.czesl.data.layerl.Errorr;

/**
 *
 * @author j
 */
public class DataCols {
    
    /**
     * For give edge, finds an error with a particular tag.
     * @param edge
     * @param errorTag
     * @return the first error with that tag or null if there is none.
     * todo: Locations.find(edge, "tag:" + errorTag);
     */
    public static Errorr find(Edge edge, String errorTag) {
        for (Errorr err : edge.getErrors()) {
            if (err.getTag().equals(errorTag) ) return err;
        }
        return null;
    }
}
