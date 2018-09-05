package com.oldbai.latte_core.delegates.web.event;

import com.oldbai.latte_core.app.Latte;
import com.oldbai.latte_core.util.log.LatteLogger;

public class UndefineEvent extends Event {
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent", params);
        return null;
    }
}
