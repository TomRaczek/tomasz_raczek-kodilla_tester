package com.kodilla.spotbugs;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.beans.Expression;

import static java.lang.Math.PI;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeExampleTest {

    @Test
    public void shouldReturnPI() {
        double pi = BadCodeExample.getPi();
        Assertions.assertEquals(PI, pi);
    }
}