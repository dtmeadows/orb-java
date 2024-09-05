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
import com.withorb.api.models.EventBackfillFetchResponse

class EventBackfillFetchResponseTest {

    @Test
    fun createEventBackfillFetchResponse() {
      val eventBackfillFetchResponse = EventBackfillFetchResponse.builder()
          .id("id")
          .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .eventsIngested(123L)
          .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .status(EventBackfillFetchResponse.Status.PENDING)
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .build()
      assertThat(eventBackfillFetchResponse).isNotNull
      assertThat(eventBackfillFetchResponse.id()).isEqualTo("id")
      assertThat(eventBackfillFetchResponse.closeTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillFetchResponse.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillFetchResponse.customerId()).contains("customer_id")
      assertThat(eventBackfillFetchResponse.eventsIngested()).isEqualTo(123L)
      assertThat(eventBackfillFetchResponse.revertedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillFetchResponse.status()).isEqualTo(EventBackfillFetchResponse.Status.PENDING)
      assertThat(eventBackfillFetchResponse.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillFetchResponse.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillFetchResponse.deprecationFilter()).contains("my_numeric_property > 100 AND my_other_property = 'bar'")
    }
}
