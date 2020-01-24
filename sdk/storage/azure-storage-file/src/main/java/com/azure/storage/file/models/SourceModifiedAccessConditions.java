// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for uploadRangeFromURL operation.
 */
@JacksonXmlRootElement(localName = "source-modified-access-conditions")
@Fluent
public final class SourceModifiedAccessConditions {
    /*
     * Specify the crc64 value to operate only on range with a matching crc64
     * checksum.
     */
    @JsonProperty(value = "sourceIfMatchCrc64")
    private byte[] sourceIfMatchCrc64;

    /*
     * Specify the crc64 value to operate only on range without a matching
     * crc64 checksum.
     */
    @JsonProperty(value = "sourceIfNoneMatchCrc64")
    private byte[] sourceIfNoneMatchCrc64;

    /**
     * Get the sourceIfMatchCrc64 property: Specify the crc64 value to operate
     * only on range with a matching crc64 checksum.
     *
     * @return the sourceIfMatchCrc64 value.
     */
    public byte[] getSourceIfMatchCrc64() {
        return ImplUtils.clone(this.sourceIfMatchCrc64);
    }

    /**
     * Set the sourceIfMatchCrc64 property: Specify the crc64 value to operate
     * only on range with a matching crc64 checksum.
     *
     * @param sourceIfMatchCrc64 the sourceIfMatchCrc64 value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions setSourceIfMatchCrc64(byte[] sourceIfMatchCrc64) {
        this.sourceIfMatchCrc64 = ImplUtils.clone(sourceIfMatchCrc64);
        return this;
    }

    /**
     * Get the sourceIfNoneMatchCrc64 property: Specify the crc64 value to
     * operate only on range without a matching crc64 checksum.
     *
     * @return the sourceIfNoneMatchCrc64 value.
     */
    public byte[] getSourceIfNoneMatchCrc64() {
        return ImplUtils.clone(this.sourceIfNoneMatchCrc64);
    }

    /**
     * Set the sourceIfNoneMatchCrc64 property: Specify the crc64 value to
     * operate only on range without a matching crc64 checksum.
     *
     * @param sourceIfNoneMatchCrc64 the sourceIfNoneMatchCrc64 value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions setSourceIfNoneMatchCrc64(byte[] sourceIfNoneMatchCrc64) {
        this.sourceIfNoneMatchCrc64 = ImplUtils.clone(sourceIfNoneMatchCrc64);
        return this;
    }
}