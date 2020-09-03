// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ContainerRegistryEventData model. */
@Fluent
public class ContainerRegistryEventData {
    /*
     * The event ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The time at which the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The action that encompasses the provided event.
     */
    @JsonProperty(value = "action")
    private String action;

    /*
     * The target of the event.
     */
    @JsonProperty(value = "target")
    private ContainerRegistryEventTarget target;

    /*
     * The request that generated the event.
     */
    @JsonProperty(value = "request")
    private ContainerRegistryEventRequest request;

    /*
     * The agent that initiated the event. For most situations, this could be
     * from the authorization context of the request.
     */
    @JsonProperty(value = "actor")
    private ContainerRegistryEventActor actor;

    /*
     * The registry node that generated the event. Put differently, while the
     * actor initiates the event, the source generates it.
     */
    @JsonProperty(value = "source")
    private ContainerRegistryEventSource source;

    /**
     * Get the id property: The event ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The event ID.
     *
     * @param id the id value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the timestamp property: The time at which the event occurred.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time at which the event occurred.
     *
     * @param timestamp the timestamp value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the action property: The action that encompasses the provided event.
     *
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action that encompasses the provided event.
     *
     * @param action the action value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the target property: The target of the event.
     *
     * @return the target value.
     */
    public ContainerRegistryEventTarget getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target of the event.
     *
     * @param target the target value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setTarget(ContainerRegistryEventTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get the request property: The request that generated the event.
     *
     * @return the request value.
     */
    public ContainerRegistryEventRequest getRequest() {
        return this.request;
    }

    /**
     * Set the request property: The request that generated the event.
     *
     * @param request the request value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setRequest(ContainerRegistryEventRequest request) {
        this.request = request;
        return this;
    }

    /**
     * Get the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @return the actor value.
     */
    public ContainerRegistryEventActor getActor() {
        return this.actor;
    }

    /**
     * Set the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @param actor the actor value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setActor(ContainerRegistryEventActor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @return the source value.
     */
    public ContainerRegistryEventSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @param source the source value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    public ContainerRegistryEventData setSource(ContainerRegistryEventSource source) {
        this.source = source;
        return this;
    }
}
