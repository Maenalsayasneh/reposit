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
import com.pubnub.api.models.consumer.objects_api.channel.PNGetChannelMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetChannelMetadata */
public final class GetChannelMetadataCommand extends GetChannelMetadata implements Include.HavingCustomInclude<GetChannelMetadata> {
    public GetChannelMetadataCommand(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityEnvelope<PNChannelMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().getChannelMetadata(getPubnub().getConfiguration().getSubscribeKey(), this.channel, map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetChannelMetadataOperation;
    }

    public PNGetChannelMetadataResult createResponse(v<EntityEnvelope<PNChannelMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetChannelMetadataResult((EntityEnvelope) t);
        }
        return new PNGetChannelMetadataResult();
    }
}
