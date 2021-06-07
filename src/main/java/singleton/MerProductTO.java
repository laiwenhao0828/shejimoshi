/*
 * Unpay.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package singleton;

import java.io.Serializable;
import java.util.Date;

/**
 * 签约/未签约 产品传输实体
 * @author zhangge
 * @version MerProductTO.java, 2018/5/5 19:10
 */
public class MerProductTO implements Serializable {

    private static final long serialVersionUID = -2790140209286223224L;
    /**
     * 产品号
     */
    private String productNo;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 签约状态,1:签约，2：未签约
     */
    private String signType;

    /**
     * 失效时间
     */
    private Date failDate;

    /**
     * 签约产品的商户号
     */
    private String merNo;



    private MerProductTO(String productNo, String productName, String signType, Date failDate) {
        this.productNo = productNo;
        this.productName = productName;
        this.signType = signType;
        this.failDate = failDate;
    }

    public static MerProductTOBuilder builder() {
        return new MerProductTOBuilder();
    }

    public static class MerProductTOBuilder implements Serializable{
        private static final long serialVersionUID = -8225388125411899523L;
        /**
         * 产品号
         */
        private String productNo;

        /**
         * 产品名称
         */
        private String productName;

        /**
         * 签约状态,1:签约，2：未签约
         */
        private String signType;

        /**
         * 失效时间
         */
        private Date failDate;

        private MerProductTOBuilder() {
        }

        public MerProductTOBuilder productNo(String productNo) {
            this.productNo = productNo;
            return this;
        }

        public MerProductTOBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public MerProductTOBuilder signType(String signType) {
            this.signType = signType;
            return this;
        }

        public MerProductTOBuilder failDate(Date failDate) {
            this.failDate = failDate;
            return this;
        }

        public MerProductTO build() {
            return new MerProductTO(productNo, productName, signType, failDate);
        }
    }

    /**
     * Setter method for <tt>productNo</tt>.
     *
     * @param productNo value to be assigned to productNo
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * Setter method for <tt>productName</tt>.
     *
     * @param productName value to be assigned to productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Setter method for <tt>signType</tt>.
     *
     * @param signType value to be assigned to signType
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * Setter method for <tt>failDate</tt>.
     *
     * @param failDate value to be assigned to failDate
     */
    public void setFailDate(Date failDate) {
        this.failDate = failDate;
    }

    /**
     * Getter method for <tt>productNo</tt>.
     *
     * @return value of productNo
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * Getter method for <tt>productName</tt>.
     *
     * @return value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Getter method for <tt>signType</tt>.
     *
     * @return value of signType
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Getter method for <tt>failDate</tt>.
     *
     * @return value of failDate
     */
    public Date getFailDate() {
        return failDate;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo;
    }
}
