package com.instabug.library.annotation.e;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"EQ_COMPARETO_USE_OBJECT_EQUALS", "UUF_UNUSED_FIELD", "URF_UNREAD_FIELD"})
/* compiled from: Weight */
public class g implements Comparable<g> {
    public float Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c;
    public int c2;
    public int d;
    public float d2;
    public float q;
    public float x;
    public float y;

    /* compiled from: Weight */
    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public int compareTo(Object obj) {
        int i = ((g) obj).c;
        int i2 = this.c;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
