package com.tnals.study.refactoring.chapter01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setup() {
        customer = new Customer("test");
    }

    @Test
    void test() {
        System.out.println(customer.statement());
    }
}