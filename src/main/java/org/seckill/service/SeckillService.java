package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.entity.Seckill;

import java.util.List;

/**
 * Created by Yang on 2017/5/3.
 */
public interface SeckillService {
    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    /**
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    void executeSeckill(long seckillId, long userPhone, String md5);
}
