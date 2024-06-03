// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceTest {

    @Test
    fun createInvoice() {
        val invoice =
            Invoice.builder()
                .id("string")
                .amountDue("8.00")
                .autoCollection(
                    Invoice.AutoCollection.builder()
                        .enabled(true)
                        .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .billingAddress(
                    Invoice.BillingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .creditNotes(
                    listOf(
                        Invoice.CreditNote.builder()
                            .id("string")
                            .creditNoteNumber("string")
                            .memo("string")
                            .reason("string")
                            .total("string")
                            .type("string")
                            .voidedAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                            .build()
                    )
                )
                .currency("USD")
                .customer(
                    Invoice.Customer.builder().id("string").externalCustomerId("string").build()
                )
                .customerBalanceTransactions(
                    listOf(
                        Invoice.CustomerBalanceTransaction.builder()
                            .id("cgZa3SXcsPTVyC4Y")
                            .action(Invoice.CustomerBalanceTransaction.Action.APPLIED_TO_INVOICE)
                            .amount("11.00")
                            .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                            .creditNote(
                                Invoice.CustomerBalanceTransaction.CreditNote.builder()
                                    .id("string")
                                    .build()
                            )
                            .description("An optional description")
                            .endingBalance("22.00")
                            .invoice(
                                Invoice.CustomerBalanceTransaction.Invoice.builder()
                                    .id("gXcsPTVyC4YZa3Sc")
                                    .build()
                            )
                            .startingBalance("33.00")
                            .type(Invoice.CustomerBalanceTransaction.Type.INCREMENT)
                            .build()
                    )
                )
                .customerTaxId(
                    Invoice.CustomerTaxId.builder()
                        .country(Invoice.CustomerTaxId.Country.AD)
                        .type(Invoice.CustomerTaxId.Type.AD_NRT)
                        .value("string")
                        .build()
                )
                .discount(
                    Discount.ofPercentageDiscount(
                        Discount.PercentageDiscount.builder()
                            .appliesToPriceIds(listOf("string"))
                            .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                            .percentageDiscount(1.0)
                            .reason("string")
                            .build()
                    )
                )
                .discounts(
                    listOf(
                        Discount.ofPercentageDiscount(
                            Discount.PercentageDiscount.builder()
                                .appliesToPriceIds(listOf("string"))
                                .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(1.0)
                                .reason("string")
                                .build()
                        )
                    )
                )
                .dueDate(OffsetDateTime.parse("2022-05-30T07:00:00+00:00"))
                .eligibleToIssueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hostedInvoiceUrl("string")
                .invoiceDate(OffsetDateTime.parse("2022-05-01T07:00:00+00:00"))
                .invoiceNumber("JYEFHK-00001")
                .invoicePdf("https://assets.withorb.com/invoice/rUHdhmg45vY45DX/qEAeuYePaphGMdFb")
                .invoiceSource(Invoice.InvoiceSource.SUBSCRIPTION)
                .issueFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lineItems(
                    listOf(
                        Invoice.LineItem.builder()
                            .id("string")
                            .amount("7.00")
                            .discount(
                                Discount.ofPercentageDiscount(
                                    Discount.PercentageDiscount.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .discountType(
                                            Discount.PercentageDiscount.DiscountType.PERCENTAGE
                                        )
                                        .percentageDiscount(1.0)
                                        .reason("string")
                                        .build()
                                )
                            )
                            .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                            .grouping("string")
                            .maximum(
                                Invoice.LineItem.Maximum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .maximumAmount("string")
                                    .build()
                            )
                            .maximumAmount("string")
                            .minimum(
                                Invoice.LineItem.Minimum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .minimumAmount("string")
                                    .build()
                            )
                            .minimumAmount("string")
                            .name("Fixed Fee")
                            .price(
                                Price.ofUnitPrice(
                                    Price.UnitPrice.builder()
                                        .id("string")
                                        .billableMetric(
                                            Price.UnitPrice.BillableMetric.builder()
                                                .id("string")
                                                .build()
                                        )
                                        .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                        .conversionRate(42.23)
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .creditAllocation(
                                            Price.UnitPrice.CreditAllocation.builder()
                                                .allowsRollover(true)
                                                .currency("string")
                                                .build()
                                        )
                                        .currency("string")
                                        .discount(
                                            Discount.ofPercentageDiscount(
                                                Discount.PercentageDiscount.builder()
                                                    .appliesToPriceIds(listOf("string"))
                                                    .discountType(
                                                        Discount.PercentageDiscount.DiscountType
                                                            .PERCENTAGE
                                                    )
                                                    .percentageDiscount(1.0)
                                                    .reason("string")
                                                    .build()
                                            )
                                        )
                                        .externalPriceId("string")
                                        .fixedPriceQuantity(42.23)
                                        .item(
                                            Price.UnitPrice.Item.builder()
                                                .id("string")
                                                .name("string")
                                                .build()
                                        )
                                        .maximum(
                                            Price.UnitPrice.Maximum.builder()
                                                .appliesToPriceIds(listOf("string"))
                                                .maximumAmount("string")
                                                .build()
                                        )
                                        .maximumAmount("string")
                                        .minimum(
                                            Price.UnitPrice.Minimum.builder()
                                                .appliesToPriceIds(listOf("string"))
                                                .minimumAmount("string")
                                                .build()
                                        )
                                        .minimumAmount("string")
                                        .modelType(Price.UnitPrice.ModelType.UNIT)
                                        .name("string")
                                        .planPhaseOrder(123L)
                                        .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                                        .unitConfig(
                                            Price.UnitPrice.UnitConfig.builder()
                                                .unitAmount("string")
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .quantity(42.23)
                            .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                            .subLineItems(
                                listOf(
                                    Invoice.LineItem.SubLineItem.ofMatrixSubLineItem(
                                        Invoice.LineItem.SubLineItem.MatrixSubLineItem.builder()
                                            .amount("9.00")
                                            .grouping(
                                                Invoice.LineItem.SubLineItem.MatrixSubLineItem
                                                    .Grouping
                                                    .builder()
                                                    .key("region")
                                                    .value("west")
                                                    .build()
                                            )
                                            .matrixConfig(
                                                Invoice.LineItem.SubLineItem.MatrixSubLineItem
                                                    .MatrixConfig
                                                    .builder()
                                                    .dimensionValues(listOf("string"))
                                                    .build()
                                            )
                                            .name("Tier One")
                                            .quantity(42.23)
                                            .type(
                                                Invoice.LineItem.SubLineItem.MatrixSubLineItem.Type
                                                    .MATRIX
                                            )
                                            .build()
                                    )
                                )
                            )
                            .subtotal("9.00")
                            .taxAmounts(
                                listOf(
                                    Invoice.LineItem.TaxAmount.builder()
                                        .amount("string")
                                        .taxRateDescription("string")
                                        .taxRatePercentage("string")
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .maximum(
                    Invoice.Maximum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .maximumAmount("string")
                        .build()
                )
                .maximumAmount("string")
                .memo("string")
                .metadata(Invoice.Metadata.builder().build())
                .minimum(
                    Invoice.Minimum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .minimumAmount("string")
                        .build()
                )
                .minimumAmount("string")
                .paidAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduledIssueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shippingAddress(
                    Invoice.ShippingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .status(Invoice.Status.ISSUED)
                .subscription(Invoice.Subscription.builder().id("VDGsT23osdLb84KD").build())
                .subtotal("8.00")
                .syncFailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .total("8.00")
                .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .willAutoIssue(true)
                .build()
        assertThat(invoice).isNotNull
        assertThat(invoice.id()).isEqualTo("string")
        assertThat(invoice.amountDue()).isEqualTo("8.00")
        assertThat(invoice.autoCollection())
            .isEqualTo(
                Invoice.AutoCollection.builder()
                    .enabled(true)
                    .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoice.billingAddress())
            .contains(
                Invoice.BillingAddress.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(invoice.createdAt()).isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
        assertThat(invoice.creditNotes())
            .containsExactly(
                Invoice.CreditNote.builder()
                    .id("string")
                    .creditNoteNumber("string")
                    .memo("string")
                    .reason("string")
                    .total("string")
                    .type("string")
                    .voidedAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                    .build()
            )
        assertThat(invoice.currency()).isEqualTo("USD")
        assertThat(invoice.customer())
            .isEqualTo(Invoice.Customer.builder().id("string").externalCustomerId("string").build())
        assertThat(invoice.customerBalanceTransactions())
            .containsExactly(
                Invoice.CustomerBalanceTransaction.builder()
                    .id("cgZa3SXcsPTVyC4Y")
                    .action(Invoice.CustomerBalanceTransaction.Action.APPLIED_TO_INVOICE)
                    .amount("11.00")
                    .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                    .creditNote(
                        Invoice.CustomerBalanceTransaction.CreditNote.builder().id("string").build()
                    )
                    .description("An optional description")
                    .endingBalance("22.00")
                    .invoice(
                        Invoice.CustomerBalanceTransaction.Invoice.builder()
                            .id("gXcsPTVyC4YZa3Sc")
                            .build()
                    )
                    .startingBalance("33.00")
                    .type(Invoice.CustomerBalanceTransaction.Type.INCREMENT)
                    .build()
            )
        assertThat(invoice.customerTaxId())
            .contains(
                Invoice.CustomerTaxId.builder()
                    .country(Invoice.CustomerTaxId.Country.AD)
                    .type(Invoice.CustomerTaxId.Type.AD_NRT)
                    .value("string")
                    .build()
            )
        assertThat(invoice.discount())
            .contains(
                Discount.ofPercentageDiscount(
                    Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("string")
                        .build()
                )
            )
        assertThat(invoice.discounts())
            .containsExactly(
                Discount.ofPercentageDiscount(
                    Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("string")
                        .build()
                )
            )
        assertThat(invoice.dueDate()).isEqualTo(OffsetDateTime.parse("2022-05-30T07:00:00+00:00"))
        assertThat(invoice.eligibleToIssueAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.hostedInvoiceUrl()).contains("string")
        assertThat(invoice.invoiceDate())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:00:00+00:00"))
        assertThat(invoice.invoiceNumber()).isEqualTo("JYEFHK-00001")
        assertThat(invoice.invoicePdf())
            .contains("https://assets.withorb.com/invoice/rUHdhmg45vY45DX/qEAeuYePaphGMdFb")
        assertThat(invoice.invoiceSource()).isEqualTo(Invoice.InvoiceSource.SUBSCRIPTION)
        assertThat(invoice.issueFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.issuedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.lineItems())
            .containsExactly(
                Invoice.LineItem.builder()
                    .id("string")
                    .amount("7.00")
                    .discount(
                        Discount.ofPercentageDiscount(
                            Discount.PercentageDiscount.builder()
                                .appliesToPriceIds(listOf("string"))
                                .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(1.0)
                                .reason("string")
                                .build()
                        )
                    )
                    .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                    .grouping("string")
                    .maximum(
                        Invoice.LineItem.Maximum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .maximumAmount("string")
                            .build()
                    )
                    .maximumAmount("string")
                    .minimum(
                        Invoice.LineItem.Minimum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .minimumAmount("string")
                            .build()
                    )
                    .minimumAmount("string")
                    .name("Fixed Fee")
                    .price(
                        Price.ofUnitPrice(
                            Price.UnitPrice.builder()
                                .id("string")
                                .billableMetric(
                                    Price.UnitPrice.BillableMetric.builder().id("string").build()
                                )
                                .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                .conversionRate(42.23)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .creditAllocation(
                                    Price.UnitPrice.CreditAllocation.builder()
                                        .allowsRollover(true)
                                        .currency("string")
                                        .build()
                                )
                                .currency("string")
                                .discount(
                                    Discount.ofPercentageDiscount(
                                        Discount.PercentageDiscount.builder()
                                            .appliesToPriceIds(listOf("string"))
                                            .discountType(
                                                Discount.PercentageDiscount.DiscountType.PERCENTAGE
                                            )
                                            .percentageDiscount(1.0)
                                            .reason("string")
                                            .build()
                                    )
                                )
                                .externalPriceId("string")
                                .fixedPriceQuantity(42.23)
                                .item(
                                    Price.UnitPrice.Item.builder()
                                        .id("string")
                                        .name("string")
                                        .build()
                                )
                                .maximum(
                                    Price.UnitPrice.Maximum.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .maximumAmount("string")
                                        .build()
                                )
                                .maximumAmount("string")
                                .minimum(
                                    Price.UnitPrice.Minimum.builder()
                                        .appliesToPriceIds(listOf("string"))
                                        .minimumAmount("string")
                                        .build()
                                )
                                .minimumAmount("string")
                                .modelType(Price.UnitPrice.ModelType.UNIT)
                                .name("string")
                                .planPhaseOrder(123L)
                                .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                                .unitConfig(
                                    Price.UnitPrice.UnitConfig.builder()
                                        .unitAmount("string")
                                        .build()
                                )
                                .build()
                        )
                    )
                    .quantity(42.23)
                    .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                    .subLineItems(
                        listOf(
                            Invoice.LineItem.SubLineItem.ofMatrixSubLineItem(
                                Invoice.LineItem.SubLineItem.MatrixSubLineItem.builder()
                                    .amount("9.00")
                                    .grouping(
                                        Invoice.LineItem.SubLineItem.MatrixSubLineItem.Grouping
                                            .builder()
                                            .key("region")
                                            .value("west")
                                            .build()
                                    )
                                    .matrixConfig(
                                        Invoice.LineItem.SubLineItem.MatrixSubLineItem.MatrixConfig
                                            .builder()
                                            .dimensionValues(listOf("string"))
                                            .build()
                                    )
                                    .name("Tier One")
                                    .quantity(42.23)
                                    .type(
                                        Invoice.LineItem.SubLineItem.MatrixSubLineItem.Type.MATRIX
                                    )
                                    .build()
                            )
                        )
                    )
                    .subtotal("9.00")
                    .taxAmounts(
                        listOf(
                            Invoice.LineItem.TaxAmount.builder()
                                .amount("string")
                                .taxRateDescription("string")
                                .taxRatePercentage("string")
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(invoice.maximum())
            .contains(
                Invoice.Maximum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .maximumAmount("string")
                    .build()
            )
        assertThat(invoice.maximumAmount()).contains("string")
        assertThat(invoice.memo()).contains("string")
        assertThat(invoice.metadata()).isEqualTo(Invoice.Metadata.builder().build())
        assertThat(invoice.minimum())
            .contains(
                Invoice.Minimum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .minimumAmount("string")
                    .build()
            )
        assertThat(invoice.minimumAmount()).contains("string")
        assertThat(invoice.paidAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.paymentFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.paymentStartedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.scheduledIssueAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.shippingAddress())
            .contains(
                Invoice.ShippingAddress.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(invoice.status()).isEqualTo(Invoice.Status.ISSUED)
        assertThat(invoice.subscription())
            .contains(Invoice.Subscription.builder().id("VDGsT23osdLb84KD").build())
        assertThat(invoice.subtotal()).isEqualTo("8.00")
        assertThat(invoice.syncFailedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.total()).isEqualTo("8.00")
        assertThat(invoice.voidedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.willAutoIssue()).isEqualTo(true)
    }
}
