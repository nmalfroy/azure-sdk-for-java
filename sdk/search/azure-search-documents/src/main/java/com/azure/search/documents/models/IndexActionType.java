// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

/** The operation to perform on a document in an indexing batch. */
public enum IndexActionType {
    /**
     * Inserts the document into the index if it is new and updates it if it exists. All fields are replaced in the
     * update case.
     */
    UPLOAD("upload"),

    /**
     * Merges the specified field values with an existing document. If the document does not exist, the merge will fail.
     * Any field you specify in a merge will replace the existing field in the document. This also applies to
     * collections of primitive and complex types.
     */
    MERGE("merge"),

    /**
     * Behaves like merge if a document with the given key already exists in the index. If the document does not exist,
     * it behaves like upload with a new document.
     */
    MERGE_OR_UPLOAD("mergeOrUpload"),

    /**
     * Removes the specified document from the index. Any field you specify in a delete operation other than the key
     * field will be ignored. If you want to remove an individual field from a document, use merge instead and set the
     * field explicitly to null.
     */
    DELETE("delete");

    /** The actual serialized value for a IndexActionType instance. */
    private final String value;

    IndexActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IndexActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IndexActionType object, or null if unable to parse.
     */
    public static IndexActionType fromString(String value) {
        if (value == null) {
            return null;
        }
        IndexActionType[] items = IndexActionType.values();
        for (IndexActionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
