package me.zhengjie.modules.system.domain;


import me.zhengjie.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="goods")
public class Goods extends BaseEntity implements Serializable {


  private long id;
  private long goodsId;
  private String statDate;
  private String goodsName;
  private String goodsFavCnt;
  private String goodsUv;
  private String goodsPv;
  private String payOrdrCnt;
  private String goodsVcr;
  private String pctGoodsVcr;
  private String payOrdrGoodsQty;
  private String payOrdrUsrCnt;
  private String payOrdrAmt;
  private String cfmOrdrCnt;
  private String cfmOrdrGoodsQty;
  private String goodsUvPpr;
  private String goodsPvPpr;
  private String payOrdrCntPpr;
  private String goodsVcrPpr;
  private String cfmOrdrRtoPpr;
  private String goodsFavCntPpr;
  private String payOrdrGoodsQtyPpr;
  private String payOrdrUsrCntPpr;
  private String payOrdrAmtPpr;
  private String cfmOrdrCntPpr;
  private String cfmOrdrGoodsQtyPpr;
  private String goodsUvPprIsPercent;
  private String goodsPvPprIsPercent;
  private String payOrdrCntPprIsPercent;
  private String goodsVcrPprIsPercent;
  private String cfmOrdrRtoPprIsPercent;
  private String goodsFavCntPprIsPercent;
  private String payOrdrGoodsQtyPprIsPercent;
  private String payOrdrUsrCntPprIsPercent;
  private String payOrdrAmtPprIsPercent;
  private String cfmOrdrCntPprIsPercent;
  private String cfmOrdrGoodsQtyPprIsPercent;
  private String hdThumbUrl;
  private String cate3PctGoodsVcr;
  private String cate3AvgGoodsVcr;
  private String cate3IsPgvAbove;
  private String isCreated1M;
  private String isNewstyle;


  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)   //自增长
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getStatDate() {
    return statDate;
  }

  public void setStatDate(String statDate) {
    this.statDate = statDate;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getGoodsFavCnt() {
    return goodsFavCnt;
  }

  public void setGoodsFavCnt(String goodsFavCnt) {
    this.goodsFavCnt = goodsFavCnt;
  }


  public String getGoodsUv() {
    return goodsUv;
  }

  public void setGoodsUv(String goodsUv) {
    this.goodsUv = goodsUv;
  }


  public String getGoodsPv() {
    return goodsPv;
  }

  public void setGoodsPv(String goodsPv) {
    this.goodsPv = goodsPv;
  }


  public String getPayOrdrCnt() {
    return payOrdrCnt;
  }

  public void setPayOrdrCnt(String payOrdrCnt) {
    this.payOrdrCnt = payOrdrCnt;
  }


  public String getGoodsVcr() {
    return goodsVcr;
  }

  public void setGoodsVcr(String goodsVcr) {
    this.goodsVcr = goodsVcr;
  }


  public String getPctGoodsVcr() {
    return pctGoodsVcr;
  }

  public void setPctGoodsVcr(String pctGoodsVcr) {
    this.pctGoodsVcr = pctGoodsVcr;
  }


  public String getPayOrdrGoodsQty() {
    return payOrdrGoodsQty;
  }

  public void setPayOrdrGoodsQty(String payOrdrGoodsQty) {
    this.payOrdrGoodsQty = payOrdrGoodsQty;
  }


  public String getPayOrdrUsrCnt() {
    return payOrdrUsrCnt;
  }

  public void setPayOrdrUsrCnt(String payOrdrUsrCnt) {
    this.payOrdrUsrCnt = payOrdrUsrCnt;
  }


  public String getPayOrdrAmt() {
    return payOrdrAmt;
  }

  public void setPayOrdrAmt(String payOrdrAmt) {
    this.payOrdrAmt = payOrdrAmt;
  }


  public String getCfmOrdrCnt() {
    return cfmOrdrCnt;
  }

  public void setCfmOrdrCnt(String cfmOrdrCnt) {
    this.cfmOrdrCnt = cfmOrdrCnt;
  }


  public String getCfmOrdrGoodsQty() {
    return cfmOrdrGoodsQty;
  }

  public void setCfmOrdrGoodsQty(String cfmOrdrGoodsQty) {
    this.cfmOrdrGoodsQty = cfmOrdrGoodsQty;
  }


  public String getGoodsUvPpr() {
    return goodsUvPpr;
  }

  public void setGoodsUvPpr(String goodsUvPpr) {
    this.goodsUvPpr = goodsUvPpr;
  }


  public String getGoodsPvPpr() {
    return goodsPvPpr;
  }

  public void setGoodsPvPpr(String goodsPvPpr) {
    this.goodsPvPpr = goodsPvPpr;
  }


  public String getPayOrdrCntPpr() {
    return payOrdrCntPpr;
  }

  public void setPayOrdrCntPpr(String payOrdrCntPpr) {
    this.payOrdrCntPpr = payOrdrCntPpr;
  }


  public String getGoodsVcrPpr() {
    return goodsVcrPpr;
  }

  public void setGoodsVcrPpr(String goodsVcrPpr) {
    this.goodsVcrPpr = goodsVcrPpr;
  }


  public String getCfmOrdrRtoPpr() {
    return cfmOrdrRtoPpr;
  }

  public void setCfmOrdrRtoPpr(String cfmOrdrRtoPpr) {
    this.cfmOrdrRtoPpr = cfmOrdrRtoPpr;
  }


  public String getGoodsFavCntPpr() {
    return goodsFavCntPpr;
  }

  public void setGoodsFavCntPpr(String goodsFavCntPpr) {
    this.goodsFavCntPpr = goodsFavCntPpr;
  }


  public String getPayOrdrGoodsQtyPpr() {
    return payOrdrGoodsQtyPpr;
  }

  public void setPayOrdrGoodsQtyPpr(String payOrdrGoodsQtyPpr) {
    this.payOrdrGoodsQtyPpr = payOrdrGoodsQtyPpr;
  }


  public String getPayOrdrUsrCntPpr() {
    return payOrdrUsrCntPpr;
  }

  public void setPayOrdrUsrCntPpr(String payOrdrUsrCntPpr) {
    this.payOrdrUsrCntPpr = payOrdrUsrCntPpr;
  }


  public String getPayOrdrAmtPpr() {
    return payOrdrAmtPpr;
  }

  public void setPayOrdrAmtPpr(String payOrdrAmtPpr) {
    this.payOrdrAmtPpr = payOrdrAmtPpr;
  }


  public String getCfmOrdrCntPpr() {
    return cfmOrdrCntPpr;
  }

  public void setCfmOrdrCntPpr(String cfmOrdrCntPpr) {
    this.cfmOrdrCntPpr = cfmOrdrCntPpr;
  }


  public String getCfmOrdrGoodsQtyPpr() {
    return cfmOrdrGoodsQtyPpr;
  }

  public void setCfmOrdrGoodsQtyPpr(String cfmOrdrGoodsQtyPpr) {
    this.cfmOrdrGoodsQtyPpr = cfmOrdrGoodsQtyPpr;
  }


  public String getGoodsUvPprIsPercent() {
    return goodsUvPprIsPercent;
  }

  public void setGoodsUvPprIsPercent(String goodsUvPprIsPercent) {
    this.goodsUvPprIsPercent = goodsUvPprIsPercent;
  }


  public String getGoodsPvPprIsPercent() {
    return goodsPvPprIsPercent;
  }

  public void setGoodsPvPprIsPercent(String goodsPvPprIsPercent) {
    this.goodsPvPprIsPercent = goodsPvPprIsPercent;
  }


  public String getPayOrdrCntPprIsPercent() {
    return payOrdrCntPprIsPercent;
  }

  public void setPayOrdrCntPprIsPercent(String payOrdrCntPprIsPercent) {
    this.payOrdrCntPprIsPercent = payOrdrCntPprIsPercent;
  }


  public String getGoodsVcrPprIsPercent() {
    return goodsVcrPprIsPercent;
  }

  public void setGoodsVcrPprIsPercent(String goodsVcrPprIsPercent) {
    this.goodsVcrPprIsPercent = goodsVcrPprIsPercent;
  }


  public String getCfmOrdrRtoPprIsPercent() {
    return cfmOrdrRtoPprIsPercent;
  }

  public void setCfmOrdrRtoPprIsPercent(String cfmOrdrRtoPprIsPercent) {
    this.cfmOrdrRtoPprIsPercent = cfmOrdrRtoPprIsPercent;
  }


  public String getGoodsFavCntPprIsPercent() {
    return goodsFavCntPprIsPercent;
  }

  public void setGoodsFavCntPprIsPercent(String goodsFavCntPprIsPercent) {
    this.goodsFavCntPprIsPercent = goodsFavCntPprIsPercent;
  }


  public String getPayOrdrGoodsQtyPprIsPercent() {
    return payOrdrGoodsQtyPprIsPercent;
  }

  public void setPayOrdrGoodsQtyPprIsPercent(String payOrdrGoodsQtyPprIsPercent) {
    this.payOrdrGoodsQtyPprIsPercent = payOrdrGoodsQtyPprIsPercent;
  }


  public String getPayOrdrUsrCntPprIsPercent() {
    return payOrdrUsrCntPprIsPercent;
  }

  public void setPayOrdrUsrCntPprIsPercent(String payOrdrUsrCntPprIsPercent) {
    this.payOrdrUsrCntPprIsPercent = payOrdrUsrCntPprIsPercent;
  }


  public String getPayOrdrAmtPprIsPercent() {
    return payOrdrAmtPprIsPercent;
  }

  public void setPayOrdrAmtPprIsPercent(String payOrdrAmtPprIsPercent) {
    this.payOrdrAmtPprIsPercent = payOrdrAmtPprIsPercent;
  }


  public String getCfmOrdrCntPprIsPercent() {
    return cfmOrdrCntPprIsPercent;
  }

  public void setCfmOrdrCntPprIsPercent(String cfmOrdrCntPprIsPercent) {
    this.cfmOrdrCntPprIsPercent = cfmOrdrCntPprIsPercent;
  }


  public String getCfmOrdrGoodsQtyPprIsPercent() {
    return cfmOrdrGoodsQtyPprIsPercent;
  }

  public void setCfmOrdrGoodsQtyPprIsPercent(String cfmOrdrGoodsQtyPprIsPercent) {
    this.cfmOrdrGoodsQtyPprIsPercent = cfmOrdrGoodsQtyPprIsPercent;
  }


  public String getHdThumbUrl() {
    return hdThumbUrl;
  }

  public void setHdThumbUrl(String hdThumbUrl) {
    this.hdThumbUrl = hdThumbUrl;
  }


  public String getCate3PctGoodsVcr() {
    return cate3PctGoodsVcr;
  }

  public void setCate3PctGoodsVcr(String cate3PctGoodsVcr) {
    this.cate3PctGoodsVcr = cate3PctGoodsVcr;
  }


  public String getCate3AvgGoodsVcr() {
    return cate3AvgGoodsVcr;
  }

  public void setCate3AvgGoodsVcr(String cate3AvgGoodsVcr) {
    this.cate3AvgGoodsVcr = cate3AvgGoodsVcr;
  }


  public String getCate3IsPgvAbove() {
    return cate3IsPgvAbove;
  }

  public void setCate3IsPgvAbove(String cate3IsPgvAbove) {
    this.cate3IsPgvAbove = cate3IsPgvAbove;
  }


  public String getIsCreated1M() {
    return isCreated1M;
  }

  public void setIsCreated1M(String isCreated1M) {
    this.isCreated1M = isCreated1M;
  }


  public String getIsNewstyle() {
    return isNewstyle;
  }

  public void setIsNewstyle(String isNewstyle) {
    this.isNewstyle = isNewstyle;
  }

}
