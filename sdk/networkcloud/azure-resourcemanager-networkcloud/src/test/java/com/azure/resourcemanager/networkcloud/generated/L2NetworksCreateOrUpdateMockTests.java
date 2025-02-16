// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.L2Network;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class L2NetworksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"xls\",\"type\":\"ihmxrfdsajredn\"},\"properties\":{\"clusterId\":\"yshtuwgmev\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"wzyif\",\"hybridAksClustersAssociatedIds\":[\"wltxeqipxgzdyims\",\"ayorprav\",\"jogeslabnsmjkwyn\"],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"kqsykvwjtqpke\",\"l2IsolationDomainId\":\"myltj\",\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[\"klurccl\",\"gxannnoytzposewx\",\"gpxvkqmaupxvpi\",\"dfaifyzyzeyuube\"]},\"location\":\"szlfyt\",\"tags\":{\"hoynk\":\"hgygvfltgvd\",\"nn\":\"xwetwkdrcyrucpc\",\"odnaienhqhskndn\":\"zdqumoe\",\"anniyopetxivcnr\":\"lqkaadlknwf\"},\"id\":\"yxnu\",\"name\":\"aephblkw\",\"type\":\"pat\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        L2Network response =
            manager
                .l2Networks()
                .define("atbwbqam")
                .withRegion("sxwwhnhjtf")
                .withExistingResourceGroup("v")
                .withExtendedLocation(new ExtendedLocation().withName("e").withType("liys"))
                .withL2IsolationDomainId("hycvdimwrzre")
                .withTags(mapOf("ynudqllzsa", "dpmiljpn"))
                .withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                .withInterfaceName("xn")
                .create();

        Assertions.assertEquals("szlfyt", response.location());
        Assertions.assertEquals("hgygvfltgvd", response.tags().get("hoynk"));
        Assertions.assertEquals("xls", response.extendedLocation().name());
        Assertions.assertEquals("ihmxrfdsajredn", response.extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, response.hybridAksPluginType());
        Assertions.assertEquals("kqsykvwjtqpke", response.interfaceName());
        Assertions.assertEquals("myltj", response.l2IsolationDomainId());
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
