package ProxyPattern;

/**
 * 客户端测试类
 */
public class ProgramClient {
    public static void main(String[] args) {
//        ProxySearcher proxySearcher = new ProxySearcher();
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        assert searcher != null;
        searcher.doSearch("杨过", "玉女心经");
    }
}
