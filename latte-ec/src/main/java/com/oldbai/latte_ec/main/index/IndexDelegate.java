package com.oldbai.latte_ec.main.index;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.oldbai.latte_core.delegates.bottom.BottomItemDelegate;
import com.oldbai.latte_ec.R;

public class IndexDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_index;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }
}
