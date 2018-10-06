package org.sleuthkit.autopsy.keywordsearch;
/** Localizable strings for {@link org.sleuthkit.autopsy.keywordsearch}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Credit Card Number</i>
     * @see AccountsText
     */
    static String AccountsText_creditCardNumber() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.creditCardNumber");
    }
    /**
     * @return <i>Credit Card Numbers</i>
     * @see AccountsText
     */
    static String AccountsText_creditCardNumbers() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.creditCardNumbers");
    }
    /**
     * @return <i>&lt;html>&lt;pre>&lt;span style\\='background\\:yellow'>There were no keyword hits on this page. &lt;br />The keyword could have been in the file name. &lt;br />Advance to another page if present, or to view the original text, choose File Text &lt;br />in the drop down menu to the right...&lt;/span>&lt;/pre>&lt;/html></i>
     * @see AccountsText
     */
    static String AccountsText_getMarkup_noMatchMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.getMarkup.noMatchMsg");
    }
    /**
     * @return <i>&lt;html>&lt;pre>&lt;span style\\='background\\:yellow'>Failed to retrieve keyword hit results. &lt;br />Confirm that Autopsy can connect to the Solr server. &lt;br />&lt;/span>&lt;/pre>&lt;/html></i>
     * @see AccountsText
     */
    static String AccountsText_getMarkup_queryFailedMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.getMarkup.queryFailedMsg");
    }
    /**
     * @return <i>No next item.</i>
     * @see AccountsText
     */
    static String AccountsText_nextItem_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.nextItem.exception.msg");
    }
    /**
     * @return <i>No next page.</i>
     * @see AccountsText
     */
    static String AccountsText_nextPage_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.nextPage.exception.msg");
    }
    /**
     * @return <i>No previous item.</i>
     * @see AccountsText
     */
    static String AccountsText_previousItem_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.previousItem.exception.msg");
    }
    /**
     * @return <i>No previous page.</i>
     * @see AccountsText
     */
    static String AccountsText_previousPage_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.previousPage.exception.msg");
    }
    /**
     * @return <i>Unable to run file type detection.</i>
     * @see KeywordSearchIngestModule
     */
    static String CannotRunFileTypeDetection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CannotRunFileTypeDetection");
    }
    /**
     * @return <i>There was an error getting the text for the selected source.</i>
     * @see ExtractedContentPanel
     */
    static String ExtractedContentPanel_SetMarkup_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractedContentPanel.SetMarkup.error");
    }
    /**
     * @param Content_name Content name
     * @return <i>Loading text for </i>{@code Content_name}
     * @see ExtractedContentPanel
     */
    static String ExtractedContentPanel_SetMarkup_progress_loading(Object Content_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractedContentPanel.SetMarkup.progress.loading", Content_name);
    }
    /**
     * @return <i>&lt;span style='font-style:italic'>Loading text... Please wait&lt;/span></i>
     * @see ExtractedContentPanel
     */
    static String ExtractedContentPanel_setMarkup_panelTxt() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractedContentPanel.setMarkup.panelTxt");
    }
    /**
     * @return <i>Edit Keyword</i>
     * @see GlobalEditListPanel
     */
    static String GlobalEditListPanel_editKeyword_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GlobalEditListPanel.editKeyword.title");
    }
    /**
     * @return <i>Could not perform the query to get chunk info and get highlights:</i>
     * @see HighlightedText
     */
    static String HighlightedText_query_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HighlightedText.query.exception.msg");
    }
    /**
     * @return <i>Global Keyword Search Settings</i>
     * @see KeywordSearchGlobalSettingsPanel
     */
    static String KeywordSearchGlobalSettingsPanel_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchGlobalSettingsPanel.Title");
    }
    /**
     * @return <i>Keyword search server was not properly initialized, cannot run keyword search ingest.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_badInitMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.badInitMsg");
    }
    /**
     * @param Reason_for_not_connecting_to_Solr Reason for not connecting to Solr
     * @return <i>Error connecting to SOLR server: </i>{@code Reason_for_not_connecting_to_Solr}<i>.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_exception_errConnToSolr_msg(Object Reason_for_not_connecting_to_Solr) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.exception.errConnToSolr.msg", Reason_for_not_connecting_to_Solr);
    }
    /**
     * @param Reason_for_not_starting_Solr Reason for not starting Solr
     * @return {@code Reason_for_not_starting_Solr}<i>&lt;br />Please try stopping Java Solr processes if any exist and restart the application.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_tryStopSolrMsg(Object Reason_for_not_starting_Solr) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.tryStopSolrMsg", Reason_for_not_starting_Solr);
    }
    /**
     * @return <i>The index could not be opened or does not exist.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startUp_noOpenCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startUp.noOpenCore.msg");
    }
    /**
     * @param schema_version_number schema version number
     * @return <i>Adding text no longer supported for schema version </i>{@code schema_version_number}<i> of the text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupException_indexSchemaNotSupported(Object schema_version_number) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupException.indexSchemaNotSupported", schema_version_number);
    }
    /**
     * @param Solr_version_number Solr version number
     * @return <i>Adding text no longer supported for Solr version </i>{@code Solr_version_number}<i> of the text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupException_indexSolrVersionNotSupported(Object Solr_version_number) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupException.indexSolrVersionNotSupported", Solr_version_number);
    }
    /**
     * @return <i>Failed to get schema version for text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupMessage_failedToGetIndexSchema() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupMessage.failedToGetIndexSchema");
    }
    /**
     * @return <i>No results found.</i>
     * @see KeywordSearchResultFactory
     */
    static String KeywordSearchResultFactory_createNodeForKey_noResultsFound_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchResultFactory.createNodeForKey.noResultsFound.text");
    }
    /**
     * @return <i>Could not perform the query </i>
     * @see KeywordSearchResultFactory
     */
    static String KeywordSearchResultFactory_query_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchResultFactory.query.exception.msg");
    }
    /**
     * @return <i>File Text</i>
     * @see RawText
     */
    static String RawText_FileText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RawText.FileText");
    }
    /**
     * @return <i>Result Text</i>
     * @see RawText
     */
    static String RawText_ResultText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RawText.ResultText");
    }
    /**
     * @return <i>Error performing query:</i>
     * @see SearchRunner
     */
    static String SearchRunner_query_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SearchRunner.query.exception.msg");
    }
    /**
     * @param core_name core name
     * @return <i>Failed to delete Solr core </i>{@code core_name}
     * @see Server
     */
    static String Server_deleteCore_exception_msg(Object core_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.deleteCore.exception.msg", core_name);
    }
    /**
     * @return <i>Invalid port number.</i>
     * @see KeywordSearchIngestModule
     */
    static String SolrConnectionCheck_Port() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrConnectionCheck.Port");
    }
    /**
     * @param index_folder_path index folder path
     * @return <i>Failed to delete text index files at </i>{@code index_folder_path}
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_failedToDeleteIndexFiles(Object index_folder_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.failedToDeleteIndexFiles", index_folder_path);
    }
    /**
     * @return <i>IndexMetadata did not contain a current Solr core so could not delete the case</i>
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_noCurrentSolrCore() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.noCurrentSolrCore");
    }
    /**
     * @param case_directory case directory
     * @return <i>Unable to create IndexMetaData from case directory: </i>{@code case_directory}
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_noIndexMetadata(Object case_directory) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.noIndexMetadata", case_directory);
    }
    /**
     * @return <i>Looking for text index with latest Solr and schema version</i>
     * @see SolrSearchService
     */
    static String SolrSearch_checkingForLatestIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.checkingForLatestIndex.msg");
    }
    /**
     * @return <i>Text index successfully opened</i>
     * @see SolrSearchService
     */
    static String SolrSearch_complete_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.complete.msg");
    }
    /**
     * @return <i>Creating new text index</i>
     * @see SolrSearchService
     */
    static String SolrSearch_creatingNewIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.creatingNewIndex.msg");
    }
    /**
     * @return <i>Looking for existing text index directories</i>
     * @see SolrSearchService
     */
    static String SolrSearch_findingIndexes_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.findingIndexes.msg");
    }
    /**
     * @return <i>Identifying text index to use</i>
     * @see SolrSearchService
     */
    static String SolrSearch_indentifyingIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.indentifyingIndex.msg");
    }
    /**
     * @return <i>Looking for text index metadata file</i>
     * @see SolrSearchService
     */
    static String SolrSearch_lookingForMetadata_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.lookingForMetadata.msg");
    }
    /**
     * @return <i>Opening text index</i>
     * @see SolrSearchService
     */
    static String SolrSearch_openCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.openCore.msg");
    }
    /**
     * @return <i>Opening text index. Text index for this case is very large and may take long time to load.</i>
     * @see SolrSearchService
     */
    static String SolrSearch_openGiantCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.openGiantCore.msg");
    }
    /**
     * @return <i>Opening text index. This may take several minutes.</i>
     * @see SolrSearchService
     */
    static String SolrSearch_openLargeCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.openLargeCore.msg");
    }
    /**
     * @return <i>Reading text index metadata file</i>
     * @see SolrSearchService
     */
    static String SolrSearch_readingIndexes_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.readingIndexes.msg");
    }
    private Bundle() {}
}
