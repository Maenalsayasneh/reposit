package com.airbnb.epoxy;

import i0.b.a.t;

public class ImmutableModelException extends RuntimeException {
    public ImmutableModelException(t tVar, String str, int i) {
        super(str + " Position: " + i + " Model: " + tVar.toString() + "\n\n" + "Epoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.");
    }
}
