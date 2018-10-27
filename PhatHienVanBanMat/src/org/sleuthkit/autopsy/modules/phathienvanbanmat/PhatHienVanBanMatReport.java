package org.sleuthkit.autopsy.modules.phathienvanbanmat;

public class PhatHienVanBanMatReport {
    private boolean isKnown;
    private String permaLink;

    public PhatHienVanBanMatReport() {
        this.isKnown = false;
    }

    public PhatHienVanBanMatReport(String permaLink) {
        this.permaLink = permaLink;
        this.isKnown = true;
    }

    public boolean isKnown() {
        return isKnown;
    }

    public String getPermaLink() {
        return permaLink;
    }
}