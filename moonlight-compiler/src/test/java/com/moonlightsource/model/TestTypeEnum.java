package com.moonlightsource.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

/**
 * @author Pengtao Qiu
 */
public class TestTypeEnum {

    @Test
    public void test() {
        Assert.assertThat(true, is(TypeEnum.BOOLEAN.isBaseType()));
        Assert.assertThat(true, is(TypeEnum.STRING.isBaseType()));
        Assert.assertThat(false, is(TypeEnum.MAP.isBaseType()));
        Assert.assertThat(true, is(TypeEnum.MAP.isContainerType()));
    }
}
