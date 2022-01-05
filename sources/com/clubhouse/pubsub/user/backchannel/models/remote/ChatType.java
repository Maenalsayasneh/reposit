package com.clubhouse.pubsub.user.backchannel.models.remote;

import i0.e.d.b.a.a.b.c;
import n0.c.e;

@e(with = c.class)
/* compiled from: ChatType.kt */
public enum ChatType {
    ONE_ON_ONE("one_on_one"),
    GROUP("group");
    
    private final String value;

    private ChatType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
