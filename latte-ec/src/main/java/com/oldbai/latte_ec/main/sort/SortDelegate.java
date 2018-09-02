package com.oldbai.latte_ec.main.sort;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.oldbai.latte_core.delegates.LatteDelegate;
import com.oldbai.latte_core.delegates.bottom.BottomItemDelegate;
import com.oldbai.latte_ec.R;
import com.oldbai.latte_ec.main.sort.content.ContentDelegate;
import com.oldbai.latte_ec.main.sort.list.VerticalListDelegate;

public class SortDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        final VerticalListDelegate listDelegate = new VerticalListDelegate();
        loadRootFragment(R.id.vertical_list_container, listDelegate);
        //设置右侧第一个分类的显示，默认显示分类一
        replaceLoadRootFragment(R.id.sort_content_container, ContentDelegate.newInstance(1), false);
    }
}
