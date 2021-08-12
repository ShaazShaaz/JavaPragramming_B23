package Day16;

public class WebName {
    public static void main(String[] args) {
        String url="www.amazon.com";
        // get the amazon out of the url
        int beginningIndex=url.indexOf(".")+1;
        int endingIndex=url.lastIndexOf(".");

        String name=url.substring(beginningIndex,endingIndex);
        System.out.println(name);

    }
}
