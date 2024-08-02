// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTest {

    @Test
    fun createPlan() {
        val plan =
            Plan.builder()
                .id("id")
                .basePlan(
                    Plan.BasePlan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .basePlanId("base_plan_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .defaultInvoiceMemo("default_invoice_memo")
                .description("description")
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
                .externalPlanId("external_plan_id")
                .invoicingCurrency("invoicing_currency")
                .maximum(
                    Plan.Maximum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .maximumAmount("maximum_amount")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .metadata(Plan.Metadata.builder().build())
                .minimum(
                    Plan.Minimum.builder()
                        .appliesToPriceIds(listOf("string"))
                        .minimumAmount("minimum_amount")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .name("name")
                .netTerms(123L)
                .planPhases(
                    listOf(
                        Plan.PlanPhase.builder()
                            .id("id")
                            .description("description")
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
                            .duration(123L)
                            .durationUnit(Plan.PlanPhase.DurationUnit.DAILY)
                            .maximum(
                                Plan.PlanPhase.Maximum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .maximumAmount("maximum_amount")
                                    .build()
                            )
                            .maximumAmount("maximum_amount")
                            .minimum(
                                Plan.PlanPhase.Minimum.builder()
                                    .appliesToPriceIds(listOf("string"))
                                    .minimumAmount("minimum_amount")
                                    .build()
                            )
                            .minimumAmount("minimum_amount")
                            .name("name")
                            .order(123L)
                            .build()
                    )
                )
                .prices(
                    listOf(
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
                )
                .product(
                    Plan.Product.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .build()
                )
                .status(Plan.Status.ACTIVE)
                .trialConfig(
                    Plan.TrialConfig.builder()
                        .trialPeriod(123L)
                        .trialPeriodUnit(Plan.TrialConfig.TrialPeriodUnit.DAYS)
                        .build()
                )
                .version(123L)
                .build()
        assertThat(plan).isNotNull
        assertThat(plan.id()).isEqualTo("id")
        assertThat(plan.basePlan())
            .contains(
                Plan.BasePlan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(plan.basePlanId()).contains("base_plan_id")
        assertThat(plan.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(plan.currency()).isEqualTo("currency")
        assertThat(plan.defaultInvoiceMemo()).contains("default_invoice_memo")
        assertThat(plan.description()).isEqualTo("description")
        assertThat(plan.discount())
            .contains(
                Discount.ofPercentageDiscount(
                    Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(plan.externalPlanId()).contains("external_plan_id")
        assertThat(plan.invoicingCurrency()).isEqualTo("invoicing_currency")
        assertThat(plan.maximum())
            .contains(
                Plan.Maximum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .maximumAmount("maximum_amount")
                    .build()
            )
        assertThat(plan.maximumAmount()).contains("maximum_amount")
        assertThat(plan.metadata()).isEqualTo(Plan.Metadata.builder().build())
        assertThat(plan.minimum())
            .contains(
                Plan.Minimum.builder()
                    .appliesToPriceIds(listOf("string"))
                    .minimumAmount("minimum_amount")
                    .build()
            )
        assertThat(plan.minimumAmount()).contains("minimum_amount")
        assertThat(plan.name()).isEqualTo("name")
        assertThat(plan.netTerms()).contains(123L)
        assertThat(plan.planPhases().get())
            .containsExactly(
                Plan.PlanPhase.builder()
                    .id("id")
                    .description("description")
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
                    .duration(123L)
                    .durationUnit(Plan.PlanPhase.DurationUnit.DAILY)
                    .maximum(
                        Plan.PlanPhase.Maximum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .maximumAmount("maximum_amount")
                            .build()
                    )
                    .maximumAmount("maximum_amount")
                    .minimum(
                        Plan.PlanPhase.Minimum.builder()
                            .appliesToPriceIds(listOf("string"))
                            .minimumAmount("minimum_amount")
                            .build()
                    )
                    .minimumAmount("minimum_amount")
                    .name("name")
                    .order(123L)
                    .build()
            )
        assertThat(plan.prices())
            .containsExactly(
                Price.ofUnitPrice(
                    Price.UnitPrice.builder()
                        .id("id")
                        .billableMetric(Price.UnitPrice.BillableMetric.builder().id("id").build())
                        .billingCycleConfiguration(
                            Price.UnitPrice.BillingCycleConfiguration.builder()
                                .duration(123L)
                                .durationUnit(
                                    Price.UnitPrice.BillingCycleConfiguration.DurationUnit.DAY
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
                            Price.UnitPrice.UnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(plan.product())
            .isEqualTo(
                Plan.Product.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .build()
            )
        assertThat(plan.status()).isEqualTo(Plan.Status.ACTIVE)
        assertThat(plan.trialConfig())
            .isEqualTo(
                Plan.TrialConfig.builder()
                    .trialPeriod(123L)
                    .trialPeriodUnit(Plan.TrialConfig.TrialPeriodUnit.DAYS)
                    .build()
            )
        assertThat(plan.version()).isEqualTo(123L)
    }
}
