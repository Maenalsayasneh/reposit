package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.e;
import i0.f.a.c.p.b;
import i0.f.a.c.t.p;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonNodeDeserializer */
public abstract class BaseNodeDeserializer<T extends e> extends StdDeserializer<T> {
    public final Boolean x;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this.x = bool;
    }

    public void A0(DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, e eVar, e eVar2) throws JsonProcessingException {
        if (deserializationContext.d0(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            String b = deserializationContext.b("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
            throw new MismatchedInputException(deserializationContext.Z1, b, (Class<?>) e.class);
        } else if (deserializationContext.c0(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            Objects.requireNonNull(eVar);
            if (eVar instanceof ArrayNode) {
                ArrayNode arrayNode = (ArrayNode) eVar;
                if (eVar2 == null) {
                    eVar2 = arrayNode.v();
                }
                arrayNode.d.add(eVar2);
                objectNode.w(str, eVar);
                return;
            }
            Objects.requireNonNull(jsonNodeFactory);
            ArrayNode arrayNode2 = new ArrayNode(jsonNodeFactory);
            arrayNode2.d.add(eVar);
            if (eVar2 == null) {
                eVar2 = arrayNode2.v();
            }
            arrayNode2.d.add(eVar2);
            objectNode.w(str, arrayNode2);
        }
    }

    public final e B0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        DoubleNode doubleNode;
        int k = jsonParser.k();
        if (k != 2) {
            switch (k) {
                case 5:
                    return E0(jsonParser, deserializationContext, jsonNodeFactory);
                case 6:
                    return jsonNodeFactory.c(jsonParser.Z());
                case 7:
                    return z0(jsonParser, deserializationContext, jsonNodeFactory);
                case 8:
                    JsonParser.NumberType M = jsonParser.M();
                    if (M == JsonParser.NumberType.BIG_DECIMAL) {
                        return jsonNodeFactory.b(jsonParser.E());
                    }
                    if (deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        if (!jsonParser.J0()) {
                            return jsonNodeFactory.b(jsonParser.E());
                        }
                        double F = jsonParser.F();
                        Objects.requireNonNull(jsonNodeFactory);
                        doubleNode = new DoubleNode(F);
                    } else if (M == JsonParser.NumberType.FLOAT) {
                        float H = jsonParser.H();
                        Objects.requireNonNull(jsonNodeFactory);
                        return new FloatNode(H);
                    } else {
                        double F2 = jsonParser.F();
                        Objects.requireNonNull(jsonNodeFactory);
                        doubleNode = new DoubleNode(F2);
                    }
                    return doubleNode;
                case 9:
                    return jsonNodeFactory.a(true);
                case 10:
                    return jsonNodeFactory.a(false);
                case 11:
                    Objects.requireNonNull(jsonNodeFactory);
                    return NullNode.c;
                case 12:
                    return y0(jsonParser, jsonNodeFactory);
                default:
                    deserializationContext.V(this.d, jsonParser);
                    throw null;
            }
        } else {
            Objects.requireNonNull(jsonNodeFactory);
            return new ObjectNode(jsonNodeFactory);
        }
    }

    public final ArrayNode C0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        Objects.requireNonNull(jsonNodeFactory);
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        while (true) {
            JsonToken M0 = jsonParser.M0();
            if (M0 != null) {
                switch (M0.id()) {
                    case 1:
                        arrayNode.d.add(D0(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 3:
                        arrayNode.d.add(C0(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 4:
                        return arrayNode;
                    case 6:
                        arrayNode.w(jsonNodeFactory.c(jsonParser.Z()));
                        break;
                    case 7:
                        arrayNode.w(z0(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 9:
                        arrayNode.w(jsonNodeFactory.a(true));
                        break;
                    case 10:
                        arrayNode.w(jsonNodeFactory.a(false));
                        break;
                    case 11:
                        arrayNode.w(NullNode.c);
                        break;
                    case 12:
                        arrayNode.w(y0(jsonParser, jsonNodeFactory));
                        break;
                    default:
                        arrayNode.w(B0(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                }
            } else {
                return arrayNode;
            }
        }
    }

    public final ObjectNode D0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        e eVar;
        Objects.requireNonNull(jsonNodeFactory);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        String K0 = jsonParser.K0();
        while (K0 != null) {
            JsonToken M0 = jsonParser.M0();
            if (M0 == null) {
                M0 = JsonToken.NOT_AVAILABLE;
            }
            int id = M0.id();
            if (id == 1) {
                eVar = D0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                eVar = C0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                eVar = jsonNodeFactory.c(jsonParser.Z());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        eVar = jsonNodeFactory.a(true);
                        break;
                    case 10:
                        eVar = jsonNodeFactory.a(false);
                        break;
                    case 11:
                        eVar = NullNode.c;
                        break;
                    case 12:
                        eVar = y0(jsonParser, jsonNodeFactory);
                        break;
                    default:
                        eVar = B0(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                eVar = z0(jsonParser, deserializationContext, jsonNodeFactory);
            }
            e eVar2 = eVar;
            e w = objectNode.w(K0, eVar2);
            if (w != null) {
                A0(deserializationContext, jsonNodeFactory, K0, objectNode, w, eVar2);
            }
            K0 = jsonParser.K0();
        }
        return objectNode;
    }

    public final ObjectNode E0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        e eVar;
        Objects.requireNonNull(jsonNodeFactory);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        String f = jsonParser.f();
        while (f != null) {
            JsonToken M0 = jsonParser.M0();
            if (M0 == null) {
                M0 = JsonToken.NOT_AVAILABLE;
            }
            int id = M0.id();
            if (id == 1) {
                eVar = D0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                eVar = C0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                eVar = jsonNodeFactory.c(jsonParser.Z());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        eVar = jsonNodeFactory.a(true);
                        break;
                    case 10:
                        eVar = jsonNodeFactory.a(false);
                        break;
                    case 11:
                        eVar = NullNode.c;
                        break;
                    case 12:
                        eVar = y0(jsonParser, jsonNodeFactory);
                        break;
                    default:
                        eVar = B0(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                eVar = z0(jsonParser, deserializationContext, jsonNodeFactory);
            }
            e eVar2 = eVar;
            e w = objectNode.w(f, eVar2);
            if (w != null) {
                A0(deserializationContext, jsonNodeFactory, f, objectNode, w, eVar2);
            }
            f = jsonParser.K0();
        }
        return objectNode;
    }

    public final e F0(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
        JsonNodeFactory jsonNodeFactory = deserializationContext.q.h2;
        while (true) {
            switch (jsonParser.M0().id()) {
                case 1:
                    arrayNode.d.add(D0(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 3:
                    arrayNode.d.add(C0(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.w(jsonNodeFactory.c(jsonParser.Z()));
                    break;
                case 7:
                    arrayNode.w(z0(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 9:
                    arrayNode.w(jsonNodeFactory.a(true));
                    break;
                case 10:
                    arrayNode.w(jsonNodeFactory.a(false));
                    break;
                case 11:
                    Objects.requireNonNull(jsonNodeFactory);
                    arrayNode.w(NullNode.c);
                    break;
                case 12:
                    arrayNode.w(y0(jsonParser, jsonNodeFactory));
                    break;
                default:
                    arrayNode.w(B0(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
            }
        }
    }

    public final e G0(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
        String str;
        Object obj;
        if (jsonParser.I0()) {
            str = jsonParser.K0();
        } else if (!jsonParser.y0(JsonToken.FIELD_NAME)) {
            return (e) d(jsonParser, deserializationContext);
        } else {
            str = jsonParser.f();
        }
        while (str != null) {
            JsonToken M0 = jsonParser.M0();
            e eVar = objectNode.d.get(str);
            if (eVar != null) {
                if (eVar instanceof ObjectNode) {
                    if (M0 == JsonToken.START_OBJECT) {
                        e G0 = G0(jsonParser, deserializationContext, (ObjectNode) eVar);
                        if (G0 != eVar) {
                            if (G0 == null) {
                                G0 = objectNode.v();
                            }
                            objectNode.d.put(str, G0);
                        }
                        str = jsonParser.K0();
                    }
                } else if ((eVar instanceof ArrayNode) && M0 == JsonToken.START_ARRAY) {
                    ArrayNode arrayNode = (ArrayNode) eVar;
                    F0(jsonParser, deserializationContext, arrayNode);
                    if (arrayNode != eVar) {
                        objectNode.d.put(str, arrayNode);
                    }
                    str = jsonParser.K0();
                }
            }
            if (M0 == null) {
                M0 = JsonToken.NOT_AVAILABLE;
            }
            JsonNodeFactory jsonNodeFactory = deserializationContext.q.h2;
            int id = M0.id();
            if (id == 1) {
                obj = D0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                obj = C0(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                obj = jsonNodeFactory.c(jsonParser.Z());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        obj = jsonNodeFactory.a(true);
                        break;
                    case 10:
                        obj = jsonNodeFactory.a(false);
                        break;
                    case 11:
                        Objects.requireNonNull(jsonNodeFactory);
                        obj = NullNode.c;
                        break;
                    case 12:
                        obj = y0(jsonParser, jsonNodeFactory);
                        break;
                    default:
                        obj = B0(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                obj = z0(jsonParser, deserializationContext, jsonNodeFactory);
            }
            if (obj == null) {
                obj = objectNode.v();
            }
            objectNode.d.put(str, obj);
            str = jsonParser.K0();
        }
        return objectNode;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.b(jsonParser, deserializationContext);
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.Untyped;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return this.x;
    }

    public final e y0(JsonParser jsonParser, JsonNodeFactory jsonNodeFactory) throws IOException {
        Object G = jsonParser.G();
        if (G == null) {
            Objects.requireNonNull(jsonNodeFactory);
            return NullNode.c;
        } else if (G.getClass() == byte[].class) {
            byte[] bArr = (byte[]) G;
            Objects.requireNonNull(jsonNodeFactory);
            BinaryNode binaryNode = BinaryNode.c;
            if (bArr.length == 0) {
                return BinaryNode.c;
            }
            return new BinaryNode(bArr);
        } else if (G instanceof p) {
            Objects.requireNonNull(jsonNodeFactory);
            return new POJONode((p) G);
        } else if (G instanceof e) {
            return (e) G;
        } else {
            Objects.requireNonNull(jsonNodeFactory);
            return new POJONode(G);
        }
    }

    public final e z0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType;
        int i = deserializationContext.x;
        if ((StdDeserializer.c & i) == 0) {
            numberType = jsonParser.M();
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i)) {
            numberType = JsonParser.NumberType.BIG_INTEGER;
        } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i)) {
            numberType = JsonParser.NumberType.LONG;
        } else {
            numberType = jsonParser.M();
        }
        if (numberType == JsonParser.NumberType.INT) {
            int I = jsonParser.I();
            Objects.requireNonNull(jsonNodeFactory);
            if (I > 10 || I < -1) {
                return new IntNode(I);
            }
            return IntNode.c[I - -1];
        } else if (numberType == JsonParser.NumberType.LONG) {
            long J = jsonParser.J();
            Objects.requireNonNull(jsonNodeFactory);
            return new LongNode(J);
        } else {
            BigInteger l = jsonParser.l();
            Objects.requireNonNull(jsonNodeFactory);
            if (l == null) {
                return NullNode.c;
            }
            return new BigIntegerNode(l);
        }
    }
}
