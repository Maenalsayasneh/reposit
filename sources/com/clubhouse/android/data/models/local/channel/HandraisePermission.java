package com.clubhouse.android.data.models.local.channel;

import com.clubhouse.android.data.R;
import n0.c.e;

@e(with = i0.e.b.b3.a.b.c.e.class)
/* compiled from: HandraisePermission.kt */
public enum HandraisePermission {
    ALL(1, R.string.raised_hands_open, R.id.handraise_menu_all),
    FOLLOWED_BY_SPEAKERS(2, R.string.raised_hands_followed_by_speakers, R.id.handraise_menu_followed_by_speakers),
    CLUB_MEMBERS(3, R.string.raised_hands_club, R.id.handraise_menu_club);
    
    private final int code;
    private final int description;
    private final int menuID;

    private HandraisePermission(int i, int i2, int i3) {
        this.code = i;
        this.description = i2;
        this.menuID = i3;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getMenuID() {
        return this.menuID;
    }
}
