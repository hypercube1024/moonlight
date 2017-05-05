package com.moonlightsource.idl.compiler;

import com.firefly.utils.exception.CommonRuntimeException;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        try {
            String root = MoonlightCompiler.getClasspath().toString();
            String p = "/testIDLError";
            List<String> list = Files.walk(Paths.get(root, p))
                                     .filter(path -> Files.isDirectory(path))
                                     .map(Path::toString)
                                     .map(s -> s.substring(root.length()))
                                     .filter(s -> s.endsWith("Error") && !s.equals(p))
                                     .collect(Collectors.toList());
            System.out.println(list);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            throw new CommonRuntimeException(e);
        }
    }

    @Test(expected = CompilingRuntimeException.class)
    public void test() throws IOException {
        compile(path);
    }

}
