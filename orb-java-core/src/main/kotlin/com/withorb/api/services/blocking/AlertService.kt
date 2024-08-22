// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPage
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

interface AlertService {

    /** This endpoint retrieves an alert by its ID. */
    @JvmOverloads
    fun retrieve(params: AlertRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /** This endpoint updates the thresholds of an alert. */
    @JvmOverloads
    fun update(params: AlertUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /**
     * This endpoint returns a list of alerts within Orb.
     *
     * The request must specify one of `customer_id`, `external_customer_id`, or
     * `subscription_id`.
     *
     * If querying by subscripion_id, the endpoint will return the subscription level
     * alerts as well as the plan level alerts associated with the subscription.
     *
     * The list of alerts is ordered starting from the most recently created alert.
     * This endpoint follows Orb's
     * [standardized pagination format](../reference/pagination).
     */
    @JvmOverloads
    fun list(params: AlertListParams, requestOptions: RequestOptions = RequestOptions.none()): AlertListPage

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There
     * are three types of alerts that can be scoped to customers:
     * `credit_balance_depleted`, `credit_balance_dropped`, and
     * `credit_balance_recovered`. Customers can have a maximum of one of each type of
     * alert per
     * [credit balance currency](https://docs.withorb.com/guides/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided
     * while `credit_balance_depleted` and `credit_balance_recovered` alerts do not
     * require thresholds.
     */
    @JvmOverloads
    fun createForCustomer(params: AlertCreateForCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There
     * are three types of alerts that can be scoped to customers:
     * `credit_balance_depleted`, `credit_balance_dropped`, and
     * `credit_balance_recovered`. Customers can have a maximum of one of each type of
     * alert per
     * [credit balance currency](https://docs.withorb.com/guides/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided
     * while `credit_balance_depleted` and `credit_balance_recovered` alerts do not
     * require thresholds.
     */
    @JvmOverloads
    fun createForExternalCustomer(params: AlertCreateForExternalCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /**
     * This endpoint is used to create alerts at the subscription level.
     *
     * Subscription level alerts can be one of two types: `usage_exceeded` or
     * `cost_exceeded`. A `usage_exceeded` alert is scoped to a particular metric and
     * is triggered when the usage of that metric exceeds predefined thresholds during
     * the current billing cycle. A `cost_exceeded` alert is triggered when the total
     * amount due during the current billing cycle surpasses predefined thresholds.
     * `cost_exceeded` alerts do not include burndown of pre-purchase credits. Each
     * subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert
     * per metric that is a part of the subscription. Alerts are triggered based on
     * usage or cost conditions met during the current billing cycle.
     */
    @JvmOverloads
    fun createForSubscription(params: AlertCreateForSubscriptionParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /** This endpoint can be used to disable an alert. */
    @JvmOverloads
    fun disable(params: AlertDisableParams, requestOptions: RequestOptions = RequestOptions.none()): Alert

    /** This endpoint can be used to enable an alert. */
    @JvmOverloads
    fun enable(params: AlertEnableParams, requestOptions: RequestOptions = RequestOptions.none()): Alert
}
