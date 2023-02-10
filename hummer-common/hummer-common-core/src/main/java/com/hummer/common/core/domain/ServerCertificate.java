package com.hummer.common.core.domain;

import java.io.Serializable;

public class ServerCertificate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.name
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.description
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.is_public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String isPublicKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.password
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.public_key_path
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String publicKeyPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.creator
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.last_modified
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private Long lastModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.proxy_id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private Integer proxyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_certificate.public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private String publicKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table server_certificate
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.id
     *
     * @return the value of server_certificate.id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.id
     *
     * @param id the value for server_certificate.id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.name
     *
     * @return the value of server_certificate.name
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.name
     *
     * @param name the value for server_certificate.name
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.description
     *
     * @return the value of server_certificate.description
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.description
     *
     * @param description the value for server_certificate.description
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.is_public_key
     *
     * @return the value of server_certificate.is_public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getIsPublicKey() {
        return isPublicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.is_public_key
     *
     * @param isPublicKey the value for server_certificate.is_public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setIsPublicKey(String isPublicKey) {
        this.isPublicKey = isPublicKey == null ? null : isPublicKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.password
     *
     * @return the value of server_certificate.password
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.password
     *
     * @param password the value for server_certificate.password
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.public_key_path
     *
     * @return the value of server_certificate.public_key_path
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.public_key_path
     *
     * @param publicKeyPath the value for server_certificate.public_key_path
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath == null ? null : publicKeyPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.creator
     *
     * @return the value of server_certificate.creator
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.creator
     *
     * @param creator the value for server_certificate.creator
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.last_modified
     *
     * @return the value of server_certificate.last_modified
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.last_modified
     *
     * @param lastModified the value for server_certificate.last_modified
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.proxy_id
     *
     * @return the value of server_certificate.proxy_id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public Integer getProxyId() {
        return proxyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.proxy_id
     *
     * @param proxyId the value for server_certificate.proxy_id
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_certificate.public_key
     *
     * @return the value of server_certificate.public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_certificate.public_key
     *
     * @param publicKey the value for server_certificate.public_key
     *
     * @mbg.generated Wed Sep 21 13:59:35 CST 2022
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }
}
