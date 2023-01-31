package forum;

import java.util.ArrayList;
import java.util.List;

public class ArticleListHandler {

	private List<Article> articleList = new ArrayList <>();
	
	public void create(String title, String creator, Integer index, Integer click) {
		Article art = new Article();
		art.setTitle(title);
		art.setCreator(creator);
		art.setIndex(index);
		art.setClick(click);
		articleList.add(art);
		
	}
	
	public void viewcount(String title, String creator, Integer index, Integer click) {
		
	}
	
	public void edit(String title, String creator, Integer index, Integer click) {
		
	}
	
	public void delete(String title, String creator, Integer index, Integer click) {
		articleList.remove(index);
	}
}
