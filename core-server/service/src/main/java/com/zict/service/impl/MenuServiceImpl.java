package com.zict.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zict.entity.HrRole;
import com.zict.entity.Menu;
import com.zict.entity.MenuRole;
import com.zict.entity.Role;
import com.zict.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zict.service.MenuService;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author guoflytiger
 * @date 2020/8/24 16:51
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Resource
    private MenuRoleMapper menuRoleMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private HrMapper hrMapper;

    @Resource
    private HrRoleMapper hrRoleMapper;

    @Override
    public List<Menu> getAllMenusWithRole() {
        List<Menu> menus = this.list();
        menus
        .forEach(e-> {
            Integer[] rIds = menuRoleMapper.selectList(Wrappers.<MenuRole>lambdaQuery().eq(MenuRole::getMId, e.getId()))
                    .stream().map(MenuRole::getRId).toArray(Integer[]::new);
            if (rIds.length > 0) {
                e.setRoles(roleMapper.selectList(
                        Wrappers.<Role>lambdaQuery().in(Role::getId,
                                rIds)
                ));
            }
        });
//        menus
//        .forEach(e-> {
//            e.setRoles(roleMapper.selectList(
//                    Wrappers.<Role>lambdaQuery().in(Role::getId,
//                            menuRoleMapper.selectList(
//                                    Wrappers.<MenuRole>lambdaQuery().eq(MenuRole::getMId,e.getId()))
//                    .stream().map(MenuRole::getRId).toArray(Integer[]::new))
//            ));
//        });
        return menus;
    }

    @Override
    public List<Menu> getMenusByHrId(Integer id) {
        Set<Menu> menus = new HashSet<>();
        List<Menu> menusByHrId = menuMapper.getMenusByHrId(id);
//        hrRoleMapper.selectList(Wrappers.<HrRole>lambdaQuery().eq(HrRole::getHrId,id))
//                .forEach(e->{
//                    menuRoleMapper.selectList(Wrappers.<MenuRole>lambdaQuery().eq(MenuRole::getRId,e.getRId()))
//                            .stream().map(MenuRole::getMId).forEach(es->{
//                                menus.add(menuMapper.selectById(es));
//                    });
//                });
        return new ArrayList<>(menus);
    }
}
