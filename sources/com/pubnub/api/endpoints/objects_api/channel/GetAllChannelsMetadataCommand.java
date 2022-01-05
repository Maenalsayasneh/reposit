package com.pubnub.api.endpoints.objects_api.channel;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.channel.PNGetAllChannelsMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetAllChannelsMetadata */
public final class GetAllChannelsMetadataCommand extends GetAllChannelsMetadata implements Include.HavingCustomInclude<GetAllChannelsMetadata>, ListCapabilities.HavingListCapabilites<GetAllChannelsMetadata> {
    public GetAllChannelsMetadataCommand(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityArrayEnvelope<PNChannelMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().getChannelMetadata(getPubnub().getConfiguration().getSubscribeKey(), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetAllChannelsMetadataOperation;
    }

    public PNGetAllChannelsMetadataResult createResponse(v<EntityArrayEnvelope<PNChannelMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetAllChannelsMetadataResult((EntityArrayEnvelope) t);
        }
        return new PNGetAllChannelsMetadataResult();
    }
}
