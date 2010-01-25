package com.sun.javaee.blueprints.petstore.util;

public class PetstoreConstants {

    public static final String PETSTORE_INDEX_DIRECTORY = System.getProperty("com.sun.aas.instanceRoot") +
                                                            "/lib/petstore/searchindex";
    public static final String PETSTORE_IMAGE_DIRECTORY = System.getProperty("com.sun.aas.instanceRoot") +
                                                            "/lib/petstore";
    public static final String PETSTORE_BASE_LOGGER = "com.sun.javaee.blueprints.petstore";
    public static final String PETSTORE_BASE_LOG_STRINGS = "com.sun.javaee.blueprints.petstore.util.LogStrings";

    /** private constructor to enforce only constants class */
    private PetstoreConstants() {}

}
