package com.briup.apps.pul.bean;

public class Profile {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_profile.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_profile.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_profile.numble
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String numble;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_profile.business
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String business;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_profile.nature
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String nature;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_profile.id
     *
     * @return the value of pul_profile.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_profile.id
     *
     * @param id the value for pul_profile.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_profile.name
     *
     * @return the value of pul_profile.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_profile.name
     *
     * @param name the value for pul_profile.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_profile.numble
     *
     * @return the value of pul_profile.numble
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getNumble() {
        return numble;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_profile.numble
     *
     * @param numble the value for pul_profile.numble
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setNumble(String numble) {
        this.numble = numble == null ? null : numble.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_profile.business
     *
     * @return the value of pul_profile.business
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getBusiness() {
        return business;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_profile.business
     *
     * @param business the value for pul_profile.business
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_profile.nature
     *
     * @return the value of pul_profile.nature
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getNature() {
        return nature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_profile.nature
     *
     * @param nature the value for pul_profile.nature
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }
}