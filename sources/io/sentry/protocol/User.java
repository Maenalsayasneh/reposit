package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class User implements Cloneable, IUnknownPropertiesConsumer {
    private String email;
    private String id;
    private String ipAddress;
    private Map<String, String> other;
    private Map<String, Object> unknown;
    private String username;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public void setOthers(Map<String, String> map) {
        if (map != null) {
            this.other = new ConcurrentHashMap(map);
        } else {
            this.other = null;
        }
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.other = CollectionUtils.shallowCopy(this.other);
        user.unknown = CollectionUtils.shallowCopy(this.unknown);
        return user;
    }
}
