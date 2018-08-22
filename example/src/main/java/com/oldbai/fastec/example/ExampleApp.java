package com.oldbai.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.oldbai.latte_core.app.Latte;
import com.oldbai.latte_core.net.interceptors.DebugInterceptor;
import com.oldbai.latte_ec.icon.FontEcModule;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
