package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Storage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author demo
 * @since 2024-05-08
 */
public interface GoodsService extends IService<Goods> {
    IPage pageCC(IPage<Goods>page, Wrapper wrapper);
}
