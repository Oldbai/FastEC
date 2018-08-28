package com.oldbai.latte_core.util.timer;

import java.util.TimerTask;

public class BaseTimerTask extends TimerTask {

    ITimerListener mITimerListener = null;

    public BaseTimerTask(ITimerListener ITimerListener) {
        this.mITimerListener = ITimerListener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
