// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageBlobCreatedEventData model. */
@Fluent
public final class StorageBlobCreatedEventData {
    /*
     * The name of the API/operation that triggered this event.
     */
    @JsonProperty(value = "api")
    private String api;

    /*
     * A request id provided by the client of the storage API operation that
     * triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * The request id generated by the Storage service for the storage API
     * operation that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /*
     * The etag of the blob at the time this event was triggered.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /*
     * The content type of the blob. This is the same as what would be returned
     * in the Content-Type header from the blob.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * The size of the blob in bytes. This is the same as what would be
     * returned in the Content-Length header from the blob.
     */
    @JsonProperty(value = "contentLength")
    private Long contentLength;

    /*
     * The offset of the blob in bytes.
     */
    @JsonProperty(value = "contentOffset")
    private Long contentOffset;

    /*
     * The type of blob.
     */
    @JsonProperty(value = "blobType")
    private String blobType;

    /*
     * The path to the blob.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * An opaque string value representing the logical sequence of events for
     * any particular blob name. Users can use standard string comparison to
     * understand the relative sequence of two events on the same blob name.
     */
    @JsonProperty(value = "sequencer")
    private String sequencer;

    /*
     * The identity of the requester that triggered this event.
     */
    @JsonProperty(value = "identity")
    private String identity;

    /*
     * For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     */
    @JsonProperty(value = "storageDiagnostics")
    private Object storageDiagnostics;

    /**
     * Get the api property: The name of the API/operation that triggered this event.
     *
     * @return the api value.
     */
    public String getApi() {
        return this.api;
    }

    /**
     * Set the api property: The name of the API/operation that triggered this event.
     *
     * @param api the api value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * Get the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the Storage service for the storage API operation that
     * triggered this event.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the Storage service for the storage API operation that
     * triggered this event.
     *
     * @param requestId the requestId value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the eTag property: The etag of the blob at the time this event was triggered.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The etag of the blob at the time this event was triggered.
     *
     * @param eTag the eTag value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentType property: The content type of the blob. This is the same as what would be returned in the
     * Content-Type header from the blob.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of the blob. This is the same as what would be returned in the
     * Content-Type header from the blob.
     *
     * @param contentType the contentType value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLength property: The size of the blob in bytes. This is the same as what would be returned in the
     * Content-Length header from the blob.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the blob in bytes. This is the same as what would be returned in the
     * Content-Length header from the blob.
     *
     * @param contentLength the contentLength value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentOffset property: The offset of the blob in bytes.
     *
     * @return the contentOffset value.
     */
    public Long getContentOffset() {
        return this.contentOffset;
    }

    /**
     * Set the contentOffset property: The offset of the blob in bytes.
     *
     * @param contentOffset the contentOffset value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setContentOffset(Long contentOffset) {
        this.contentOffset = contentOffset;
        return this;
    }

    /**
     * Get the blobType property: The type of blob.
     *
     * @return the blobType value.
     */
    public String getBlobType() {
        return this.blobType;
    }

    /**
     * Set the blobType property: The type of blob.
     *
     * @param blobType the blobType value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setBlobType(String blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the url property: The path to the blob.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The path to the blob.
     *
     * @param url the url value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * blob name. Users can use standard string comparison to understand the relative sequence of two events on the same
     * blob name.
     *
     * @return the sequencer value.
     */
    public String getSequencer() {
        return this.sequencer;
    }

    /**
     * Set the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * blob name. Users can use standard string comparison to understand the relative sequence of two events on the same
     * blob name.
     *
     * @param sequencer the sequencer value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setSequencer(String sequencer) {
        this.sequencer = sequencer;
        return this;
    }

    /**
     * Get the identity property: The identity of the requester that triggered this event.
     *
     * @return the identity value.
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the requester that triggered this event.
     *
     * @param identity the identity value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     *
     * @return the storageDiagnostics value.
     */
    public Object getStorageDiagnostics() {
        return this.storageDiagnostics;
    }

    /**
     * Set the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     *
     * @param storageDiagnostics the storageDiagnostics value to set.
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData setStorageDiagnostics(Object storageDiagnostics) {
        this.storageDiagnostics = storageDiagnostics;
        return this;
    }
}
