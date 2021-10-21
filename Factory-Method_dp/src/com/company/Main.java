package com.company;

public class Main {

    public static void main(String[] args) {

       WebsiteBuilderFactory websiteBuilderFactory = websiteBuilder("Advanced");
       WebsiteBuilder websiteBuilder = websiteBuilderFactory.createWebsite();

       websiteBuilder.buildWebsite();
    }

    static WebsiteBuilderFactory websiteBuilder (String website){
        if(website.equalsIgnoreCase("Advanced")){
            return new AdvancedWebsiteFactory();
        }else if (website.equalsIgnoreCase("Simple")){
            return new SimpleWebsiteFactory();
        }else {
            throw new RuntimeException("error!!!!!");
        }
    }
}
