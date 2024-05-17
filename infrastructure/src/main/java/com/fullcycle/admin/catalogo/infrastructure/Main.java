package com.fullcycle.admin.catalogo.infrastructure;

import com.fullcycle.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UseCase useCase = new UseCase();
        System.out.println(useCase.execute());
    }
}