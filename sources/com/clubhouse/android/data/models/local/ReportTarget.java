package com.clubhouse.android.data.models.local;

/* compiled from: ReportTarget.kt */
public enum ReportTarget {
    USER_SPOKEN("user_spoken"),
    USER_PROFILE("user_profile"),
    CHANNEL_TOPIC("channel_topic"),
    CHAT_MESSAGES("chat_messages"),
    CLUB_PROFILE("club_profile"),
    UNKNOWN("unknown");
    
    private final String target;

    private ReportTarget(String str) {
        this.target = str;
    }

    public final String getTarget() {
        return this.target;
    }
}
