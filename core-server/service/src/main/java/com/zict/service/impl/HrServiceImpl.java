package com.zict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zict.entity.Hr;
import com.zict.entity.HrRole;
import com.zict.entity.Role;
import com.zict.mapper.HrMapper;
import com.zict.mapper.HrRoleMapper;
import com.zict.mapper.RoleMapper;
import com.zict.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author guoflytiger
 * @date 2020/8/24 16:11
 */
@Service
public class HrServiceImpl implements HrService {

    @Resource
    private HrMapper hrMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private HrRoleMapper hrRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Hr> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        Hr hr = hrMapper.selectOne(queryWrapper);
        if (hr == null) {
            throw new RuntimeException("用户名不存在");
        }
        hr.setRoles(roleMapper.selectList(
                Wrappers.<Role>lambdaQuery().in(Role::getId,
                        hrRoleMapper.selectList(
                                Wrappers.<HrRole>lambdaQuery().eq(HrRole::getHrId,hr.getId())
                        ).stream().map(HrRole::getRId).toArray(Integer[]::new))
        ));
        return hr;
    }
}
