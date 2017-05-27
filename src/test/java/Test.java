import com.java1234.crawler.ImageBean;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.CssSelectorNodeFilter;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

/**
 * Created by Ouyang on 2017/5/17.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Parser parser = new Parser("\uFEFF<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                    "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                    "<head>\n" +
                    "<title>植树节图片 植树节图片大全</title>\n" +
                    "<meta name=\"Keywords\" content=\"植树节图片 植树节图片免费下载\" />\n" +
                    "<meta name=\"description\" content=\"植树节图片 植树节图片免费下载\" />\n" +
                    "<link rel=\"miphtml\" href=\"http://m.sc.chinaz.com/mip/tag_tupian/zhishujie.html\">\n" +
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                    "<meta http-equiv=\"x-ua-compatible\" content=\"ie=7\" />\n" +
                    "<link href=\"/style/pic_all.css\" type=\"text/css\" rel=\"stylesheet\" />\n" +
                    "<link href=\"http://img.chinaz.com/max-templates/passport/styles/topbar.css\" type=\"text/css\" rel=\"Stylesheet\" />\n" +
                    "<script type=\"text/javascript\" src=\"/style/js/jquery-1.2.pack.js\"></script>\n" +
                    "<script type=\"text/javascript\" src=\"/style/js/jquery.masonry.min.js\"></script>\n" +
                    "<script type=\"text/javascript\" src=\"/style/js/mainutf8.js\"></script>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div class=\"toolbar\">\n" +
                    "    <div class=\"clearfix toolbar-inner\">\n" +
                    "        <div class=\"quicklink\">\n" +
                    "            <ul id=\"chinaz_website_links\" class=\"accesslink\">\n" +
                    "                <li><a href=\"http://www.chinaz.com\"><span>站长之家</span></a></li>\n" +
                    "                <li onmouseover=\"chinazTopBarMenu.create(this,'chinaz_website_menu_1');\" onmouseout=\"chinazTopBarMenu.clear(this);\"><a class=\"item-expand\" href=\"http://bbs.chinaz.com\" target=\"_blank\"><span>站长论坛</span></a></li>\n" +
                    "                <li onmouseover=\"chinazTopBarMenu.create(this,'chinaz_website_menu_2');\" onmouseout=\"chinazTopBarMenu.clear(this);\"><a class=\"item-expand\" href=\"http://tool.chinaz.com\" target=\"_blank\"><span>站长工具</span></a></li>\n" +
                    "                <li><a href=\"http://down.chinaz.com\" target=\"_blank\"><span>源码下载</span></a></li>\n" +
                    "                <li onmouseover=\"chinazTopBarMenu.create(this,'chinaz_website_menu_3');\" onmouseout=\"chinazTopBarMenu.clear(this);\"><a class=\"item-expand\" href=\"http://sc.chinaz.com\" target=\"_blank\"><span>站长素材</span></a></li>\n" +
                    "                <li><a href=\"http://font.chinaz.com/\" target=\"_blank\"><span>字体下载</span></a></li>\n" +
                    "                <li onmouseover=\"chinazTopBarMenu.create(this,'chinaz_website_menu_4');\" onmouseout=\"chinazTopBarMenu.clear(this);\"><a class=\"item-expand\" href=\"http://desk.chinaz.com\" target=\"_blank\"><span>电脑壁纸</span></a></li>\n" +
                    "                <li onmouseover=\"chinazTopBarMenu.create(this,'chinaz_website_menu_5');\" onmouseout=\"chinazTopBarMenu.clear(this);\"><a class=\"item-expand\" href=\"http://top.chinaz.com\" target=\"_blank\"><span>网站排行榜</span></a></li>\n" +
                    "            </ul>\n" +
                    "            <div id=\"chinaz_website_menu_1\" class=\"topbar-hiddencontents\">\n" +
                    "                <a href=\"http://bbs.chinaz.com/forum-51-1.html\" target=\"_blank\">站长俱乐部</a>\n" +
                    "                <a href=\"http://bbs.chinaz.com/forum-140-1.html\" target=\"_blank\">站长问答</a>\n" +
                    "                <a href=\"http://bbs.chinaz.com/forum-165-1.html\" target=\"_blank\">网站建设资源</a>\n" +
                    "                <a href=\"http://bbs.chinaz.com/forum-167-1.html\" target=\"_blank\">站长交易赚钱</a> \n" +
                    "            </div>\n" +
                    "            <div id=\"chinaz_website_menu_2\" class=\"topbar-hiddencontents\">\n" +
                    "                <a href=\"http://alexa.chinaz.com\" target=\"_blank\">ALEXA排名查询</a>\n" +
                    "                <a href=\"http://rank.chinaz.com/\" target=\"_blank\">百度权重查询</a>\n" +
                    "                <a href=\"http://seo.chinaz.com\" target=\"_blank\">SEO概况查询</a>\n" +
                    "                <a href=\"http://link.chinaz.com\" target=\"_blank\">友情链接查询</a>\n" +
                    "                <a href=\"http://pr.chinaz.com\" target=\"_blank\">Google PR查询</a>\n" +
                    "                <a href=\"http://whois.chinaz.com\" target=\"_blank\">Whois信息查询</a>\n" +
                    "                <a href=\"http://icp.chinaz.com/\" target=\"_blank\">域名备案查询</a>\n" +
                    "            </div>\n" +
                    "            <div id=\"chinaz_website_menu_3\" class=\"topbar-hiddencontents\">\n" +
                    "                <a href=\"http://sc.chinaz.com/tupian/\" target=\"_blank\">高清图片</a>\n" +
                    "                <a href=\"http://sc.chinaz.com/shiliang/\" target=\"_blank\">矢量素材</a>\n" +
                    "                <a href=\"http://sc.chinaz.com/jianli/\" target=\"_blank\">简历模板</a>\n" +
                    "                <a href=\"http://sc.chinaz.com/ppt/\" target=\"_blank\">PPT模板</a>\n" +
                    "                <a href=\"http://sc.chinaz.com/psd/\" target=\"_blank\">PSD素材</a>\n" +
                    "            </div>\n" +
                    "            <div id=\"chinaz_website_menu_4\" class=\"topbar-hiddencontents\">\n" +
                    "                <a href=\"http://desk.chinaz.com/shouji\" target=\"_blank\">手机壁纸</a>\n" +
                    "                <a href=\"http://desk.chinaz.com/ipad/\" target=\"_blank\">Ipad壁纸</a>\n" +
                    "                <a href=\"http://desk.chinaz.com/zhutixiazai/xpzhuti.html\" target=\"_blank\">XP主题</a>\n" +
                    "                <a href=\"http://desk.chinaz.com/zhutixiazai/win7zhuti.html\" target=\"_blank\">WIN7主题</a>\n" +
                    "            </div>\n" +
                    "            <div id=\"chinaz_website_menu_5\" class=\"topbar-hiddencontents\">\n" +
                    "                <a href=\"http://top.chinaz.com/hangye/\" target=\"_blank\">行业网站排名</a>\n" +
                    "                <a href=\"http://top.chinaz.com/diqu/\" target=\"_blank\">地区网站排名</a>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "        <div id=\"chinaz_topbar\"></div>\n" +
                    "        </div>\n" +
                    "        </div>\n" +
                    "        <div class=\"all_wrap\">\n" +
                    "        <div class=\"banner\">\n" +
                    "        \t <div class=\"logo\">\n" +
                    "                <a href='http://sc.chinaz.com'><span>站长素材</span></a>\n" +
                    "             </div>\n" +
                    "            <div class=\"gg1\" style=\"margin-left: 130px\">\n" +
                    "<script type=\"text/javascript\">\n" +
                    "    var cpro_id = \"u2312314\";\n" +
                    "</script>\n" +
                    "<script src=\"http://cpro.baidustatic.com/cpro/ui/c.js\" type=\"text/javascript\"></script>\n" +
                    "        </div>\n" +
                    "        </div>\n" +
                    "        <div class=\"nav\">\n" +
                    "        \t<ul>\n" +
                    "            \t<li class=\"index_list\">\n" +
                    "                     <a href=\"/\" target=\"_blank\">素材首页</a>\n" +
                    "                </li>\n" +
                    "                <li class=\"nos\">\n" +
                    "                    <a href=\"/shiliang/\" target=\"_blank\">矢量</a>\n" +
                    "                \t<a href=\"/tupian/\" target=\"_blank\">高清图片</a>\n" +
                    "                    <a href=\"/tubiao/\" target=\"_blank\">图标</a>\n" +
                    "                    <a href=\"/psd/\" target=\"_blank\">PSD素材</a>\n" +
                    "                </li>\n" +
                    "                 <li class=\"nos no2\">\n" +
                    "                \t<a href=\"http://font.chinaz.com/\" target=\"_blank\">字体</a>\n" +
                    "                    <a href=\"http://font.chinaz.com/zhongwenziti.html\" target=\"_blank\">中文字体</a>\n" +
                    "                    <a href=\"http://font.chinaz.com/yingwenziti.html\" target=\"_blank\">英文字体</a>\n" +
                    "                    <a href=\"/yinxiao/\" target=\"_blank\">音效</a>\n" +
                    "                    <a href=\"/donghua/\" target=\"_blank\">Flash动画</a>\n" +
                    "                    <a href=\"/biaoqing/\" target=\"_blank\">QQ表情 </a>\n" +
                    "                </li>\n" +
                    "                 <li class=\"nos no3\">\n" +
                    "                \t<a href=\"/moban/\" target=\"_blank\">网页模板</a>\n" +
                    "                    <a href=\"/3D/\" target=\"_blank\">3D模型</a>\n" +
                    "                    <a href=\"/ppt/\" target=\"_blank\">PPT模板</a>\n" +
                    "\t\t\t\t\t<a href=\"/jianli/\" target=\"_blank\">简历模板</a>\n" +
                    "                    <a href=\"/jiaoben/\" target=\"_blank\">脚本代码</a>\n" +
                    "                    <a href=\"/tag_jiaoben/jquery.html\" target=\"_blank\">JQuery </a>\n" +
                    "                </li>\n" +
                    "                  <li class=\"nos no4\">  \n" +
                    "                  <a style=\"\" href=\"http://sc.chinaz.com/ppt/gerenjianlipptmoban.html\" target=\"_blank\">个人简历PPT</a>\n" +
                    "\t\t\t\t\t<a style=\"color:#ff6622;font-weight:bold;margin-top:-3px;\" href=\"http://tu.chinaz.com/\" target=\"_blank\">商用图片<i style=\"font-style:normal;font-size:14px;\">↓</i></a>\n" +
                    "                    <a style=\"\" href=\"http://sc.chinaz.com/ppt/zongjie.html\" target=\"_blank\">工作总结PPT</a>\n" +
                    "\t\t\t\t\t<a style=\"\" href=\"http://sc.chinaz.com/jianli/shangye.html\" target=\"_blank\">商业简历</a>\n" +
                    "                </li>\n" +
                    "                 <li class=\"nos no5\">\n" +
                    "                    <a href=\"http://sc.chinaz.com/info/\" target=\"_blank\">素材资讯</a>\n" +
                    "                \t<a href=\"http://sc.chinaz.com/kuzhan/\" target=\"_blank\">酷站欣赏</a>\n" +
                    "                \t<a href=\"http://sc.chinaz.com/zhuanti/\" target=\"_blank\">节日专题</a>\n" +
                    "                    <a href=\"http://desk.chinaz.com/\" target=\"_blank\">壁纸主题</a>\n" +
                    "                    <a href=\"http://sc.chinaz.com/hezuo.html\" target=\"_blank\">商务合作</a>\n" +
                    "                    <a href=\"http://sc.chinaz.com/new/\" target=\"_blank\">最新更新</a>\n" +
                    "                </li>\n" +
                    "            </ul>\n" +
                    "        </div>        \n" +
                    "        <div class=\"new_search\">\n" +
                    "        \t<div class=\"left\">\n" +
                    "           \t\t<span>快速导航</span>\n" +
                    "                <a href=\"http://sc.chinaz.com/3D/\" class=\"max\" target=\"_blank\"><span>3d</span></a>\n" +
                    "            \t<a href=\"/tupian/\" class=\"jpg\" target=\"_blank\"><span class=\"active\">jpg</span></a>\n" +
                    "                <a href=\"/psd/\" class=\"psd\" target=\"_blank\"><span>psd</span></a>\n" +
                    "                <a href=\"/shiliang/\" class=\"ai\" target=\"_blank\"><span>ai</span></a>\n" +
                    "                <a href=\"/shiliang/\" class=\"eps\" target=\"_blank\"><span>eps</span></a>\n" +
                    "                <a href=\"/shiliang/\" class=\"cdr\" target=\"_blank\"><span>cdr</span></a>\n" +
                    "                <a href=\"/ppt/\" class=\"ppt\" target=\"_blank\"><span>ppt</span></a>\n" +
                    "                <a href=\"http://font.chinaz.com/\" class=\"ttf\" target=\"_blank\"><span>ttf</span></a>\n" +
                    "                <a href=\"/moban/\" class=\"htmls\" target=\"_blank\"><span>html</span></a>\n" +
                    "                <a href=\"/tubiao/\" class=\"png\" target=\"_blank\"><span>png</span></a>\n" +
                    "                <a href=\"/yinxiao/\" class=\"mp3\" target=\"_blank\"><span>mp3</span></a>\n" +
                    "                <a href=\"/donghua/\" class=\"fla\" target=\"_blank\"><span>fla</span></a>\n" +
                    "                <a href=\"/donghua/\" class=\"swf\" target=\"_blank\"><span>swf</span></a>\n" +
                    "                <a href=\"/biaoqing/\" class=\"gif\" target=\"_blank\"><span>gif</span></a>\n" +
                    "            </div>\n" +
                    "            <div class=\"right\">\n" +
                    "                <form id=\"searchform\" name=\"searchform\" method=\"get\" action=\"http://aspx.sc.chinaz.com/query.aspx\" target=\"_blank\" onsubmit=\"return checkForm(this);\">\n" +
                    "                <input name=\"keyword\" type=\"text\" value=\"\" class=\"text\" />\n" +
                    "                <input name=\"classID\" type=\"hidden\" id=\"classID\" value=\"11\" />\n" +
                    "                <input name=\"\" type=\"submit\" class=\"btn\" value=\"\" />\n" +
                    "                </form>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "        <div class=\"advert\" style=\" margin-top:5PX\">\n" +
                    "<script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
                    "<ins class=\"adsbygoogle\"\n" +
                    "     style=\"display:inline-block;width:970px;height:90px\"\n" +
                    "     data-ad-client=\"ca-pub-4194977297280070\"\n" +
                    "     data-ad-slot=\"6169719246\"></ins>\n" +
                    "<script>\n" +
                    "(adsbygoogle = window.adsbygoogle || []).push({});\n" +
                    "</script>\n" +
                    "<script type=\"text/javascript\">\n" +
                    "        document.write('<a style=\"display:none!important\" id=\"tanx-a-mm_16135210_3475628_33924008\"></a>');\n" +
                    "        tanx_s = document.createElement(\"script\");\n" +
                    "        tanx_s.type = \"text/javascript\";\n" +
                    "        tanx_s.charset = \"gbk\";\n" +
                    "        tanx_s.id = \"tanx-s-mm_16135210_3475628_33924008\";\n" +
                    "        tanx_s.async = true;\n" +
                    "        tanx_s.src = \"http://p.tanx.com/ex?i=mm_16135210_3475628_33924008\";\n" +
                    "        tanx_h = document.getElementsByTagName(\"head\")[0];\n" +
                    "        if(tanx_h)tanx_h.insertBefore(tanx_s,tanx_h.firstChild);\n" +
                    "</script>\n" +
                    "        \t</div>  \n" +
                    "\t<div class=\"active_dq\">\n" +
                    "            <p>您当前位置：<a href=\"http://sc.chinaz.com/\">站长素材</a> >><a target=\"_blank\" href=\"/tupian/\">图片</a> >><a href=\"/tag_tupian/zhishujie.html\" >植树节图片</a></p><div class=\"bread_right\"><div id=\"tagwz\"></div></div>\n" +
                    "        </div>\n" +
                    "        <!--标签内容-->\n" +
                    "        <div class=\"text\">\n" +
                    "        <div class=\"text\">\n" +
                    "        <div class=\"tagsbox\"><i></i>\n" +
                    "        <p class=\"tags_a\">\n" +
                    "\n" +
                    "<a style=\"color:#C09\" target=\"_blank\" title=\"可爱图片\" href=\"/tupian/keaitupian.html\">可爱图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/beijingtupian.html\">背景图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/meinvxiezhen.html\">美女写真</a>\n" +
                    "<a style=\"color:#C09\" target=\"_blank\" href=\"/tupian/gougoutupian.html\">狗狗图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/dongman.html\">动漫图片</a>\n" +
                    "<a target=\"_blank\" title=\"美甲图片\" href=\"/tupian/meijia.html\">美甲图片</a>\n" +
                    "<a style=\"color:#36F\" target=\"_blank\"href=\"/tupian/shanggan.html\">伤感图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/dongman.html\">动漫图片</a>\n" +
                    "<a style=\"color:#C00\" target=\"_blank\" href=\"/tupian/omeitupian.html\">欧美图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tag_tupian/RiBenMeiNv.html\">日本美女图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/dangaotupian.html\">蛋糕图片</a>\n" +
                    "<a style=\"color:#36F\" target=\"_blank\" href=\"/tupian/kongbutupian.html\">恐怖图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/linglei.html\">另类图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/faxingtupian.html\">发型图片</a>\n" +
                    "<a style=\"color:#C00\" target=\"_blank\" href=\"/tag_tupian/SiWa.html\">丝袜图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tupian/shuaigetupian.html\">帅哥图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tag_tupian/GuFeng.html\">古风图片</a>\n" +
                    "<a target=\"_blank\" href=\"/tag_tupian/JiQing.html\">激情图片</a>\n" +
                    "<a style=\"color:#ee8600\" target=\"_blank\" href=\"/tag_tupian/MeiTun.html\">美臀图片</a>\n" +
                    "<a style=\"color:#ee8600\" target=\"_blank\" href=\"/tupian/feizhuliutupian.html\">非主流图片</a>\n" +
                    "        </p>\n" +
                    "        </div>\n" +
                    "\n" +
                    "        <div class=\"text_left text_leftbq\">\n" +
                    "                <div id=\"container\" class=\"clearfix imgload\">\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:285px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170314337491.htm\" alt=\"关于植树节的图片\">\n" +
                    "                <img src2=\"http://pic.sc.chinaz.com/Files/pic/pic9/201703/zzpic1954_s.jpg\" alt=\"关于植树节的图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170314337491.htm\" alt=\"关于植树节的图片\">关于植树节的图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:161px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170313159135.htm\" alt=\"植树节手抄报版面设计\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1940_s.jpg\" alt=\"植树节手抄报版面设计\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170313159135.htm\" alt=\"植树节手抄报版面设计\">植树节手抄报版面设计</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:285px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170311268442.htm\" alt=\"植树节卡通绿色背景图片\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1895_s.jpg\" alt=\"植树节卡通绿色背景图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170311268442.htm\" alt=\"植树节卡通绿色背景图片\">植树节卡通绿色背景图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:123px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170308183420.htm\" alt=\"植树节手抄报花边图片\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1803_s.jpg\" alt=\"植树节手抄报花边图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170308183420.htm\" alt=\"植树节手抄报花边图片\">植树节手抄报花边图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:164px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170307402373.htm\" alt=\"3.12植树节手抄报简单\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1764_s.jpg\" alt=\"3.12植树节手抄报简单\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170307402373.htm\" alt=\"3.12植树节手抄报简单\">3.12植树节手抄报简单</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:156px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170305517375.htm\" alt=\"绿色植树节背景素材\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1736_s.jpg\" alt=\"绿色植树节背景素材\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170305517375.htm\" alt=\"绿色植树节背景素材\">绿色植树节背景素材</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:150px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170303298204.htm\" alt=\"六年级植树节手抄报\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201703/zzpic1693_s.jpg\" alt=\"六年级植树节手抄报\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170303298204.htm\" alt=\"六年级植树节手抄报\">六年级植树节手抄报</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:155px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170301512302.htm\" alt=\"植树节手抄报版面设计\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201702/zzpic1613_s.jpg\" alt=\"植树节手抄报版面设计\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170301512302.htm\" alt=\"植树节手抄报版面设计\">植树节手抄报版面设计</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:273px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170228228780.htm\" alt=\"312植树节卡通素材\">\n" +
                    "                <img src2=\"http://pic2.sc.chinaz.com/Files/pic/pic9/201702/zzpic1581_s.jpg\" alt=\"312植树节卡通素材\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170228228780.htm\" alt=\"312植树节卡通素材\">312植树节卡通素材</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:157px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170227159131.htm\" alt=\"2017植树节手抄报\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1540_s.jpg\" alt=\"2017植树节手抄报\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170227159131.htm\" alt=\"2017植树节手抄报\">2017植树节手抄报</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:158px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170225473584.htm\" alt=\"三年级植树节手抄报\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1519_s.jpg\" alt=\"三年级植树节手抄报\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170225473584.htm\" alt=\"三年级植树节手抄报\">三年级植树节手抄报</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:156px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170224101290.htm\" alt=\"手抄报植树节图片\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1485_s.jpg\" alt=\"手抄报植树节图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170224101290.htm\" alt=\"手抄报植树节图片\">手抄报植树节图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:156px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170223305494.htm\" alt=\"小学生植树节手抄报图片\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1459_s.jpg\" alt=\"小学生植树节手抄报图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170223305494.htm\" alt=\"小学生植树节手抄报图片\">小学生植树节手抄报图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:290px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170222049862.htm\" alt=\"3.12植树节宣传海报图片\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1421_s.jpg\" alt=\"3.12植树节宣传海报图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170222049862.htm\" alt=\"3.12植树节宣传海报图片\">3.12植树节宣传海报图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:288px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170221347172.htm\" alt=\"3.12植树节海报图片\">\n" +
                    "                <img src2=\"http://pic.sc.chinaz.com/Files/pic/pic9/201702/zzpic1379_s.jpg\" alt=\"3.12植树节海报图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170221347172.htm\" alt=\"3.12植树节海报图片\">3.12植树节海报图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:164px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170220247455.htm\" alt=\"植树节卡通海报图片\">\n" +
                    "                <img src2=\"http://pic.sc.chinaz.com/Files/pic/pic9/201702/zzpic1322_s.jpg\" alt=\"植树节卡通海报图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170220247455.htm\" alt=\"植树节卡通海报图片\">植树节卡通海报图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:210px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170216164540.htm\" alt=\"植树节图片卡通\">\n" +
                    "                <img src2=\"http://pic.sc.chinaz.com/Files/pic/pic9/201702/zzpic1149_s.jpg\" alt=\"植树节图片卡通\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170216164540.htm\" alt=\"植树节图片卡通\">植树节图片卡通</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:151px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170215255202.htm\" alt=\"植树节绿色环保手抄报\">\n" +
                    "                <img src2=\"http://pic.sc.chinaz.com/Files/pic/pic9/201702/zzpic1247_s.jpg\" alt=\"植树节绿色环保手抄报\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170215255202.htm\" alt=\"植树节绿色环保手抄报\">植树节绿色环保手抄报</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:156px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170215105072.htm\" alt=\"植树节手抄报图片\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1097_s.jpg\" alt=\"植树节手抄报图片\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170215105072.htm\" alt=\"植树节手抄报图片\">植树节手抄报图片</a></p></div>\n" +
                    "                \n" +
                    "                <div class=\"box picblock col3\" style=\"width:186px;height:163px\"><div>\n" +
                    "                <a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170214545562.htm\" alt=\"六年级植树节手抄报\">\n" +
                    "                <img src2=\"http://pic1.sc.chinaz.com/Files/pic/pic9/201702/zzpic1217_s.jpg\" alt=\"六年级植树节手抄报\">\n" +
                    "                </a></div>\n" +
                    "                <p><a target=\"_blank\" href=\"http://sc.chinaz.com/tupian/170214545562.htm\" alt=\"六年级植树节手抄报\">六年级植树节手抄报</a></p></div>\n" +
                    "                \n" +
                    "                </div>\n" +
                    "\t\t\t<div class=\"clear\"></div>\n" +
                    "\t\t</div>\n" +
                    "\t\t<div class=\"clear\"></div>\n" +
                    "\t</div>\n" +
                    "        <!--end 标签内容-->\n" +
                    "        <div class=\"fybg\">\n" +
                    "                    <div class=\"fenye\">\n" +
                    "                    <a class=\"backpage grey\">上一页</a><a href=\"javascript:;\" class='active'><b>1</b></a> <a href=\"zhishujie_2.html\"><b>2</b></a><a href=\"zhishujie_3.html\"><b>3</b></a><a href=\"zhishujie_4.html\"><b>4</b></a><a href=\"zhishujie_2.html\" class=\"nextpage\">下一页</a>转到第 <input name=\"tbpage\" id=\"tbpage\" type=\"text\" onkeydown=\"if(event.keyCode==13){ event.keyCode=9; document.getElementById('btngo').click();}\" size=\"3\"> 页 <input type=\"submit\" id=\"btngo\" onclick=\"return btngoUrl('tbpage','zhishujie','4')\" value=\"跳转\">\n" +
                    "                    </div>\n" +
                    "            <div class=\"clear\"></div>\n" +
                    "\t\t</div>\n" +
                    "\t\t<script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
                    "<ins class=\"adsbygoogle\"\n" +
                    "     style=\"display:inline-block;width:980px;height:120px\"\n" +
                    "     data-ad-client=\"ca-pub-4194977297280070\"\n" +
                    "     data-ad-slot=\"4666782841\"></ins>\n" +
                    "<script>\n" +
                    "(adsbygoogle = window.adsbygoogle || []).push({});\n" +
                    "</script>\n" +
                    "    </div>\n" +
                    "        <script type=\"text/javascript\" src=\"/style/js/lazyload.js\"></script>\n" +
                    "    <div class=\"foodte\">\n" +
                    "        <div class=\"bot_dh\">\n" +
                    "              <a href=\"http://www.chinaz.com/aboutus/index.html\" class=\"hui333\" target=\"_blank\">关于站长之家</a> - \n" +
                    "               <a href=\"http://ww.chinaz.com/aboutus/contact.php?from=sc\" class=\"hui333\" target=\"_blank\">联系我们(电话)</a> - \n" +
                    "               <a href=\"http://www.chinaz.com/aboutus/ad.html\" class=\"hui333\" target=\"_blank\">广告服务</a> - \n" +
                    "               <a href=\"http://www.chinaz.com/aboutus/announce.html\" class=\"hui333\" target=\"_blank\">版权声明</a> - \n" +
                    "               <a href=\"http://sc.chinaz.com/link.html\" class=\"hui333\" target=\"_blank\">友情链接</a> - \n" +
                    "               <a href=\"http://sc.chinaz.com/ditu.html\" class=\"hui333\" target=\"_blank\">栏目地图</a> - \n" +
                    "               <a href=\"http://sc.chinaz.com/bangzhu.html\" class=\"hui333\" target=\"_blank\">帮助说明</a>\n" +
                    "        </div>\n" +
                    "        <div class=\"banquan\">\t\t\n" +
                    "\t\t\t  <p>&copy; CopyRight 2002-2017, <a href=\"http://www.chinaz.com\">CHINAZ.COM</a>, Inc.All Rights Reserved. <script src=\"http://s4.cnzz.com/stat.php?id=300636&web_id=300636\" language=\"JavaScript\"></script></p>\t\n" +
                    "\t\t    </div>\n" +
                    "        </div>\n" +
                    "        <script type=\"text/javascript\" src=\"http://stats.chinaz.com/sc_images/sc_s.js\"></script>\n" +
                    "        <script type=\"text/javascript\" src=\"http://my.chinaz.com/js/uc.js\" charset=\"utf-8\"></script>\n" +
                    "\n" +
                    "    \n" +
                    "<div style=\"display:none\">\n" +
                    "<script src=\"http://s23.cnzz.com/stat.php?id=3435928&web_id=3435928\" language=\"JavaScript\"></script>\n" +
                    "</div>\n" +
                    "<script>window._bd_share_config={\"common\":{\"bdSnsKey\":{},\"bdText\":\"\",\"bdMini\":\"2\",\"bdMiniList\":false,\"bdPic\":\"\",\"bdStyle\":\"0\",\"bdSize\":\"16\"},\"slide\":{\"type\":\"slide\",\"bdImg\":\"2\",\"bdPos\":\"left\",\"bdTop\":\"2\"}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>\n" +
                    "</body>\n" +
                    "</html>");
            System.out.println(parser);
            NodeFilter filter=new CssSelectorNodeFilter(".image_gall");
            NodeList nList=parser.extractAllNodesThatMatch(filter);
            LinkTag node_a=(LinkTag) nList.elementAt(1);
            ImageTag node_img=(ImageTag) node_a.getFirstChild();
            ImageBean bBean=new ImageBean();
            bBean.setTitle(node_a.getAttribute("title"));
            bBean.setUrl(node_img.getAttribute("src"));
        } catch (ParserException e) {
            e.printStackTrace();
        }
    }
}
