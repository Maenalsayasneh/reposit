package com.pubnub.api.models.consumer;

import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import i0.d.a.a.a;
import java.util.List;

public class PNStatus {
    private List<String> affectedChannelGroups;
    private List<String> affectedChannels;
    private String authKey;
    private PNStatusCategory category;
    private Object clientRequest;
    private boolean error;
    private PNErrorData errorData;
    private RemoteAction<?> executedEndpoint;
    private PNOperationType operation;
    private String origin;
    private int statusCode;
    private boolean tlsEnabled;
    private String uuid;

    public static class PNStatusBuilder {
        private List<String> affectedChannelGroups;
        private List<String> affectedChannels;
        private String authKey;
        private PNStatusCategory category;
        private Object clientRequest;
        private boolean error;
        private PNErrorData errorData;
        private RemoteAction<?> executedEndpoint;
        private PNOperationType operation;
        private String origin;
        private int statusCode;
        private boolean tlsEnabled;
        private String uuid;

        public PNStatusBuilder affectedChannelGroups(List<String> list) {
            this.affectedChannelGroups = list;
            return this;
        }

        public PNStatusBuilder affectedChannels(List<String> list) {
            this.affectedChannels = list;
            return this;
        }

        public PNStatusBuilder authKey(String str) {
            this.authKey = str;
            return this;
        }

        public PNStatus build() {
            return new PNStatus(this.category, this.errorData, this.error, this.statusCode, this.operation, this.tlsEnabled, this.uuid, this.authKey, this.origin, this.clientRequest, this.affectedChannels, this.affectedChannelGroups, this.executedEndpoint);
        }

        public PNStatusBuilder category(PNStatusCategory pNStatusCategory) {
            this.category = pNStatusCategory;
            return this;
        }

        public PNStatusBuilder clientRequest(Object obj) {
            this.clientRequest = obj;
            return this;
        }

        public PNStatusBuilder error(boolean z) {
            this.error = z;
            return this;
        }

        public PNStatusBuilder errorData(PNErrorData pNErrorData) {
            this.errorData = pNErrorData;
            return this;
        }

        public PNStatusBuilder executedEndpoint(RemoteAction<?> remoteAction) {
            this.executedEndpoint = remoteAction;
            return this;
        }

        public PNStatusBuilder operation(PNOperationType pNOperationType) {
            this.operation = pNOperationType;
            return this;
        }

        public PNStatusBuilder origin(String str) {
            this.origin = str;
            return this;
        }

        public PNStatusBuilder statusCode(int i) {
            this.statusCode = i;
            return this;
        }

        public PNStatusBuilder tlsEnabled(boolean z) {
            this.tlsEnabled = z;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNStatus.PNStatusBuilder(category=");
            P0.append(this.category);
            P0.append(", errorData=");
            P0.append(this.errorData);
            P0.append(", error=");
            P0.append(this.error);
            P0.append(", statusCode=");
            P0.append(this.statusCode);
            P0.append(", operation=");
            P0.append(this.operation);
            P0.append(", tlsEnabled=");
            P0.append(this.tlsEnabled);
            P0.append(", uuid=");
            P0.append(this.uuid);
            P0.append(", authKey=");
            P0.append(this.authKey);
            P0.append(", origin=");
            P0.append(this.origin);
            P0.append(", clientRequest=");
            P0.append(this.clientRequest);
            P0.append(", affectedChannels=");
            P0.append(this.affectedChannels);
            P0.append(", affectedChannelGroups=");
            P0.append(this.affectedChannelGroups);
            P0.append(", executedEndpoint=");
            P0.append(this.executedEndpoint);
            P0.append(")");
            return P0.toString();
        }

        public PNStatusBuilder uuid(String str) {
            this.uuid = str;
            return this;
        }
    }

    public PNStatus(PNStatusCategory pNStatusCategory, PNErrorData pNErrorData, boolean z, int i, PNOperationType pNOperationType, boolean z2, String str, String str2, String str3, Object obj, List<String> list, List<String> list2, RemoteAction<?> remoteAction) {
        this.category = pNStatusCategory;
        this.errorData = pNErrorData;
        this.error = z;
        this.statusCode = i;
        this.operation = pNOperationType;
        this.tlsEnabled = z2;
        this.uuid = str;
        this.authKey = str2;
        this.origin = str3;
        this.clientRequest = obj;
        this.affectedChannels = list;
        this.affectedChannelGroups = list2;
        this.executedEndpoint = remoteAction;
    }

    public static PNStatusBuilder builder() {
        return new PNStatusBuilder();
    }

    public List<String> getAffectedChannelGroups() {
        return this.affectedChannelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.affectedChannels;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public PNStatusCategory getCategory() {
        return this.category;
    }

    public Object getClientRequest() {
        return this.clientRequest;
    }

    public PNErrorData getErrorData() {
        return this.errorData;
    }

    public PNOperationType getOperation() {
        return this.operation;
    }

    public String getOrigin() {
        return this.origin;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isError() {
        return this.error;
    }

    public boolean isTlsEnabled() {
        return this.tlsEnabled;
    }

    public void retry() {
        this.executedEndpoint.retry();
    }

    public PNStatusBuilder toBuilder() {
        return new PNStatusBuilder().category(this.category).errorData(this.errorData).error(this.error).statusCode(this.statusCode).operation(this.operation).tlsEnabled(this.tlsEnabled).uuid(this.uuid).authKey(this.authKey).origin(this.origin).clientRequest(this.clientRequest).affectedChannels(this.affectedChannels).affectedChannelGroups(this.affectedChannelGroups).executedEndpoint(this.executedEndpoint);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNStatus(category=");
        P0.append(getCategory());
        P0.append(", errorData=");
        P0.append(getErrorData());
        P0.append(", error=");
        P0.append(isError());
        P0.append(", statusCode=");
        P0.append(getStatusCode());
        P0.append(", operation=");
        P0.append(getOperation());
        P0.append(", tlsEnabled=");
        P0.append(isTlsEnabled());
        P0.append(", uuid=");
        P0.append(getUuid());
        P0.append(", authKey=");
        P0.append(getAuthKey());
        P0.append(", origin=");
        P0.append(getOrigin());
        P0.append(", clientRequest=");
        P0.append(getClientRequest());
        P0.append(", affectedChannels=");
        P0.append(getAffectedChannels());
        P0.append(", affectedChannelGroups=");
        P0.append(getAffectedChannelGroups());
        P0.append(")");
        return P0.toString();
    }
}
