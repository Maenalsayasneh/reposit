package com.clubhouse.android.ui.channels.views;

import com.clubhouse.app.R;

/* compiled from: NoticeBar.kt */
public enum NoticeType {
    FirstTimeAudience(R.color.clubhouse_light_gray, R.color.clubhouse_dark_gray, Integer.valueOf(R.drawable.ic_mute_notice), Integer.valueOf(R.string.notice_bar_muted)),
    BlockedUsers(R.color.clubhouse_red, R.color.white, Integer.valueOf(R.drawable.ic_blocked), (int) null),
    BadNetwork(R.color.clubhouse_red, R.color.white, Integer.valueOf(R.drawable.ic_wifi), Integer.valueOf(R.string.poor_connection));
    
    private final int background;
    private final Integer defaultMessage;
    private final Integer icon;
    private final int textColor;

    private NoticeType(int i, int i2, Integer num, Integer num2) {
        this.background = i;
        this.textColor = i2;
        this.icon = num;
        this.defaultMessage = num2;
    }

    public final int getBackground() {
        return this.background;
    }

    public final Integer getDefaultMessage() {
        return this.defaultMessage;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final int getTextColor() {
        return this.textColor;
    }
}
