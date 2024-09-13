package com.csc340.Assignment2;

public class DogImage {

    int fileSizeBytes;
    String url;

    /**
     * DogImage Constructor
     *
     * @param fileSizeBytes The size in bytes of the dog image.
     * @param url The web link to the image.
     */
    DogImage(int fileSizeBytes, String url)
    {
        this.fileSizeBytes = fileSizeBytes;
        this.url = url;
    }

    /**
     * Gets the web link of the image.
     * @return Returns the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the size in bytes of the
     * @return
     */
    public int getFileSizeBytes() {
        return fileSizeBytes;
    }

    /**
     * Sets the file size in bytes.
     *
     * @param fileSizeBytes The new file size
     */
    public void setFileSizeBytes(int fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    /**
     * Sets the web link.
     *
     * @param url The new web link.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
