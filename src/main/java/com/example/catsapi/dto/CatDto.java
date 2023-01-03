package com.example.catsapi.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 0:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class CatDto {
    String name;
    LocalDate birthDay;
}