// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.plans

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalPlanIdServiceAsync {

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     */
    @JvmOverloads
    fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Plan>

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price). "
     */
    @JvmOverloads
    fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Plan>
}
