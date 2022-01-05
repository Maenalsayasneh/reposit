package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import s0.a.a.j;
import s0.a.a.n;
import s0.a.a.q;
import s0.a.d.d.e;

public class PKCS12BagAttributeCarrierImpl implements e {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    public PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }

    public Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return (s0.a.a.e) this.pkcs12Attributes.get(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    public Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) readObject;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
            return;
        }
        j jVar = new j((byte[]) readObject);
        while (true) {
            n nVar = (n) jVar.i();
            if (nVar != null) {
                setBagAttribute(nVar, jVar.i());
            } else {
                return;
            }
        }
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        if (this.pkcs12Attributes.containsKey(nVar)) {
            this.pkcs12Attributes.put(nVar, eVar);
            return;
        }
        this.pkcs12Attributes.put(nVar, eVar);
        this.pkcs12Ordering.addElement(nVar);
    }

    public int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        q qVar = new q(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            n D = n.D(bagAttributeKeys.nextElement());
            qVar.k(D);
            qVar.j((s0.a.a.e) this.pkcs12Attributes.get(D));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }
}
