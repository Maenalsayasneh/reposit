package io.michaelrocks.libphonenumber.android;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$PhoneMetadata implements Externalizable {
    public Phonemetadata$PhoneNumberDesc A2 = null;
    public String B2 = "";
    public int C2 = 0;
    public String D2 = "";
    public boolean E2;
    public String F2 = "";
    public boolean G2;
    public String H2 = "";
    public boolean I2;
    public String J2 = "";
    public boolean K2;
    public String L2 = "";
    public boolean M2;
    public String N2 = "";
    public boolean O2 = false;
    public List<Phonemetadata$NumberFormat> P2 = new ArrayList();
    public List<Phonemetadata$NumberFormat> Q2 = new ArrayList();
    public boolean R2 = false;
    public boolean S2;
    public String T2 = "";
    public boolean U2 = false;
    public boolean V2 = false;
    public Phonemetadata$PhoneNumberDesc Y1 = null;
    public boolean Z1;
    public Phonemetadata$PhoneNumberDesc a2 = null;
    public boolean b2;
    public boolean c;
    public Phonemetadata$PhoneNumberDesc c2 = null;
    public Phonemetadata$PhoneNumberDesc d = null;
    public boolean d2;
    public Phonemetadata$PhoneNumberDesc e2 = null;
    public boolean f2;
    public Phonemetadata$PhoneNumberDesc g2 = null;
    public boolean h2;
    public Phonemetadata$PhoneNumberDesc i2 = null;
    public boolean j2;
    public Phonemetadata$PhoneNumberDesc k2 = null;
    public boolean l2;
    public Phonemetadata$PhoneNumberDesc m2 = null;
    public boolean n2;
    public Phonemetadata$PhoneNumberDesc o2 = null;
    public boolean p2;
    public boolean q;
    public Phonemetadata$PhoneNumberDesc q2 = null;
    public boolean r2;
    public Phonemetadata$PhoneNumberDesc s2 = null;
    public boolean t2;
    public Phonemetadata$PhoneNumberDesc u2 = null;
    public boolean v2;
    public Phonemetadata$PhoneNumberDesc w2 = null;
    public Phonemetadata$PhoneNumberDesc x = null;
    public boolean x2;
    public boolean y;
    public Phonemetadata$PhoneNumberDesc y2 = null;
    public boolean z2;

    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.c = true;
            this.d = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.q = true;
            this.x = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.y = true;
            this.Y1 = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.Z1 = true;
            this.a2 = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.b2 = true;
            this.c2 = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.d2 = true;
            this.e2 = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.f2 = true;
            this.g2 = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.h2 = true;
            this.i2 = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.j2 = true;
            this.k2 = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.l2 = true;
            this.m2 = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.n2 = true;
            this.o2 = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.p2 = true;
            this.q2 = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.r2 = true;
            this.s2 = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.t2 = true;
            this.u2 = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.v2 = true;
            this.w2 = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.x2 = true;
            this.y2 = phonemetadata$PhoneNumberDesc16;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc17 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc17.readExternal(objectInput);
            this.z2 = true;
            this.A2 = phonemetadata$PhoneNumberDesc17;
        }
        this.B2 = objectInput.readUTF();
        this.C2 = objectInput.readInt();
        this.D2 = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.E2 = true;
            this.F2 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.G2 = true;
            this.H2 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.I2 = true;
            this.J2 = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.K2 = true;
            this.L2 = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.M2 = true;
            this.N2 = readUTF5;
        }
        this.O2 = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.P2.add(phonemetadata$NumberFormat);
        }
        int readInt2 = objectInput.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.Q2.add(phonemetadata$NumberFormat2);
        }
        this.R2 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.S2 = true;
            this.T2 = readUTF6;
        }
        this.U2 = objectInput.readBoolean();
        this.V2 = objectInput.readBoolean();
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.q);
        if (this.q) {
            this.x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.Y1.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Z1);
        if (this.Z1) {
            this.a2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.b2);
        if (this.b2) {
            this.c2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.d2);
        if (this.d2) {
            this.e2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f2);
        if (this.f2) {
            this.g2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.h2);
        if (this.h2) {
            this.i2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.j2);
        if (this.j2) {
            this.k2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.l2);
        if (this.l2) {
            this.m2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.n2);
        if (this.n2) {
            this.o2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.p2);
        if (this.p2) {
            this.q2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r2);
        if (this.r2) {
            this.s2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.t2);
        if (this.t2) {
            this.u2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v2);
        if (this.v2) {
            this.w2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x2);
        if (this.x2) {
            this.y2.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z2);
        if (this.z2) {
            this.A2.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.B2);
        objectOutput.writeInt(this.C2);
        objectOutput.writeUTF(this.D2);
        objectOutput.writeBoolean(this.E2);
        if (this.E2) {
            objectOutput.writeUTF(this.F2);
        }
        objectOutput.writeBoolean(this.G2);
        if (this.G2) {
            objectOutput.writeUTF(this.H2);
        }
        objectOutput.writeBoolean(this.I2);
        if (this.I2) {
            objectOutput.writeUTF(this.J2);
        }
        objectOutput.writeBoolean(this.K2);
        if (this.K2) {
            objectOutput.writeUTF(this.L2);
        }
        objectOutput.writeBoolean(this.M2);
        if (this.M2) {
            objectOutput.writeUTF(this.N2);
        }
        objectOutput.writeBoolean(this.O2);
        int size = this.P2.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.P2.get(i).writeExternal(objectOutput);
        }
        int size2 = this.Q2.size();
        objectOutput.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.Q2.get(i3).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R2);
        objectOutput.writeBoolean(this.S2);
        if (this.S2) {
            objectOutput.writeUTF(this.T2);
        }
        objectOutput.writeBoolean(this.U2);
        objectOutput.writeBoolean(this.V2);
    }
}
