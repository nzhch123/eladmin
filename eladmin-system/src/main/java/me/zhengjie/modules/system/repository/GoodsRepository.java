package me.zhengjie.modules.system.repository;

import me.zhengjie.modules.system.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface GoodsRepository extends  JpaRepository<Goods, Integer> {


}