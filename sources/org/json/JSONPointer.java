package org.json;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class JSONPointer {
    private static final String ENCODING = "utf-8";
    private final List<String> refTokens;

    public JSONPointer(String str) {
        String str2;
        Objects.requireNonNull(str, "pointer cannot be null");
        if (str.isEmpty() || str.equals("#")) {
            this.refTokens = Collections.emptyList();
            return;
        }
        if (str.startsWith("#/")) {
            try {
                str2 = URLDecoder.decode(str.substring(2), ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else if (str.startsWith("/")) {
            str2 = str.substring(1);
        } else {
            throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
        }
        this.refTokens = new ArrayList();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int indexOf = str2.indexOf(47, i2);
            if (i2 == indexOf || i2 == str2.length()) {
                this.refTokens.add("");
            } else if (indexOf >= 0) {
                this.refTokens.add(unescape(str2.substring(i2, indexOf)));
            } else {
                this.refTokens.add(unescape(str2.substring(i2)));
            }
            if (indexOf >= 0) {
                i = indexOf;
            } else {
                return;
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private String escape(String str) {
        return str.replace("~", "~0").replace("/", "~1").replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private Object readByIndexToken(Object obj, String str) throws JSONPointerException {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
            JSONArray jSONArray = (JSONArray) obj;
            if (parseInt < jSONArray.length()) {
                return jSONArray.get(parseInt);
            }
            throw new JSONPointerException(String.format("index %s is out of bounds - the array has %d elements", new Object[]{str, Integer.valueOf(jSONArray.length())}));
        } catch (JSONException e) {
            throw new JSONPointerException("Error reading value at index position " + parseInt, e);
        } catch (NumberFormatException e2) {
            throw new JSONPointerException(String.format("%s is not an array index", new Object[]{str}), e2);
        }
    }

    private String unescape(String str) {
        return str.replace("~1", "/").replace("~0", "~").replace("\\\"", "\"").replace("\\\\", "\\");
    }

    public Object queryFrom(Object obj) throws JSONPointerException {
        if (this.refTokens.isEmpty()) {
            return obj;
        }
        for (String next : this.refTokens) {
            if (obj instanceof JSONObject) {
                obj = ((JSONObject) obj).opt(unescape(next));
            } else if (obj instanceof JSONArray) {
                obj = readByIndexToken(obj, next);
            } else {
                throw new JSONPointerException(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", new Object[]{obj, next}));
            }
        }
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String escape : this.refTokens) {
            sb.append('/');
            sb.append(escape(escape));
        }
        return sb.toString();
    }

    public String toURIFragment() {
        try {
            StringBuilder sb = new StringBuilder("#");
            for (String encode : this.refTokens) {
                sb.append('/');
                sb.append(URLEncoder.encode(encode, ENCODING));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Builder {
        private final List<String> refTokens = new ArrayList();

        public Builder append(String str) {
            Objects.requireNonNull(str, "token cannot be null");
            this.refTokens.add(str);
            return this;
        }

        public JSONPointer build() {
            return new JSONPointer(this.refTokens);
        }

        public Builder append(int i) {
            this.refTokens.add(String.valueOf(i));
            return this;
        }
    }

    public JSONPointer(List<String> list) {
        this.refTokens = new ArrayList(list);
    }
}
