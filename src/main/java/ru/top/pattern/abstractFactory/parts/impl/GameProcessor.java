package ru.top.pattern.abstractFactory.parts.impl;

import ru.top.pattern.abstractFactory.parts.Processor;

import java.math.BigDecimal;

public class GameProcessor extends Processor {

    private Long id;
    private String name;
    private Long frequency;
    private BigDecimal price;
}
