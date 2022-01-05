package i0.f.a.b.m;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonParserSequence */
public class h extends g {
    public int Y1;
    public boolean Z1;
    public final JsonParser[] x;
    public final boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.y = z;
        if (z && this.q.v0()) {
            z2 = true;
        }
        this.Z1 = z2;
        this.x = jsonParserArr;
        this.Y1 = 1;
    }

    public static h W0(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof h;
        if (z2 || (jsonParser2 instanceof h)) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ((h) jsonParser).V0(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
            if (jsonParser2 instanceof h) {
                ((h) jsonParser2).V0(arrayList);
            } else {
                arrayList.add(jsonParser2);
            }
            return new h(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
        }
        return new h(z, new JsonParser[]{jsonParser, jsonParser2});
    }

    public JsonToken M0() throws IOException {
        JsonToken M0;
        JsonParser jsonParser = this.q;
        if (jsonParser == null) {
            return null;
        }
        if (this.Z1) {
            this.Z1 = false;
            return jsonParser.i();
        }
        JsonToken M02 = jsonParser.M0();
        if (M02 != null) {
            return M02;
        }
        do {
            int i = this.Y1;
            JsonParser[] jsonParserArr = this.x;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.Y1 = i + 1;
            JsonParser jsonParser2 = jsonParserArr[i];
            this.q = jsonParser2;
            if (this.y && jsonParser2.v0()) {
                return this.q.z();
            }
            M0 = this.q.M0();
        } while (M0 == null);
        return M0;
    }

    public JsonParser U0() throws IOException {
        if (this.q.i() != JsonToken.START_OBJECT && this.q.i() != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken M0 = M0();
            if (M0 == null) {
                return this;
            }
            if (M0.isStructStart()) {
                i++;
            } else if (M0.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public void V0(List<JsonParser> list) {
        int length = this.x.length;
        for (int i = this.Y1 - 1; i < length; i++) {
            JsonParser jsonParser = this.x[i];
            if (jsonParser instanceof h) {
                ((h) jsonParser).V0(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public void close() throws IOException {
        boolean z;
        do {
            this.q.close();
            int i = this.Y1;
            JsonParser[] jsonParserArr = this.x;
            if (i < jsonParserArr.length) {
                this.Y1 = i + 1;
                this.q = jsonParserArr[i];
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
        } while (z);
    }
}
