package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;
import java.util.Iterator;

public abstract class PropertyBindingException extends MismatchedInputException {
    public final Collection<Object> x;
    public transient String y;

    public PropertyBindingException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation);
        this.x = collection;
    }

    public String a() {
        String str = this.y;
        if (str != null || this.x == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = this.x.size();
        if (size != 1) {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator<Object> it = this.x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        } else {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(this.x.iterator().next()));
            sb.append('\"');
        }
        sb.append("])");
        String sb2 = sb.toString();
        this.y = sb2;
        return sb2;
    }
}
