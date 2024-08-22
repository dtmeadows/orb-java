// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

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
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
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

class ExternalPriceIdServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : ExternalPriceIdServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<Price> =
    jsonHandler<Price>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you
     * pass null for the metadata value, it will clear any existing metadata for that
     * price.
     */
    override fun update(params: PriceExternalPriceIdUpdateParams, requestOptions: RequestOptions): CompletableFuture<Price> {
      val request = HttpRequest.builder()
        .method(HttpMethod.PUT)
        .addPathSegments("prices", "external_price_id", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              updateHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val fetchHandler: Handler<Price> =
    jsonHandler<Price>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](../reference/create-price) for more information about
     * external price aliases.
     */
    override fun fetch(params: PriceExternalPriceIdFetchParams, requestOptions: RequestOptions): CompletableFuture<Price> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("prices", "external_price_id", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              fetchHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
