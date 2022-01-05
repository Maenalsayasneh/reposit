package com.clubhouse.pubsub.user.backchannel.models.remote;

import n0.c.e;

@e(with = i0.e.d.b.a.a.b.e.class)
/* compiled from: ChatMember.kt */
public enum Role {
    MEMBER("member"),
    ADMIN("admin");
    
    private final String value;

    private Role(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
