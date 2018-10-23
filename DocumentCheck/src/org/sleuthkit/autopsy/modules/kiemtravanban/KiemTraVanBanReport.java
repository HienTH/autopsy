package org.sleuthkit.autopsy.modules.kiemtravanban;

public class KiemTraVanBanReport {
    private boolean isKnown;
    private String permaLink;

    public KiemTraVanBanReport() {
        this.isKnown = false;
    }

    public KiemTraVanBanReport(String permaLink) {
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