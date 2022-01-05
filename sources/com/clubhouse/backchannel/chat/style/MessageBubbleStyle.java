package com.clubhouse.backchannel.chat.style;

import i0.e.c.c.j0.b;

/* compiled from: MessageBubbleStyle.kt */
public enum MessageBubbleStyle {
    MIDDLE_ALIGN_RIGHT(r1, new b(0, r9, 0, r9, 5)),
    MIDDLE_ALIGN_LEFT(r1, new b(r9, 0, r9, 0, 10)),
    TOP_ALIGN_RIGHT(r8, new b(0, 0, 0, r9, 7)),
    TOP_ALIGN_LEFT(r8, new b(0, 0, r9, 0, 11)),
    BOTTOM_ALIGN_RIGHT(r1, new b(0, r9, 0, 0, 13)),
    BOTTOM_ALIGN_LEFT(r1, new b(r9, 0, 0, 0, 14)),
    ONLY(r8, new b(0, 0, 0, 0, 15));
    
    private final int gapToPrevious;
    private final b radius;

    private MessageBubbleStyle(int i, b bVar) {
        this.gapToPrevious = i;
        this.radius = bVar;
    }

    public final int getGapToPrevious() {
        return this.gapToPrevious;
    }

    public final b getRadius() {
        return this.radius;
    }
}
