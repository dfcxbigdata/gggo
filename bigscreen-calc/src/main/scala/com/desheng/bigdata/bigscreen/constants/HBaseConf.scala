package com.desheng.bigdata.bigscreen.constants

/**
  * hbase的配置信息
  * create 'bd_1809:sale_total_amt', 'cf'
    create 'bd_1809:shop_amt_rank', 'cf'
    create 'bd_1809:time_amt_trend', 'cf'
  */
object HBaseConf {
    val TABLE_SALE_TOTAL_AMT = "bd_1809:sale_total_amt"
    val CF_SALE_TOTAL_AMT = "cf".getBytes()
    val RK_SALE_TOTAL_AMT = "sta".getBytes()
    val COL_SALE_TOTAL_AMT = "total_amt".getBytes()
    val TABLE_SHOP_AMT_RANK = "bd_1809:shop_amt_rank"
    val TABLE_TIME_AMT_TREND = "bd_1809:time_amt_trend"

}
