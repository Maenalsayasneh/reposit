package com.pubnub.api.endpoints;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.history.PNHistoryItemResult;
import com.pubnub.api.models.consumer.history.PNHistoryResult;
import com.pubnub.api.vendor.Crypto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class History extends Endpoint<JsonElement, PNHistoryResult> {
    private static final int MAX_COUNT = 100;
    private String channel;
    private Integer count;
    private Long end;
    private Boolean includeMeta;
    private Boolean includeTimetoken;
    private Boolean reverse;
    private Long start;

    public History(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    private JsonElement processMessage(JsonElement jsonElement) throws PubNubException {
        String str;
        if (getPubnub().getConfiguration().getCipherKey() == null) {
            return jsonElement;
        }
        Crypto crypto = new Crypto(getPubnub().getConfiguration().getCipherKey(), getPubnub().getConfiguration().isUseRandomInitializationVector());
        MapperManager mapper = getPubnub().getMapper();
        if (!mapper.isJsonObject(jsonElement) || !mapper.hasField(jsonElement, "pn_other")) {
            str = mapper.elementToString(jsonElement);
        } else {
            str = mapper.elementToString(jsonElement, "pn_other");
        }
        JsonElement jsonElement2 = (JsonElement) getPubnub().getMapper().fromJson(crypto.decrypt(str), JsonElement.class);
        if (!mapper.isJsonObject(jsonElement) || !mapper.hasField(jsonElement, "pn_other")) {
            return jsonElement2;
        }
        JsonObject asObject = mapper.getAsObject(jsonElement);
        mapper.putOnObject(asObject, "pn_other", jsonElement2);
        return asObject;
    }

    public History channel(String str) {
        this.channel = str;
        return this;
    }

    public History count(Integer num) {
        this.count = num;
        return this;
    }

    public d<JsonElement> doWork(Map<String, String> map) {
        Boolean bool = this.reverse;
        if (bool != null) {
            map.put("reverse", String.valueOf(bool));
        }
        Boolean bool2 = this.includeTimetoken;
        if (bool2 != null) {
            map.put("include_token", String.valueOf(bool2));
        }
        if (this.includeMeta.booleanValue()) {
            map.put("include_meta", String.valueOf(this.includeMeta));
        }
        Integer num = this.count;
        if (num == null || num.intValue() <= 0 || this.count.intValue() > 100) {
            map.put("count", "100");
        } else {
            map.put("count", String.valueOf(this.count));
        }
        Long l = this.start;
        if (l != null) {
            map.put(Pager.START_PARAM_NAME, Long.toString(l.longValue()).toLowerCase());
        }
        Long l2 = this.end;
        if (l2 != null) {
            map.put(Pager.END_PARAM_NAME, Long.toString(l2.longValue()).toLowerCase());
        }
        return getRetrofit().getHistoryService().fetchHistory(getPubnub().getConfiguration().getSubscribeKey(), this.channel, map);
    }

    public History end(Long l) {
        this.end = l;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNHistoryOperation;
    }

    public History includeMeta(Boolean bool) {
        this.includeMeta = bool;
        return this;
    }

    public History includeTimetoken(Boolean bool) {
        this.includeTimetoken = bool;
        return this;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public History reverse(Boolean bool) {
        this.reverse = bool;
        return this;
    }

    public History start(Long l) {
        this.start = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
        if (this.includeMeta == null) {
            this.includeMeta = Boolean.FALSE;
        }
        if (this.includeTimetoken == null) {
            this.includeTimetoken = Boolean.FALSE;
        }
    }

    public PNHistoryResult createResponse(v<JsonElement> vVar) throws PubNubException {
        JsonElement jsonElement;
        PNHistoryResult.PNHistoryResultBuilder builder = PNHistoryResult.builder();
        ArrayList arrayList = new ArrayList();
        MapperManager mapper = getPubnub().getMapper();
        T t = vVar.b;
        if (t != null) {
            Long elementToLong = mapper.elementToLong(mapper.getArrayElement((JsonElement) t, 1));
            Long elementToLong2 = mapper.elementToLong(mapper.getArrayElement((JsonElement) vVar.b, 2));
            builder.startTimetoken(elementToLong);
            builder.endTimetoken(elementToLong2);
            if (mapper.getArrayElement((JsonElement) vVar.b, 0).isJsonArray()) {
                Iterator<JsonElement> arrayIterator = mapper.getArrayIterator(mapper.getArrayElement((JsonElement) vVar.b, 0));
                while (arrayIterator.hasNext()) {
                    JsonElement next = arrayIterator.next();
                    PNHistoryItemResult.PNHistoryItemResultBuilder builder2 = PNHistoryItemResult.builder();
                    if (this.includeTimetoken.booleanValue() || this.includeMeta.booleanValue()) {
                        JsonElement processMessage = processMessage(mapper.getField(next, InstabugDbContract.BugEntry.COLUMN_MESSAGE));
                        if (this.includeTimetoken.booleanValue()) {
                            builder2.timetoken(mapper.elementToLong(next, "timetoken"));
                        }
                        if (this.includeMeta.booleanValue()) {
                            builder2.meta(mapper.getField(next, "meta"));
                        }
                        jsonElement = processMessage;
                    } else {
                        jsonElement = processMessage(next);
                    }
                    builder2.entry(jsonElement);
                    arrayList.add(builder2.build());
                }
                builder.messages(arrayList);
            } else {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR).errormsg("History is disabled").jso((JsonElement) vVar.b).build();
            }
        }
        return builder.build();
    }
}
