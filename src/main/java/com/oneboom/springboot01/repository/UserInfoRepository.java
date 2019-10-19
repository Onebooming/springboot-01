package com.oneboom.springboot01.repository;

import com.oneboom.springboot01.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 在使用JAP操作数据库时，我们需要创建一个和实体类相对应的接口，并且让该接口继承JAP中已经提供的JpaRepository
 * (有很多个接口暂时只介绍这一个)接口。这样我们就可以通过这个接口来操作数据库了。
 */

/*
 * 　在我们继承JpaRepository接口时需要我们指定两个参数，
 *   第一个参数表示我们要操作的实体类是哪一个，第二个参数表示我们实体类中的主键类型，
 *   其次我们还需要添加@Repository注解，这样JPA才能操作数据库。
 */

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
}
