package com.pubnub.api.endpoints.objects_api;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t0.d;

public abstract class ObjectApiEndpoint<INPUT, OUTPUT> extends Endpoint<INPUT, OUTPUT> {
    private final CompositeParameterEnricher compositeParameterEnricher;

    public ObjectApiEndpoint(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher2, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.compositeParameterEnricher = compositeParameterEnricher2;
    }

    public d<INPUT> doWork(Map<String, String> map) throws PubNubException {
        return executeCommand(encodeParams(this.compositeParameterEnricher.enrichParameters(new HashMap(map))));
    }

    public abstract d<INPUT> executeCommand(Map<String, String> map) throws PubNubException;

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return this.compositeParameterEnricher;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        this.compositeParameterEnricher.validateParameters();
    }
}
