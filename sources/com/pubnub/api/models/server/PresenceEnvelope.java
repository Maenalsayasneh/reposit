package com.pubnub.api.models.server;

import com.google.gson.JsonElement;

public class PresenceEnvelope {
    private String action;
    private JsonElement data;
    private Integer occupancy;
    private Long timestamp;
    private String uuid;

    public String getAction() {
        return this.action;
    }

    public JsonElement getData() {
        return this.data;
    }

    public Integer getOccupancy() {
        return this.occupancy;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUuid() {
        return this.uuid;
    }
}
