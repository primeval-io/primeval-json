package io.primeval.json;

import io.primeval.common.type.TypeTag;

public interface JsonSerializer {
    <T> String toString(T object, TypeTag<? extends T> typeTag);

    default <T> String toString(T object, Class<? extends T> clazz) {
        return toString(object, TypeTag.of(clazz));
    }

    default <T> CharSequence toCharSequence(T object, TypeTag<? extends T> typeTag) {
        return toString(object, typeTag);
    }

    default <T> CharSequence toCharSequence(T object, Class<? extends T> clazz) {
        return toString(object, clazz);
    }

    <T> byte[] toByteArray(T object, TypeTag<? extends T> typeTag);

    default <T> byte[] toByteArray(T object, Class<? extends T> clazz) {
        return toByteArray(object, TypeTag.of(clazz));
    }
}
