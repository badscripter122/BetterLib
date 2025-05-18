package FluidStudios;

public class BetterLib {
    //
    public static void LoadLibrary(String lib) {
        String userDir = System.getProperty("user.dir");
        String os = System.getProperty("os.name").toLowerCase();

        String fileType = "";

        if (os.contains("win")) {
            fileType = ".dll";
        } else if (os.contains("mac")) {
            fileType = ".dylib";
        } else if (os.contains("linux")) {
            fileType = ".so";
        }

        if(userDir != null) {
            System.load(userDir + "/libs/" + lib + fileType);
        } else {
            System.err.println("Error loading library: " + lib);
        }
    }
}