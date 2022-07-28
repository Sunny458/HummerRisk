package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.Plugin;
import com.hummerrisk.base.domain.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    long countByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int deleteByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int insert(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int insertSelective(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    List<Plugin> selectByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    Plugin selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int updateByPrimaryKeySelective(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin
     *
     * @mbg.generated Thu Jul 28 21:02:48 CST 2022
     */
    int updateByPrimaryKey(Plugin record);
}