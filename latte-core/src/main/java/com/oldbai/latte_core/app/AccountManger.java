package com.oldbai.latte_core.app;

import com.oldbai.latte_core.util.storage.LattePreference;

public class AccountManger {

    private enum SignTag {
        SIGN_TAG
    }

    //保存登陆状态，登陆后调用
    public static void setSignState(boolean state) {
        LattePreference.setAppFlag(SignTag.SIGN_TAG.name(), state);
    }

    //
    private static boolean isSignIn() {
        return LattePreference.getAppFlag(SignTag.SIGN_TAG.name());
    }

    public static void checkAccount(IUserChecker checker){
        if (isSignIn()){
            checker.onSignIn();
        } else {
            checker.onNotSignIn();
        }
    }
}
