package com.company;

public class ToDollarImplentation implements ToDollarAdapter {
    private Money money;

    public ToDollarImplentation(Money money) {
        this.money = money;
    }


    @Override
    public double cash() {
        return money.cash()*450;
    }
}
