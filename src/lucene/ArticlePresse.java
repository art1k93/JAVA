/**
 * 
 */
package lucene;

import java.net.MalformedURLException;
import java.net.URL;

import java.io.Serializable;


/**
 * @author admin
 *
 */
public class ArticlePresse extends News implements Comparable<News>, Serializable {

	private URL source;
	private boolean isHavePaperVersion;
	
	public ArticlePresse() {
		super();
	}
	
	public URL getSource() {
		return source;
	}

	public void setSource(URL source) {
		this.source = source;
	}
	
	public boolean isHavePaperVersion() {
		return isHavePaperVersion;
	}

	public void setHavePaperVersion(boolean isHavePaperVersion) {
		this.isHavePaperVersion = isHavePaperVersion;
	}

	public void saisir() {

		String choice;
		boolean isCorrectAnswer = true;
		
		super.saisir();

		System.out.print("Source :");
		String sURL = Lire.S();
		try {
			URL uNews = new URL(sURL);
			setSource(uNews);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.print("L'article a la version papier? Y/N : ");

		do {
			choice = Lire.S();
			System.out.println(choice);
			if(choice.equals("Y") || choice.equals("y"))
			{
				isCorrectAnswer = true;
				isHavePaperVersion = true;
			}
			else if(choice.equals("N") || choice.equals("n"))
			{
				isCorrectAnswer = true;
				isHavePaperVersion = false;
			}
			else
			{
				isCorrectAnswer = false;
				System.out.print("Incorrect réponse. Essayez encore une fois svp.");
			}
		} while(isCorrectAnswer == false);
	}

	public String toString() {

		classInfo += super.toString() + "\nSource : " + source + "\n Have paper version? " + isHavePaperVersion;
		return classInfo;

	}

}
