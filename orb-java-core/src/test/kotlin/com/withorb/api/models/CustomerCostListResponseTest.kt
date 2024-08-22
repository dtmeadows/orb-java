// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCostListResponse

class CustomerCostListResponseTest {

    @Test
    fun createCustomerCostListResponse() {
      val customerCostListResponse = CustomerCostListResponse.builder()
          .data(listOf(CustomerCostListResponse.Data.builder()
              .perPriceCosts(listOf(CustomerCostListResponse.Data.PerPriceCost.builder()
                  .price(Price.ofUnitPrice(Price.UnitPrice.builder()
                      .id("id")
                      .billableMetric(Price.UnitPrice.BillableMetric.builder()
                          .id("id")
                          .build())
                      .billingCycleConfiguration(Price.UnitPrice.BillingCycleConfiguration.builder()
                          .duration(123L)
                          .durationUnit(Price.UnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                          .build())
                      .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                      .conversionRate(42.23)
                      .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .creditAllocation(Price.UnitPrice.CreditAllocation.builder()
                          .allowsRollover(true)
                          .currency("currency")
                          .build())
                      .currency("currency")
                      .discount(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
                          .appliesToPriceIds(listOf("string"))
                          .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                          .percentageDiscount(1.0)
                          .reason("reason")
                          .build()))
                      .externalPriceId("external_price_id")
                      .fixedPriceQuantity(42.23)
                      .item(Price.UnitPrice.Item.builder()
                          .id("id")
                          .name("name")
                          .build())
                      .maximum(Price.UnitPrice.Maximum.builder()
                          .appliesToPriceIds(listOf("string"))
                          .maximumAmount("maximum_amount")
                          .build())
                      .maximumAmount("maximum_amount")
                      .metadata(Price.UnitPrice.Metadata.builder().build())
                      .minimum(Price.UnitPrice.Minimum.builder()
                          .appliesToPriceIds(listOf("string"))
                          .minimumAmount("minimum_amount")
                          .build())
                      .minimumAmount("minimum_amount")
                      .modelType(Price.UnitPrice.ModelType.UNIT)
                      .name("name")
                      .planPhaseOrder(123L)
                      .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                      .unitConfig(Price.UnitPrice.UnitConfig.builder()
                          .unitAmount("unit_amount")
                          .build())
                      .build()))
                  .subtotal("subtotal")
                  .total("total")
                  .quantity(42.23)
                  .build()))
              .subtotal("subtotal")
              .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .total("total")
              .build()))
          .build()
      assertThat(customerCostListResponse).isNotNull
      assertThat(customerCostListResponse.data()).containsExactly(CustomerCostListResponse.Data.builder()
          .perPriceCosts(listOf(CustomerCostListResponse.Data.PerPriceCost.builder()
              .price(Price.ofUnitPrice(Price.UnitPrice.builder()
                  .id("id")
                  .billableMetric(Price.UnitPrice.BillableMetric.builder()
                      .id("id")
                      .build())
                  .billingCycleConfiguration(Price.UnitPrice.BillingCycleConfiguration.builder()
                      .duration(123L)
                      .durationUnit(Price.UnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                      .build())
                  .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                  .conversionRate(42.23)
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .creditAllocation(Price.UnitPrice.CreditAllocation.builder()
                      .allowsRollover(true)
                      .currency("currency")
                      .build())
                  .currency("currency")
                  .discount(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
                      .appliesToPriceIds(listOf("string"))
                      .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                      .percentageDiscount(1.0)
                      .reason("reason")
                      .build()))
                  .externalPriceId("external_price_id")
                  .fixedPriceQuantity(42.23)
                  .item(Price.UnitPrice.Item.builder()
                      .id("id")
                      .name("name")
                      .build())
                  .maximum(Price.UnitPrice.Maximum.builder()
                      .appliesToPriceIds(listOf("string"))
                      .maximumAmount("maximum_amount")
                      .build())
                  .maximumAmount("maximum_amount")
                  .metadata(Price.UnitPrice.Metadata.builder().build())
                  .minimum(Price.UnitPrice.Minimum.builder()
                      .appliesToPriceIds(listOf("string"))
                      .minimumAmount("minimum_amount")
                      .build())
                  .minimumAmount("minimum_amount")
                  .modelType(Price.UnitPrice.ModelType.UNIT)
                  .name("name")
                  .planPhaseOrder(123L)
                  .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                  .unitConfig(Price.UnitPrice.UnitConfig.builder()
                      .unitAmount("unit_amount")
                      .build())
                  .build()))
              .subtotal("subtotal")
              .total("total")
              .quantity(42.23)
              .build()))
          .subtotal("subtotal")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .total("total")
          .build())
    }
}
