package com.pubnub.api.endpoints.objects_api;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.objects_api.UUIDEndpoint;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;

public abstract class UUIDEndpoint<SELF extends UUIDEndpoint, INPUT, OUTPUT> extends ObjectApiEndpoint<INPUT, OUTPUT> {
    private String uuid;

    public UUIDEndpoint(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public String effectiveUuid() {
        String str = this.uuid;
        return str != null ? str : getPubnub().getConfiguration().getUuid();
    }

    public SELF uuid(String str) {
        this.uuid = str;
        return this;
    }

    public void validateParams() throws PubNubException {
        super.validateParams();
        String effectiveUuid = effectiveUuid();
        if (effectiveUuid == null || effectiveUuid.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_UUID_MISSING).build();
        }
    }
}
