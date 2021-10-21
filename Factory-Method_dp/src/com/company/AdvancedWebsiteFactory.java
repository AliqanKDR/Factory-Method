package com.company;

public class AdvancedWebsiteFactory implements WebsiteBuilderFactory {
    @Override
    public WebsiteBuilder createWebsite() {
        return new AdvancedWebsiteBuilder();
    }
}
