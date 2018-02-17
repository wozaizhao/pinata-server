package com.wozaizhao.coin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Coinbasic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String coin_id;

    private String name;

    private String symbol;

    private Integer rank;

    private Float price_usd;

    private Float price_btc;

    private Float volume_24h_usd;

    private Float market_cap_usd;

    private Float available_supply;

    private Float total_supply;

    private Float max_supply;

    private Float percent_change_1h;

    private Float percent_change_24h;

    private Float percent_change_7d;

    private Integer last_updated;

    private Float price_cny;

    private Float volume_24h_cny;

    private Float market_cap_cny;

    private Date timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoin_id() {
        return coin_id;
    }

    public void setCoin_id(String coin_id) {
        this.coin_id = coin_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Float getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(Float price_usd) {
        this.price_usd = price_usd;
    }

    public Float getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(Float price_btc) {
        this.price_btc = price_btc;
    }

    public Float getVolume_24h_usd() {
        return volume_24h_usd;
    }

    public void setVolume_24h_usd(Float volume_24h_usd) {
        this.volume_24h_usd = volume_24h_usd;
    }

    public Float getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(Float market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public Float getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(Float available_supply) {
        this.available_supply = available_supply;
    }

    public Float getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(Float total_supply) {
        this.total_supply = total_supply;
    }

    public Float getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(Float max_supply) {
        this.max_supply = max_supply;
    }

    public Float getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(Float percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public Float getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(Float percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public Float getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(Float percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public Integer getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Integer last_updated) {
        this.last_updated = last_updated;
    }

    public Float getPrice_cny() {
        return price_cny;
    }

    public void setPrice_cny(Float price_cny) {
        this.price_cny = price_cny;
    }

    public Float getVolume_24h_cny() {
        return volume_24h_cny;
    }

    public void setVolume_24h_cny(Float volume_24h_cny) {
        this.volume_24h_cny = volume_24h_cny;
    }

    public Float getMarket_cap_cny() {
        return market_cap_cny;
    }

    public void setMarket_cap_cny(Float market_cap_cny) {
        this.market_cap_cny = market_cap_cny;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
