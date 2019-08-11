package com.gang.gexpro.core.persistence.mybatis.entity.mapper;

import com.gang.gexpro.core.persistence.mybatis.entity.Test;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_test
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_test
     *
     * @mbg.generated
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_test
     *
     * @mbg.generated
     */
    Test selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_test
     *
     * @mbg.generated
     */
    List<Test> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_test
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Test record);
}