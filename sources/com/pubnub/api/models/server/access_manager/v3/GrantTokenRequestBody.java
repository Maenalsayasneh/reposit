package com.pubnub.api.models.server.access_manager.v3;

import com.pubnub.api.PubNubException;
import com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant;
import com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant;
import com.pubnub.api.models.consumer.access_manager.v3.PNResource;
import com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant;
import i0.d.a.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrantTokenRequestBody {
    private final GrantTokenPermissions permissions;
    private final Integer ttl;

    public static class GrantTokenPermission {
        private final Map<String, Integer> channels;
        private final Map<String, Integer> groups;
        private final Map<String, Integer> spaces = Collections.emptyMap();
        private final Map<String, Integer> users = Collections.emptyMap();
        private final Map<String, Integer> uuids;

        public GrantTokenPermission(Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
            this.channels = map;
            this.groups = map2;
            this.uuids = map3;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof GrantTokenPermission;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GrantTokenPermission)) {
                return false;
            }
            GrantTokenPermission grantTokenPermission = (GrantTokenPermission) obj;
            if (!grantTokenPermission.canEqual(this)) {
                return false;
            }
            Map<String, Integer> channels2 = getChannels();
            Map<String, Integer> channels3 = grantTokenPermission.getChannels();
            if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
                return false;
            }
            Map<String, Integer> groups2 = getGroups();
            Map<String, Integer> groups3 = grantTokenPermission.getGroups();
            if (groups2 != null ? !groups2.equals(groups3) : groups3 != null) {
                return false;
            }
            Map<String, Integer> uuids2 = getUuids();
            Map<String, Integer> uuids3 = grantTokenPermission.getUuids();
            if (uuids2 != null ? !uuids2.equals(uuids3) : uuids3 != null) {
                return false;
            }
            Map<String, Integer> spaces2 = getSpaces();
            Map<String, Integer> spaces3 = grantTokenPermission.getSpaces();
            if (spaces2 != null ? !spaces2.equals(spaces3) : spaces3 != null) {
                return false;
            }
            Map<String, Integer> users2 = getUsers();
            Map<String, Integer> users3 = grantTokenPermission.getUsers();
            return users2 != null ? users2.equals(users3) : users3 == null;
        }

        public Map<String, Integer> getChannels() {
            return this.channels;
        }

        public Map<String, Integer> getGroups() {
            return this.groups;
        }

        public Map<String, Integer> getSpaces() {
            return this.spaces;
        }

        public Map<String, Integer> getUsers() {
            return this.users;
        }

        public Map<String, Integer> getUuids() {
            return this.uuids;
        }

        public int hashCode() {
            Map<String, Integer> channels2 = getChannels();
            int i = 43;
            int hashCode = channels2 == null ? 43 : channels2.hashCode();
            Map<String, Integer> groups2 = getGroups();
            int hashCode2 = ((hashCode + 59) * 59) + (groups2 == null ? 43 : groups2.hashCode());
            Map<String, Integer> uuids2 = getUuids();
            int hashCode3 = (hashCode2 * 59) + (uuids2 == null ? 43 : uuids2.hashCode());
            Map<String, Integer> spaces2 = getSpaces();
            int hashCode4 = (hashCode3 * 59) + (spaces2 == null ? 43 : spaces2.hashCode());
            Map<String, Integer> users2 = getUsers();
            int i2 = hashCode4 * 59;
            if (users2 != null) {
                i = users2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("GrantTokenRequestBody.GrantTokenPermission(channels=");
            P0.append(getChannels());
            P0.append(", groups=");
            P0.append(getGroups());
            P0.append(", uuids=");
            P0.append(getUuids());
            P0.append(", spaces=");
            P0.append(getSpaces());
            P0.append(", users=");
            P0.append(getUsers());
            P0.append(")");
            return P0.toString();
        }
    }

    public static class GrantTokenPermissions {
        private final Object meta;
        private final GrantTokenPermission patterns;
        private final GrantTokenPermission resources;
        private final String uuid;

        public GrantTokenPermissions(GrantTokenPermission grantTokenPermission, GrantTokenPermission grantTokenPermission2, Object obj, String str) {
            this.resources = grantTokenPermission;
            this.patterns = grantTokenPermission2;
            this.meta = obj;
            this.uuid = str;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof GrantTokenPermissions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GrantTokenPermissions)) {
                return false;
            }
            GrantTokenPermissions grantTokenPermissions = (GrantTokenPermissions) obj;
            if (!grantTokenPermissions.canEqual(this)) {
                return false;
            }
            GrantTokenPermission resources2 = getResources();
            GrantTokenPermission resources3 = grantTokenPermissions.getResources();
            if (resources2 != null ? !resources2.equals(resources3) : resources3 != null) {
                return false;
            }
            GrantTokenPermission patterns2 = getPatterns();
            GrantTokenPermission patterns3 = grantTokenPermissions.getPatterns();
            if (patterns2 != null ? !patterns2.equals(patterns3) : patterns3 != null) {
                return false;
            }
            Object meta2 = getMeta();
            Object meta3 = grantTokenPermissions.getMeta();
            if (meta2 != null ? !meta2.equals(meta3) : meta3 != null) {
                return false;
            }
            String uuid2 = getUuid();
            String uuid3 = grantTokenPermissions.getUuid();
            return uuid2 != null ? uuid2.equals(uuid3) : uuid3 == null;
        }

        public Object getMeta() {
            return this.meta;
        }

        public GrantTokenPermission getPatterns() {
            return this.patterns;
        }

        public GrantTokenPermission getResources() {
            return this.resources;
        }

        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            GrantTokenPermission resources2 = getResources();
            int i = 43;
            int hashCode = resources2 == null ? 43 : resources2.hashCode();
            GrantTokenPermission patterns2 = getPatterns();
            int hashCode2 = ((hashCode + 59) * 59) + (patterns2 == null ? 43 : patterns2.hashCode());
            Object meta2 = getMeta();
            int hashCode3 = (hashCode2 * 59) + (meta2 == null ? 43 : meta2.hashCode());
            String uuid2 = getUuid();
            int i2 = hashCode3 * 59;
            if (uuid2 != null) {
                i = uuid2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("GrantTokenRequestBody.GrantTokenPermissions(resources=");
            P0.append(getResources());
            P0.append(", patterns=");
            P0.append(getPatterns());
            P0.append(", meta=");
            P0.append(getMeta());
            P0.append(", uuid=");
            P0.append(getUuid());
            P0.append(")");
            return P0.toString();
        }
    }

    public static class GrantTokenRequestBodyBuilder {
        private List<ChannelGrant> channels;
        private List<ChannelGroupGrant> groups;
        private Object meta;
        private Integer ttl;
        private String uuid;
        private List<UUIDGrant> uuids;

        public GrantTokenRequestBody build() throws PubNubException {
            return GrantTokenRequestBody.of(this.ttl, this.channels, this.groups, this.uuids, this.meta, this.uuid);
        }

        public GrantTokenRequestBodyBuilder channels(List<ChannelGrant> list) {
            this.channels = list;
            return this;
        }

        public GrantTokenRequestBodyBuilder groups(List<ChannelGroupGrant> list) {
            this.groups = list;
            return this;
        }

        public GrantTokenRequestBodyBuilder meta(Object obj) {
            this.meta = obj;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("GrantTokenRequestBody.GrantTokenRequestBodyBuilder(ttl=");
            P0.append(this.ttl);
            P0.append(", channels=");
            P0.append(this.channels);
            P0.append(", groups=");
            P0.append(this.groups);
            P0.append(", uuids=");
            P0.append(this.uuids);
            P0.append(", meta=");
            P0.append(this.meta);
            P0.append(", uuid=");
            return a.y0(P0, this.uuid, ")");
        }

        public GrantTokenRequestBodyBuilder ttl(Integer num) {
            this.ttl = num;
            return this;
        }

        public GrantTokenRequestBodyBuilder uuid(String str) {
            this.uuid = str;
            return this;
        }

        public GrantTokenRequestBodyBuilder uuids(List<UUIDGrant> list) {
            this.uuids = list;
            return this;
        }
    }

    public GrantTokenRequestBody(Integer num, GrantTokenPermissions grantTokenPermissions) {
        this.ttl = num;
        this.permissions = grantTokenPermissions;
    }

    public static GrantTokenRequestBodyBuilder builder() {
        return new GrantTokenRequestBodyBuilder();
    }

    private static int calculateBitmask(PNResource<?> pNResource) throws PubNubException {
        int i = pNResource.isRead() ? 1 : 0;
        if (pNResource.isWrite()) {
            i |= 2;
        }
        if (pNResource.isManage()) {
            i |= 4;
        }
        if (pNResource.isDelete()) {
            i |= 8;
        }
        if (pNResource.isCreate()) {
            i |= 16;
        }
        if (pNResource.isGet()) {
            i |= 32;
        }
        if (pNResource.isJoin()) {
            i |= 128;
        }
        return pNResource.isUpdate() ? i | 64 : i;
    }

    private static <T extends PNResource<?>> Map<String, Integer> getPatterns(List<T> list) throws PubNubException {
        HashMap hashMap = new HashMap();
        for (T t : list) {
            if (t.isPatternResource()) {
                hashMap.put(t.getId(), Integer.valueOf(calculateBitmask(t)));
            }
        }
        return hashMap;
    }

    private static <T extends PNResource<?>> Map<String, Integer> getResources(List<T> list) throws PubNubException {
        HashMap hashMap = new HashMap();
        for (T t : list) {
            if (!t.isPatternResource()) {
                hashMap.put(t.getId(), Integer.valueOf(calculateBitmask(t)));
            }
        }
        return hashMap;
    }

    public static GrantTokenRequestBody of(Integer num, List<ChannelGrant> list, List<ChannelGroupGrant> list2, List<UUIDGrant> list3, Object obj, String str) throws PubNubException {
        GrantTokenPermission grantTokenPermission = new GrantTokenPermission(getResources(list), getResources(list2), getResources(list3));
        GrantTokenPermission grantTokenPermission2 = new GrantTokenPermission(getPatterns(list), getPatterns(list2), getPatterns(list3));
        if (obj == null) {
            obj = Collections.emptyMap();
        }
        return new GrantTokenRequestBody(num, new GrantTokenPermissions(grantTokenPermission, grantTokenPermission2, obj, str));
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GrantTokenRequestBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrantTokenRequestBody)) {
            return false;
        }
        GrantTokenRequestBody grantTokenRequestBody = (GrantTokenRequestBody) obj;
        if (!grantTokenRequestBody.canEqual(this)) {
            return false;
        }
        Integer ttl2 = getTtl();
        Integer ttl3 = grantTokenRequestBody.getTtl();
        if (ttl2 != null ? !ttl2.equals(ttl3) : ttl3 != null) {
            return false;
        }
        GrantTokenPermissions permissions2 = getPermissions();
        GrantTokenPermissions permissions3 = grantTokenRequestBody.getPermissions();
        return permissions2 != null ? permissions2.equals(permissions3) : permissions3 == null;
    }

    public GrantTokenPermissions getPermissions() {
        return this.permissions;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        Integer ttl2 = getTtl();
        int i = 43;
        int hashCode = ttl2 == null ? 43 : ttl2.hashCode();
        GrantTokenPermissions permissions2 = getPermissions();
        int i2 = (hashCode + 59) * 59;
        if (permissions2 != null) {
            i = permissions2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("GrantTokenRequestBody(ttl=");
        P0.append(getTtl());
        P0.append(", permissions=");
        P0.append(getPermissions());
        P0.append(")");
        return P0.toString();
    }
}
