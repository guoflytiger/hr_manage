package com.zict.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zict.entity.Menu;
import java.util.List;

/**
 * @author guoflytiger
 * @date 2020/8/24 16:51
 */
public interface MenuService extends IService<Menu> {

    List<Menu> getAllMenusWithRole();

    List<Menu> getMenusByHrId(Integer id);
}
