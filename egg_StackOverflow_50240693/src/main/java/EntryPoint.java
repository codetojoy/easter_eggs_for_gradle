
import java.io.*;
import java.net.URL;

public class EntryPoint {
    private static final String JAR_NAME = "example.jar";

    String trimPath(URL path, String jarName) {
        String result = path.toString().replaceAll(jarName, "");
        return result;
    }

    InputStream attemptOverride() throws Exception {
        InputStream result = null;

        URL u = this.getClass().getProtectionDomain().getCodeSource().getLocation();
        String jarDir = trimPath(u, JAR_NAME);
        URL overrideURL = new URL(jarDir + "/config/data.txt");

        if (new File(overrideURL.toURI()).exists()) {
            result = overrideURL.openStream();
            System.out.println("TRACER override detected ...");
        }

        return result;
    }

    InputStream getDefault() throws Exception {
        InputStream result = this.getClass().getClassLoader().getResourceAsStream("data.txt");
        System.out.println("TRACER using default ...");
        return result;
    }

    void go() throws Exception {
        System.out.println("TRACER EntryPoint");
        InputStream inputStream = attemptOverride();

        if (inputStream == null) {
            inputStream = getDefault();
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;

        while((line = in.readLine()) != null) {
            System.out.println("TRACER : " + line);
        }

        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
        new EntryPoint().go();
    }
}
