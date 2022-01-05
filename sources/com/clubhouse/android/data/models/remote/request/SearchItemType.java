package com.clubhouse.android.data.models.remote.request;

import i0.e.b.b3.a.b.c.g;
import n0.c.e;

@e(with = g.class)
/* compiled from: SearchRequest.kt */
public enum SearchItemType {
    USERS("UserProfile"),
    CLUBS("Club"),
    CHANNELS("LiveChannel"),
    EVENTS("Event");
    
    private final String value;

    private SearchItemType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
