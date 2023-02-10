package com.hummer.common.core.domain;

import java.io.Serializable;

public class CloudNativeResultKubench implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_result_kubench.id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_result_kubench.result_id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private String resultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_result_kubench.number
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private String number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_result_kubench.severity
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private String severity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_result_kubench.create_time
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private Long createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_result_kubench
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_result_kubench.id
     *
     * @return the value of cloud_native_result_kubench.id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_result_kubench.id
     *
     * @param id the value for cloud_native_result_kubench.id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_result_kubench.result_id
     *
     * @return the value of cloud_native_result_kubench.result_id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_result_kubench.result_id
     *
     * @param resultId the value for cloud_native_result_kubench.result_id
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_result_kubench.number
     *
     * @return the value of cloud_native_result_kubench.number
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_result_kubench.number
     *
     * @param number the value for cloud_native_result_kubench.number
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_result_kubench.severity
     *
     * @return the value of cloud_native_result_kubench.severity
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_result_kubench.severity
     *
     * @param severity the value for cloud_native_result_kubench.severity
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_result_kubench.create_time
     *
     * @return the value of cloud_native_result_kubench.create_time
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_result_kubench.create_time
     *
     * @param createTime the value for cloud_native_result_kubench.create_time
     *
     * @mbg.generated Sun Dec 25 23:41:12 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
