package com.oldbai.latte_core.delegates.bottom;

public final class BottomTabBean {
    private final CharSequence ICON;
    private final CharSequence TITLE;

    public BottomTabBean(CharSequence ICON, CharSequence TITLE) {
        this.ICON = ICON;
        this.TITLE = TITLE;
    }


    public CharSequence getIcon() {
        return ICON;
    }

    public CharSequence getTitle() {
        return TITLE;
    }
}
