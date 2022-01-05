package com.pubnub.api.endpoints.push;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNPushEnvironment;
import com.pubnub.api.enums.PNPushType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.push.PNPushAddChannelResult;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class AddChannelsToPush extends Endpoint<List<Object>, PNPushAddChannelResult> {
    private List<String> channels;
    private String deviceId;
    private PNPushEnvironment environment;
    private PNPushType pushType;
    private String topic;

    public AddChannelsToPush(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public AddChannelsToPush channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public AddChannelsToPush deviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public d<List<Object>> doWork(Map<String, String> map) throws PubNubException {
        map.put("add", PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP));
        PNPushType pNPushType = this.pushType;
        if (pNPushType != PNPushType.APNS2) {
            map.put("type", pNPushType.toString());
            return getRetrofit().getPushService().modifyChannelsForDevice(getPubnub().getConfiguration().getSubscribeKey(), this.deviceId, map);
        }
        map.put("environment", this.environment.name().toLowerCase());
        map.put("topic", this.topic);
        return getRetrofit().getPushService().modifyChannelsForDeviceApns2(getPubnub().getConfiguration().getSubscribeKey(), this.deviceId, map);
    }

    public AddChannelsToPush environment(PNPushEnvironment pNPushEnvironment) {
        this.environment = pNPushEnvironment;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNPushNotificationEnabledChannelsOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public AddChannelsToPush pushType(PNPushType pNPushType) {
        this.pushType = pNPushType;
        return this;
    }

    public AddChannelsToPush topic(String str) {
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
            }
            List<String> list = this.channels;
            if (list == null || list.isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
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

    public PNPushAddChannelResult createResponse(v<List<Object>> vVar) throws PubNubException {
        if (vVar.b != null) {
            return PNPushAddChannelResult.builder().build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
