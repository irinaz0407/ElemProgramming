package org.irush.study.elementary.chapter_02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeAreaTest {

    @Test
    public void test_areaC() {

        ComputeArea computeArea = new ComputeArea();

        double result = computeArea.areaC(2.0);

        Assert.assertEquals(12.5668, result, 0);
    }
}