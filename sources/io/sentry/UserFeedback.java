package io.sentry;

import i0.d.a.a.a;
import io.sentry.protocol.SentryId;

public final class UserFeedback {
    private String comments;
    private String email;
    private final SentryId eventId;
    private String name;

    public UserFeedback(SentryId sentryId) {
        this(sentryId, (String) null, (String) null, (String) null);
    }

    public String getComments() {
        return this.comments;
    }

    public String getEmail() {
        return this.email;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public String getName() {
        return this.name;
    }

    public void setComments(String str) {
        this.comments = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder P0 = a.P0("UserFeedback{eventId=");
        P0.append(this.eventId);
        P0.append(", name='");
        a.r(P0, this.name, '\'', ", email='");
        a.r(P0, this.email, '\'', ", comments='");
        P0.append(this.comments);
        P0.append('\'');
        P0.append('}');
        return P0.toString();
    }

    public UserFeedback(SentryId sentryId, String str, String str2, String str3) {
        this.eventId = sentryId;
        this.name = str;
        this.email = str2;
        this.comments = str3;
    }
}
