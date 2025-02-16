// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeInnerTests {
    @Test
    public void testDeserialize() {
        VolumeInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"volumeId\":\"mi\",\"creationData\":{\"createSource\":\"None\",\"sourceUri\":\"rvqdra\"},\"sizeGiB\":6644182027847311754,\"storageTarget\":{\"targetIqn\":\"gehoqfbowskany\",\"targetPortalHostname\":\"zlcuiywgqywgndrv\",\"targetPortalPort\":2138839355,\"provisioningState\":\"Pending\",\"status\":\"Updating\"}},\"tags\":{\"ofsx\":\"gyncocpecfvmmc\",\"qjqabcypmivkwl\":\"zevgb\",\"wnfnbacf\":\"uvcc\"},\"id\":\"onlebxetqgtzxdpn\",\"name\":\"bqqwxrj\",\"type\":\"eallnwsubisnj\"}")
                .toObject(VolumeInner.class);
        Assertions.assertEquals("gyncocpecfvmmc", model.tags().get("ofsx"));
        Assertions.assertEquals(VolumeCreateOption.NONE, model.creationData().createSource());
        Assertions.assertEquals("rvqdra", model.creationData().sourceUri());
        Assertions.assertEquals(6644182027847311754L, model.sizeGiB());
    }

    @Test
    public void testSerialize() {
        VolumeInner model =
            new VolumeInner()
                .withTags(mapOf("ofsx", "gyncocpecfvmmc", "qjqabcypmivkwl", "zevgb", "wnfnbacf", "uvcc"))
                .withCreationData(
                    new SourceCreationData().withCreateSource(VolumeCreateOption.NONE).withSourceUri("rvqdra"))
                .withSizeGiB(6644182027847311754L);
        model = BinaryData.fromObject(model).toObject(VolumeInner.class);
        Assertions.assertEquals("gyncocpecfvmmc", model.tags().get("ofsx"));
        Assertions.assertEquals(VolumeCreateOption.NONE, model.creationData().createSource());
        Assertions.assertEquals("rvqdra", model.creationData().sourceUri());
        Assertions.assertEquals(6644182027847311754L, model.sizeGiB());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
