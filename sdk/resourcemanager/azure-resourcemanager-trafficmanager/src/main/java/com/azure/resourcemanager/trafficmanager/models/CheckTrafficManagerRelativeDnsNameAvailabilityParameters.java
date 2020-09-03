// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CheckTrafficManagerRelativeDnsNameAvailabilityParameters model. */
public final class CheckTrafficManagerRelativeDnsNameAvailabilityParameters {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(CheckTrafficManagerRelativeDnsNameAvailabilityParameters.class);

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the CheckTrafficManagerRelativeDnsNameAvailabilityParameters object itself.
     */
    public CheckTrafficManagerRelativeDnsNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource.
     *
     * @param type the type value to set.
     * @return the CheckTrafficManagerRelativeDnsNameAvailabilityParameters object itself.
     */
    public CheckTrafficManagerRelativeDnsNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
