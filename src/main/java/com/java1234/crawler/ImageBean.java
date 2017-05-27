package com.java1234.crawler;



import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.CssSelectorNodeFilter;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;


/**
 * Created by Ouyang on 2017/5/17.
 */
public class ImageBean {
    private String title;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static ImageBean toImageBean(String html){
        String css_class="il_img";
        try {
            Parser parser = new Parser(html);
            NodeFilter filter=new CssSelectorNodeFilter("."+css_class);
            NodeList nList=parser.extractAllNodesThatMatch(filter);
            if(nList==null||nList.size()<=1) return null;
            for (int i = 0; i < nList.size(); i ++) {
                ImageTag node_img =(ImageTag) nList.elementAt(0).getChildren().elementAt(0).getFirstChild();
                ImageBean bBean=new ImageBean();
                bBean.setUrl(node_img.getAttribute("src"));
                bBean.setTitle(node_img.getAttribute("alt")+"."+bBean.getUrl().substring(bBean.getUrl().lastIndexOf(".")+1));
                System.out.println(bBean.getTitle());
                System.out.println(bBean.getUrl());
                URLConnectionDownloader.download(bBean.getUrl(),bBean.getTitle(),"e://");
            }
            return null;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
