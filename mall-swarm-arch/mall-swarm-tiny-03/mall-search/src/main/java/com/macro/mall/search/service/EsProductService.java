package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @auther macrozheng
 * @description 商品搜索管理Service
 * @date 2018/6/19
 * @github https://github.com/macrozheng
 */
public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或者副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}