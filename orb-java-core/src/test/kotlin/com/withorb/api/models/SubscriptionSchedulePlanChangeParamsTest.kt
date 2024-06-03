// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionSchedulePlanChangeParamsTest {

    @Test
    fun createSubscriptionSchedulePlanChangeParams() {
        SubscriptionSchedulePlanChangeParams.builder()
            .subscriptionId("string")
            .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
            .alignBillingWithPlanChangeDate(true)
            .billingCycleAlignment(
                SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
            )
            .changeDate("2017-07-21T17:32:28Z")
            .couponRedemptionCode("string")
            .creditsOverageRate(42.23)
            .externalPlanId("ZMwNQefe7J3ecf7W")
            .initialPhaseOrder(123L)
            .invoicingThreshold("10.00")
            .perCreditOverageAmount(42.23)
            .planId("ZMwNQefe7J3ecf7W")
            .priceOverrides(
                listOf(
                    SubscriptionSchedulePlanChangeParams.PriceOverride.ofOverrideUnitPrice(
                        SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                            .builder()
                            .id("string")
                            .modelType(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .ModelType
                                    .UNIT
                            )
                            .unitConfig(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .UnitConfig
                                    .builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .conversionRate(42.23)
                            .currency("string")
                            .discount(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .Discount
                                    .builder()
                                    .discountType(
                                        SubscriptionSchedulePlanChangeParams.PriceOverride
                                            .OverrideUnitPrice
                                            .Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("string")
                                    .appliesToPriceIds(listOf("string"))
                                    .percentageDiscount(42.23)
                                    .trialAmountDiscount("string")
                                    .usageDiscount(42.23)
                                    .build()
                            )
                            .fixedPriceQuantity(42.23)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .build()
                    )
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionSchedulePlanChangeParams.builder()
                .subscriptionId("string")
                .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                .alignBillingWithPlanChangeDate(true)
                .billingCycleAlignment(
                    SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
                )
                .changeDate("2017-07-21T17:32:28Z")
                .couponRedemptionCode("string")
                .creditsOverageRate(42.23)
                .externalPlanId("ZMwNQefe7J3ecf7W")
                .initialPhaseOrder(123L)
                .invoicingThreshold("10.00")
                .perCreditOverageAmount(42.23)
                .planId("ZMwNQefe7J3ecf7W")
                .priceOverrides(
                    listOf(
                        SubscriptionSchedulePlanChangeParams.PriceOverride.ofOverrideUnitPrice(
                            SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                .builder()
                                .id("string")
                                .modelType(
                                    SubscriptionSchedulePlanChangeParams.PriceOverride
                                        .OverrideUnitPrice
                                        .ModelType
                                        .UNIT
                                )
                                .unitConfig(
                                    SubscriptionSchedulePlanChangeParams.PriceOverride
                                        .OverrideUnitPrice
                                        .UnitConfig
                                        .builder()
                                        .unitAmount("string")
                                        .build()
                                )
                                .conversionRate(42.23)
                                .currency("string")
                                .discount(
                                    SubscriptionSchedulePlanChangeParams.PriceOverride
                                        .OverrideUnitPrice
                                        .Discount
                                        .builder()
                                        .discountType(
                                            SubscriptionSchedulePlanChangeParams.PriceOverride
                                                .OverrideUnitPrice
                                                .Discount
                                                .DiscountType
                                                .PERCENTAGE
                                        )
                                        .amountDiscount("string")
                                        .appliesToPriceIds(listOf("string"))
                                        .percentageDiscount(42.23)
                                        .trialAmountDiscount("string")
                                        .usageDiscount(42.23)
                                        .build()
                                )
                                .fixedPriceQuantity(42.23)
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.changeOption())
            .isEqualTo(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
        assertThat(body.alignBillingWithPlanChangeDate()).isEqualTo(true)
        assertThat(body.billingCycleAlignment())
            .isEqualTo(SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED)
        assertThat(body.changeDate()).isEqualTo("2017-07-21T17:32:28Z")
        assertThat(body.couponRedemptionCode()).isEqualTo("string")
        assertThat(body.creditsOverageRate()).isEqualTo(42.23)
        assertThat(body.externalPlanId()).isEqualTo("ZMwNQefe7J3ecf7W")
        assertThat(body.initialPhaseOrder()).isEqualTo(123L)
        assertThat(body.invoicingThreshold()).isEqualTo("10.00")
        assertThat(body.perCreditOverageAmount()).isEqualTo(42.23)
        assertThat(body.planId()).isEqualTo("ZMwNQefe7J3ecf7W")
        assertThat(body.priceOverrides())
            .isEqualTo(
                listOf(
                    SubscriptionSchedulePlanChangeParams.PriceOverride.ofOverrideUnitPrice(
                        SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                            .builder()
                            .id("string")
                            .modelType(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .ModelType
                                    .UNIT
                            )
                            .unitConfig(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .UnitConfig
                                    .builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .conversionRate(42.23)
                            .currency("string")
                            .discount(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .Discount
                                    .builder()
                                    .discountType(
                                        SubscriptionSchedulePlanChangeParams.PriceOverride
                                            .OverrideUnitPrice
                                            .Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("string")
                                    .appliesToPriceIds(listOf("string"))
                                    .percentageDiscount(42.23)
                                    .trialAmountDiscount("string")
                                    .usageDiscount(42.23)
                                    .build()
                            )
                            .fixedPriceQuantity(42.23)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .build()
                    )
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SubscriptionSchedulePlanChangeParams.builder()
                .subscriptionId("string")
                .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.changeOption())
            .isEqualTo(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionSchedulePlanChangeParams.builder()
                .subscriptionId("string")
                .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
