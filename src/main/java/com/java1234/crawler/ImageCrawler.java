package com.java1234.crawler;

import java.util.regex.Pattern;
  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;  

import edu.uci.ics.crawler4j.crawler.Page;  
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;  
  
public class ImageCrawler extends WebCrawler {  
    static Log log = LogFactory.getLog("log4j");  
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|"  
            + "|tiff?|mid|mp2|mp3|mp4" + "|wav|avi|mov|mpeg|ram|m4v|pdf"  
            + "|rm|smil|wmv|swf|wma|zip|rar|gz))$");  
  
    @Override  
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();  
        return !FILTERS.matcher(href).matches() && (href.contains("http://www.ivsky.com/tupian/"));
//      return !FILTERS.matcher(href).matches() && (href.startsWith("http://sc.chinaz.com/tupian/"));  
    }  
  
    @Override  
    public void visit(Page page) {  
        String url = page.getWebURL().getURL();  
        log.info("URL: " + url);  
        if (page.getParseData() instanceof HtmlParseData) {  
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();  
            String html = htmlParseData.getHtml();
            if(html.startsWith("\uFEFF")){
                html = html.replace("\uFEFF", "");
            }
            ImageBean iBean = ImageBean.toImageBean(html);  
            if(iBean==null) return;  
            log.info(iBean.toString());
        }  
    }

} 