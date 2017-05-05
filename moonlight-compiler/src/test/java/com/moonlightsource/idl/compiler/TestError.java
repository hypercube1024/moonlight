package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * @author Pengtao Qiu
 */
@RunWith(Parameterized.class)
public class TestError extends AbstractCompilingErrorTest {

    @Parameter
    public String path;

    @Parameters(name = "{0}")
    public static Collection<String> data() {
        return Arrays.asList(
                "/testIDLError/importError",
                "/testIDLError/annotationError",
                "/testIDLError/annotationFieldError");
    }

    @Test(expected = CompilingRuntimeException.class)
    public void test() throws IOException {
        compile(path);
    }

}
