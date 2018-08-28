package com.oldbai.latte_ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.oldbai.latte_core.delegates.LatteDelegate;
import com.oldbai.latte_ec.R;
import com.oldbai.latte_ec.R2;

import butterknife.BindView;

public class LauncherDelegate extends LatteDelegate {

    //@BindView(R2.id.tv_launcher_timer)

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }
}
