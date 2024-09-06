// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillListParamsTest {

    @Test
    fun createEventBackfillListParams() {
        EventBackfillListParams.builder().cursor("cursor").limit(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = EventBackfillListParams.builder().cursor("cursor").limit(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventBackfillListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
