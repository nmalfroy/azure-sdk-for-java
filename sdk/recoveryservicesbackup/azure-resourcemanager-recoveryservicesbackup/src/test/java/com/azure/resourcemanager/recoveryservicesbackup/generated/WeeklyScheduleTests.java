// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklySchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WeeklyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeeklySchedule model =
            BinaryData
                .fromString(
                    "{\"scheduleRunDays\":[\"Saturday\"],\"scheduleRunTimes\":[\"2021-04-08T20:14:46Z\",\"2021-06-10T08:41:51Z\",\"2021-04-22T13:36Z\",\"2021-06-17T22:27:31Z\"]}")
                .toObject(WeeklySchedule.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-08T20:14:46Z"), model.scheduleRunTimes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeeklySchedule model =
            new WeeklySchedule()
                .withScheduleRunDays(Arrays.asList(DayOfWeek.SATURDAY))
                .withScheduleRunTimes(
                    Arrays
                        .asList(
                            OffsetDateTime.parse("2021-04-08T20:14:46Z"),
                            OffsetDateTime.parse("2021-06-10T08:41:51Z"),
                            OffsetDateTime.parse("2021-04-22T13:36Z"),
                            OffsetDateTime.parse("2021-06-17T22:27:31Z")));
        model = BinaryData.fromObject(model).toObject(WeeklySchedule.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-08T20:14:46Z"), model.scheduleRunTimes().get(0));
    }
}
