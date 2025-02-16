// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class AvailableWorkloadProfileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableWorkloadProfileInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"fbowskanyk\",\"properties\":{\"category\":\"cuiywgqyw\",\"applicability\":\"LocationDefault\",\"cores\":974991639,\"memoryGiB\":1069077696,\"displayName\":\"zgpphrcgyncocpe\"},\"id\":\"vmmcoofs\",\"name\":\"lzevgbmqjqab\",\"type\":\"y\"}")
                .toObject(AvailableWorkloadProfileInner.class);
        Assertions.assertEquals("fbowskanyk", model.location());
        Assertions.assertEquals("cuiywgqyw", model.properties().category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.properties().applicability());
        Assertions.assertEquals(974991639, model.properties().cores());
        Assertions.assertEquals(1069077696, model.properties().memoryGiB());
        Assertions.assertEquals("zgpphrcgyncocpe", model.properties().displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableWorkloadProfileInner model =
            new AvailableWorkloadProfileInner()
                .withLocation("fbowskanyk")
                .withProperties(
                    new AvailableWorkloadProfileProperties()
                        .withCategory("cuiywgqyw")
                        .withApplicability(Applicability.LOCATION_DEFAULT)
                        .withCores(974991639)
                        .withMemoryGiB(1069077696)
                        .withDisplayName("zgpphrcgyncocpe"));
        model = BinaryData.fromObject(model).toObject(AvailableWorkloadProfileInner.class);
        Assertions.assertEquals("fbowskanyk", model.location());
        Assertions.assertEquals("cuiywgqyw", model.properties().category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.properties().applicability());
        Assertions.assertEquals(974991639, model.properties().cores());
        Assertions.assertEquals(1069077696, model.properties().memoryGiB());
        Assertions.assertEquals("zgpphrcgyncocpe", model.properties().displayName());
    }
}
