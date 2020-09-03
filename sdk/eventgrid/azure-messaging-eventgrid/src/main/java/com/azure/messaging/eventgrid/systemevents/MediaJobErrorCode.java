// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MediaJobErrorCode. */
public enum MediaJobErrorCode {
    /** Enum value ServiceError. */
    SERVICE_ERROR("ServiceError"),

    /** Enum value ServiceTransientError. */
    SERVICE_TRANSIENT_ERROR("ServiceTransientError"),

    /** Enum value DownloadNotAccessible. */
    DOWNLOAD_NOT_ACCESSIBLE("DownloadNotAccessible"),

    /** Enum value DownloadTransientError. */
    DOWNLOAD_TRANSIENT_ERROR("DownloadTransientError"),

    /** Enum value UploadNotAccessible. */
    UPLOAD_NOT_ACCESSIBLE("UploadNotAccessible"),

    /** Enum value UploadTransientError. */
    UPLOAD_TRANSIENT_ERROR("UploadTransientError"),

    /** Enum value ConfigurationUnsupported. */
    CONFIGURATION_UNSUPPORTED("ConfigurationUnsupported"),

    /** Enum value ContentMalformed. */
    CONTENT_MALFORMED("ContentMalformed"),

    /** Enum value ContentUnsupported. */
    CONTENT_UNSUPPORTED("ContentUnsupported");

    /** The actual serialized value for a MediaJobErrorCode instance. */
    private final String value;

    MediaJobErrorCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MediaJobErrorCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MediaJobErrorCode object, or null if unable to parse.
     */
    @JsonCreator
    public static MediaJobErrorCode fromString(String value) {
        MediaJobErrorCode[] items = MediaJobErrorCode.values();
        for (MediaJobErrorCode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
