package com.pubnub.api.endpoints.objects_api.channel;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.channel.PNSetChannelMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import com.pubnub.api.models.server.objects_api.SetChannelMetadataPayload;
import java.util.HashMap;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: SetChannelMetadata */
public final class SetChannelMetadataCommand extends SetChannelMetadata implements Include.HavingCustomInclude<SetChannelMetadata> {
    private Object custom;
    private String description;
    private String name;

    public SetChannelMetadataCommand(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public SetChannelMetadata custom(Map<String, Object> map) {
        this.custom = new HashMap(map);
        return this;
    }

    public SetChannelMetadata description(String str) {
        this.description = str;
        return this;
    }

    public d<EntityEnvelope<PNChannelMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().setChannelsMetadata(getPubnub().getConfiguration().getSubscribeKey(), this.channel, new SetChannelMetadataPayload(this.name, this.description, this.custom), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSetChannelMetadataOperation;
    }

    public SetChannelMetadata name(String str) {
        this.name = str;
        return this;
    }

    public PNSetChannelMetadataResult createResponse(v<EntityEnvelope<PNChannelMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNSetChannelMetadataResult((EntityEnvelope) t);
        }
        return new PNSetChannelMetadataResult();
    }
}
