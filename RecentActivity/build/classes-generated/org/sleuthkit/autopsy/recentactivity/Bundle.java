package org.sleuthkit.autopsy.recentactivity;
/** Localizable strings for {@link org.sleuthkit.autopsy.recentactivity}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Failed to index artifact for keyword search.</i>
     * @see Extract
     */
    static String Extract_indexError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Extract.indexError.message");
    }
    /**
     * @return <i>Full version RegRipper executable not found.</i>
     * @see ExtractRegistry
     */
    static String RegRipperFullNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RegRipperFullNotFound");
    }
    /**
     * @return <i>Autopsy RegRipper executable not found.</i>
     * @see ExtractRegistry
     */
    static String RegRipperNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RegRipperNotFound");
    }
    /**
     * @param file_name file name
     * @return <i>Unable to find </i>{@code file_name}<i>.</i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String SearchEngineURLQueryAnalyzer_init_exception_msg(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SearchEngineURLQueryAnalyzer.init.exception.msg", file_name);
    }
    /**
     * @return <i>Unable to build XML parser: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotBuildXmlParser() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotBuildXmlParser");
    }
    /**
     * @return <i>Unable to load Search Engine URL Query Analyzer settings file, SEUQAMappings.xml: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotLoadSEUQA() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotLoadSEUQA");
    }
    /**
     * @return <i>Unable to parse XML file: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotParseXml() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotParseXml");
    }
    private Bundle() {}
}
