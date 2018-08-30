package com.oldbai.latte_ec.main.sort;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.oldbai.latte_core.delegates.bottom.BottomItemDelegate;
import com.oldbai.latte_ec.R;

public class SortDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }
}
