package org.json;

import i0.d.a.a.a;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

public class XML {
    public static final Character AMP = '&';
    public static final Character APOS = '\'';
    public static final Character BANG = '!';
    public static final Character EQ = '=';
    public static final Character GT = '>';
    public static final Character LT = '<';
    public static final String NULL_ATTR = "xsi:nil";
    public static final Character QUEST = '?';
    public static final Character QUOT = '\"';
    public static final Character SLASH = '/';

    private static Iterable<Integer> codePointIterator(final String str) {
        return new Iterable<Integer>() {
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    private int length;
                    private int nextIndex = 0;

                    {
                        this.length = str.length();
                    }

                    public boolean hasNext() {
                        return this.nextIndex < this.length;
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public Integer next() {
                        int codePointAt = str.codePointAt(this.nextIndex);
                        this.nextIndex = Character.charCount(codePointAt) + this.nextIndex;
                        return Integer.valueOf(codePointAt);
                    }
                };
            }
        };
    }

    public static String escape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (Integer intValue : codePointIterator(str)) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 34) {
                sb.append("&quot;");
            } else if (intValue2 == 60) {
                sb.append("&lt;");
            } else if (intValue2 == 62) {
                sb.append("&gt;");
            } else if (intValue2 == 38) {
                sb.append("&amp;");
            } else if (intValue2 == 39) {
                sb.append("&apos;");
            } else if (mustEscape(intValue2)) {
                sb.append("&#x");
                sb.append(Integer.toHexString(intValue2));
                sb.append(';');
            } else {
                sb.appendCodePoint(intValue2);
            }
        }
        return sb.toString();
    }

    private static boolean mustEscape(int i) {
        return !(!Character.isISOControl(i) || i == 9 || i == 10 || i == 13) || ((i < 32 || i > 55295) && ((i < 57344 || i > 65533) && (i < 65536 || i > 1114111)));
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length != 0) {
            int i = 0;
            while (i < length) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    i++;
                } else {
                    throw new JSONException(a.o0("'", str, "' contains a space character."));
                }
            }
            return;
        }
        throw new JSONException("Empty string.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f0, code lost:
        r7 = r10.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f6, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fa, code lost:
        if (r13.convertNilAttributeToNull == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0102, code lost:
        if (NULL_ATTR.equals(r5) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010b, code lost:
        if (java.lang.Boolean.parseBoolean((java.lang.String) r7) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010f, code lost:
        if (r6 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0113, code lost:
        if (r13.keepStrings == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0115, code lost:
        r7 = (java.lang.String) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0118, code lost:
        r7 = stringToValue((java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011e, code lost:
        r12.accumulate(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        throw r10.syntaxError("Missing value");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parse(org.json.XMLTokener r10, org.json.JSONObject r11, java.lang.String r12, org.json.XMLParserConfiguration r13) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r10.nextToken()
            java.lang.Character r1 = BANG
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x006c
            char r12 = r10.next()
            r0 = 45
            if (r12 != r0) goto L_0x0022
            char r11 = r10.next()
            if (r11 != r0) goto L_0x001e
            java.lang.String r11 = "-->"
            r10.skipPast(r11)
            return r3
        L_0x001e:
            r10.back()
            goto L_0x004f
        L_0x0022:
            r0 = 91
            if (r12 != r0) goto L_0x004f
            java.lang.Object r12 = r10.nextToken()
            java.lang.String r1 = "CDATA"
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x0048
            char r12 = r10.next()
            if (r12 != r0) goto L_0x0048
            java.lang.String r10 = r10.nextCDATA()
            int r12 = r10.length()
            if (r12 <= 0) goto L_0x0047
            java.lang.String r12 = r13.cDataTagName
            r11.accumulate(r12, r10)
        L_0x0047:
            return r3
        L_0x0048:
            java.lang.String r11 = "Expected 'CDATA['"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x004f:
            java.lang.Object r11 = r10.nextMeta()
            if (r11 == 0) goto L_0x0065
            java.lang.Character r12 = LT
            if (r11 != r12) goto L_0x005c
            int r2 = r2 + 1
            goto L_0x0062
        L_0x005c:
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x0062
            int r2 = r2 + -1
        L_0x0062:
            if (r2 > 0) goto L_0x004f
            return r3
        L_0x0065:
            java.lang.String r11 = "Missing '>' after '<!'."
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x006c:
            java.lang.Character r1 = QUEST
            if (r0 != r1) goto L_0x0076
            java.lang.String r11 = "?>"
            r10.skipPast(r11)
            return r3
        L_0x0076:
            java.lang.Character r1 = SLASH
            if (r0 != r1) goto L_0x00ca
            java.lang.Object r11 = r10.nextToken()
            if (r12 == 0) goto L_0x00b4
            boolean r13 = r11.equals(r12)
            if (r13 == 0) goto L_0x0096
            java.lang.Object r11 = r10.nextToken()
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x008f
            return r2
        L_0x008f:
            java.lang.String r11 = "Misshaped close tag"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0096:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Mismatched "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = " and "
            r13.append(r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00b4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Mismatched close tag "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00ca:
            boolean r12 = r0 instanceof java.lang.Character
            java.lang.String r1 = "Misshaped tag"
            if (r12 != 0) goto L_0x01c8
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r4 = 0
            r6 = r3
        L_0x00d9:
            r5 = r4
        L_0x00da:
            if (r5 != 0) goto L_0x00e0
            java.lang.Object r5 = r10.nextToken()
        L_0x00e0:
            boolean r7 = r5 instanceof java.lang.String
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x012e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r10.nextToken()
            java.lang.Character r9 = EQ
            if (r7 != r9) goto L_0x0129
            java.lang.Object r7 = r10.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0122
            boolean r8 = r13.convertNilAttributeToNull
            if (r8 == 0) goto L_0x010f
            java.lang.String r8 = "xsi:nil"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x010f
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = java.lang.Boolean.parseBoolean(r8)
            if (r8 == 0) goto L_0x010f
            r6 = r2
            goto L_0x00d9
        L_0x010f:
            if (r6 != 0) goto L_0x00d9
            boolean r8 = r13.keepStrings
            if (r8 == 0) goto L_0x0118
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x011e
        L_0x0118:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = stringToValue(r7)
        L_0x011e:
            r12.accumulate(r5, r7)
            goto L_0x00d9
        L_0x0122:
            java.lang.String r11 = "Missing value"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0129:
            r12.accumulate(r5, r8)
            r5 = r7
            goto L_0x00da
        L_0x012e:
            java.lang.Character r4 = SLASH
            if (r5 != r4) goto L_0x0155
            java.lang.Object r13 = r10.nextToken()
            java.lang.Character r2 = GT
            if (r13 != r2) goto L_0x0150
            if (r6 == 0) goto L_0x0142
            java.lang.Object r10 = org.json.JSONObject.NULL
            r11.accumulate(r0, r10)
            goto L_0x014f
        L_0x0142:
            int r10 = r12.length()
            if (r10 <= 0) goto L_0x014c
            r11.accumulate(r0, r12)
            goto L_0x014f
        L_0x014c:
            r11.accumulate(r0, r8)
        L_0x014f:
            return r3
        L_0x0150:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x0155:
            java.lang.Character r4 = GT
            if (r5 != r4) goto L_0x01c3
        L_0x0159:
            java.lang.Object r1 = r10.nextContent()
            if (r1 != 0) goto L_0x0178
            if (r0 != 0) goto L_0x0162
            return r3
        L_0x0162:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unclosed tag "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0178:
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x0193
            java.lang.String r1 = (java.lang.String) r1
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0159
            java.lang.String r4 = r13.cDataTagName
            boolean r5 = r13.keepStrings
            if (r5 == 0) goto L_0x018b
            goto L_0x018f
        L_0x018b:
            java.lang.Object r1 = stringToValue(r1)
        L_0x018f:
            r12.accumulate(r4, r1)
            goto L_0x0159
        L_0x0193:
            java.lang.Character r4 = LT
            if (r1 != r4) goto L_0x0159
            boolean r1 = parse(r10, r12, r0, r13)
            if (r1 == 0) goto L_0x0159
            int r10 = r12.length()
            if (r10 != 0) goto L_0x01a7
            r11.accumulate(r0, r8)
            goto L_0x01c2
        L_0x01a7:
            int r10 = r12.length()
            if (r10 != r2) goto L_0x01bf
            java.lang.String r10 = r13.cDataTagName
            java.lang.Object r10 = r12.opt(r10)
            if (r10 == 0) goto L_0x01bf
            java.lang.String r10 = r13.cDataTagName
            java.lang.Object r10 = r12.opt(r10)
            r11.accumulate(r0, r10)
            goto L_0x01c2
        L_0x01bf:
            r11.accumulate(r0, r12)
        L_0x01c2:
            return r3
        L_0x01c3:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x01c8:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XML.parse(org.json.XMLTokener, org.json.JSONObject, java.lang.String, org.json.XMLParserConfiguration):boolean");
    }

    public static Object stringToValue(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return JSONObject.NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            try {
                if (str.indexOf(46) <= -1 && str.indexOf(101) <= -1 && str.indexOf(69) <= -1) {
                    if (!"-0".equals(str)) {
                        Long valueOf = Long.valueOf(str);
                        if (str.equals(valueOf.toString())) {
                            return valueOf.longValue() == ((long) valueOf.intValue()) ? Integer.valueOf(valueOf.intValue()) : valueOf;
                        }
                    }
                }
                Double valueOf2 = Double.valueOf(str);
                return (valueOf2.isInfinite() || valueOf2.isNaN()) ? str : valueOf2;
            } catch (Exception unused) {
            }
        }
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(str, XMLParserConfiguration.ORIGINAL);
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, (String) null, XMLParserConfiguration.ORIGINAL);
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                int indexOf = str.indexOf(59, i);
                if (indexOf > i) {
                    String substring = str.substring(i + 1, indexOf);
                    sb.append(XMLTokener.unescapeEntity(substring));
                    i += substring.length() + 1;
                } else {
                    sb.append(charAt);
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(Reader reader) throws JSONException {
        return toJSONObject(reader, XMLParserConfiguration.ORIGINAL);
    }

    public static String toString(Object obj, String str) {
        return toString(obj, str, XMLParserConfiguration.ORIGINAL);
    }

    public static JSONObject toJSONObject(Reader reader, boolean z) throws JSONException {
        if (z) {
            return toJSONObject(reader, XMLParserConfiguration.KEEP_STRINGS);
        }
        return toJSONObject(reader, XMLParserConfiguration.ORIGINAL);
    }

    public static String toString(Object obj, String str, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        String str2;
        JSONArray jSONArray;
        StringBuilder sb = new StringBuilder();
        if (obj instanceof JSONObject) {
            if (str != null) {
                sb.append('<');
                sb.append(str);
                sb.append('>');
            }
            JSONObject jSONObject = (JSONObject) obj;
            for (String next : jSONObject.keySet()) {
                Object opt = jSONObject.opt(next);
                if (opt == null) {
                    opt = "";
                } else if (opt.getClass().isArray()) {
                    opt = new JSONArray(opt);
                }
                if (next.equals(xMLParserConfiguration.cDataTagName)) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) opt;
                        int length = jSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            if (i > 0) {
                                sb.append(10);
                            }
                            sb.append(escape(jSONArray2.opt(i).toString()));
                        }
                    } else {
                        sb.append(escape(opt.toString()));
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) opt;
                    int length2 = jSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object opt2 = jSONArray3.opt(i2);
                        if (opt2 instanceof JSONArray) {
                            sb.append('<');
                            sb.append(next);
                            sb.append('>');
                            sb.append(toString(opt2, (String) null, xMLParserConfiguration));
                            sb.append("</");
                            sb.append(next);
                            sb.append('>');
                        } else {
                            sb.append(toString(opt2, next, xMLParserConfiguration));
                        }
                    }
                } else if ("".equals(opt)) {
                    sb.append('<');
                    sb.append(next);
                    sb.append("/>");
                } else {
                    sb.append(toString(opt, next, xMLParserConfiguration));
                }
            }
            if (str != null) {
                sb.append("</");
                sb.append(str);
                sb.append('>');
            }
            return sb.toString();
        } else if (obj == null || (!(obj instanceof JSONArray) && !obj.getClass().isArray())) {
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = escape(obj.toString());
            }
            if (str == null) {
                return a.o0("\"", str2, "\"");
            }
            if (str2.length() == 0) {
                return a.o0("<", str, "/>");
            }
            return a.y0(a.U0("<", str, ">", str2, "</"), str, ">");
        } else {
            if (obj.getClass().isArray()) {
                jSONArray = new JSONArray(obj);
            } else {
                jSONArray = (JSONArray) obj;
            }
            int length3 = jSONArray.length();
            for (int i3 = 0; i3 < length3; i3++) {
                sb.append(toString(jSONArray.opt(i3), str == null ? "array" : str, xMLParserConfiguration));
            }
            return sb.toString();
        }
    }

    public static JSONObject toJSONObject(Reader reader, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(reader);
        while (xMLTokener.more()) {
            xMLTokener.skipPast("<");
            if (xMLTokener.more()) {
                parse(xMLTokener, jSONObject, (String) null, xMLParserConfiguration);
            }
        }
        return jSONObject;
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return toJSONObject((Reader) new StringReader(str), z);
    }

    public static JSONObject toJSONObject(String str, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        return toJSONObject((Reader) new StringReader(str), xMLParserConfiguration);
    }
}
