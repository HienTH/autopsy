package org.sleuthkit.autopsy.modules.phathienvanbanmat;

import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;
import org.sleuthkit.autopsy.coreutils.Version;
import org.sleuthkit.autopsy.ingest.FileIngestModule;
import org.sleuthkit.autopsy.ingest.IngestModuleFactory;
import org.sleuthkit.autopsy.ingest.IngestModuleFactoryAdapter;
import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettings;

/**
 * A factory for creating email parser file ingest module instances.
 */
@ServiceProvider(service = IngestModuleFactory.class)
public class PhatHienVanBanMatModuleFactory extends IngestModuleFactoryAdapter {

    static String getModuleName() {
        return NbBundle.getMessage(PhatHienVanBanMatModule.class,
                "PhatHienVanBanMatModule.moduleName");
    }

    static String getModuleVersion() {
        return Version.getVersion();
    }

    @Override
    public String getModuleDisplayName() {
        return getModuleName();
    }

    @Override
    public String getModuleDescription() {
        return NbBundle.getMessage(PhatHienVanBanMatModule.class,
                "PhatHienVanBanMatModule.getDesc.text");
    }

    @Override
    public String getModuleVersionNumber() {
        return getModuleVersion();
    }

    @Override
    public boolean isFileIngestModuleFactory() {
        return true;
    }

    @Override
    public FileIngestModule createFileIngestModule(IngestModuleIngestJobSettings settings) {
        try {
            return new PhatHienVanBanMatModule();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }
}