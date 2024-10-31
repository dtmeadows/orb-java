// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerCreditTopUpCreateByExternalIdParams
constructor(
    private val externalCustomerId: String,
    private val amount: String,
    private val currency: String,
    private val invoiceSettings: InvoiceSettings,
    private val perUnitCostBasis: String,
    private val threshold: String,
    private val expiresAfter: Long?,
    private val expiresAfterUnit: ExpiresAfterUnit?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun amount(): String = amount

    fun currency(): String = currency

    fun invoiceSettings(): InvoiceSettings = invoiceSettings

    fun perUnitCostBasis(): String = perUnitCostBasis

    fun threshold(): String = threshold

    fun expiresAfter(): Optional<Long> = Optional.ofNullable(expiresAfter)

    fun expiresAfterUnit(): Optional<ExpiresAfterUnit> = Optional.ofNullable(expiresAfterUnit)

    @JvmSynthetic
    internal fun getBody(): CustomerCreditTopUpCreateByExternalIdBody {
        return CustomerCreditTopUpCreateByExternalIdBody(
            amount,
            currency,
            invoiceSettings,
            perUnitCostBasis,
            threshold,
            expiresAfter,
            expiresAfterUnit,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerCreditTopUpCreateByExternalIdBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditTopUpCreateByExternalIdBody
    internal constructor(
        private val amount: String?,
        private val currency: String?,
        private val invoiceSettings: InvoiceSettings?,
        private val perUnitCostBasis: String?,
        private val threshold: String?,
        private val expiresAfter: Long?,
        private val expiresAfterUnit: ExpiresAfterUnit?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The amount to increment when the threshold is reached. */
        @JsonProperty("amount") fun amount(): String? = amount

        /**
         * The currency or custom pricing unit to use for this top-up. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /** Settings for invoices generated by triggered top-ups. */
        @JsonProperty("invoice_settings") fun invoiceSettings(): InvoiceSettings? = invoiceSettings

        /** How much, in the customer's currency, to charge for each unit. */
        @JsonProperty("per_unit_cost_basis") fun perUnitCostBasis(): String? = perUnitCostBasis

        /**
         * The threshold at which to trigger the top-up. If the balance is at or below this
         * threshold, the top-up will be triggered.
         */
        @JsonProperty("threshold") fun threshold(): String? = threshold

        /**
         * The number of days or months after which the top-up expires. If unspecified, it does not
         * expire.
         */
        @JsonProperty("expires_after") fun expiresAfter(): Long? = expiresAfter

        /** The unit of expires_after. */
        @JsonProperty("expires_after_unit")
        fun expiresAfterUnit(): ExpiresAfterUnit? = expiresAfterUnit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: String? = null
            private var currency: String? = null
            private var invoiceSettings: InvoiceSettings? = null
            private var perUnitCostBasis: String? = null
            private var threshold: String? = null
            private var expiresAfter: Long? = null
            private var expiresAfterUnit: ExpiresAfterUnit? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerCreditTopUpCreateByExternalIdBody: CustomerCreditTopUpCreateByExternalIdBody
            ) = apply {
                this.amount = customerCreditTopUpCreateByExternalIdBody.amount
                this.currency = customerCreditTopUpCreateByExternalIdBody.currency
                this.invoiceSettings = customerCreditTopUpCreateByExternalIdBody.invoiceSettings
                this.perUnitCostBasis = customerCreditTopUpCreateByExternalIdBody.perUnitCostBasis
                this.threshold = customerCreditTopUpCreateByExternalIdBody.threshold
                this.expiresAfter = customerCreditTopUpCreateByExternalIdBody.expiresAfter
                this.expiresAfterUnit = customerCreditTopUpCreateByExternalIdBody.expiresAfterUnit
                additionalProperties(customerCreditTopUpCreateByExternalIdBody.additionalProperties)
            }

            /** The amount to increment when the threshold is reached. */
            @JsonProperty("amount") fun amount(amount: String) = apply { this.amount = amount }

            /**
             * The currency or custom pricing unit to use for this top-up. If this is a real-world
             * currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** Settings for invoices generated by triggered top-ups. */
            @JsonProperty("invoice_settings")
            fun invoiceSettings(invoiceSettings: InvoiceSettings) = apply {
                this.invoiceSettings = invoiceSettings
            }

            /** How much, in the customer's currency, to charge for each unit. */
            @JsonProperty("per_unit_cost_basis")
            fun perUnitCostBasis(perUnitCostBasis: String) = apply {
                this.perUnitCostBasis = perUnitCostBasis
            }

            /**
             * The threshold at which to trigger the top-up. If the balance is at or below this
             * threshold, the top-up will be triggered.
             */
            @JsonProperty("threshold")
            fun threshold(threshold: String) = apply { this.threshold = threshold }

            /**
             * The number of days or months after which the top-up expires. If unspecified, it does
             * not expire.
             */
            @JsonProperty("expires_after")
            fun expiresAfter(expiresAfter: Long) = apply { this.expiresAfter = expiresAfter }

            /** The unit of expires_after. */
            @JsonProperty("expires_after_unit")
            fun expiresAfterUnit(expiresAfterUnit: ExpiresAfterUnit) = apply {
                this.expiresAfterUnit = expiresAfterUnit
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

            fun build(): CustomerCreditTopUpCreateByExternalIdBody =
                CustomerCreditTopUpCreateByExternalIdBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(invoiceSettings) {
                        "`invoiceSettings` is required but was not set"
                    },
                    checkNotNull(perUnitCostBasis) {
                        "`perUnitCostBasis` is required but was not set"
                    },
                    checkNotNull(threshold) { "`threshold` is required but was not set" },
                    expiresAfter,
                    expiresAfterUnit,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditTopUpCreateByExternalIdBody && this.amount == other.amount && this.currency == other.currency && this.invoiceSettings == other.invoiceSettings && this.perUnitCostBasis == other.perUnitCostBasis && this.threshold == other.threshold && this.expiresAfter == other.expiresAfter && this.expiresAfterUnit == other.expiresAfterUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, currency, invoiceSettings, perUnitCostBasis, threshold, expiresAfter, expiresAfterUnit, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCreditTopUpCreateByExternalIdBody{amount=$amount, currency=$currency, invoiceSettings=$invoiceSettings, perUnitCostBasis=$perUnitCostBasis, threshold=$threshold, expiresAfter=$expiresAfter, expiresAfterUnit=$expiresAfterUnit, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpCreateByExternalIdParams && this.externalCustomerId == other.externalCustomerId && this.amount == other.amount && this.currency == other.currency && this.invoiceSettings == other.invoiceSettings && this.perUnitCostBasis == other.perUnitCostBasis && this.threshold == other.threshold && this.expiresAfter == other.expiresAfter && this.expiresAfterUnit == other.expiresAfterUnit && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalCustomerId, amount, currency, invoiceSettings, perUnitCostBasis, threshold, expiresAfter, expiresAfterUnit, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditTopUpCreateByExternalIdParams{externalCustomerId=$externalCustomerId, amount=$amount, currency=$currency, invoiceSettings=$invoiceSettings, perUnitCostBasis=$perUnitCostBasis, threshold=$threshold, expiresAfter=$expiresAfter, expiresAfterUnit=$expiresAfterUnit, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var amount: String? = null
        private var currency: String? = null
        private var invoiceSettings: InvoiceSettings? = null
        private var perUnitCostBasis: String? = null
        private var threshold: String? = null
        private var expiresAfter: Long? = null
        private var expiresAfterUnit: ExpiresAfterUnit? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerCreditTopUpCreateByExternalIdParams: CustomerCreditTopUpCreateByExternalIdParams
        ) = apply {
            this.externalCustomerId = customerCreditTopUpCreateByExternalIdParams.externalCustomerId
            this.amount = customerCreditTopUpCreateByExternalIdParams.amount
            this.currency = customerCreditTopUpCreateByExternalIdParams.currency
            this.invoiceSettings = customerCreditTopUpCreateByExternalIdParams.invoiceSettings
            this.perUnitCostBasis = customerCreditTopUpCreateByExternalIdParams.perUnitCostBasis
            this.threshold = customerCreditTopUpCreateByExternalIdParams.threshold
            this.expiresAfter = customerCreditTopUpCreateByExternalIdParams.expiresAfter
            this.expiresAfterUnit = customerCreditTopUpCreateByExternalIdParams.expiresAfterUnit
            additionalQueryParams(customerCreditTopUpCreateByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerCreditTopUpCreateByExternalIdParams.additionalHeaders)
            additionalBodyProperties(
                customerCreditTopUpCreateByExternalIdParams.additionalBodyProperties
            )
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The amount to increment when the threshold is reached. */
        fun amount(amount: String) = apply { this.amount = amount }

        /**
         * The currency or custom pricing unit to use for this top-up. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(currency: String) = apply { this.currency = currency }

        /** Settings for invoices generated by triggered top-ups. */
        fun invoiceSettings(invoiceSettings: InvoiceSettings) = apply {
            this.invoiceSettings = invoiceSettings
        }

        /** How much, in the customer's currency, to charge for each unit. */
        fun perUnitCostBasis(perUnitCostBasis: String) = apply {
            this.perUnitCostBasis = perUnitCostBasis
        }

        /**
         * The threshold at which to trigger the top-up. If the balance is at or below this
         * threshold, the top-up will be triggered.
         */
        fun threshold(threshold: String) = apply { this.threshold = threshold }

        /**
         * The number of days or months after which the top-up expires. If unspecified, it does not
         * expire.
         */
        fun expiresAfter(expiresAfter: Long) = apply { this.expiresAfter = expiresAfter }

        /** The unit of expires_after. */
        fun expiresAfterUnit(expiresAfterUnit: ExpiresAfterUnit) = apply {
            this.expiresAfterUnit = expiresAfterUnit
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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CustomerCreditTopUpCreateByExternalIdParams =
            CustomerCreditTopUpCreateByExternalIdParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(invoiceSettings) { "`invoiceSettings` is required but was not set" },
                checkNotNull(perUnitCostBasis) { "`perUnitCostBasis` is required but was not set" },
                checkNotNull(threshold) { "`threshold` is required but was not set" },
                expiresAfter,
                expiresAfterUnit,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Settings for invoices generated by triggered top-ups. */
    @JsonDeserialize(builder = InvoiceSettings.Builder::class)
    @NoAutoDetect
    class InvoiceSettings
    private constructor(
        private val autoCollection: Boolean?,
        private val netTerms: Long?,
        private val memo: String?,
        private val requireSuccessfulPayment: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Whether the credits purchase invoice should auto collect with the customer's saved
         * payment method.
         */
        @JsonProperty("auto_collection") fun autoCollection(): Boolean? = autoCollection

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0.
         */
        @JsonProperty("net_terms") fun netTerms(): Long? = netTerms

        /** An optional memo to display on the invoice. */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * If true, new credit blocks created by this top-up will require that the corresponding
         * invoice is paid before they can be drawn down from.
         */
        @JsonProperty("require_successful_payment")
        fun requireSuccessfulPayment(): Boolean? = requireSuccessfulPayment

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var autoCollection: Boolean? = null
            private var netTerms: Long? = null
            private var memo: String? = null
            private var requireSuccessfulPayment: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceSettings: InvoiceSettings) = apply {
                this.autoCollection = invoiceSettings.autoCollection
                this.netTerms = invoiceSettings.netTerms
                this.memo = invoiceSettings.memo
                this.requireSuccessfulPayment = invoiceSettings.requireSuccessfulPayment
                additionalProperties(invoiceSettings.additionalProperties)
            }

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            @JsonProperty("auto_collection")
            fun autoCollection(autoCollection: Boolean) = apply {
                this.autoCollection = autoCollection
            }

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            @JsonProperty("net_terms")
            fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

            /** An optional memo to display on the invoice. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /**
             * If true, new credit blocks created by this top-up will require that the corresponding
             * invoice is paid before they can be drawn down from.
             */
            @JsonProperty("require_successful_payment")
            fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) = apply {
                this.requireSuccessfulPayment = requireSuccessfulPayment
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

            fun build(): InvoiceSettings =
                InvoiceSettings(
                    checkNotNull(autoCollection) { "`autoCollection` is required but was not set" },
                    checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                    memo,
                    requireSuccessfulPayment,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSettings && this.autoCollection == other.autoCollection && this.netTerms == other.netTerms && this.memo == other.memo && this.requireSuccessfulPayment == other.requireSuccessfulPayment && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(autoCollection, netTerms, memo, requireSuccessfulPayment, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"
    }

    class ExpiresAfterUnit
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpiresAfterUnit && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DAY = ExpiresAfterUnit(JsonField.of("day"))

            @JvmField val MONTH = ExpiresAfterUnit(JsonField.of("month"))

            @JvmStatic fun of(value: String) = ExpiresAfterUnit(JsonField.of(value))
        }

        enum class Known {
            DAY,
            MONTH,
        }

        enum class Value {
            DAY,
            MONTH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DAY -> Value.DAY
                MONTH -> Value.MONTH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DAY -> Known.DAY
                MONTH -> Known.MONTH
                else -> throw OrbInvalidDataException("Unknown ExpiresAfterUnit: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
