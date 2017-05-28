package com.java1234.crawler;

import java.util.regex.Pattern;
  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;  

import edu.uci.ics.crawler4j.crawler.Page;  
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.CssSelectorNodeFilter;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

public class ImageCrawler extends WebCrawler {  
    static Log log = LogFactory.getLog("log4j");  
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|"  
            + "|tiff?|mid|mp2|mp3|mp4" + "|wav|avi|mov|mpeg|ram|m4v|pdf"  
            + "|rm|smil|wmv|swf|wma|zip|rar|gz))$");  
  
    @Override  
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();  
        return !FILTERS.matcher(href).matches() && (href.contains("http://manhua.fzdm.com/132/116/"));
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
            Parser parser = null;
            Parser parser2 = null;
            try {
                parser = new Parser(html);
                parser2 = new Parser(html);
            } catch (ParserException e) {
                e.printStackTrace();
            }
            NodeFilter filter=new CssSelectorNodeFilter("#mhpic");
            NodeFilter filter3=new CssSelectorNodeFilter("#mhona");

            NodeList nList= null;

            NodeList nList3= null;
            try {
                nList3 = parser2.extractAllNodesThatMatch(filter3);
                nList = parser.extractAllNodesThatMatch(filter);


            } catch (ParserException e) {
                e.printStackTrace();
            }

            ImageTag node_img = (ImageTag) nList.elementAt(0);
            String page1 = "";
            for (int i = 0; i < nList3.size(); i++) {
                Node node = nList3.elementAt(i);
                if (!(node.toPlainTextString().equals("上一页")||node.toPlainTextString().equals("下一页"))) {
                    page1 = node.toPlainTextString();
                }
            }



            html = "http:"+node_img.getAttribute("src");
            System.out.println(html);
            System.out.println(node_img.getAttribute("alt"));
            System.out.println(page1);
        }  
    }

} 