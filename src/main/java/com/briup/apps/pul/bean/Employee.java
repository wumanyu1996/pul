package com.briup.apps.pul.bean;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.age
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.sex
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.card
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String card;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.phone
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.message
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pul_employee.option_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    private Long optionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.id
     *
     * @return the value of pul_employee.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.id
     *
     * @param id the value for pul_employee.id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.name
     *
     * @return the value of pul_employee.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.name
     *
     * @param name the value for pul_employee.name
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.age
     *
     * @return the value of pul_employee.age
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.age
     *
     * @param age the value for pul_employee.age
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.sex
     *
     * @return the value of pul_employee.sex
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.sex
     *
     * @param sex the value for pul_employee.sex
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.card
     *
     * @return the value of pul_employee.card
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getCard() {
        return card;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.card
     *
     * @param card the value for pul_employee.card
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.phone
     *
     * @return the value of pul_employee.phone
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.phone
     *
     * @param phone the value for pul_employee.phone
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.message
     *
     * @return the value of pul_employee.message
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.message
     *
     * @param message the value for pul_employee.message
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pul_employee.option_id
     *
     * @return the value of pul_employee.option_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pul_employee.option_id
     *
     * @param optionId the value for pul_employee.option_id
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }
}