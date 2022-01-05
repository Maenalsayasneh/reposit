package com.pubnub.api.models.server.presence;

import i0.d.a.a.a;
import java.util.List;

public class WhereNowPayload {
    private List<String> channels;

    public boolean canEqual(Object obj) {
        return obj instanceof WhereNowPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WhereNowPayload)) {
            return false;
        }
        WhereNowPayload whereNowPayload = (WhereNowPayload) obj;
        if (!whereNowPayload.canEqual(this)) {
            return false;
        }
        List<String> channels2 = getChannels();
        List<String> channels3 = whereNowPayload.getChannels();
        return channels2 != null ? channels2.equals(channels3) : channels3 == null;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public int hashCode() {
        List<String> channels2 = getChannels();
        return 59 + (channels2 == null ? 43 : channels2.hashCode());
    }

    public void setChannels(List<String> list) {
        this.channels = list;
    }

    public String toString() {
        StringBuilder P0 = a.P0("WhereNowPayload(channels=");
        P0.append(getChannels());
        P0.append(")");
        return P0.toString();
    }
}
