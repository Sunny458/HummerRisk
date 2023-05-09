package com.hummer.common.core.domain;

import java.io.Serializable;

public class ImageGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.id
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.name
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.repository
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private String repository;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.create_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.update_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group.creator
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table image_group
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.id
     *
     * @return the value of image_group.id
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.id
     *
     * @param id the value for image_group.id
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.name
     *
     * @return the value of image_group.name
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.name
     *
     * @param name the value for image_group.name
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.repository
     *
     * @return the value of image_group.repository
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public String getRepository() {
        return repository;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.repository
     *
     * @param repository the value for image_group.repository
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setRepository(String repository) {
        this.repository = repository == null ? null : repository.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.create_time
     *
     * @return the value of image_group.create_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.create_time
     *
     * @param createTime the value for image_group.create_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.update_time
     *
     * @return the value of image_group.update_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.update_time
     *
     * @param updateTime the value for image_group.update_time
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group.creator
     *
     * @return the value of image_group.creator
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group.creator
     *
     * @param creator the value for image_group.creator
     *
     * @mbg.generated Wed May 10 00:39:30 CST 2023
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}
