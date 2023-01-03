package com.example.catsapi.repository;

import com.example.catsapi.entety.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 22:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface CatRepository extends JpaRepository<Cat, String> {

}