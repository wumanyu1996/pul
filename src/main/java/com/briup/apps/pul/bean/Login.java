package com.briup.apps.pul.bean;

public class Login {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_login.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_login.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_login.profile_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private Long profileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_login.password
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_login.id
     *
     * @return the value of pul_login.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_login.id
     *
     * @param id the value for pul_login.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_login.name
     *
     * @return the value of pul_login.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_login.name
     *
     * @param name the value for pul_login.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_login.profile_id
     *
     * @return the value of pul_login.profile_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_login.profile_id
     *
     * @param profileId the value for pul_login.profile_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_login.password
     *
     * @return the value of pul_login.password
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_login.password
     *
     * @param password the value for pul_login.password
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}