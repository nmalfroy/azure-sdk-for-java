// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contract model of an ACS call participant. */
@Fluent
public final class CallParticipantInternal {
    /*
     * Communication identifier of the participant
     */
    @JsonProperty(value = "identifier")
    private CommunicationIdentifierModel identifier;

    /*
     * Is participant muted
     */
    @JsonProperty(value = "isMuted")
    private Boolean isMuted;

    /**
     * Get the identifier property: Communication identifier of the participant.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Communication identifier of the participant.
     *
     * @param identifier the identifier value to set.
     * @return the CallParticipantInternal object itself.
     */
    public CallParticipantInternal setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the isMuted property: Is participant muted.
     *
     * @return the isMuted value.
     */
    public Boolean isMuted() {
        return this.isMuted;
    }

    /**
     * Set the isMuted property: Is participant muted.
     *
     * @param isMuted the isMuted value to set.
     * @return the CallParticipantInternal object itself.
     */
    public CallParticipantInternal setIsMuted(Boolean isMuted) {
        this.isMuted = isMuted;
        return this;
    }
}
