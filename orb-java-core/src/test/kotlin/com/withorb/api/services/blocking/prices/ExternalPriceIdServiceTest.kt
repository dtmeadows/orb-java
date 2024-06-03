// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.prices

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalPriceIdServiceTest {

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPriceIdService = client.prices().externalPriceId()
        val price =
            externalPriceIdService.fetch(
                PriceExternalPriceIdFetchParams.builder().externalPriceId("string").build()
            )
        println(price)
    }
}
