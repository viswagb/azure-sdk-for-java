/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the fallback route. IoT Hub uses these properties when it
 * routes messages to the fallback endpoint.
 */
public class FallbackRouteProperties {
    /**
     * The name of the route. The name can only include alphanumeric
     * characters, periods, underscores, hyphens, has a maximum length of 64
     * characters, and must be unique.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The source to which the routing rule is to be applied to. For example,
     * DeviceMessages.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /**
     * The condition which is evaluated in order to apply the fallback route.
     * If the condition is not provided it will evaluate to true by default.
     * For grammar, See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     */
    @JsonProperty(value = "condition")
    private String condition;

    /**
     * The list of endpoints to which the messages that satisfy the condition
     * are routed to. Currently only 1 endpoint is allowed.
     */
    @JsonProperty(value = "endpointNames", required = true)
    private List<String> endpointNames;

    /**
     * Used to specify whether the fallback route is enabled.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Creates an instance of FallbackRouteProperties class.
     * @param endpointNames the list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     * @param isEnabled used to specify whether the fallback route is enabled.
     */
    public FallbackRouteProperties() {
        source = "DeviceMessages";
    }

    /**
     * Get the name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     *
     * @param name the name value to set
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source to which the routing rule is to be applied to. For example, DeviceMessages.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source to which the routing rule is to be applied to. For example, DeviceMessages.
     *
     * @param source the source value to set
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     *
     * @return the condition value
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     *
     * @param condition the condition value to set
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     *
     * @return the endpointNames value
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     *
     * @param endpointNames the endpointNames value to set
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

    /**
     * Get used to specify whether the fallback route is enabled.
     *
     * @return the isEnabled value
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set used to specify whether the fallback route is enabled.
     *
     * @param isEnabled the isEnabled value to set
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

}