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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

@JsonDeserialize(builder = EventSearchResponse.Builder::class)
@NoAutoDetect
class EventSearchResponse private constructor(private val data: JsonField<List<Data>>, private val additionalProperties: Map<String, JsonValue>, ) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventSearchResponse = apply {
        if (!validated) {
          data().forEach { it.validate() }
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EventSearchResponse &&
          this.data == other.data &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(data, additionalProperties)
      }
      return hashCode
    }

    override fun toString() = "EventSearchResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSearchResponse: EventSearchResponse) = apply {
            this.data = eventSearchResponse.data
            additionalProperties(eventSearchResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data
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

        fun build(): EventSearchResponse = EventSearchResponse(data.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
    }

    /**
     * The [Event](../guides/core-concepts.mdx#event) resource represents a usage event
     * that has been created for a customer. Events are the core of Orb's usage-based
     * billing model, and are used to calculate the usage charges for a given billing
     * period.
     */
    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data private constructor(
      private val id: JsonField<String>,
      private val customerId: JsonField<String>,
      private val externalCustomerId: JsonField<String>,
      private val eventName: JsonField<String>,
      private val properties: JsonValue,
      private val timestamp: JsonField<OffsetDateTime>,
      private val deprecated: JsonField<Boolean>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * A unique value, generated by the client, that is used to de-duplicate events.
         * Exactly one event with a given idempotency key will be ingested, which allows
         * for safe request retries.
         */
        fun id(): String = id.getRequired("id")

        /** The Orb Customer identifier */
        fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

        /**
         * An alias for the Orb customer, whose mapping is specified when creating the
         * customer
         */
        fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId.getNullable("external_customer_id"))

        /** A name to meaningfully identify the action or event type. */
        fun eventName(): String = eventName.getRequired("event_name")

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should
         * represent the time that usage was recorded, and is particularly important to
         * attribute usage to a given billing period.
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /** A boolean indicating whether the event is currently deprecated. */
        fun deprecated(): Boolean = deprecated.getRequired("deprecated")

        /**
         * A unique value, generated by the client, that is used to de-duplicate events.
         * Exactly one event with a given idempotency key will be ingested, which allows
         * for safe request retries.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        /** The Orb Customer identifier */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId() = customerId

        /**
         * An alias for the Orb customer, whose mapping is specified when creating the
         * customer
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId() = externalCustomerId

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name")
        @ExcludeMissing
        fun _eventName() = eventName

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric,
         * boolean, or strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties() = properties

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should
         * represent the time that usage was recorded, and is particularly important to
         * attribute usage to a given billing period.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp() = timestamp

        /** A boolean indicating whether the event is currently deprecated. */
        @JsonProperty("deprecated")
        @ExcludeMissing
        fun _deprecated() = deprecated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
              id()
              customerId()
              externalCustomerId()
              eventName()
              timestamp()
              deprecated()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Data &&
              this.id == other.id &&
              this.customerId == other.customerId &&
              this.externalCustomerId == other.externalCustomerId &&
              this.eventName == other.eventName &&
              this.properties == other.properties &&
              this.timestamp == other.timestamp &&
              this.deprecated == other.deprecated &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                id,
                customerId,
                externalCustomerId,
                eventName,
                properties,
                timestamp,
                deprecated,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Data{id=$id, customerId=$customerId, externalCustomerId=$externalCustomerId, eventName=$eventName, properties=$properties, timestamp=$timestamp, deprecated=$deprecated, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var eventName: JsonField<String> = JsonMissing.of()
            private var properties: JsonValue = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var deprecated: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.id = data.id
                this.customerId = data.customerId
                this.externalCustomerId = data.externalCustomerId
                this.eventName = data.eventName
                this.properties = data.properties
                this.timestamp = data.timestamp
                this.deprecated = data.deprecated
                additionalProperties(data.additionalProperties)
            }

            /**
             * A unique value, generated by the client, that is used to de-duplicate events.
             * Exactly one event with a given idempotency key will be ingested, which allows
             * for safe request retries.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * A unique value, generated by the client, that is used to de-duplicate events.
             * Exactly one event with a given idempotency key will be ingested, which allows
             * for safe request retries.
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
            }

            /** The Orb Customer identifier */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** The Orb Customer identifier */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun customerId(customerId: JsonField<String>) = apply {
                this.customerId = customerId
            }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the
             * customer
             */
            fun externalCustomerId(externalCustomerId: String) = externalCustomerId(JsonField.of(externalCustomerId))

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the
             * customer
             */
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /** A name to meaningfully identify the action or event type. */
            @JsonProperty("event_name")
            @ExcludeMissing
            fun eventName(eventName: JsonField<String>) = apply {
                this.eventName = eventName
            }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun properties(properties: JsonValue) = apply {
                this.properties = properties
            }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should
             * represent the time that usage was recorded, and is particularly important to
             * attribute usage to a given billing period.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should
             * represent the time that usage was recorded, and is particularly important to
             * attribute usage to a given billing period.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            /** A boolean indicating whether the event is currently deprecated. */
            fun deprecated(deprecated: Boolean) = deprecated(JsonField.of(deprecated))

            /** A boolean indicating whether the event is currently deprecated. */
            @JsonProperty("deprecated")
            @ExcludeMissing
            fun deprecated(deprecated: JsonField<Boolean>) = apply {
                this.deprecated = deprecated
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

            fun build(): Data = Data(
                id,
                customerId,
                externalCustomerId,
                eventName,
                properties,
                timestamp,
                deprecated,
                additionalProperties.toUnmodifiable(),
            )
        }
    }
}
