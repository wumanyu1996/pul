package com.briup.apps.pul.dao;

import com.briup.apps.pul.bean.Notice;
import com.briup.apps.pul.bean.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    long countByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int deleteByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int insertSelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    List<Notice> selectByExampleWithBLOBs(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    Notice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pul_notice
     *
     * @mbg.generated Thu Aug 09 14:47:37 CST 2018
     */
    int updateByPrimaryKey(Notice record);
}