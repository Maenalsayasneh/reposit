package com.clubhouse.android.data.models.local.channel;

import i0.e.b.b3.a.a.c.c;
import n0.c.e;

@e(with = c.class)
/* compiled from: PromptField.kt */
public enum PromptField {
    BIO("bio"),
    PHOTO("photo");
    
    private final String value;

    private PromptField(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
