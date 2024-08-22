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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerCreditTopUpCreateByExternalIdResponse.Builder::class)
@NoAutoDetect
class CustomerCreditTopUpCreateByExternalIdResponse
private constructor(
    private val id: JsonField<String>,
    private val currency: JsonField<String>,
    private val threshold: JsonField<String>,
    private val amount: JsonField<String>,
    private val perUnitCostBasis: JsonField<String>,
    private val invoiceSettings: JsonField<InvoiceSettings>,
    private val expiresAfter: JsonField<Long>,
    private val expiresAfterUnit: JsonField<ExpiresAfterUnit>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    /**
     * The currency or custom pricing unit to use for this top-up. If this is a real-world currency,
     * it must match the customer's invoicing currency.
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The threshold at which to trigger the top-up. If the balance is at or below this threshold,
     * the top-up will be triggered.
     */
    fun threshold(): String = threshold.getRequired("threshold")

    /** The amount to increment when the threshold is reached. */
    fun amount(): String = amount.getRequired("amount")

    /** How much, in the customer's currency, to charge for each unit. */
    fun perUnitCostBasis(): String = perUnitCostBasis.getRequired("per_unit_cost_basis")

    /** Settings for invoices generated by triggered top-ups. */
    fun invoiceSettings(): InvoiceSettings = invoiceSettings.getRequired("invoice_settings")

    /**
     * The number of days or months after which the top-up expires. If unspecified, it does not
     * expire.
     */
    fun expiresAfter(): Optional<Long> =
        Optional.ofNullable(expiresAfter.getNullable("expires_after"))

    /** The unit of expires_after. */
    fun expiresAfterUnit(): Optional<ExpiresAfterUnit> =
        Optional.ofNullable(expiresAfterUnit.getNullable("expires_after_unit"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The currency or custom pricing unit to use for this top-up. If this is a real-world currency,
     * it must match the customer's invoicing currency.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The threshold at which to trigger the top-up. If the balance is at or below this threshold,
     * the top-up will be triggered.
     */
    @JsonProperty("threshold") @ExcludeMissing fun _threshold() = threshold

    /** The amount to increment when the threshold is reached. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** How much, in the customer's currency, to charge for each unit. */
    @JsonProperty("per_unit_cost_basis") @ExcludeMissing fun _perUnitCostBasis() = perUnitCostBasis

    /** Settings for invoices generated by triggered top-ups. */
    @JsonProperty("invoice_settings") @ExcludeMissing fun _invoiceSettings() = invoiceSettings

    /**
     * The number of days or months after which the top-up expires. If unspecified, it does not
     * expire.
     */
    @JsonProperty("expires_after") @ExcludeMissing fun _expiresAfter() = expiresAfter

    /** The unit of expires_after. */
    @JsonProperty("expires_after_unit") @ExcludeMissing fun _expiresAfterUnit() = expiresAfterUnit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerCreditTopUpCreateByExternalIdResponse = apply {
        if (!validated) {
            id()
            currency()
            threshold()
            amount()
            perUnitCostBasis()
            invoiceSettings().validate()
            expiresAfter()
            expiresAfterUnit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditTopUpCreateByExternalIdResponse &&
            this.id == other.id &&
            this.currency == other.currency &&
            this.threshold == other.threshold &&
            this.amount == other.amount &&
            this.perUnitCostBasis == other.perUnitCostBasis &&
            this.invoiceSettings == other.invoiceSettings &&
            this.expiresAfter == other.expiresAfter &&
            this.expiresAfterUnit == other.expiresAfterUnit &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    currency,
                    threshold,
                    amount,
                    perUnitCostBasis,
                    invoiceSettings,
                    expiresAfter,
                    expiresAfterUnit,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CustomerCreditTopUpCreateByExternalIdResponse{id=$id, currency=$currency, threshold=$threshold, amount=$amount, perUnitCostBasis=$perUnitCostBasis, invoiceSettings=$invoiceSettings, expiresAfter=$expiresAfter, expiresAfterUnit=$expiresAfterUnit, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var threshold: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<String> = JsonMissing.of()
        private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
        private var invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of()
        private var expiresAfter: JsonField<Long> = JsonMissing.of()
        private var expiresAfterUnit: JsonField<ExpiresAfterUnit> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerCreditTopUpCreateByExternalIdResponse:
                CustomerCreditTopUpCreateByExternalIdResponse
        ) = apply {
            this.id = customerCreditTopUpCreateByExternalIdResponse.id
            this.currency = customerCreditTopUpCreateByExternalIdResponse.currency
            this.threshold = customerCreditTopUpCreateByExternalIdResponse.threshold
            this.amount = customerCreditTopUpCreateByExternalIdResponse.amount
            this.perUnitCostBasis = customerCreditTopUpCreateByExternalIdResponse.perUnitCostBasis
            this.invoiceSettings = customerCreditTopUpCreateByExternalIdResponse.invoiceSettings
            this.expiresAfter = customerCreditTopUpCreateByExternalIdResponse.expiresAfter
            this.expiresAfterUnit = customerCreditTopUpCreateByExternalIdResponse.expiresAfterUnit
            additionalProperties(customerCreditTopUpCreateByExternalIdResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The currency or custom pricing unit to use for this top-up. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The currency or custom pricing unit to use for this top-up. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The threshold at which to trigger the top-up. If the balance is at or below this
         * threshold, the top-up will be triggered.
         */
        fun threshold(threshold: String) = threshold(JsonField.of(threshold))

        /**
         * The threshold at which to trigger the top-up. If the balance is at or below this
         * threshold, the top-up will be triggered.
         */
        @JsonProperty("threshold")
        @ExcludeMissing
        fun threshold(threshold: JsonField<String>) = apply { this.threshold = threshold }

        /** The amount to increment when the threshold is reached. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The amount to increment when the threshold is reached. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** How much, in the customer's currency, to charge for each unit. */
        fun perUnitCostBasis(perUnitCostBasis: String) =
            perUnitCostBasis(JsonField.of(perUnitCostBasis))

        /** How much, in the customer's currency, to charge for each unit. */
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
        }

        /** Settings for invoices generated by triggered top-ups. */
        fun invoiceSettings(invoiceSettings: InvoiceSettings) =
            invoiceSettings(JsonField.of(invoiceSettings))

        /** Settings for invoices generated by triggered top-ups. */
        @JsonProperty("invoice_settings")
        @ExcludeMissing
        fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
            this.invoiceSettings = invoiceSettings
        }

        /**
         * The number of days or months after which the top-up expires. If unspecified, it does not
         * expire.
         */
        fun expiresAfter(expiresAfter: Long) = expiresAfter(JsonField.of(expiresAfter))

        /**
         * The number of days or months after which the top-up expires. If unspecified, it does not
         * expire.
         */
        @JsonProperty("expires_after")
        @ExcludeMissing
        fun expiresAfter(expiresAfter: JsonField<Long>) = apply { this.expiresAfter = expiresAfter }

        /** The unit of expires_after. */
        fun expiresAfterUnit(expiresAfterUnit: ExpiresAfterUnit) =
            expiresAfterUnit(JsonField.of(expiresAfterUnit))

        /** The unit of expires_after. */
        @JsonProperty("expires_after_unit")
        @ExcludeMissing
        fun expiresAfterUnit(expiresAfterUnit: JsonField<ExpiresAfterUnit>) = apply {
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

        fun build(): CustomerCreditTopUpCreateByExternalIdResponse =
            CustomerCreditTopUpCreateByExternalIdResponse(
                id,
                currency,
                threshold,
                amount,
                perUnitCostBasis,
                invoiceSettings,
                expiresAfter,
                expiresAfterUnit,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Settings for invoices generated by triggered top-ups. */
    @JsonDeserialize(builder = InvoiceSettings.Builder::class)
    @NoAutoDetect
    class InvoiceSettings
    private constructor(
        private val autoCollection: JsonField<Boolean>,
        private val netTerms: JsonField<Long>,
        private val memo: JsonField<String>,
        private val requireSuccessfulPayment: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Whether the credits purchase invoice should auto collect with the customer's saved
         * payment method.
         */
        fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0.
         */
        fun netTerms(): Long = netTerms.getRequired("net_terms")

        /** An optional memo to display on the invoice. */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /**
         * If true, new credit blocks created by this top-up will require that the corresponding
         * invoice is paid before they can be drawn down from.
         */
        fun requireSuccessfulPayment(): Optional<Boolean> =
            Optional.ofNullable(requireSuccessfulPayment.getNullable("require_successful_payment"))

        /**
         * Whether the credits purchase invoice should auto collect with the customer's saved
         * payment method.
         */
        @JsonProperty("auto_collection") @ExcludeMissing fun _autoCollection() = autoCollection

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms() = netTerms

        /** An optional memo to display on the invoice. */
        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        /**
         * If true, new credit blocks created by this top-up will require that the corresponding
         * invoice is paid before they can be drawn down from.
         */
        @JsonProperty("require_successful_payment")
        @ExcludeMissing
        fun _requireSuccessfulPayment() = requireSuccessfulPayment

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InvoiceSettings = apply {
            if (!validated) {
                autoCollection()
                netTerms()
                memo()
                requireSuccessfulPayment()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceSettings &&
                this.autoCollection == other.autoCollection &&
                this.netTerms == other.netTerms &&
                this.memo == other.memo &&
                this.requireSuccessfulPayment == other.requireSuccessfulPayment &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        autoCollection,
                        netTerms,
                        memo,
                        requireSuccessfulPayment,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of()
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
            fun autoCollection(autoCollection: Boolean) =
                autoCollection(JsonField.of(autoCollection))

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            @JsonProperty("auto_collection")
            @ExcludeMissing
            fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                this.autoCollection = autoCollection
            }

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            @JsonProperty("net_terms")
            @ExcludeMissing
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

            /** An optional memo to display on the invoice. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** An optional memo to display on the invoice. */
            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /**
             * If true, new credit blocks created by this top-up will require that the corresponding
             * invoice is paid before they can be drawn down from.
             */
            fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) =
                requireSuccessfulPayment(JsonField.of(requireSuccessfulPayment))

            /**
             * If true, new credit blocks created by this top-up will require that the corresponding
             * invoice is paid before they can be drawn down from.
             */
            @JsonProperty("require_successful_payment")
            @ExcludeMissing
            fun requireSuccessfulPayment(requireSuccessfulPayment: JsonField<Boolean>) = apply {
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
                    autoCollection,
                    netTerms,
                    memo,
                    requireSuccessfulPayment,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

            return other is ExpiresAfterUnit && this.value == other.value
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
