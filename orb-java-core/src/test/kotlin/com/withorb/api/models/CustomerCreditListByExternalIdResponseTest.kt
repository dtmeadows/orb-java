// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditListByExternalIdResponseTest {

    @Test
    fun createCustomerCreditListByExternalIdResponse() {
        val customerCreditListByExternalIdResponse =
            CustomerCreditListByExternalIdResponse.builder()
                .id("id")
                .balance(42.23)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumInitialBalance(42.23)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                .build()
        assertThat(customerCreditListByExternalIdResponse).isNotNull
        assertThat(customerCreditListByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditListByExternalIdResponse.balance()).isEqualTo(42.23)
        assertThat(customerCreditListByExternalIdResponse.effectiveDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.expiryDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.maximumInitialBalance()).contains(42.23)
        assertThat(customerCreditListByExternalIdResponse.perUnitCostBasis())
            .contains("per_unit_cost_basis")
        assertThat(customerCreditListByExternalIdResponse.status())
            .isEqualTo(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
    }
}
