package com.instabug.chat.e;

import java.util.ArrayList;

/* compiled from: FlatMessage */
public class c {
    public String a;
    public String b;
    public String c;
    public String d;
    public b e;
    public a f;
    public long g;
    public boolean h;
    public ArrayList<e> i;

    /* compiled from: FlatMessage */
    public enum a {
        NONE,
        PLAYING
    }

    /* compiled from: FlatMessage */
    public enum b {
        MESSAGE,
        IMAGE,
        AUDIO,
        VIDEO
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Body: ");
        P0.append(this.a);
        P0.append("URL: ");
        P0.append(this.c);
        P0.append("has actions: ");
        ArrayList<e> arrayList = this.i;
        P0.append(arrayList != null && arrayList.size() > 0);
        P0.append("type: ");
        P0.append(this.e);
        P0.append("actions: ");
        P0.append(this.i);
        return P0.toString();
    }
}
