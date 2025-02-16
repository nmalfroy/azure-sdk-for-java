// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Fail activity properties. */
@Fluent
public final class FailActivityTypeProperties {
    /*
     * The error message that surfaced in the Fail activity. It can be dynamic content that's evaluated to a non
     * empty/blank string at runtime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "message", required = true)
    private Object message;

    /*
     * The error code that categorizes the error type of the Fail activity. It can be dynamic content that's evaluated
     * to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "errorCode", required = true)
    private Object errorCode;

    /** Creates an instance of FailActivityTypeProperties class. */
    public FailActivityTypeProperties() {
    }

    /**
     * Get the message property: The error message that surfaced in the Fail activity. It can be dynamic content that's
     * evaluated to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     *
     * @return the message value.
     */
    public Object message() {
        return this.message;
    }

    /**
     * Set the message property: The error message that surfaced in the Fail activity. It can be dynamic content that's
     * evaluated to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     *
     * @param message the message value to set.
     * @return the FailActivityTypeProperties object itself.
     */
    public FailActivityTypeProperties withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorCode property: The error code that categorizes the error type of the Fail activity. It can be
     * dynamic content that's evaluated to a non empty/blank string at runtime. Type: string (or Expression with
     * resultType string).
     *
     * @return the errorCode value.
     */
    public Object errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The error code that categorizes the error type of the Fail activity. It can be
     * dynamic content that's evaluated to a non empty/blank string at runtime. Type: string (or Expression with
     * resultType string).
     *
     * @param errorCode the errorCode value to set.
     * @return the FailActivityTypeProperties object itself.
     */
    public FailActivityTypeProperties withErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (message() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property message in model FailActivityTypeProperties"));
        }
        if (errorCode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property errorCode in model FailActivityTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FailActivityTypeProperties.class);
}
