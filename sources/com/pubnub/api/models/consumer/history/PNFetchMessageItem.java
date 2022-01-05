package com.pubnub.api.models.consumer.history;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;
import java.util.HashMap;
import java.util.List;

public class PNFetchMessageItem {
    private final HashMap<String, HashMap<String, List<Action>>> actions;
    private final JsonElement message;
    @SerializedName("message_type")
    private final String messageType;
    private final JsonElement meta;
    private final Long timetoken;
    private final String uuid;

    public static class Action {
        private final String actionTimetoken;
        private final String uuid;

        public Action(String str, String str2) {
            this.uuid = str;
            this.actionTimetoken = str2;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof Action;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            if (!action.canEqual(this)) {
                return false;
            }
            String uuid2 = getUuid();
            String uuid3 = action.getUuid();
            if (uuid2 != null ? !uuid2.equals(uuid3) : uuid3 != null) {
                return false;
            }
            String actionTimetoken2 = getActionTimetoken();
            String actionTimetoken3 = action.getActionTimetoken();
            return actionTimetoken2 != null ? actionTimetoken2.equals(actionTimetoken3) : actionTimetoken3 == null;
        }

        public String getActionTimetoken() {
            return this.actionTimetoken;
        }

        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            String uuid2 = getUuid();
            int i = 43;
            int hashCode = uuid2 == null ? 43 : uuid2.hashCode();
            String actionTimetoken2 = getActionTimetoken();
            int i2 = (hashCode + 59) * 59;
            if (actionTimetoken2 != null) {
                i = actionTimetoken2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNFetchMessageItem.Action(uuid=");
            P0.append(getUuid());
            P0.append(", actionTimetoken=");
            P0.append(getActionTimetoken());
            P0.append(")");
            return P0.toString();
        }
    }

    public static class PNFetchMessageItemBuilder {
        private HashMap<String, HashMap<String, List<Action>>> actions;
        private JsonElement message;
        private String messageType;
        private JsonElement meta;
        private Long timetoken;
        private String uuid;

        public PNFetchMessageItemBuilder actions(HashMap<String, HashMap<String, List<Action>>> hashMap) {
            this.actions = hashMap;
            return this;
        }

        public PNFetchMessageItem build() {
            return new PNFetchMessageItem(this.message, this.meta, this.timetoken, this.actions, this.uuid, this.messageType);
        }

        public PNFetchMessageItemBuilder message(JsonElement jsonElement) {
            this.message = jsonElement;
            return this;
        }

        public PNFetchMessageItemBuilder messageType(String str) {
            this.messageType = str;
            return this;
        }

        public PNFetchMessageItemBuilder meta(JsonElement jsonElement) {
            this.meta = jsonElement;
            return this;
        }

        public PNFetchMessageItemBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNFetchMessageItem.PNFetchMessageItemBuilder(message=");
            P0.append(this.message);
            P0.append(", meta=");
            P0.append(this.meta);
            P0.append(", timetoken=");
            P0.append(this.timetoken);
            P0.append(", actions=");
            P0.append(this.actions);
            P0.append(", uuid=");
            P0.append(this.uuid);
            P0.append(", messageType=");
            return a.y0(P0, this.messageType, ")");
        }

        public PNFetchMessageItemBuilder uuid(String str) {
            this.uuid = str;
            return this;
        }
    }

    public PNFetchMessageItem(JsonElement jsonElement, JsonElement jsonElement2, Long l, HashMap<String, HashMap<String, List<Action>>> hashMap, String str, String str2) {
        this.message = jsonElement;
        this.meta = jsonElement2;
        this.timetoken = l;
        this.actions = hashMap;
        this.uuid = str;
        this.messageType = str2;
    }

    public static PNFetchMessageItemBuilder builder() {
        return new PNFetchMessageItemBuilder();
    }

    private int getMessageType() {
        String str = this.messageType;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(this.messageType);
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNFetchMessageItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNFetchMessageItem)) {
            return false;
        }
        PNFetchMessageItem pNFetchMessageItem = (PNFetchMessageItem) obj;
        if (!pNFetchMessageItem.canEqual(this)) {
            return false;
        }
        JsonElement message2 = getMessage();
        JsonElement message3 = pNFetchMessageItem.getMessage();
        if (message2 != null ? !message2.equals(message3) : message3 != null) {
            return false;
        }
        JsonElement meta2 = getMeta();
        JsonElement meta3 = pNFetchMessageItem.getMeta();
        if (meta2 != null ? !meta2.equals(meta3) : meta3 != null) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = pNFetchMessageItem.getTimetoken();
        if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
            return false;
        }
        HashMap<String, HashMap<String, List<Action>>> actions2 = getActions();
        HashMap<String, HashMap<String, List<Action>>> actions3 = pNFetchMessageItem.getActions();
        if (actions2 != null ? !actions2.equals(actions3) : actions3 != null) {
            return false;
        }
        String uuid2 = getUuid();
        String uuid3 = pNFetchMessageItem.getUuid();
        if (uuid2 != null ? uuid2.equals(uuid3) : uuid3 == null) {
            return getMessageType() == pNFetchMessageItem.getMessageType();
        }
        return false;
    }

    public HashMap<String, HashMap<String, List<Action>>> getActions() {
        return this.actions;
    }

    public JsonElement getMessage() {
        return this.message;
    }

    public JsonElement getMeta() {
        return this.meta;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        JsonElement message2 = getMessage();
        int i = 43;
        int hashCode = message2 == null ? 43 : message2.hashCode();
        JsonElement meta2 = getMeta();
        int hashCode2 = ((hashCode + 59) * 59) + (meta2 == null ? 43 : meta2.hashCode());
        Long timetoken2 = getTimetoken();
        int hashCode3 = (hashCode2 * 59) + (timetoken2 == null ? 43 : timetoken2.hashCode());
        HashMap<String, HashMap<String, List<Action>>> actions2 = getActions();
        int hashCode4 = (hashCode3 * 59) + (actions2 == null ? 43 : actions2.hashCode());
        String uuid2 = getUuid();
        int i2 = hashCode4 * 59;
        if (uuid2 != null) {
            i = uuid2.hashCode();
        }
        return ((i2 + i) * 59) + getMessageType();
    }

    public PNFetchMessageItemBuilder toBuilder() {
        return new PNFetchMessageItemBuilder().message(this.message).meta(this.meta).timetoken(this.timetoken).actions(this.actions).uuid(this.uuid).messageType(this.messageType);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNFetchMessageItem(message=");
        P0.append(getMessage());
        P0.append(", meta=");
        P0.append(getMeta());
        P0.append(", timetoken=");
        P0.append(getTimetoken());
        P0.append(", actions=");
        P0.append(getActions());
        P0.append(", uuid=");
        P0.append(getUuid());
        P0.append(", messageType=");
        return a.u0(P0, getMessageType(), ")");
    }
}
