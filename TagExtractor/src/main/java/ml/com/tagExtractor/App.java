package ml.com.tagExtractor;

import java.io.IOException;

import com.sharethis.common.IOUtils;

import ml.com.tagExtractor.textRank.korean.TextRank;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
/*     	KoreanModel km = new KoreanModel();
    	km.tokenize();*/
    	
    	String text = null;
		try {
			TextRank tr = new TextRank();
			text = IOUtils.readFile("test/good.txt");
			tr.rank(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    }
}
