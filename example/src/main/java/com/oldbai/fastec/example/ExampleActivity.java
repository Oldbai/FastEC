package com.oldbai.fastec.example;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.oldbai.latte_core.activities.ProxyActivity;
import com.oldbai.latte_core.app.Latte;
import com.oldbai.latte_core.delegates.LatteDelegate;
import com.oldbai.latte_ec.launcher.LauncherDelegate;
import com.oldbai.latte_ec.launcher.LauncherScrollDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }
}
