/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filter expression to be used in the report.
 */
public class ReportConfigFilter {
    /**
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<ReportConfigFilter> and;

    /**
     * The logical "OR" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "or")
    private List<ReportConfigFilter> or;

    /**
     * The logical "NOT" expression.
     */
    @JsonProperty(value = "not")
    private ReportConfigFilter not;

    /**
     * Has comparison expression for a dimension.
     */
    @JsonProperty(value = "dimension")
    private ReportConfigComparisonExpression dimension;

    /**
     * Has comparison expression for a tag.
     */
    @JsonProperty(value = "tag")
    private ReportConfigComparisonExpression tag;

    /**
     * Get the logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value
     */
    public List<ReportConfigFilter> and() {
        return this.and;
    }

    /**
     * Set the logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withAnd(List<ReportConfigFilter> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the logical "OR" expression. Must have at least 2 items.
     *
     * @return the or value
     */
    public List<ReportConfigFilter> or() {
        return this.or;
    }

    /**
     * Set the logical "OR" expression. Must have at least 2 items.
     *
     * @param or the or value to set
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withOr(List<ReportConfigFilter> or) {
        this.or = or;
        return this;
    }

    /**
     * Get the logical "NOT" expression.
     *
     * @return the not value
     */
    public ReportConfigFilter not() {
        return this.not;
    }

    /**
     * Set the logical "NOT" expression.
     *
     * @param not the not value to set
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withNot(ReportConfigFilter not) {
        this.not = not;
        return this;
    }

    /**
     * Get has comparison expression for a dimension.
     *
     * @return the dimension value
     */
    public ReportConfigComparisonExpression dimension() {
        return this.dimension;
    }

    /**
     * Set has comparison expression for a dimension.
     *
     * @param dimension the dimension value to set
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withDimension(ReportConfigComparisonExpression dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get has comparison expression for a tag.
     *
     * @return the tag value
     */
    public ReportConfigComparisonExpression tag() {
        return this.tag;
    }

    /**
     * Set has comparison expression for a tag.
     *
     * @param tag the tag value to set
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withTag(ReportConfigComparisonExpression tag) {
        this.tag = tag;
        return this;
    }

}
