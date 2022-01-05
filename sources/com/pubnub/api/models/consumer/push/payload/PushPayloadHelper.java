package com.pubnub.api.models.consumer.push.payload;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.enums.PNPushEnvironment;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PushPayloadHelper {
    private APNSPayload apnsPayload;
    private Map<String, Object> commonPayload;
    private FCMPayload fcmPayload;
    private MPNSPayload mpnsPayload;

    public static class APNSPayload implements PushPayloadSerializer {
        private List<APNS2Configuration> apns2Configurations;
        private APS aps;
        private Map<String, Object> custom;

        public static class APNS2Configuration implements PushPayloadSerializer {
            private String collapseId;
            private String expiration;
            private List<Target> targets;
            private String version;

            public static class Target implements PushPayloadSerializer {
                private PNPushEnvironment environment;
                private List<String> excludeDevices;
                private String topic;

                public Target setEnvironment(PNPushEnvironment pNPushEnvironment) {
                    this.environment = pNPushEnvironment;
                    return this;
                }

                public Target setExcludeDevices(List<String> list) {
                    this.excludeDevices = list;
                    return this;
                }

                public Target setTopic(String str) {
                    this.topic = str;
                    return this;
                }

                public Map<String, Object> toMap() {
                    HashMap hashMap = new HashMap();
                    String str = this.topic;
                    if (str != null) {
                        hashMap.put("topic", str);
                    }
                    List<String> list = this.excludeDevices;
                    if (list != null && !list.isEmpty()) {
                        hashMap.put("excluded_devices", this.excludeDevices);
                    }
                    PNPushEnvironment pNPushEnvironment = this.environment;
                    if (pNPushEnvironment != null) {
                        hashMap.put("environment", pNPushEnvironment.name().toLowerCase());
                    }
                    return hashMap;
                }
            }

            public APNS2Configuration setCollapseId(String str) {
                this.collapseId = str;
                return this;
            }

            public APNS2Configuration setExpiration(String str) {
                this.expiration = str;
                return this;
            }

            public APNS2Configuration setTargets(List<Target> list) {
                this.targets = list;
                return this;
            }

            public APNS2Configuration setVersion(String str) {
                this.version = str;
                return this;
            }

            public Map<String, Object> toMap() {
                HashMap hashMap = new HashMap();
                String str = this.collapseId;
                if (str != null) {
                    hashMap.put("collapse_id", str);
                }
                String str2 = this.expiration;
                if (str2 != null) {
                    hashMap.put("expiration", str2);
                }
                List<Target> list = this.targets;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Target map : this.targets) {
                        Map<String, Object> map2 = map.toMap();
                        if (map2 != null && !map2.isEmpty()) {
                            arrayList.add(map2);
                        }
                    }
                    hashMap.put("targets", arrayList);
                }
                String str3 = this.version;
                if (str3 != null) {
                    hashMap.put("version", str3);
                }
                return hashMap;
            }
        }

        public static class APS implements PushPayloadSerializer {
            private Object alert;
            private Integer badge;
            private String sound;

            public APS setAlert(Object obj) {
                this.alert = obj;
                return this;
            }

            public APS setBadge(Integer num) {
                this.badge = num;
                return this;
            }

            public APS setSound(String str) {
                this.sound = str;
                return this;
            }

            public Map<String, Object> toMap() {
                HashMap hashMap = new HashMap();
                Object obj = this.alert;
                if (obj != null) {
                    hashMap.put("alert", obj);
                }
                Integer num = this.badge;
                if (num != null) {
                    hashMap.put("badge", num);
                }
                String str = this.sound;
                if (str != null) {
                    hashMap.put("sound", str);
                }
                return hashMap;
            }
        }

        public APNSPayload setApns2Configurations(List<APNS2Configuration> list) {
            this.apns2Configurations = list;
            return this;
        }

        public APNSPayload setAps(APS aps2) {
            this.aps = aps2;
            return this;
        }

        public APNSPayload setCustom(Map<String, Object> map) {
            this.custom = map;
            return this;
        }

        public Map<String, Object> toMap() {
            Map<String, Object> map;
            HashMap hashMap = new HashMap();
            APS aps2 = this.aps;
            if (!(aps2 == null || (map = aps2.toMap()) == null || map.isEmpty())) {
                hashMap.put("aps", map);
            }
            if (this.apns2Configurations != null) {
                ArrayList arrayList = new ArrayList();
                for (APNS2Configuration map2 : this.apns2Configurations) {
                    Map<String, Object> map3 = map2.toMap();
                    if (map3 != null && !map3.isEmpty()) {
                        arrayList.add(map3);
                    }
                }
                hashMap.put("pn_push", arrayList);
            }
            hashMap.putAll(PushPayloadHelper.filterNonNullEntries(this.custom));
            return hashMap;
        }
    }

    public static class FCMPayload implements PushPayloadSerializer {
        private Map<String, Object> custom;
        private Map<String, Object> data;
        private Notification notification;

        public static class Notification implements PushPayloadSerializer {
            private Map<String, Object> parametersMap = new HashMap();

            public Notification set(String str, Object obj) {
                this.parametersMap.put(str, obj);
                return this;
            }

            public Notification setBody(String str) {
                set("body", str);
                return this;
            }

            public Notification setClickAction(String str) {
                set("click_action", str);
                return this;
            }

            public Notification setImage(String str) {
                set("image", str);
                return this;
            }

            public Notification setParametersMap(Map<String, Object> map) {
                this.parametersMap = map;
                return this;
            }

            public Notification setTitle(String str) {
                set(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, str);
                return this;
            }

            public Map<String, Object> toMap() {
                return PushPayloadHelper.filterNonNullEntries(this.parametersMap);
            }
        }

        public FCMPayload setCustom(Map<String, Object> map) {
            this.custom = map;
            return this;
        }

        public FCMPayload setData(Map<String, Object> map) {
            this.data = map;
            return this;
        }

        public FCMPayload setNotification(Notification notification2) {
            this.notification = notification2;
            return this;
        }

        public Map<String, Object> toMap() {
            Map<String, Object> map;
            HashMap hashMap = new HashMap();
            Notification notification2 = this.notification;
            if (!(notification2 == null || (map = notification2.toMap()) == null || map.isEmpty())) {
                hashMap.put("notification", this.notification.toMap());
            }
            Map<String, Object> map2 = this.data;
            if (map2 != null && !map2.isEmpty()) {
                hashMap.put(MessageExtension.FIELD_DATA, this.data);
            }
            hashMap.putAll(PushPayloadHelper.filterNonNullEntries(this.custom));
            return hashMap;
        }
    }

    public static class MPNSPayload implements PushPayloadSerializer {
        private String backContent;
        private String backTitle;
        private Integer count;
        private Map<String, Object> custom;
        private String title;
        private String type;

        public MPNSPayload setBackContent(String str) {
            this.backContent = str;
            return this;
        }

        public MPNSPayload setBackTitle(String str) {
            this.backTitle = str;
            return this;
        }

        public MPNSPayload setCount(Integer num) {
            this.count = num;
            return this;
        }

        public MPNSPayload setCustom(Map<String, Object> map) {
            this.custom = map;
            return this;
        }

        public MPNSPayload setTitle(String str) {
            this.title = str;
            return this;
        }

        public MPNSPayload setType(String str) {
            this.type = str;
            return this;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            Integer num = this.count;
            if (num != null) {
                hashMap.put("count", num);
            }
            String str = this.backTitle;
            if (str != null) {
                hashMap.put("back_title", str);
            }
            String str2 = this.title;
            if (str2 != null) {
                hashMap.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, str2);
            }
            String str3 = this.backContent;
            if (str3 != null) {
                hashMap.put("back_content", str3);
            }
            String str4 = this.type;
            if (str4 != null) {
                hashMap.put("type", str4);
            }
            hashMap.putAll(PushPayloadHelper.filterNonNullEntries(this.custom));
            return hashMap;
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> filterNonNullEntries(Map<String, Object> map) {
        if (map == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        return hashMap;
    }

    public Map<String, Object> build() {
        HashMap hashMap = new HashMap();
        APNSPayload aPNSPayload = this.apnsPayload;
        if (aPNSPayload != null) {
            Map<String, Object> map = aPNSPayload.toMap();
            if (!map.isEmpty()) {
                hashMap.put("pn_apns", map);
            }
        }
        FCMPayload fCMPayload = this.fcmPayload;
        if (fCMPayload != null) {
            Map<String, Object> map2 = fCMPayload.toMap();
            if (!map2.isEmpty()) {
                hashMap.put("pn_gcm", map2);
            }
        }
        MPNSPayload mPNSPayload = this.mpnsPayload;
        if (mPNSPayload != null) {
            Map<String, Object> map3 = mPNSPayload.toMap();
            if (!map3.isEmpty()) {
                hashMap.put("pn_mpns", map3);
            }
        }
        hashMap.putAll(filterNonNullEntries(this.commonPayload));
        return hashMap;
    }

    public PushPayloadHelper setApnsPayload(APNSPayload aPNSPayload) {
        this.apnsPayload = aPNSPayload;
        return this;
    }

    public PushPayloadHelper setCommonPayload(Map<String, Object> map) {
        this.commonPayload = map;
        return this;
    }

    public PushPayloadHelper setFcmPayload(FCMPayload fCMPayload) {
        this.fcmPayload = fCMPayload;
        return this;
    }

    public PushPayloadHelper setMpnsPayload(MPNSPayload mPNSPayload) {
        this.mpnsPayload = mPNSPayload;
        return this;
    }
}
