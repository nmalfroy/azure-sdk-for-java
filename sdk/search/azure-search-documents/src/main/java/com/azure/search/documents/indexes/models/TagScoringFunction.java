// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Defines a function that boosts scores of documents with string values matching a given list of tags. */
@Fluent
public final class TagScoringFunction extends ScoringFunction {
    /*
     * Indicates the type of function to use. Valid values include magnitude, freshness, distance, and tag. The
     * function type must be lower case.
     */
    private static final String TYPE = "tag";

    /*
     * Parameter values for the tag scoring function.
     */
    private final TagScoringParameters parameters;

    /**
     * Creates an instance of TagScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     * @param parameters the parameters value to set.
     */
    public TagScoringFunction(String fieldName, double boost, TagScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the tag scoring function.
     *
     * @return the parameters value.
     */
    public TagScoringParameters getParameters() {
        return this.parameters;
    }

    /** {@inheritDoc} */
    @Override
    public TagScoringFunction setInterpolation(ScoringFunctionInterpolation interpolation) {
        super.setInterpolation(interpolation);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", TYPE);
        jsonWriter.writeStringField("fieldName", getFieldName());
        jsonWriter.writeDoubleField("boost", getBoost());
        jsonWriter.writeStringField("interpolation", Objects.toString(getInterpolation(), null));
        jsonWriter.writeJsonField("tag", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagScoringFunction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagScoringFunction if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the TagScoringFunction.
     */
    public static TagScoringFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean fieldNameFound = false;
                    String fieldName = null;
                    boolean boostFound = false;
                    double boost = 0.0;
                    ScoringFunctionInterpolation interpolation = null;
                    boolean parametersFound = false;
                    TagScoringParameters parameters = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String jsonFieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("type".equals(jsonFieldName)) {
                            String type = reader.getString();
                            if (!TYPE.equals(type)) {
                                throw new IllegalStateException(
                                        "'type' was expected to be non-null and equal to '"
                                                + TYPE
                                                + "'. The found 'type' was '"
                                                + type
                                                + "'.");
                            }
                        } else if ("fieldName".equals(jsonFieldName)) {
                            fieldName = reader.getString();
                            fieldNameFound = true;
                        } else if ("boost".equals(jsonFieldName)) {
                            boost = reader.getDouble();
                            boostFound = true;
                        } else if ("interpolation".equals(jsonFieldName)) {
                            interpolation = ScoringFunctionInterpolation.fromString(reader.getString());
                        } else if ("tag".equals(jsonFieldName)) {
                            parameters = TagScoringParameters.fromJson(reader);
                            parametersFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (fieldNameFound && boostFound && parametersFound) {
                        TagScoringFunction deserializedTagScoringFunction =
                                new TagScoringFunction(fieldName, boost, parameters);
                        deserializedTagScoringFunction.setInterpolation(interpolation);

                        return deserializedTagScoringFunction;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!fieldNameFound) {
                        missingProperties.add("fieldName");
                    }
                    if (!boostFound) {
                        missingProperties.add("boost");
                    }
                    if (!parametersFound) {
                        missingProperties.add("tag");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
