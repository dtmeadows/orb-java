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

@JsonDeserialize(builder = CustomerBalanceTransactionListResponse.Builder::class)
@NoAutoDetect
class CustomerBalanceTransactionListResponse private constructor(
  private val id: JsonField<String>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val startingBalance: JsonField<String>,
  private val endingBalance: JsonField<String>,
  private val amount: JsonField<String>,
  private val action: JsonField<Action>,
  private val description: JsonField<String>,
  private val invoice: JsonField<Invoice>,
  private val type: JsonField<Type>,
  private val creditNote: JsonField<CreditNote>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A unique id for this transaction. */
    fun id(): String = id.getRequired("id")

    /** The creation time of this transaction. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The original value of the customer's balance prior to the transaction, in the
     * customer's currency.
     */
    fun startingBalance(): String = startingBalance.getRequired("starting_balance")

    /**
     * The new value of the customer's balance prior to the transaction, in the
     * customer's currency.
     */
    fun endingBalance(): String = endingBalance.getRequired("ending_balance")

    /** The value of the amount changed in the transaction. */
    fun amount(): String = amount.getRequired("amount")

    fun action(): Action = action.getRequired("action")

    /** An optional description provided for manual customer balance adjustments. */
    fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

    fun invoice(): Optional<Invoice> = Optional.ofNullable(invoice.getNullable("invoice"))

    fun type(): Type = type.getRequired("type")

    fun creditNote(): Optional<CreditNote> = Optional.ofNullable(creditNote.getNullable("credit_note"))

    /** A unique id for this transaction. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** The creation time of this transaction. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /**
     * The original value of the customer's balance prior to the transaction, in the
     * customer's currency.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance() = startingBalance

    /**
     * The new value of the customer's balance prior to the transaction, in the
     * customer's currency.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance() = endingBalance

    /** The value of the amount changed in the transaction. */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    @JsonProperty("action")
    @ExcludeMissing
    fun _action() = action

    /** An optional description provided for manual customer balance adjustments. */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description() = description

    @JsonProperty("invoice")
    @ExcludeMissing
    fun _invoice() = invoice

    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonProperty("credit_note")
    @ExcludeMissing
    fun _creditNote() = creditNote

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerBalanceTransactionListResponse = apply {
        if (!validated) {
          id()
          createdAt()
          startingBalance()
          endingBalance()
          amount()
          action()
          description()
          invoice().map { it.validate() }
          type()
          creditNote().map { it.validate() }
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CustomerBalanceTransactionListResponse &&
          this.id == other.id &&
          this.createdAt == other.createdAt &&
          this.startingBalance == other.startingBalance &&
          this.endingBalance == other.endingBalance &&
          this.amount == other.amount &&
          this.action == other.action &&
          this.description == other.description &&
          this.invoice == other.invoice &&
          this.type == other.type &&
          this.creditNote == other.creditNote &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            createdAt,
            startingBalance,
            endingBalance,
            amount,
            action,
            description,
            invoice,
            type,
            creditNote,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "CustomerBalanceTransactionListResponse{id=$id, createdAt=$createdAt, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, action=$action, description=$description, invoice=$invoice, type=$type, creditNote=$creditNote, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startingBalance: JsonField<String> = JsonMissing.of()
        private var endingBalance: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<String> = JsonMissing.of()
        private var action: JsonField<Action> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var invoice: JsonField<Invoice> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var creditNote: JsonField<CreditNote> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerBalanceTransactionListResponse: CustomerBalanceTransactionListResponse) = apply {
            this.id = customerBalanceTransactionListResponse.id
            this.createdAt = customerBalanceTransactionListResponse.createdAt
            this.startingBalance = customerBalanceTransactionListResponse.startingBalance
            this.endingBalance = customerBalanceTransactionListResponse.endingBalance
            this.amount = customerBalanceTransactionListResponse.amount
            this.action = customerBalanceTransactionListResponse.action
            this.description = customerBalanceTransactionListResponse.description
            this.invoice = customerBalanceTransactionListResponse.invoice
            this.type = customerBalanceTransactionListResponse.type
            this.creditNote = customerBalanceTransactionListResponse.creditNote
            additionalProperties(customerBalanceTransactionListResponse.additionalProperties)
        }

        /** A unique id for this transaction. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique id for this transaction. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** The creation time of this transaction. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of this transaction. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /**
         * The original value of the customer's balance prior to the transaction, in the
         * customer's currency.
         */
        fun startingBalance(startingBalance: String) = startingBalance(JsonField.of(startingBalance))

        /**
         * The original value of the customer's balance prior to the transaction, in the
         * customer's currency.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun startingBalance(startingBalance: JsonField<String>) = apply {
            this.startingBalance = startingBalance
        }

        /**
         * The new value of the customer's balance prior to the transaction, in the
         * customer's currency.
         */
        fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

        /**
         * The new value of the customer's balance prior to the transaction, in the
         * customer's currency.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun endingBalance(endingBalance: JsonField<String>) = apply {
            this.endingBalance = endingBalance
        }

        /** The value of the amount changed in the transaction. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The value of the amount changed in the transaction. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<String>) = apply {
            this.amount = amount
        }

        fun action(action: Action) = action(JsonField.of(action))

        @JsonProperty("action")
        @ExcludeMissing
        fun action(action: JsonField<Action>) = apply {
            this.action = action
        }

        /** An optional description provided for manual customer balance adjustments. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description provided for manual customer balance adjustments. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply {
            this.description = description
        }

        fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

        @JsonProperty("invoice")
        @ExcludeMissing
        fun invoice(invoice: JsonField<Invoice>) = apply {
            this.invoice = invoice
        }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
        }

        fun creditNote(creditNote: CreditNote) = creditNote(JsonField.of(creditNote))

        @JsonProperty("credit_note")
        @ExcludeMissing
        fun creditNote(creditNote: JsonField<CreditNote>) = apply {
            this.creditNote = creditNote
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

        fun build(): CustomerBalanceTransactionListResponse = CustomerBalanceTransactionListResponse(
            id,
            createdAt,
            startingBalance,
            endingBalance,
            amount,
            action,
            description,
            invoice,
            type,
            creditNote,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Action @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Action &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPLIED_TO_INVOICE = Action(JsonField.of("applied_to_invoice"))

            @JvmField val MANUAL_ADJUSTMENT = Action(JsonField.of("manual_adjustment"))

            @JvmField val PRORATED_REFUND = Action(JsonField.of("prorated_refund"))

            @JvmField val REVERT_PRORATED_REFUND = Action(JsonField.of("revert_prorated_refund"))

            @JvmField val RETURN_FROM_VOIDING = Action(JsonField.of("return_from_voiding"))

            @JvmField val CREDIT_NOTE_APPLIED = Action(JsonField.of("credit_note_applied"))

            @JvmField val CREDIT_NOTE_VOIDED = Action(JsonField.of("credit_note_voided"))

            @JvmField val OVERPAYMENT_REFUND = Action(JsonField.of("overpayment_refund"))

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        enum class Known {
            APPLIED_TO_INVOICE,
            MANUAL_ADJUSTMENT,
            PRORATED_REFUND,
            REVERT_PRORATED_REFUND,
            RETURN_FROM_VOIDING,
            CREDIT_NOTE_APPLIED,
            CREDIT_NOTE_VOIDED,
            OVERPAYMENT_REFUND,
        }

        enum class Value {
            APPLIED_TO_INVOICE,
            MANUAL_ADJUSTMENT,
            PRORATED_REFUND,
            REVERT_PRORATED_REFUND,
            RETURN_FROM_VOIDING,
            CREDIT_NOTE_APPLIED,
            CREDIT_NOTE_VOIDED,
            OVERPAYMENT_REFUND,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            APPLIED_TO_INVOICE -> Value.APPLIED_TO_INVOICE
            MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
            PRORATED_REFUND -> Value.PRORATED_REFUND
            REVERT_PRORATED_REFUND -> Value.REVERT_PRORATED_REFUND
            RETURN_FROM_VOIDING -> Value.RETURN_FROM_VOIDING
            CREDIT_NOTE_APPLIED -> Value.CREDIT_NOTE_APPLIED
            CREDIT_NOTE_VOIDED -> Value.CREDIT_NOTE_VOIDED
            OVERPAYMENT_REFUND -> Value.OVERPAYMENT_REFUND
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            APPLIED_TO_INVOICE -> Known.APPLIED_TO_INVOICE
            MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
            PRORATED_REFUND -> Known.PRORATED_REFUND
            REVERT_PRORATED_REFUND -> Known.REVERT_PRORATED_REFUND
            RETURN_FROM_VOIDING -> Known.RETURN_FROM_VOIDING
            CREDIT_NOTE_APPLIED -> Known.CREDIT_NOTE_APPLIED
            CREDIT_NOTE_VOIDED -> Known.CREDIT_NOTE_VOIDED
            OVERPAYMENT_REFUND -> Known.OVERPAYMENT_REFUND
            else -> throw OrbInvalidDataException("Unknown Action: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = CreditNote.Builder::class)
    @NoAutoDetect
    class CreditNote private constructor(private val id: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The id of the Credit note */
        fun id(): String = id.getRequired("id")

        /** The id of the Credit note */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CreditNote = apply {
            if (!validated) {
              id()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CreditNote &&
              this.id == other.id &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(id, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "CreditNote{id=$id, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditNote: CreditNote) = apply {
                this.id = creditNote.id
                additionalProperties(creditNote.additionalProperties)
            }

            /** The id of the Credit note */
            fun id(id: String) = id(JsonField.of(id))

            /** The id of the Credit note */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
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

            fun build(): CreditNote = CreditNote(id, additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = Invoice.Builder::class)
    @NoAutoDetect
    class Invoice private constructor(private val id: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The Invoice id */
        fun id(): String = id.getRequired("id")

        /** The Invoice id */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Invoice = apply {
            if (!validated) {
              id()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Invoice &&
              this.id == other.id &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(id, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Invoice{id=$id, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                this.id = invoice.id
                additionalProperties(invoice.additionalProperties)
            }

            /** The Invoice id */
            fun id(id: String) = id(JsonField.of(id))

            /** The Invoice id */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
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

            fun build(): Invoice = Invoice(id, additionalProperties.toUnmodifiable())
        }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INCREMENT = Type(JsonField.of("increment"))

            @JvmField val DECREMENT = Type(JsonField.of("decrement"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INCREMENT,
            DECREMENT,
        }

        enum class Value {
            INCREMENT,
            DECREMENT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INCREMENT -> Value.INCREMENT
            DECREMENT -> Value.DECREMENT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INCREMENT -> Known.INCREMENT
            DECREMENT -> Known.DECREMENT
            else -> throw OrbInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
