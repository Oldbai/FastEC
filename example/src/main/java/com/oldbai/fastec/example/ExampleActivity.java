package com.oldbai.fastec.example;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.oldbai.latte_core.activities.ProxyActivity;
import com.oldbai.latte_core.app.Latte;
import com.oldbai.latte_core.delegates.LatteDelegate;
import com.oldbai.latte_core.ui.launcher.ILauncherListener;
import com.oldbai.latte_core.ui.launcher.OnLauncherFinishTag;
import com.oldbai.latte_ec.launcher.LauncherDelegate;
import com.oldbai.latte_ec.launcher.LauncherScrollDelegate;
import com.oldbai.latte_ec.main.EcBottomDelegate;
import com.oldbai.latte_ec.main.index.IndexDelegate;
import com.oldbai.latte_ec.sign.ISignListener;
import com.oldbai.latte_ec.sign.SignInDelegate;
import com.oldbai.latte_ec.sign.SignUpDelegate;

import qiu.niorgai.StatusBarCompat;

public class ExampleActivity extends ProxyActivity implements
        ISignListener,
        ILauncherListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
        StatusBarCompat.translucentStatusBar(this, true);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }

    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SIGNED:
                Toast.makeText(this, "启动结束，用户登陆了", Toast.LENGTH_SHORT).show();
                startWithPop(new EcBottomDelegate());
                break;
            case NOT_SIGNED:
                Toast.makeText(this, "启动结束，用户登陆了", Toast.LENGTH_SHORT).show();
                startWithPop(new SignInDelegate());
                break;
            default:
                break;
        }
    }
}
