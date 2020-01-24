/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.SqlContainerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing SqlContainer.
 */
public interface SqlContainer extends HasInner<SqlContainerInner>, Indexable, Refreshable<SqlContainer>, Updatable<SqlContainer.Update>, HasManager<CosmosDBManager> {
    /**
     * @return the _etag value.
     */
    String _etag();

    /**
     * @return the _rid value.
     */
    String _rid();

    /**
     * @return the _ts value.
     */
    Object _ts();

    /**
     * @return the conflictResolutionPolicy value.
     */
    ConflictResolutionPolicy conflictResolutionPolicy();

    /**
     * @return the defaultTtl value.
     */
    Integer defaultTtl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the indexingPolicy value.
     */
    IndexingPolicy indexingPolicy();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partitionKey value.
     */
    ContainerPartitionKey partitionKey();

    /**
     * @return the sqlContainerId value.
     */
    String sqlContainerId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueKeyPolicy value.
     */
    UniqueKeyPolicy uniqueKeyPolicy();

    /**
     * The entirety of the SqlContainer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlContainer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlContainer definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the sqlcontainer definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, accountName, databaseName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @param databaseName Cosmos DB database name
            * @return the next definition stage
            */
            WithOptions withExistingDatabasis(String resourceGroupName, String accountName, String databaseName);
        }

        /**
         * The stage of the sqlcontainer definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(Map<String, String> options);
        }

        /**
         * The stage of the sqlcontainer definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a container
            * @return the next definition stage
            */
            WithCreate withResource(SqlContainerResource resource);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SqlContainer> {
        }
    }
    /**
     * The template for a SqlContainer update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlContainer> {
    }

    /**
     * Grouping of SqlContainer update stages.
     */
    interface UpdateStages {
    }
}