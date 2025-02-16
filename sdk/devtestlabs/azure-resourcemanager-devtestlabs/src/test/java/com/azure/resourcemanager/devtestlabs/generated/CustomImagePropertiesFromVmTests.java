// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesFromVm;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsInfo;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsState;
import com.azure.resourcemanager.devtestlabs.models.WindowsOsInfo;
import com.azure.resourcemanager.devtestlabs.models.WindowsOsState;
import org.junit.jupiter.api.Assertions;

public final class CustomImagePropertiesFromVmTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomImagePropertiesFromVm model =
            BinaryData
                .fromString(
                    "{\"sourceVmId\":\"xcyjmoadsuvarmy\",\"windowsOsInfo\":{\"windowsOsState\":\"SysprepRequested\"},\"linuxOsInfo\":{\"linuxOsState\":\"NonDeprovisioned\"}}")
                .toObject(CustomImagePropertiesFromVm.class);
        Assertions.assertEquals("xcyjmoadsuvarmy", model.sourceVmId());
        Assertions.assertEquals(WindowsOsState.SYSPREP_REQUESTED, model.windowsOsInfo().windowsOsState());
        Assertions.assertEquals(LinuxOsState.NON_DEPROVISIONED, model.linuxOsInfo().linuxOsState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomImagePropertiesFromVm model =
            new CustomImagePropertiesFromVm()
                .withSourceVmId("xcyjmoadsuvarmy")
                .withWindowsOsInfo(new WindowsOsInfo().withWindowsOsState(WindowsOsState.SYSPREP_REQUESTED))
                .withLinuxOsInfo(new LinuxOsInfo().withLinuxOsState(LinuxOsState.NON_DEPROVISIONED));
        model = BinaryData.fromObject(model).toObject(CustomImagePropertiesFromVm.class);
        Assertions.assertEquals("xcyjmoadsuvarmy", model.sourceVmId());
        Assertions.assertEquals(WindowsOsState.SYSPREP_REQUESTED, model.windowsOsInfo().windowsOsState());
        Assertions.assertEquals(LinuxOsState.NON_DEPROVISIONED, model.linuxOsInfo().linuxOsState());
    }
}
