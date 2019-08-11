package io.github.pingao777.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Created by pingao on 2019/8/11.
 */
public class FileUtil {
    public static InputStream stream(String pkg, String name) throws IOException {
        return Files.newInputStream(Paths.get(System.getProperty("user.dir")
                                              + "/src/main/java/"
                                              + pkg.replace('.','/')
                                              + "/"
                                              + name));
    }

}
