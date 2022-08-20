package com.etw.etwapi.repository;

import static com.etw.etwapi.model.QFood.*;

import com.etw.etwapi.model.Food;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Set;

@Repository
public class FoodQuerydslRepository {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;

    FoodQuerydslRepository(EntityManager em){
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public List<Food> findAllById(Set<Long> ids) {
        return queryFactory
                .select(food)
                .from(food)
                .where(food.id.in(ids))
                .fetch();
    }
}
