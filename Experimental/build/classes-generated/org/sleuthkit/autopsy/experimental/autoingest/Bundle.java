package org.sleuthkit.autopsy.experimental.autoingest;
/** Localizable strings for {@link org.sleuthkit.autopsy.experimental.autoingest}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Archive file</i>
     * @see ArchiveExtractorDSProcessor
     */
    static String ArchiveDSP_dsType_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ArchiveDSP.dsType.text");
    }
    /**
     * @return <i>Module Error</i>
     * @see ArchiveFilePanel
     */
    static String ArchiveFilePanel_moduleErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ArchiveFilePanel.moduleErr");
    }
    /**
     * @return <i>A module caused an error listening to ArchiveFilePanel updates. See log to determine which module. Some data could be incomplete.<br></i>
     * @see ArchiveFilePanel
     */
    static String ArchiveFilePanel_moduleErr_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ArchiveFilePanel.moduleErr.msg");
    }
    /**
     * @return <i>Failed to start automated ingest. Verify Multi-user Settings.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_AutoIngestStartupError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.AutoIngestStartupError");
    }
    /**
     * @return <i>Failed to start automated ingest.<br>Please see auto ingest system log for details.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_AutoIngestStartupFailed_Message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.AutoIngestStartupFailed.Message");
    }
    /**
     * @return <i>Automated Ingest Error</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_AutoIngestStartupFailed_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.AutoIngestStartupFailed.Title");
    }
    /**
     * @return <i>Failed to establish remote communications with other automated ingest nodes.<br>Auto ingest dashboard will only be able to display local ingest job events.<br>Please verify Multi-User settings (Options->Multi-User). See application log for details.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_AutoIngestStartupWarning_Message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.AutoIngestStartupWarning.Message");
    }
    /**
     * @return <i>Automated Ingest Warning</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_AutoIngestStartupWarning_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.AutoIngestStartupWarning.Title");
    }
    /**
     * @return <i>Cancel</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_Cancel() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.Cancel");
    }
    /**
     * @return <i>Cancelling...</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_Cancelling() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.Cancelling");
    }
    /**
     * @return <i>The shared configuration directory is locked because upload from another node is in progress. <br>If this is an error, you can unlock the directory and then retry the upload.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ConfigLocked() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ConfigLocked");
    }
    /**
     * @return <i>Configuration directory locked</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ConfigLockedTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ConfigLockedTitle");
    }
    /**
     * @return <i>Deletion failed for job</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_DeletionFailed() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.DeletionFailed");
    }
    /**
     * @return <i>Enable shared configuration from the options panel before uploading</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_EnableConfigurationSettings() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.EnableConfigurationSettings");
    }
    /**
     * @return <i>Error uploading configuration</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ErrorUploadingConfiguration() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ErrorUploadingConfiguration");
    }
    /**
     * @return <i>This will cancel any currently running job on this host. Exiting while a job is running potentially leaves the case in an inconsistent or corrupted state.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ExitConsequences() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ExitConsequences");
    }
    /**
     * @return <i>Exiting...</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ExitingStatus() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ExitingStatus");
    }
    /**
     * @return <i>Case</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_Case() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.Case");
    }
    /**
     * @return <i>Case Folder</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_CaseFolder() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.CaseFolder");
    }
    /**
     * @return <i>Job Completed</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_CompletedTime() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.CompletedTime");
    }
    /**
     * @return <i>Job Created</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_CreatedTime() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.CreatedTime");
    }
    /**
     * @return <i>Host Name</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_HostName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.HostName");
    }
    /**
     * @return <i>Data Source</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_ImageFolder() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.ImageFolder");
    }
    /**
     * @return <i> Local Job?</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_LocalJob() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.LocalJob");
    }
    /**
     * @return <i> Manifest File Path</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_ManifestFilePath() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.ManifestFilePath");
    }
    /**
     * @return <i>Prioritized</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_Priority() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.Priority");
    }
    /**
     * @return <i>Stage</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_Stage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.Stage");
    }
    /**
     * @return <i>Time in Stage</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_StageTime() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.StageTime");
    }
    /**
     * @return <i>Stage Started</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_StartedTime() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.StartedTime");
    }
    /**
     * @return <i>Status</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_JobsTableModel_ColumnHeader_Status() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.JobsTableModel.ColumnHeader.Status");
    }
    /**
     * @return <i>OK</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_OK() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.OK");
    }
    /**
     * @return <i>Paused, unable to communicate with coordination service.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToCoordinationServiceDown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToCoordinationServiceDown");
    }
    /**
     * @return <i>Paused, unable to communicate with case database service.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToDatabaseServiceDown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToDatabaseServiceDown");
    }
    /**
     * @return <i>Paused, unable to load File Exporter settings.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToFileExporterError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToFileExporterError");
    }
    /**
     * @return <i>Paused, unable to start ingest job processing.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToIngestJobStartFailure() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToIngestJobStartFailure");
    }
    /**
     * @return <i>Paused, unable to communicate with keyword search service.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToKeywordSearchServiceDown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToKeywordSearchServiceDown");
    }
    /**
     * @return <i>Paused, unable to update shared configuration.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToSharedConfigError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToSharedConfigError");
    }
    /**
     * @return <i>Paused due to system error, please consult the auto ingest system log</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToSystemError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToSystemError");
    }
    /**
     * @return <i>Paused, unable to write to shared images or cases location.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_PauseDueToWriteStateFilesFailure() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.PauseDueToWriteStateFilesFailure");
    }
    /**
     * @return <i>Shared configuration disabled</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_SharedConfigurationDisabled() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.SharedConfigurationDisabled");
    }
    /**
     * @return <i>Case log file does not exist</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ShowLogFailed_Message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ShowLogFailed.Message");
    }
    /**
     * @return <i>Unable to display case log</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_ShowLogFailed_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.ShowLogFailed.Title");
    }
    /**
     * @return <i>Updating shared configuration</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_UpdatingSharedConfig() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.UpdatingSharedConfig");
    }
    /**
     * @return <i>Failed</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_UploadFailedTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.UploadFailedTitle");
    }
    /**
     * @return <i>Shared configuration successfully uploaded</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_UploadSuccess() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.UploadSuccess");
    }
    /**
     * @return <i>Success</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_UploadSuccessTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.UploadSuccessTitle");
    }
    /**
     * @return <i>&amp;Cancel Job</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnCancelJob_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnCancelJob.text");
    }
    /**
     * @return <i>Cancel processing of the current Job and move on to the next Job. This functionality is only available for jobs running on current AIM node.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnCancelJob_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnCancelJob.toolTipText");
    }
    /**
     * @return <i>Cancel &amp;Module</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnCancelModule_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnCancelModule.text");
    }
    /**
     * @return <i>Cancel processing of the current module within the Job and move on to the next module within the Job. This functionality is only available for jobs running on current AIM node.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnCancelModule_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnCancelModule.toolTipText");
    }
    /**
     * @return <i>Auto Ingest Metrics</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnClusterMetrics_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnClusterMetrics.text");
    }
    /**
     * @return <i>&amp;Delete Case</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnDeleteCase_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnDeleteCase.text");
    }
    /**
     * @return <i>Delete the selected Case in its entirety</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnDeleteCase_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnDeleteCase.toolTipText");
    }
    /**
     * @return <i>&amp;Exit</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnExit_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnExit.text");
    }
    /**
     * @return <i>Exit Application</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnExit_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnExit.toolTipText");
    }
    /**
     * @return <i>Open System Logs Folder</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnOpenLogDir_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnOpenLogDir.text");
    }
    /**
     * @return <i>&amp;Options</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnOptions_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnOptions.text");
    }
    /**
     * @return <i>Display options panel. All processing must be paused to open the options panel.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnOptions_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnOptions.toolTipText");
    }
    /**
     * @return <i>Are you sure you want to pause?</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_confirmHeader() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.confirmHeader");
    }
    /**
     * @return <i>Paused</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_paused() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.paused");
    }
    /**
     * @return <i>Pausing after current job completes...</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_pausing() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.pausing");
    }
    /**
     * @return <i>Running</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_running() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.running");
    }
    /**
     * @return <i>Pause</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.text");
    }
    /**
     * @return <i>Suspend processing of Pending Jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.toolTipText");
    }
    /**
     * @return <i>Resume processing of Pending Jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_toolTipTextResume() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.toolTipTextResume");
    }
    /**
     * @return <i>Pause will occur after the current job completes processing. This could take a long time. Continue?</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPause_warningText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPause.warningText");
    }
    /**
     * @return <i>Prioritize Case</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeCase_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeCase.text");
    }
    /**
     * @return <i>Move all images associated with a case to top of Pending queue.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeCase_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeCase.toolTipText");
    }
    /**
     * @return <i>&lt;AutoIngestControlPanel.bnPrioritizeJob.text></i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeFolder_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeFolder.label");
    }
    /**
     * @return <i>&lt;AutoIngestControlPanel.bnPrioritizeJob.text></i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeJob_actionCommand() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeJob.actionCommand");
    }
    /**
     * @return <i>Prioritize Job</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeJob_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeJob.text");
    }
    /**
     * @return <i>Move this folder to the top of the Pending queue.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnPrioritizeJob_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnPrioritizeJob.toolTipText");
    }
    /**
     * @return <i>&amp;Refresh</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnRefresh_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnRefresh.text");
    }
    /**
     * @return <i>Refresh displayed tables</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnRefresh_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnRefresh.toolTipText");
    }
    /**
     * @return <i>Reprocess Job</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnReprocessJob_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnReprocessJob.text");
    }
    /**
     * @return <i>Resume</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnResume_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnResume.text");
    }
    /**
     * @return <i>Show Case &amp;Log</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnShowCaseLog_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnShowCaseLog.text");
    }
    /**
     * @return <i>Display case log file for selected case</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnShowCaseLog_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnShowCaseLog.toolTipText");
    }
    /**
     * @return <i>Ingest Progress</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnShowProgress_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnShowProgress.text");
    }
    /**
     * @return <i>Show the progress of the currently running Job. This functionality is only available for jobs running on current AIM node.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnShowProgress_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnShowProgress.toolTipText");
    }
    /**
     * @return <i>Waiting to start</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnStart_startMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnStart.startMessage");
    }
    /**
     * @return <i>Start</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnStart_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnStart.text");
    }
    /**
     * @return <i>Start processing auto ingest jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_bnStart_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.bnStart.toolTipText");
    }
    /**
     * @return <i>An error occurred when prioritizing the case. Some or all jobs may not have been prioritized.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_casePrioritization_errorMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.casePrioritization.errorMessage");
    }
    /**
     * @return <i>The Completed table shows all Jobs that have been processed already</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_completedTable_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.completedTable.toolTipText");
    }
    /**
     * @return <i>An error occurred when prioritizing the job.</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_jobPrioritization_errorMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.jobPrioritization.errorMessage");
    }
    /**
     * @return <i>Completed Jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_lbCompleted_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.lbCompleted.text");
    }
    /**
     * @return <i>Pending Jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_lbPending_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.lbPending.text");
    }
    /**
     * @return <i>Running Jobs</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_lbRunning_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.lbRunning.text");
    }
    /**
     * @return <i>Services Status:</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_lbServicesStatus_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.lbServicesStatus.text");
    }
    /**
     * @return <i>Status:</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_lbStatus_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.lbStatus.text");
    }
    /**
     * @return <i>The Pending table displays the order upcoming Jobs will be processed with the top of the list first</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_pendingTable_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.pendingTable.toolTipText");
    }
    /**
     * @return <i>The Running table displays the currently running Job and information about it</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_runningTable_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.runningTable.toolTipText");
    }
    /**
     * @param case_db_status case db status
     * @param search_svc_Status search svc Status
     * @param coord_svc_Status coord svc Status
     * @param msg_broker_status msg broker status
     * @return <i>Case databases </i>{@code case_db_status}<i>, keyword search </i>{@code search_svc_Status}<i>, coordination </i>{@code coord_svc_Status}<i>, messaging </i>{@code msg_broker_status}<i> </i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbServicesStatusMessage_Message(Object case_db_status, Object search_svc_Status, Object coord_svc_Status, Object msg_broker_status) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbServicesStatusMessage.Message", case_db_status, search_svc_Status, coord_svc_Status, msg_broker_status);
    }
    /**
     * @return <i>down</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbServicesStatusMessage_Message_Down() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbServicesStatusMessage.Message.Down");
    }
    /**
     * @return <i>unknown</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbServicesStatusMessage_Message_Unknown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbServicesStatusMessage.Message.Unknown");
    }
    /**
     * @return <i>up</i>
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbServicesStatusMessage_Message_Up() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbServicesStatusMessage.Message.Up");
    }
    /**
     * @return 
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbServicesStatusMessage_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbServicesStatusMessage.text");
    }
    /**
     * @return 
     * @see AutoIngestControlPanel
     */
    static String AutoIngestControlPanel_tbStatusMessage_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestControlPanel.tbStatusMessage.text");
    }
    /**
     * @return <i>Failed to create Auto Ingest Dashboard.</i>
     * @see AutoIngestDashboardTopComponent
     */
    static String AutoIngestDashboardTopComponent_exceptionMessage_failedToCreateDashboard() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestDashboardTopComponent.exceptionMessage.failedToCreateDashboard");
    }
    /**
     * @return <i>Prioritized</i>
     * @see AutoIngestDashboard
     */
    static String AutoIngestDashboard_JobsTableModel_ColumnHeader_Priority() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestDashboard.JobsTableModel.ColumnHeader.Priority");
    }
    /**
     * @return <i>Failed to prioritize job "%s".</i>
     * @see AutoIngestDashboard
     */
    static String AutoIngestDashboard_PrioritizeCaseError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestDashboard.PrioritizeCaseError");
    }
    /**
     * @return <i>Failed to prioritize job "%s".</i>
     * @see AutoIngestDashboard
     */
    static String AutoIngestDashboard_PrioritizeJobError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestDashboard.PrioritizeJobError");
    }
    /**
     * @return <i>Select a date above and click the 'Generate Metrics Report' button to generate<br>a metrics report.</i>
     * @see AutoIngestMetricsDialog
     */
    static String AutoIngestMetricsDialog_initReportText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestMetricsDialog.initReportText");
    }
    /**
     * @return <i>Auto Ingest Metrics</i>
     * @see AutoIngestMetricsDialog
     */
    static String AutoIngestMetricsDialog_title_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AutoIngestMetricsDialog.title.text");
    }
    /**
     * @return <i>Auto Ingest Dashboard</i>
     * @see AutoIngestDashboardTopComponent
     */
    static String CTL_AutoIngestDashboardAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_AutoIngestDashboardAction");
    }
    /**
     * @return <i>Auto Ingest Dashboard</i>
     * @see AutoIngestDashboardOpenAction
     */
    static String CTL_AutoIngestDashboardOpenAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_AutoIngestDashboardOpenAction");
    }
    /**
     * @return <i>Auto Ingest Dashboard</i>
     * @see AutoIngestDashboardTopComponent
     */
    static String CTL_AutoIngestDashboardTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_AutoIngestDashboardTopComponent");
    }
    /**
     * @return <i>Warning: Path to multi-user data source is on "C:" drive</i>
     * @see ArchiveFilePanel
     */
    static String DataSourceOnCDriveError_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceOnCDriveError.text");
    }
    /**
     * @return <i>Archive Files (.zip, .rar, .arj, .7z, .7zip, .gzip, .gz, .bzip2, .tar, .tgz)</i>
     * @see ArchiveUtil
     */
    static String GeneralFilter_archiveDesc_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GeneralFilter.archiveDesc.text");
    }
    /**
     * @return <i>This job has not been prioritized.</i>
     * @see PrioritizedIconCellRenderer
     */
    static String PrioritizedIconCellRenderer_notPrioritized_tooltiptext() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PrioritizedIconCellRenderer.notPrioritized.tooltiptext");
    }
    /**
     * @return <i>This job has been prioritized. The most recently prioritized job should be processed next.</i>
     * @see PrioritizedIconCellRenderer
     */
    static String PrioritizedIconCellRenderer_prioritized_tooltiptext() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PrioritizedIconCellRenderer.prioritized.tooltiptext");
    }
    private Bundle() {}
}
