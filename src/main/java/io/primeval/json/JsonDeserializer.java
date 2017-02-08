package io.primeval.json;

import java.io.InputStream;

import io.primeval.common.type.TypeTag;

public interface JsonDeserializer {

    <T> T fromJson(CharSequence source, TypeTag<T> typeTag, ClassLoader classLoader);

    default <T> T fromJson(CharSequence source, Class<T> clazz, ClassLoader classLoader) {
        return fromJson(source, TypeTag.of(clazz), classLoader);
    }

    default <T> T fromJson(CharSequence source, Class<T> clazz) {
        return fromJson(source, clazz, clazz.getClassLoader());
    }

    default <T> T fromJson(CharSequence source, TypeTag<T> typeTag) {
        return fromJson(source, typeTag, typeTag.getClassLoader());
    }

    <T> T fromJson(InputStream source, TypeTag<T> typeTag, ClassLoader classLoader);

    default <T> T fromJson(InputStream source, Class<T> clazz, ClassLoader classLoader) {
        return fromJson(source, TypeTag.of(clazz), classLoader);
    }

    default <T> T fromJson(InputStream source, Class<T> clazz) {
        return fromJson(source, clazz, clazz.getClassLoader());
    }

    default <T> T fromJson(InputStream source, TypeTag<T> typeTag) {
        return fromJson(source, typeTag, typeTag.getClassLoader());
    }
}
