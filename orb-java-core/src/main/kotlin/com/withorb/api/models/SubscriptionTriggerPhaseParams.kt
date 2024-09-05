// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class SubscriptionTriggerPhaseParams constructor(
  private val subscriptionId: String,
  private val effectiveDate: LocalDate?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun subscriptionId(): String = subscriptionId

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    @JvmSynthetic
    internal fun getBody(): SubscriptionTriggerPhaseBody {
      return SubscriptionTriggerPhaseBody(effectiveDate, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> subscriptionId
          else -> ""
      }
    }

    @JsonDeserialize(builder = SubscriptionTriggerPhaseBody.Builder::class)
    @NoAutoDetect
    class SubscriptionTriggerPhaseBody internal constructor(private val effectiveDate: LocalDate?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        /**
         * The date on which the phase change should take effect. If not provided, defaults
         * to today in the customer's timezone.
         */
        @JsonProperty("effective_date")
        fun effectiveDate(): LocalDate? = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SubscriptionTriggerPhaseBody &&
              this.effectiveDate == other.effectiveDate &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(effectiveDate, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "SubscriptionTriggerPhaseBody{effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var effectiveDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionTriggerPhaseBody: SubscriptionTriggerPhaseBody) = apply {
                this.effectiveDate = subscriptionTriggerPhaseBody.effectiveDate
                additionalProperties(subscriptionTriggerPhaseBody.additionalProperties)
            }

            /**
             * The date on which the phase change should take effect. If not provided, defaults
             * to today in the customer's timezone.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): SubscriptionTriggerPhaseBody = SubscriptionTriggerPhaseBody(effectiveDate, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionTriggerPhaseParams &&
          this.subscriptionId == other.subscriptionId &&
          this.effectiveDate == other.effectiveDate &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          subscriptionId,
          effectiveDate,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SubscriptionTriggerPhaseParams{subscriptionId=$subscriptionId, effectiveDate=$effectiveDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var effectiveDate: LocalDate? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionTriggerPhaseParams: SubscriptionTriggerPhaseParams) = apply {
            this.subscriptionId = subscriptionTriggerPhaseParams.subscriptionId
            this.effectiveDate = subscriptionTriggerPhaseParams.effectiveDate
            additionalQueryParams(subscriptionTriggerPhaseParams.additionalQueryParams)
            additionalHeaders(subscriptionTriggerPhaseParams.additionalHeaders)
            additionalBodyProperties(subscriptionTriggerPhaseParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply {
            this.subscriptionId = subscriptionId
        }

        /**
         * The date on which the phase change should take effect. If not provided, defaults
         * to today in the customer's timezone.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply {
            this.effectiveDate = effectiveDate
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): SubscriptionTriggerPhaseParams = SubscriptionTriggerPhaseParams(
            checkNotNull(subscriptionId) {
                "`subscriptionId` is required but was not set"
            },
            effectiveDate,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
