package com.pubnub.api.endpoints.push;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNPushEnvironment;
import com.pubnub.api.enums.PNPushType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.push.PNPushListProvisionsResult;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class ListPushProvisions extends Endpoint<List<String>, PNPushListProvisionsResult> {
    private String deviceId;
    private PNPushEnvironment environment;
    private PNPushType pushType;
    private String topic;

    public ListPushProvisions(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public ListPushProvisions deviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public d<List<String>> doWork(Map<String, String> map) throws PubNubException {
        PNPushType pNPushType = this.pushType;
        if (pNPushType != PNPushType.APNS2) {
            map.put("type", pNPushType.toString());
            return getRetrofit().getPushService().listChannelsForDevice(getPubnub().getConfiguration().getSubscribeKey(), this.deviceId, map);
        }
        map.put("environment", this.environment.name().toLowerCase());
        map.put("topic", this.topic);
        return getRetrofit().getPushService().listChannelsForDeviceApns2(getPubnub().getConfiguration().getSubscribeKey(), this.deviceId, map);
    }

    public ListPushProvisions environment(PNPushEnvironment pNPushEnvironment) {
        this.environment = pNPushEnvironment;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNPushNotificationEnabledChannelsOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public ListPushProvisions pushType(PNPushType pNPushType) {
        this.pushType = pNPushType;
        return this;
    }

    public ListPushProvisions topic(String str) {
        this.topic = str;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (this.pushType != null) {
            String str = this.deviceId;
            if (str == null || str.isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_DEVICE_ID_MISSING).build();
            } else if (this.pushType == PNPushType.APNS2) {
                String str2 = this.topic;
                if (str2 == null || str2.isEmpty()) {
                    throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PUSH_TOPIC_MISSING).build();
                } else if (this.environment == null) {
                    this.environment = PNPushEnvironment.DEVELOPMENT;
                }
            }
        } else {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PUSH_TYPE_MISSING).build();
        }
    }

    public PNPushListProvisionsResult createResponse(v<List<String>> vVar) throws PubNubException {
        if (vVar.b != null) {
            return PNPushListProvisionsResult.builder().channels((List) vVar.b).build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
