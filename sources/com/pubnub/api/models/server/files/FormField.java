package com.pubnub.api.models.server.files;

import i0.d.a.a.a;

public class FormField {
    private final String key;
    private final String value;

    public FormField(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FormField;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        if (!formField.canEqual(this)) {
            return false;
        }
        String key2 = getKey();
        String key3 = formField.getKey();
        if (key2 != null ? !key2.equals(key3) : key3 != null) {
            return false;
        }
        String value2 = getValue();
        String value3 = formField.getValue();
        return value2 != null ? value2.equals(value3) : value3 == null;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String key2 = getKey();
        int i = 43;
        int hashCode = key2 == null ? 43 : key2.hashCode();
        String value2 = getValue();
        int i2 = (hashCode + 59) * 59;
        if (value2 != null) {
            i = value2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FormField(key=");
        P0.append(getKey());
        P0.append(", value=");
        P0.append(getValue());
        P0.append(")");
        return P0.toString();
    }
}
