package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.Student;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    List<Student> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    int updateByPrimaryKey(Student record);
}