package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public enum SentryItemType {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Unknown("__unknown__");
    
    private final String itemType;

    private SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        if (obj instanceof SentryEvent) {
            return Event;
        }
        if (obj instanceof SentryTransaction) {
            return Transaction;
        }
        if (obj instanceof Session) {
            return Session;
        }
        return Attachment;
    }

    public String getItemType() {
        return this.itemType;
    }
}
