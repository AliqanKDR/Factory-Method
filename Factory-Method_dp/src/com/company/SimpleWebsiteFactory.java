package com.company;

public class SimpleWebsiteFactory implements WebsiteBuilderFactory{
    @Override
    public WebsiteBuilder createWebsite() {
        return new SimpleWebsiteBuilder();
    }
}
