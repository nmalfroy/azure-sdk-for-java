// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureResourceProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureResourceProtectionIntentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureResourceProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"AzureResourceItem\",\"friendlyName\":\"asunwqrjzfrgq\",\"backupManagementType\":\"AzureBackupServer\",\"sourceResourceId\":\"cmbuocnjrohmbpy\",\"itemId\":\"xameblydyvkfkm\",\"policyId\":\"cxneh\",\"protectionState\":\"Invalid\"}")
                .toObject(AzureResourceProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("cmbuocnjrohmbpy", model.sourceResourceId());
        Assertions.assertEquals("xameblydyvkfkm", model.itemId());
        Assertions.assertEquals("cxneh", model.policyId());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("asunwqrjzfrgq", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureResourceProtectionIntent model =
            new AzureResourceProtectionIntent()
                .withBackupManagementType(BackupManagementType.AZURE_BACKUP_SERVER)
                .withSourceResourceId("cmbuocnjrohmbpy")
                .withItemId("xameblydyvkfkm")
                .withPolicyId("cxneh")
                .withProtectionState(ProtectionStatus.INVALID)
                .withFriendlyName("asunwqrjzfrgq");
        model = BinaryData.fromObject(model).toObject(AzureResourceProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("cmbuocnjrohmbpy", model.sourceResourceId());
        Assertions.assertEquals("xameblydyvkfkm", model.itemId());
        Assertions.assertEquals("cxneh", model.policyId());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("asunwqrjzfrgq", model.friendlyName());
    }
}
