// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.Office365PolicyProperties;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Appliance Site resource. */
@Fluent
public final class VirtualApplianceSiteInner extends SubResource {
    /*
     * The properties of the Virtual Appliance Sites.
     */
    @JsonProperty(value = "properties")
    private VirtualApplianceSiteProperties innerProperties;

    /*
     * Name of the virtual appliance site.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Site type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of VirtualApplianceSiteInner class. */
    public VirtualApplianceSiteInner() {
    }

    /**
     * Get the innerProperties property: The properties of the Virtual Appliance Sites.
     *
     * @return the innerProperties value.
     */
    private VirtualApplianceSiteProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the virtual appliance site.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the virtual appliance site.
     *
     * @param name the name value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Site type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualApplianceSiteInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: Address Prefix.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualApplianceSiteProperties();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the o365Policy property: Office 365 Policy.
     *
     * @return the o365Policy value.
     */
    public Office365PolicyProperties o365Policy() {
        return this.innerProperties() == null ? null : this.innerProperties().o365Policy();
    }

    /**
     * Set the o365Policy property: Office 365 Policy.
     *
     * @param o365Policy the o365Policy value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withO365Policy(Office365PolicyProperties o365Policy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualApplianceSiteProperties();
        }
        this.innerProperties().withO365Policy(o365Policy);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
