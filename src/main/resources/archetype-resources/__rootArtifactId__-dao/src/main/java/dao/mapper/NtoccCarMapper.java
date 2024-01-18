#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.dao.mapper;

import ${package}.dao.entity.NtoccCar;
import ${package}.dao.entity.NtoccCarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtoccCarMapper {
    long countByExample(NtoccCarExample example);

    int deleteByExample(NtoccCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NtoccCar record);

    int insertSelective(@Param("record") NtoccCar record, @Param("selective") NtoccCar.Column... selective);

    NtoccCar selectOneByExample(NtoccCarExample example);

    NtoccCar selectOneByExampleSelective(@Param("example") NtoccCarExample example, @Param("selective") NtoccCar.Column... selective);

    List<NtoccCar> selectByExampleSelective(@Param("example") NtoccCarExample example, @Param("selective") NtoccCar.Column... selective);

    List<NtoccCar> selectByExample(NtoccCarExample example);

    NtoccCar selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") NtoccCar.Column... selective);

    NtoccCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NtoccCar record, @Param("example") NtoccCarExample example, @Param("selective") NtoccCar.Column... selective);

    int updateByExample(@Param("record") NtoccCar record, @Param("example") NtoccCarExample example);

    int updateByPrimaryKeySelective(@Param("record") NtoccCar record, @Param("selective") NtoccCar.Column... selective);

    int updateByPrimaryKey(NtoccCar record);

    int batchInsert(@Param("list") List<NtoccCar> list);

    int batchInsertSelective(@Param("list") List<NtoccCar> list, @Param("selective") NtoccCar.Column... selective);

    int upsert(NtoccCar record);

    int upsertSelective(@Param("record") NtoccCar record, @Param("selective") NtoccCar.Column... selective);
}