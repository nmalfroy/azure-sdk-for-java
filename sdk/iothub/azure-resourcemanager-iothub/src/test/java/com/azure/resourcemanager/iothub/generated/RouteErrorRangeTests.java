// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RouteErrorPosition;
import com.azure.resourcemanager.iothub.models.RouteErrorRange;
import org.junit.jupiter.api.Assertions;

public final class RouteErrorRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RouteErrorRange model =
            BinaryData
                .fromString(
                    "{\"start\":{\"line\":900444322,\"column\":1157139188},\"end\":{\"line\":2137392775,\"column\":1769895546}}")
                .toObject(RouteErrorRange.class);
        Assertions.assertEquals(900444322, model.start().line());
        Assertions.assertEquals(1157139188, model.start().column());
        Assertions.assertEquals(2137392775, model.end().line());
        Assertions.assertEquals(1769895546, model.end().column());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RouteErrorRange model =
            new RouteErrorRange()
                .withStart(new RouteErrorPosition().withLine(900444322).withColumn(1157139188))
                .withEnd(new RouteErrorPosition().withLine(2137392775).withColumn(1769895546));
        model = BinaryData.fromObject(model).toObject(RouteErrorRange.class);
        Assertions.assertEquals(900444322, model.start().line());
        Assertions.assertEquals(1157139188, model.start().column());
        Assertions.assertEquals(2137392775, model.end().line());
        Assertions.assertEquals(1769895546, model.end().column());
    }
}
