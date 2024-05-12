package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author demo
 * @since 2024-05-07
 */
public interface StorageService extends IService<Storage> {
    IPage pageCC(IPage<Storage>page, Wrapper wrapper);
}
