package com.hummer.common.core.domain;

import java.io.Serializable;

public class CloudNativeSourceSyncLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private String cloudNativeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.create_time
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.operator
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.sum
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private Long sum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_sync_log.result
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private Boolean result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.id
     *
     * @return the value of cloud_native_source_sync_log.id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.id
     *
     * @param id the value for cloud_native_source_sync_log.id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.cloud_native_id
     *
     * @return the value of cloud_native_source_sync_log.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public String getCloudNativeId() {
        return cloudNativeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.cloud_native_id
     *
     * @param cloudNativeId the value for cloud_native_source_sync_log.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setCloudNativeId(String cloudNativeId) {
        this.cloudNativeId = cloudNativeId == null ? null : cloudNativeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.create_time
     *
     * @return the value of cloud_native_source_sync_log.create_time
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.create_time
     *
     * @param createTime the value for cloud_native_source_sync_log.create_time
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.operator
     *
     * @return the value of cloud_native_source_sync_log.operator
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.operator
     *
     * @param operator the value for cloud_native_source_sync_log.operator
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.sum
     *
     * @return the value of cloud_native_source_sync_log.sum
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public Long getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.sum
     *
     * @param sum the value for cloud_native_source_sync_log.sum
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setSum(Long sum) {
        this.sum = sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_sync_log.result
     *
     * @return the value of cloud_native_source_sync_log.result
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_sync_log.result
     *
     * @param result the value for cloud_native_source_sync_log.result
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setResult(Boolean result) {
        this.result = result;
    }
}
