package com.clubhouse.android.channels.model;

import com.clubhouse.android.channels.R;
import i0.e.b.z2.f.a;

/* compiled from: AudienceType.kt */
public enum AudienceType implements a {
    Open(r3, r4, r6, r6, R.string.room_access_room_opened_up, R.drawable.ic_channel_open, R.drawable.ic_globe),
    Social(R.string.room_type_social, R.string.room_access_social_room, R.string.room_access_social_room_explanation, R.string.room_access_social_room_tooltip, R.string.room_access_room_made_social, R.drawable.ic_channel_social, R.drawable.ic_social),
    Closed(r4, r5, r8, r7, r8, r9, r19),
    Club(0, 0, 0, R.string.room_access_club_tooltip, 0, 0, r19);
    
    private final int actionIcon;
    private final int actionTitle;
    private final int alert;
    private final int explanation;
    private final int icon;
    private final int title;
    private final int tooltip;

    private AudienceType(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.title = i;
        this.actionTitle = i2;
        this.explanation = i3;
        this.tooltip = i4;
        this.alert = i5;
        this.icon = i6;
        this.actionIcon = i7;
    }

    public final int getActionIcon() {
        return this.actionIcon;
    }

    public final int getActionTitle() {
        return this.actionTitle;
    }

    public final int getAlert() {
        return this.alert;
    }

    public final int getExplanation() {
        return this.explanation;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getTooltip() {
        return this.tooltip;
    }
}
