package com.pubnub.api.endpoints.objects_api.channel;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.channel.PNGetAllChannelsMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public abstract class GetAllChannelsMetadata extends ObjectApiEndpoint<EntityArrayEnvelope<PNChannelMetadata>, PNGetAllChannelsMetadataResult> implements Include.CustomIncludeAware<GetAllChannelsMetadata>, ListCapabilities.ListCapabilitiesAware<GetAllChannelsMetadata> {
    public GetAllChannelsMetadata(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static GetAllChannelsMetadata create(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new GetAllChannelsMetadataCommand(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }
}
