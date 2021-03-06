package io.mikheevshow.event.listener

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TradeUpdate(
    @JsonProperty("E")
    val eventTime: Long,
    @JsonProperty("s")
    val symbol: String,
    @JsonProperty("t")
    val tradeId: Long,
    @JsonProperty("p")
    val price: Double,
    @JsonProperty("q")
    val quantity: Long,
    @JsonProperty("b")
    val buyerOrderId: Long,
    @JsonProperty("a")
    val sellerOrderId: Long,
    @JsonProperty("T")
    val tradeTime: Long,
    @JsonProperty("m")
    val isBuyerMarketMaker:Boolean,
    @JsonProperty("M")
    val ignore: Boolean
)

interface TradeUpdateListener : BinanceListener<TradeUpdate>