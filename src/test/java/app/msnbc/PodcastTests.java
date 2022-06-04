package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PodcastTests extends CommonAPI {

    @Test
    public void firstPodcast1(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='Podcasts']");
        click("//span[text()='American Radical']");
        Assert.assertEquals("American Radical: an MSNBC original podcast",getPageTitle());
    }

    @Test
    public void podcastOnApplePodcasts(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='Podcasts']");
        click("//span[text()='American Radical']");
        click("//li[@class='styles_linkListItem__aVGnJ'][1]");
        Assert.assertEquals("American Radical on Apple Podcasts",getPageTitle());
    }

    @Test
    public void podcastOnSpotify(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='Podcasts']");
        click("//span[text()='American Radical']");
        click("//li[@class='styles_linkListItem__aVGnJ'][2]");
        Assert.assertEquals("| Podcast on Spotify",getPageTitle());
    }

    @Test
    public void listenPodcast(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='Podcasts']");
        click("//span[text()='American Radical']");
        click("//span[text()='Introducing: American Radical']");
        waitFor(1);
        click("(//button[@aria-label='Play'])[1]");
        Assert.assertEquals("American Radical",getPageTitle());
    }



}
