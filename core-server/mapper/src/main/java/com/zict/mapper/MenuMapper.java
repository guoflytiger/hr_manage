package com.zict.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zict.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author guoflytiger
 * @date 2020/8/25 13:57
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> getMenusByHrId(Integer hrid);
}
