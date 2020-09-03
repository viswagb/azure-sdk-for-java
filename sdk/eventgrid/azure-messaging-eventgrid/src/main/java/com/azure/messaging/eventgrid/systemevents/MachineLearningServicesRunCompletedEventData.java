// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MachineLearningServicesRunCompletedEventData model. */
@Fluent
public final class MachineLearningServicesRunCompletedEventData {
    /*
     * The ID of the experiment that the run belongs to.
     */
    @JsonProperty(value = "experimentId")
    private String experimentId;

    /*
     * The name of the experiment that the run belongs to.
     */
    @JsonProperty(value = "experimentName")
    private String experimentName;

    /*
     * The ID of the Run that was completed.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /*
     * The Run Type of the completed Run.
     */
    @JsonProperty(value = "runType")
    private String runType;

    /*
     * The tags of the completed Run.
     */
    @JsonProperty(value = "runTags")
    private Object runTags;

    /*
     * The properties of the completed Run.
     */
    @JsonProperty(value = "runProperties")
    private Object runProperties;

    /**
     * Get the experimentId property: The ID of the experiment that the run belongs to.
     *
     * @return the experimentId value.
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * Set the experimentId property: The ID of the experiment that the run belongs to.
     *
     * @param experimentId the experimentId value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * Get the experimentName property: The name of the experiment that the run belongs to.
     *
     * @return the experimentName value.
     */
    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: The name of the experiment that the run belongs to.
     *
     * @param experimentName the experimentName value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the runId property: The ID of the Run that was completed.
     *
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: The ID of the Run that was completed.
     *
     * @param runId the runId value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the runType property: The Run Type of the completed Run.
     *
     * @return the runType value.
     */
    public String getRunType() {
        return this.runType;
    }

    /**
     * Set the runType property: The Run Type of the completed Run.
     *
     * @param runType the runType value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunType(String runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the runTags property: The tags of the completed Run.
     *
     * @return the runTags value.
     */
    public Object getRunTags() {
        return this.runTags;
    }

    /**
     * Set the runTags property: The tags of the completed Run.
     *
     * @param runTags the runTags value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunTags(Object runTags) {
        this.runTags = runTags;
        return this;
    }

    /**
     * Get the runProperties property: The properties of the completed Run.
     *
     * @return the runProperties value.
     */
    public Object getRunProperties() {
        return this.runProperties;
    }

    /**
     * Set the runProperties property: The properties of the completed Run.
     *
     * @param runProperties the runProperties value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunProperties(Object runProperties) {
        this.runProperties = runProperties;
        return this;
    }
}
