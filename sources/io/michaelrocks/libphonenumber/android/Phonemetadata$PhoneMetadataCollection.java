package io.michaelrocks.libphonenumber.android;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$PhoneMetadataCollection implements Externalizable {
    public List<Phonemetadata$PhoneMetadata> c = new ArrayList();

    public void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
            phonemetadata$PhoneMetadata.readExternal(objectInput);
            this.c.add(phonemetadata$PhoneMetadata);
        }
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.c.get(i).writeExternal(objectOutput);
        }
    }
}
