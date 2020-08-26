package com.zict.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zict.entity.Department;
import com.zict.mapper.DepartmentMapper;
import com.zict.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * @author guoflytiger
 * @date 2020/8/25 20:53
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
}
