package com.pubnub.api.models.consumer.push.payload;

import java.util.Map;

public interface PushPayloadSerializer {
    Map<String, Object> toMap();
}
