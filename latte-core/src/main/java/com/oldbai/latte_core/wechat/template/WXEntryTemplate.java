package com.oldbai.latte_core.wechat.template;

import com.oldbai.latte_core.activities.ProxyActivity;
import com.oldbai.latte_core.delegates.LatteDelegate;
import com.oldbai.latte_core.wechat.BaseWXActivity;
import com.oldbai.latte_core.wechat.BaseWXEntryActivity;
import com.oldbai.latte_core.wechat.LatteWeChat;

public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWeChat.getInstance().getSignInCallback().onSignInSuccess(userInfo);
    }
}
