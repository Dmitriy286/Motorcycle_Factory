package com.company.Interfaces;

import com.company.BaseClass.Bike;

public interface ISportBike {
    public String getSportType();
    public int getSportSpeed();
}

//fixme Как в интерфейсе устанавливать какие-то условия, если абстрактные методы не позволяют создавать тело,
//fixme а статические не переопределяются в дочернем классе?



