package i0.f.a.b.m;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import i0.f.a.b.c;
import i0.f.a.b.d;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: JsonParserDelegate */
public class g extends JsonParser {
    public JsonParser q;

    public g(JsonParser jsonParser) {
        this.q = jsonParser;
    }

    public boolean A0(int i) {
        return this.q.A0(i);
    }

    @Deprecated
    public int C() {
        return this.q.C();
    }

    public boolean D0() {
        return this.q.D0();
    }

    public BigDecimal E() throws IOException {
        return this.q.E();
    }

    public double F() throws IOException {
        return this.q.F();
    }

    public boolean F0() {
        return this.q.F0();
    }

    public Object G() throws IOException {
        return this.q.G();
    }

    public float H() throws IOException {
        return this.q.H();
    }

    public int I() throws IOException {
        return this.q.I();
    }

    public boolean I0() {
        return this.q.I0();
    }

    public long J() throws IOException {
        return this.q.J();
    }

    public boolean J0() throws IOException {
        return this.q.J0();
    }

    public JsonParser.NumberType M() throws IOException {
        return this.q.M();
    }

    public Number N() throws IOException {
        return this.q.N();
    }

    public JsonToken N0() throws IOException {
        return this.q.N0();
    }

    public Number O() throws IOException {
        return this.q.O();
    }

    public JsonParser O0(int i, int i2) {
        this.q.O0(i, i2);
        return this;
    }

    public JsonParser P0(int i, int i2) {
        this.q.P0(i, i2);
        return this;
    }

    public Object Q() throws IOException {
        return this.q.Q();
    }

    public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.q.Q0(base64Variant, outputStream);
    }

    public boolean R0() {
        return this.q.R0();
    }

    public void S0(Object obj) {
        this.q.S0(obj);
    }

    public c T() {
        return this.q.T();
    }

    @Deprecated
    public JsonParser T0(int i) {
        this.q.T0(i);
        return this;
    }

    public f<StreamReadCapability> U() {
        return this.q.U();
    }

    public short Y() throws IOException {
        return this.q.Y();
    }

    public String Z() throws IOException {
        return this.q.Z();
    }

    public boolean a() {
        return this.q.a();
    }

    public boolean b() {
        return this.q.b();
    }

    public char[] b0() throws IOException {
        return this.q.b0();
    }

    public int c0() throws IOException {
        return this.q.c0();
    }

    public int d0() throws IOException {
        return this.q.d0();
    }

    public void e() {
        this.q.e();
    }

    public JsonLocation f0() {
        return this.q.f0();
    }

    public Object g0() throws IOException {
        return this.q.g0();
    }

    public JsonToken i() {
        return this.q.i();
    }

    public int i0() throws IOException {
        return this.q.i0();
    }

    public int k() {
        return this.q.k();
    }

    public BigInteger l() throws IOException {
        return this.q.l();
    }

    public int m0(int i) throws IOException {
        return this.q.m0(i);
    }

    public byte[] n(Base64Variant base64Variant) throws IOException {
        return this.q.n(base64Variant);
    }

    public long n0() throws IOException {
        return this.q.n0();
    }

    public long p0(long j) throws IOException {
        return this.q.p0(j);
    }

    public byte q() throws IOException {
        return this.q.q();
    }

    public String r0() throws IOException {
        return this.q.r0();
    }

    public String u0(String str) throws IOException {
        return this.q.u0(str);
    }

    public d v() {
        return this.q.v();
    }

    public boolean v0() {
        return this.q.v0();
    }

    public JsonLocation w() {
        return this.q.w();
    }

    public boolean w0() {
        return this.q.w0();
    }

    public String y() throws IOException {
        return this.q.y();
    }

    public boolean y0(JsonToken jsonToken) {
        return this.q.y0(jsonToken);
    }

    public JsonToken z() {
        return this.q.z();
    }
}
