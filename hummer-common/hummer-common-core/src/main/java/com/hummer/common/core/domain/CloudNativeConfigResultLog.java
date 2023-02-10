package com.hummer.common.core.domain;

import java.io.Serializable;

public class CloudNativeConfigResultLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_config_result_log.id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_config_result_log.result_id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private String resultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_config_result_log.create_time
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_config_result_log.operator
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_config_result_log.result
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private Boolean result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_config_result_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_config_result_log.id
     *
     * @return the value of cloud_native_config_result_log.id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_config_result_log.id
     *
     * @param id the value for cloud_native_config_result_log.id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_config_result_log.result_id
     *
     * @return the value of cloud_native_config_result_log.result_id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_config_result_log.result_id
     *
     * @param resultId the value for cloud_native_config_result_log.result_id
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_config_result_log.create_time
     *
     * @return the value of cloud_native_config_result_log.create_time
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_config_result_log.create_time
     *
     * @param createTime the value for cloud_native_config_result_log.create_time
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_config_result_log.operator
     *
     * @return the value of cloud_native_config_result_log.operator
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_config_result_log.operator
     *
     * @param operator the value for cloud_native_config_result_log.operator
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_config_result_log.result
     *
     * @return the value of cloud_native_config_result_log.result
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_config_result_log.result
     *
     * @param result the value for cloud_native_config_result_log.result
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    public void setResult(Boolean result) {
        this.result = result;
    }
}
