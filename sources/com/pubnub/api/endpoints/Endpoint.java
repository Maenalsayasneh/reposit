package com.pubnub.api.endpoints;

import com.google.gson.JsonElement;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubError;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import q0.e0;
import t0.d;
import t0.f;
import t0.v;

public abstract class Endpoint<Input, Output> implements RemoteAction<Output> {
    private static final Logger log = Logger.getLogger(Endpoint.class.getName());
    private PNCallback<Output> cachedCallback;
    private d<Input> call;
    /* access modifiers changed from: private */
    public MapperManager mapper;
    private PubNub pubnub;
    private Map<String, String> queryParam;
    private RetrofitManager retrofit;
    /* access modifiers changed from: private */
    public boolean silenceFailures;
    private TelemetryManager telemetryManager;
    private final TokenManager tokenManager;

    public Endpoint(PubNub pubNub, TelemetryManager telemetryManager2, RetrofitManager retrofitManager, TokenManager tokenManager2) {
        this.pubnub = pubNub;
        this.retrofit = retrofitManager;
        this.tokenManager = tokenManager2;
        this.mapper = pubNub.getMapper();
        this.telemetryManager = telemetryManager2;
    }

    /* access modifiers changed from: private */
    public PubNubException createPubNubException(v<Input> vVar, String str, JsonElement jsonElement) {
        int i = vVar.a.y;
        if (i != 413 && i != 414) {
            return PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR).errormsg(str).jso(jsonElement).statusCode(vVar.a.y).affectedCall(this.call).build();
        }
        PubNubException.PubNubExceptionBuilder builder = PubNubException.builder();
        PubNubError pubNubError = PubNubErrorBuilder.PNERROBJ_PAYLOAD_TOO_LARGE;
        return builder.pubnubError(pubNubError).affectedCall(this.call).statusCode(vVar.a.y).jso(jsonElement).errormsg(pubNubError.getMessage()).build();
    }

    /* access modifiers changed from: private */
    public PNStatus createStatusResponse(PNStatusCategory pNStatusCategory, v<Input> vVar, Exception exc, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        PNStatus.PNStatusBuilder builder = PNStatus.builder();
        builder.executedEndpoint(this);
        if (vVar == null || exc != null) {
            builder.error(true);
        }
        if (exc != null) {
            builder.errorData(new PNErrorData(exc.getMessage(), exc));
        }
        if (vVar != null) {
            builder.statusCode(vVar.a.y);
            builder.tlsEnabled(vVar.a.d.b.c);
            builder.origin(vVar.a.d.b.g);
            builder.uuid(vVar.a.d.b.h("uuid"));
            builder.authKey(vVar.a.d.b.h(PubNubUtil.AUTH_QUERY_PARAM_NAME));
            builder.clientRequest(vVar.a.d);
        }
        builder.operation(getOperationType());
        builder.category(pNStatusCategory);
        if (arrayList == null || arrayList.isEmpty()) {
            builder.affectedChannels(getAffectedChannels());
        } else {
            builder.affectedChannels(arrayList);
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            builder.affectedChannelGroups(getAffectedChannelGroups());
        } else {
            builder.affectedChannelGroups(arrayList2);
        }
        return builder.build();
    }

    /* access modifiers changed from: private */
    public void storeRequestLatency(v vVar, PNOperationType pNOperationType) {
        TelemetryManager telemetryManager2 = this.telemetryManager;
        if (telemetryManager2 != null) {
            e0 e0Var = vVar.a;
            telemetryManager2.storeLatency(e0Var.f2 - e0Var.e2, pNOperationType);
        }
    }

    public void async(final PNCallback<Output> pNCallback) {
        this.cachedCallback = pNCallback;
        try {
            validateParams();
            d<Input> doWork = doWork(createBaseParams());
            this.call = doWork;
            doWork.J(new f<Input>() {
                public void onFailure(d<Input> dVar, Throwable th) {
                    PubNubException.PubNubExceptionBuilder cause;
                    PNStatusCategory pNStatusCategory;
                    if (!Endpoint.this.silenceFailures) {
                        cause = PubNubException.builder().errormsg(th.getMessage()).cause(th);
                        try {
                            throw th;
                        } catch (UnknownHostException unused) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_CONNECTION_NOT_SET);
                            pNStatusCategory = PNStatusCategory.PNUnexpectedDisconnectCategory;
                        } catch (SocketException | SSLException unused2) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_CONNECT_EXCEPTION);
                            pNStatusCategory = PNStatusCategory.PNUnexpectedDisconnectCategory;
                        } catch (SocketTimeoutException unused3) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_SOCKET_TIMEOUT);
                            pNStatusCategory = PNStatusCategory.PNTimeoutCategory;
                        } catch (Throwable unused4) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR);
                            if (dVar.isCanceled()) {
                                pNStatusCategory = PNStatusCategory.PNCancelledCategory;
                            } else {
                                pNStatusCategory = PNStatusCategory.PNBadRequestCategory;
                            }
                        }
                    } else {
                        return;
                    }
                    pNCallback.onResponse(null, Endpoint.this.createStatusResponse(pNStatusCategory, (v) null, cause.build(), (ArrayList<String>) null, (ArrayList<String>) null));
                }

                public void onResponse(d<Input> dVar, v<Input> vVar) {
                    String str;
                    JsonElement jsonElement;
                    String str2;
                    if (Endpoint.this.isError(vVar)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            str = vVar.c.string();
                        } catch (IOException unused) {
                            str = "N/A";
                        }
                        try {
                            jsonElement = (JsonElement) Endpoint.this.mapper.fromJson(str, JsonElement.class);
                        } catch (PubNubException unused2) {
                            jsonElement = null;
                        }
                        JsonElement field = (jsonElement == null || !Endpoint.this.mapper.isJsonObject(jsonElement) || !Endpoint.this.mapper.hasField(jsonElement, "payload")) ? null : Endpoint.this.mapper.getField(jsonElement, "payload");
                        PNStatusCategory pNStatusCategory = PNStatusCategory.PNUnknownCategory;
                        PubNubException access$100 = Endpoint.this.createPubNubException(vVar, str, jsonElement);
                        if (vVar.a.y == 403) {
                            pNStatusCategory = PNStatusCategory.PNAccessDeniedCategory;
                            if (field != null && Endpoint.this.mapper.hasField(field, "channels")) {
                                Iterator<JsonElement> arrayIterator = Endpoint.this.mapper.getArrayIterator(field, "channels");
                                while (arrayIterator.hasNext()) {
                                    arrayList.add(Endpoint.this.mapper.elementToString(arrayIterator.next()));
                                }
                            }
                            if (field != null && Endpoint.this.mapper.hasField(field, "channel-groups")) {
                                Iterator<JsonElement> arrayIterator2 = Endpoint.this.mapper.getArrayIterator(field, "channel-groups");
                                while (arrayIterator2.hasNext()) {
                                    JsonElement next = arrayIterator2.next();
                                    if (Endpoint.this.mapper.elementToString(next).substring(0, 1).equals(":")) {
                                        str2 = Endpoint.this.mapper.elementToString(next).substring(1);
                                    } else {
                                        str2 = Endpoint.this.mapper.elementToString(next);
                                    }
                                    arrayList2.add(str2);
                                }
                            }
                        }
                        pNCallback.onResponse(null, Endpoint.this.createStatusResponse(vVar.a.y == 400 ? PNStatusCategory.PNBadRequestCategory : pNStatusCategory, vVar, access$100, arrayList, arrayList2));
                        return;
                    }
                    Endpoint endpoint = Endpoint.this;
                    endpoint.storeRequestLatency(vVar, endpoint.getOperationType());
                    try {
                        pNCallback.onResponse(Endpoint.this.createResponse(vVar), Endpoint.this.createStatusResponse(PNStatusCategory.PNAcknowledgmentCategory, vVar, (Exception) null, (ArrayList<String>) null, (ArrayList<String>) null));
                    } catch (PubNubException e) {
                        pNCallback.onResponse(null, Endpoint.this.createStatusResponse(PNStatusCategory.PNMalformedResponseCategory, vVar, e, (ArrayList<String>) null, (ArrayList<String>) null));
                    }
                }
            });
        } catch (PubNubException e) {
            pNCallback.onResponse(null, createStatusResponse(PNStatusCategory.PNBadRequestCategory, (v) null, e, (ArrayList<String>) null, (ArrayList<String>) null));
        }
    }

    public Map<String, String> createBaseParams() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.queryParam;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("pnsdk", "PubNub-Java-Unified/".concat(this.pubnub.getVersion()));
        hashMap.put("uuid", this.pubnub.getConfiguration().getUuid());
        if (this.pubnub.getConfiguration().isIncludeInstanceIdentifier()) {
            hashMap.put("instanceid", this.pubnub.getInstanceId());
        }
        if (this.pubnub.getConfiguration().isIncludeRequestIdentifier()) {
            hashMap.put("requestid", this.pubnub.getRequestId());
        }
        if (isAuthRequired()) {
            String token = this.tokenManager.getToken();
            if (token != null) {
                hashMap.put(PubNubUtil.AUTH_QUERY_PARAM_NAME, token);
            } else if (this.pubnub.getConfiguration().getAuthKey() != null) {
                hashMap.put(PubNubUtil.AUTH_QUERY_PARAM_NAME, this.pubnub.getConfiguration().getAuthKey());
            }
        }
        TelemetryManager telemetryManager2 = this.telemetryManager;
        if (telemetryManager2 != null) {
            hashMap.putAll(telemetryManager2.operationsLatency());
        }
        return hashMap;
    }

    public abstract Output createResponse(v<Input> vVar) throws PubNubException;

    public abstract d<Input> doWork(Map<String, String> map) throws PubNubException;

    public Map<String, String> encodeParams(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        if (hashMap.containsKey(PubNubUtil.AUTH_QUERY_PARAM_NAME)) {
            hashMap.put(PubNubUtil.AUTH_QUERY_PARAM_NAME, PubNubUtil.urlEncode((String) hashMap.get(PubNubUtil.AUTH_QUERY_PARAM_NAME)));
        }
        return hashMap;
    }

    public abstract List<String> getAffectedChannelGroups();

    public abstract List<String> getAffectedChannels();

    public abstract PNOperationType getOperationType();

    public PubNub getPubnub() {
        return this.pubnub;
    }

    public RetrofitManager getRetrofit() {
        return this.retrofit;
    }

    public abstract boolean isAuthRequired();

    public boolean isError(v<Input> vVar) {
        return vVar.a.y != 200;
    }

    public Endpoint<Input, Output> queryParam(Map<String, String> map) {
        this.queryParam = map;
        return this;
    }

    public void retry() {
        this.silenceFailures = false;
        async(this.cachedCallback);
    }

    public void silentCancel() {
        d<Input> dVar = this.call;
        if (dVar != null && !dVar.isCanceled()) {
            this.silenceFailures = true;
            this.call.cancel();
        }
    }

    public Output sync() throws PubNubException {
        String str;
        JsonElement jsonElement;
        validateParams();
        d<Input> doWork = doWork(createBaseParams());
        this.call = doWork;
        try {
            v<Input> execute = doWork.execute();
            if (!isError(execute)) {
                storeRequestLatency(execute, getOperationType());
                return createResponse(execute);
            }
            try {
                str = execute.c.string();
            } catch (IOException unused) {
                str = "N/A";
            }
            try {
                jsonElement = (JsonElement) this.mapper.fromJson(str, JsonElement.class);
            } catch (PubNubException unused2) {
                jsonElement = null;
            }
            throw createPubNubException(execute, str, jsonElement);
        } catch (IOException e) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).errormsg(e.toString()).affectedCall(this.call).cause(e).build();
        }
    }

    public abstract void validateParams() throws PubNubException;
}
