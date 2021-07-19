package UtilitiesFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoaderFactory {

    private Properties properties;
    private String propertiesPath;

    /**
     * This method returns the properties from the .properties file stored in the
     * user directory of the user running the test
     *
     * @param filename (String, name of the .properties file)
     *
     * @return Returns properties from the pre-defined .properties file
     * @throws Exception Throws exception if .properties file or path is not found
     */
    public Properties getPropertyFile(String filename) throws Exception {

        String path = null;

        try {

            path = System.getProperty("user.dir") + File.separator;

        } catch (Exception e) {

            System.err.println("Could not locate .properties file");
            e.printStackTrace();
        }
        return getProperty(path, filename);
    }

    /**
     * This method returns properties from user identified .properties file
     *
     * @param path     (String, path to .properties file)
     * @param filename (String, name of the .properties file)
     *
     * @return Returns properties from user identified .properties file
     * @throws Exception Throws exception when file is not found
     */
    public Properties getProperty(String path, String filename) throws Exception {

        propertiesPath = path;

        try {

            File file;

            file = new File(propertiesPath + filename);

            FileInputStream fileInput = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInput);

        } catch (Exception e) {

            System.err.println("Could not get Properties from the .properties file");
            e.printStackTrace();
            throw e;
        }
        return properties;
    }

    /**
     * Gets the file name.
     *
     * @param fileNameWithPath the file name with path
     * @return the file name
     */
    private String getFileName (String fileNameWithPath) {

        String fileName = "";

        try {

            File file = new File(fileNameWithPath);
            fileName =  file.getName();

        } catch (Exception e) {

            System.err.println("Could not get file");
            e.printStackTrace();
            throw e;
        }

        return fileName;
    }

    /**
     * Gets the file parent path name.
     *
     * @param fileNameWithPath the file name with path
     * @return the file parent path name
     */
    private String getFileParentPathName (String fileNameWithPath) {

        String fileParentPath = "";

        try {

            File file = new File(fileNameWithPath);
            fileParentPath =  file.getParent();

        } catch (Exception e) {

            System.err.println("Could not get file parent path");
            e.printStackTrace();
            throw e;
        }

        return fileParentPath;
    }

    /**
     * Checks if file with locale folder path exists.
     *
     * @param fileNameWithPath the file name with path
     * @return true, if is file with locale exists
     */
    private boolean isFileWithLocaleExists (String fileNameWithPath) {

        boolean isExists = false;

        try {

            File file = new File(fileNameWithPath);
            if(file.exists() && !file.isDirectory()) {

                isExists = true;

            }

        } catch (Exception e) {

            System.err.println("File doesn't exists");
            e.printStackTrace();
            throw e;
        }

        return isExists;
    }
}
