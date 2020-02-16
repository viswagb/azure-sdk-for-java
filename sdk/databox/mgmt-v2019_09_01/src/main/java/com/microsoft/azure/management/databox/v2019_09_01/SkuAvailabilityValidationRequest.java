/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request to validate sku availability.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = SkuAvailabilityValidationRequest.class)
@JsonTypeName("ValidateSkuAvailability")
public class SkuAvailabilityValidationRequest extends ValidationInputRequest {
    /**
     * Device type to be used for the job. Possible values include: 'DataBox',
     * 'DataBoxDisk', 'DataBoxHeavy'.
     */
    @JsonProperty(value = "deviceType", required = true)
    private SkuName deviceType;

    /**
     * Type of the transfer.
     */
    @JsonProperty(value = "transferType", required = true)
    private String transferType;

    /**
     * ISO country code. Country for hardware shipment. For codes check:
     * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * Location for data transfer. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Creates an instance of SkuAvailabilityValidationRequest class.
     * @param deviceType device type to be used for the job. Possible values include: 'DataBox', 'DataBoxDisk', 'DataBoxHeavy'.
     * @param country iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     * @param location location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     */
    public SkuAvailabilityValidationRequest() {
        transferType = "ImportToAzure";
    }

    /**
     * Get device type to be used for the job. Possible values include: 'DataBox', 'DataBoxDisk', 'DataBoxHeavy'.
     *
     * @return the deviceType value
     */
    public SkuName deviceType() {
        return this.deviceType;
    }

    /**
     * Set device type to be used for the job. Possible values include: 'DataBox', 'DataBoxDisk', 'DataBoxHeavy'.
     *
     * @param deviceType the deviceType value to set
     * @return the SkuAvailabilityValidationRequest object itself.
     */
    public SkuAvailabilityValidationRequest withDeviceType(SkuName deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get type of the transfer.
     *
     * @return the transferType value
     */
    public String transferType() {
        return this.transferType;
    }

    /**
     * Set type of the transfer.
     *
     * @param transferType the transferType value to set
     * @return the SkuAvailabilityValidationRequest object itself.
     */
    public SkuAvailabilityValidationRequest withTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @param country the country value to set
     * @return the SkuAvailabilityValidationRequest object itself.
     */
    public SkuAvailabilityValidationRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @param location the location value to set
     * @return the SkuAvailabilityValidationRequest object itself.
     */
    public SkuAvailabilityValidationRequest withLocation(String location) {
        this.location = location;
        return this;
    }

}