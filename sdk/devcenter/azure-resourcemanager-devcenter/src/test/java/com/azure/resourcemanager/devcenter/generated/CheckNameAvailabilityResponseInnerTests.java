// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.devcenter.models.CheckNameAvailabilityReason;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResponseInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"aakc\"}")
                .toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("aakc", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResponseInner model =
            new CheckNameAvailabilityResponseInner()
                .withNameAvailable(false)
                .withReason(CheckNameAvailabilityReason.INVALID)
                .withMessage("aakc");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("aakc", model.message());
    }
}
