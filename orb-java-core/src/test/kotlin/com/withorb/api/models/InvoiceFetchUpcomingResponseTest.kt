// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceFetchUpcomingResponseTest {

    @Test
    fun createInvoiceFetchUpcomingResponse() {
        val invoiceFetchUpcomingResponse =
            InvoiceFetchUpcomingResponse.builder()
                .id("id")
                .amountDue("8.00")
                .autoCollection(
                    InvoiceFetchUpcomingResponse.AutoCollection.builder()
                        .enabled(true)
                        .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .numAttempts(123L)
                        .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .billingAddress(
                    InvoiceFetchUpcomingResponse.BillingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .creditNotes(
                    listOf(
                        InvoiceFetchUpcomingResponse.CreditNote.builder()
                            .id("id")
                            .creditNoteNumber("credit_note_number")
                            .memo("memo")
                            .reason("reason")
                            .total("total")
                            .type("type")
                            .voidedAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                            .build()
                    )
                )
                .currency("USD")
                .customer(
                    InvoiceFetchUpcomingResponse.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .customerBalanceTransactions(
                    listOf(
                        InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.builder()
                            .id("cgZa3SXcsPTVyC4Y")
                            .action(
                                InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Action
                                    .APPLIED_TO_INVOICE
                            )
                            .amount("11.00")
                            .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                            .creditNote(
                                InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.CreditNote
                                    .builder()
                                    .id("id")
                                    .build()
                            )
                            .description("An optional description")
                            .endingBalance("22.00")
                            .invoice(
                                InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Invoice
                                    .builder()
                                    .id("gXcsPTVyC4YZa3Sc")
                                    .build()
                            )
                            .startingBalance("33.00")
                            .type(
                                InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Type
                                    .INCREMENT
                            )
                            .build()
                    )
                )
                .customerTaxId(
                    InvoiceFetchUpcomingResponse.CustomerTaxId.builder()
                        .country(InvoiceFetchUpcomingResponse.CustomerTaxId.Country.AD)
                        .type(InvoiceFetchUpcomingResponse.CustomerTaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .discount(
                    InvoiceFetchUpcomingResponse.Discount.ofPercentageDiscount(
                        InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.builder()
                            .appliesToPriceIds(listOf("string"))
                            .discountType(
                                InvoiceFetchUpcomingResponse.Discount.PercentageDiscount
                                    .DiscountType
                                    .PERCENTAGE
                            )
                            .percentageDiscount(1.0)
                            .reason("reason")
                            .build()
                    )
                )
                .discounts(
                    listOf(
                        InvoiceFetchUpcomingResponse.Discount.ofPercentageDiscount(
                            InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.builder()
                                .appliesToPriceIds(listOf("string"))
                                .discountType(
                                    InvoiceFetchUpcomingResponse.Discount.PercentageDiscount
                                        .DiscountType
                                        .PERCENTAGE
                                )
                                .percentageDiscount(1.0)
                                .reason("reason")
                                .build()
                        )
                    )
                )
                .dueDate(OffsetDateTime.parse("2022-05-30T07:00:00+00:00"))
                .eligibleToIssueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hostedInvoiceUrl("hosted_invoice_url")
                .invoiceNumber("JYEFHK-00001")
                .invoicePdf("https://assets.withorb.com/invoice/rUHdhmg45vY45DX/qEAeuYePaphGMdFb")
                .invoiceSource(InvoiceFetchUpcomingResponse.InvoiceSource.SUBSCRIPTION)
                .issueFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lineItems(
                    listOf(
                        InvoiceFetchUpcomingResponse.LineItem.builder()
                            .id("id")
                            .amount("7.00")
                            .discount(
                                Discount.ofPercentageDiscount(
                                    Discount.PercentageDiscount.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .discountType(
                                            Discount.PercentageDiscount.DiscountType.PERCENTAGE
                                        )
                                        .percentageDiscount(1.0)
                                        .reason("reason")
                                        .build()
                                )
                            )
                            .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                            .grouping("grouping")
                            .maximum(
                                InvoiceFetchUpcomingResponse.LineItem.Maximum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .maximumAmount("maximum_amount")
                                    .build()
                            )
                            .maximumAmount("maximum_amount")
                            .minimum(
                                InvoiceFetchUpcomingResponse.LineItem.Minimum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .minimumAmount("minimum_amount")
                                    .build()
                            )
                            .minimumAmount("minimum_amount")
                            .name("Fixed Fee")
                            .price(
                                Price.ofUnitPrice(
                                    Price.UnitPrice.builder()
                                        .id("id")
                                        .billableMetric(
                                            Price.UnitPrice.BillableMetric.builder()
                                                .id("id")
                                                .build()
                                        )
                                        .billingCycleConfiguration(
                                            Price.UnitPrice.BillingCycleConfiguration.builder()
                                                .duration(123L)
                                                .durationUnit(
                                                    Price.UnitPrice.BillingCycleConfiguration
                                                        .DurationUnit
                                                        .DAY
                                                )
                                                .build()
                                        )
                                        .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                        .conversionRate(42.23)
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .creditAllocation(
                                            Price.UnitPrice.CreditAllocation.builder()
                                                .allowsRollover(true)
                                                .currency("currency")
                                                .build()
                                        )
                                        .currency("currency")
                                        .discount(
                                            Discount.ofPercentageDiscount(
                                                Discount.PercentageDiscount.builder()
                                                    .appliesToPriceIds(listOf("string"))
                                                    .discountType(
                                                        Discount.PercentageDiscount.DiscountType
                                                            .PERCENTAGE
                                                    )
                                                    .percentageDiscount(1.0)
                                                    .reason("reason")
                                                    .build()
                                            )
                                        )
                                        .externalPriceId("external_price_id")
                                        .fixedPriceQuantity(42.23)
                                        .invoicingCycleConfiguration(
                                            Price.UnitPrice.InvoicingCycleConfiguration.builder()
                                                .duration(123L)
                                                .durationUnit(
                                                    Price.UnitPrice.InvoicingCycleConfiguration
                                                        .DurationUnit
                                                        .DAY
                                                )
                                                .build()
                                        )
                                        .item(
                                            Price.UnitPrice.Item.builder()
                                                .id("id")
                                                .name("name")
                                                .build()
                                        )
                                        .maximum(
                                            Price.UnitPrice.Maximum.builder()
                                                .appliesToPriceIds(listOf("string"))
                                                .maximumAmount("maximum_amount")
                                                .build()
                                        )
                                        .maximumAmount("maximum_amount")
                                        .metadata(Price.UnitPrice.Metadata.builder().build())
                                        .minimum(
                                            Price.UnitPrice.Minimum.builder()
                                                .appliesToPriceIds(listOf("string"))
                                                .minimumAmount("minimum_amount")
                                                .build()
                                        )
                                        .minimumAmount("minimum_amount")
                                        .modelType(Price.UnitPrice.ModelType.UNIT)
                                        .name("name")
                                        .planPhaseOrder(123L)
                                        .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                                        .unitConfig(
                                            Price.UnitPrice.UnitConfig.builder()
                                                .unitAmount("unit_amount")
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .quantity(42.23)
                            .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                            .subLineItems(
                                listOf(
                                    InvoiceFetchUpcomingResponse.LineItem.SubLineItem
                                        .ofMatrixSubLineItem(
                                            InvoiceFetchUpcomingResponse.LineItem.SubLineItem
                                                .MatrixSubLineItem
                                                .builder()
                                                .amount("9.00")
                                                .grouping(
                                                    InvoiceFetchUpcomingResponse.LineItem
                                                        .SubLineItem
                                                        .MatrixSubLineItem
                                                        .Grouping
                                                        .builder()
                                                        .key("region")
                                                        .value("west")
                                                        .build()
                                                )
                                                .matrixConfig(
                                                    InvoiceFetchUpcomingResponse.LineItem
                                                        .SubLineItem
                                                        .MatrixSubLineItem
                                                        .MatrixConfig
                                                        .builder()
                                                        .dimensionValues(listOf("string"))
                                                        .build()
                                                )
                                                .name("Tier One")
                                                .quantity(42.23)
                                                .type(
                                                    InvoiceFetchUpcomingResponse.LineItem
                                                        .SubLineItem
                                                        .MatrixSubLineItem
                                                        .Type
                                                        .MATRIX
                                                )
                                                .build()
                                        )
                                )
                            )
                            .subtotal("9.00")
                            .taxAmounts(
                                listOf(
                                    InvoiceFetchUpcomingResponse.LineItem.TaxAmount.builder()
                                        .amount("amount")
                                        .taxRateDescription("tax_rate_description")
                                        .taxRatePercentage("tax_rate_percentage")
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .maximum(
                    InvoiceFetchUpcomingResponse.Maximum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .maximumAmount("maximum_amount")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .memo("memo")
                .metadata(InvoiceFetchUpcomingResponse.Metadata.builder().build())
                .minimum(
                    InvoiceFetchUpcomingResponse.Minimum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .minimumAmount("minimum_amount")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .paidAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduledIssueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shippingAddress(
                    InvoiceFetchUpcomingResponse.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .status(InvoiceFetchUpcomingResponse.Status.ISSUED)
                .subscription(
                    InvoiceFetchUpcomingResponse.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .build()
                )
                .subtotal("8.00")
                .syncFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetDate(OffsetDateTime.parse("2022-05-01T07:00:00+00:00"))
                .total("8.00")
                .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .willAutoIssue(true)
                .build()
        assertThat(invoiceFetchUpcomingResponse).isNotNull
        assertThat(invoiceFetchUpcomingResponse.id()).isEqualTo("id")
        assertThat(invoiceFetchUpcomingResponse.amountDue()).isEqualTo("8.00")
        assertThat(invoiceFetchUpcomingResponse.autoCollection())
            .isEqualTo(
                InvoiceFetchUpcomingResponse.AutoCollection.builder()
                    .enabled(true)
                    .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .numAttempts(123L)
                    .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.billingAddress())
            .contains(
                InvoiceFetchUpcomingResponse.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
        assertThat(invoiceFetchUpcomingResponse.creditNotes())
            .containsExactly(
                InvoiceFetchUpcomingResponse.CreditNote.builder()
                    .id("id")
                    .creditNoteNumber("credit_note_number")
                    .memo("memo")
                    .reason("reason")
                    .total("total")
                    .type("type")
                    .voidedAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.currency()).isEqualTo("USD")
        assertThat(invoiceFetchUpcomingResponse.customer())
            .isEqualTo(
                InvoiceFetchUpcomingResponse.Customer.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.customerBalanceTransactions())
            .containsExactly(
                InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.builder()
                    .id("cgZa3SXcsPTVyC4Y")
                    .action(
                        InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Action
                            .APPLIED_TO_INVOICE
                    )
                    .amount("11.00")
                    .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                    .creditNote(
                        InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.CreditNote.builder()
                            .id("id")
                            .build()
                    )
                    .description("An optional description")
                    .endingBalance("22.00")
                    .invoice(
                        InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Invoice.builder()
                            .id("gXcsPTVyC4YZa3Sc")
                            .build()
                    )
                    .startingBalance("33.00")
                    .type(InvoiceFetchUpcomingResponse.CustomerBalanceTransaction.Type.INCREMENT)
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.customerTaxId())
            .contains(
                InvoiceFetchUpcomingResponse.CustomerTaxId.builder()
                    .country(InvoiceFetchUpcomingResponse.CustomerTaxId.Country.AD)
                    .type(InvoiceFetchUpcomingResponse.CustomerTaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.discount())
            .contains(
                InvoiceFetchUpcomingResponse.Discount.ofPercentageDiscount(
                    InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(
                            InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(1.0)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(invoiceFetchUpcomingResponse.discounts())
            .containsExactly(
                InvoiceFetchUpcomingResponse.Discount.ofPercentageDiscount(
                    InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(
                            InvoiceFetchUpcomingResponse.Discount.PercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(1.0)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(invoiceFetchUpcomingResponse.dueDate())
            .isEqualTo(OffsetDateTime.parse("2022-05-30T07:00:00+00:00"))
        assertThat(invoiceFetchUpcomingResponse.eligibleToIssueAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.hostedInvoiceUrl()).contains("hosted_invoice_url")
        assertThat(invoiceFetchUpcomingResponse.invoiceNumber()).isEqualTo("JYEFHK-00001")
        assertThat(invoiceFetchUpcomingResponse.invoicePdf())
            .contains("https://assets.withorb.com/invoice/rUHdhmg45vY45DX/qEAeuYePaphGMdFb")
        assertThat(invoiceFetchUpcomingResponse.invoiceSource())
            .isEqualTo(InvoiceFetchUpcomingResponse.InvoiceSource.SUBSCRIPTION)
        assertThat(invoiceFetchUpcomingResponse.issueFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.issuedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.lineItems())
            .containsExactly(
                InvoiceFetchUpcomingResponse.LineItem.builder()
                    .id("id")
                    .amount("7.00")
                    .discount(
                        Discount.ofPercentageDiscount(
                            Discount.PercentageDiscount.builder()
                                .appliesToPriceIds(listOf("string"))
                                .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(1.0)
                                .reason("reason")
                                .build()
                        )
                    )
                    .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                    .grouping("grouping")
                    .maximum(
                        InvoiceFetchUpcomingResponse.LineItem.Maximum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .maximumAmount("maximum_amount")
                            .build()
                    )
                    .maximumAmount("maximum_amount")
                    .minimum(
                        InvoiceFetchUpcomingResponse.LineItem.Minimum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .minimumAmount("minimum_amount")
                            .build()
                    )
                    .minimumAmount("minimum_amount")
                    .name("Fixed Fee")
                    .price(
                        Price.ofUnitPrice(
                            Price.UnitPrice.builder()
                                .id("id")
                                .billableMetric(
                                    Price.UnitPrice.BillableMetric.builder().id("id").build()
                                )
                                .billingCycleConfiguration(
                                    Price.UnitPrice.BillingCycleConfiguration.builder()
                                        .duration(123L)
                                        .durationUnit(
                                            Price.UnitPrice.BillingCycleConfiguration.DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                .conversionRate(42.23)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .creditAllocation(
                                    Price.UnitPrice.CreditAllocation.builder()
                                        .allowsRollover(true)
                                        .currency("currency")
                                        .build()
                                )
                                .currency("currency")
                                .discount(
                                    Discount.ofPercentageDiscount(
                                        Discount.PercentageDiscount.builder()
                                            .appliesToPriceIds(listOf("string"))
                                            .discountType(
                                                Discount.PercentageDiscount.DiscountType.PERCENTAGE
                                            )
                                            .percentageDiscount(1.0)
                                            .reason("reason")
                                            .build()
                                    )
                                )
                                .externalPriceId("external_price_id")
                                .fixedPriceQuantity(42.23)
                                .invoicingCycleConfiguration(
                                    Price.UnitPrice.InvoicingCycleConfiguration.builder()
                                        .duration(123L)
                                        .durationUnit(
                                            Price.UnitPrice.InvoicingCycleConfiguration.DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .item(Price.UnitPrice.Item.builder().id("id").name("name").build())
                                .maximum(
                                    Price.UnitPrice.Maximum.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .maximumAmount("maximum_amount")
                                        .build()
                                )
                                .maximumAmount("maximum_amount")
                                .metadata(Price.UnitPrice.Metadata.builder().build())
                                .minimum(
                                    Price.UnitPrice.Minimum.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .minimumAmount("minimum_amount")
                                        .build()
                                )
                                .minimumAmount("minimum_amount")
                                .modelType(Price.UnitPrice.ModelType.UNIT)
                                .name("name")
                                .planPhaseOrder(123L)
                                .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                                .unitConfig(
                                    Price.UnitPrice.UnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .build()
                        )
                    )
                    .quantity(42.23)
                    .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                    .subLineItems(
                        listOf(
                            InvoiceFetchUpcomingResponse.LineItem.SubLineItem.ofMatrixSubLineItem(
                                InvoiceFetchUpcomingResponse.LineItem.SubLineItem.MatrixSubLineItem
                                    .builder()
                                    .amount("9.00")
                                    .grouping(
                                        InvoiceFetchUpcomingResponse.LineItem.SubLineItem
                                            .MatrixSubLineItem
                                            .Grouping
                                            .builder()
                                            .key("region")
                                            .value("west")
                                            .build()
                                    )
                                    .matrixConfig(
                                        InvoiceFetchUpcomingResponse.LineItem.SubLineItem
                                            .MatrixSubLineItem
                                            .MatrixConfig
                                            .builder()
                                            .dimensionValues(listOf("string"))
                                            .build()
                                    )
                                    .name("Tier One")
                                    .quantity(42.23)
                                    .type(
                                        InvoiceFetchUpcomingResponse.LineItem.SubLineItem
                                            .MatrixSubLineItem
                                            .Type
                                            .MATRIX
                                    )
                                    .build()
                            )
                        )
                    )
                    .subtotal("9.00")
                    .taxAmounts(
                        listOf(
                            InvoiceFetchUpcomingResponse.LineItem.TaxAmount.builder()
                                .amount("amount")
                                .taxRateDescription("tax_rate_description")
                                .taxRatePercentage("tax_rate_percentage")
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.maximum())
            .contains(
                InvoiceFetchUpcomingResponse.Maximum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .maximumAmount("maximum_amount")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.maximumAmount()).contains("maximum_amount")
        assertThat(invoiceFetchUpcomingResponse.memo()).contains("memo")
        assertThat(invoiceFetchUpcomingResponse.metadata())
            .isEqualTo(InvoiceFetchUpcomingResponse.Metadata.builder().build())
        assertThat(invoiceFetchUpcomingResponse.minimum())
            .contains(
                InvoiceFetchUpcomingResponse.Minimum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .minimumAmount("minimum_amount")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.minimumAmount()).contains("minimum_amount")
        assertThat(invoiceFetchUpcomingResponse.paidAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.paymentFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.paymentStartedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.scheduledIssueAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.shippingAddress())
            .contains(
                InvoiceFetchUpcomingResponse.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(invoiceFetchUpcomingResponse.status())
            .isEqualTo(InvoiceFetchUpcomingResponse.Status.ISSUED)
        assertThat(invoiceFetchUpcomingResponse.subscription())
            .contains(
                InvoiceFetchUpcomingResponse.Subscription.builder().id("VDGsT23osdLb84KD").build()
            )
        assertThat(invoiceFetchUpcomingResponse.subtotal()).isEqualTo("8.00")
        assertThat(invoiceFetchUpcomingResponse.syncFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.targetDate())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:00:00+00:00"))
        assertThat(invoiceFetchUpcomingResponse.total()).isEqualTo("8.00")
        assertThat(invoiceFetchUpcomingResponse.voidedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceFetchUpcomingResponse.willAutoIssue()).isEqualTo(true)
    }
}
