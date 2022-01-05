package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.d.a.a.a;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    public /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        v((InetSocketAddress) obj, jsonGenerator);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        WritableTypeId d = eVar.d(inetSocketAddress, JsonToken.VALUE_STRING);
        d.b = InetSocketAddress.class;
        WritableTypeId e = eVar.e(jsonGenerator, d);
        v(inetSocketAddress, jsonGenerator);
        eVar.f(jsonGenerator, e);
    }

    public void v(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator) throws IOException {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    StringBuilder P0 = a.P0("[");
                    P0.append(hostName.substring(1));
                    P0.append("]");
                    str = P0.toString();
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        StringBuilder S0 = a.S0(hostName, ":");
        S0.append(inetSocketAddress.getPort());
        jsonGenerator.Q0(S0.toString());
    }
}
