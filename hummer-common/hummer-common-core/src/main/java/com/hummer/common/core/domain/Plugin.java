package com.hummer.common.core.domain;

import java.io.Serializable;

public class Plugin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.id
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.name
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.icon
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.update_time
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.scan_type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private String scanType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.order_
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private Long order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plugin.type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plugin
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.id
     *
     * @return the value of plugin.id
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.id
     *
     * @param id the value for plugin.id
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.name
     *
     * @return the value of plugin.name
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.name
     *
     * @param name the value for plugin.name
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.icon
     *
     * @return the value of plugin.icon
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.icon
     *
     * @param icon the value for plugin.icon
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.update_time
     *
     * @return the value of plugin.update_time
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.update_time
     *
     * @param updateTime the value for plugin.update_time
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.scan_type
     *
     * @return the value of plugin.scan_type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.scan_type
     *
     * @param scanType the value for plugin.scan_type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setScanType(String scanType) {
        this.scanType = scanType == null ? null : scanType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.order_
     *
     * @return the value of plugin.order_
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public Long getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.order_
     *
     * @param order the value for plugin.order_
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setOrder(Long order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plugin.type
     *
     * @return the value of plugin.type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plugin.type
     *
     * @param type the value for plugin.type
     *
     * @mbg.generated Sun Aug 07 03:33:27 CST 2022
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
