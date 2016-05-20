/**
 * 
 */
package lucene.engine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import lucene.ArticlePresse;
import lucene.BaseDeNews;
import lucene.IndexFiles;
import lucene.Lire;
import lucene.News;
import lucene.Photo;
import lucene.SearchFiles;


/**
 * 
 * @author Sheiko Artem
 *
 */
public class CtrlMyNews {

	public static BaseDeNews bdn = null;
	
	public static void afficher_menu() {
		System.out.printf("\n1. Creer\n" + "2. Ouvrir\n" + "3. Sauvegarder\n" + "4. Inserer\n" + "5. Supprimer\n"
				+ "6. Afficher\n" + "7. Rechercher\n" + "8. Quitter\n");
	}
	
	public static void create() {
		System.out.println("\nCreer marche");
		
		bdn = new BaseDeNews();
		bdn.initialise();

		System.out.println("\nBase de news a été créée.");
	}
	
	public static void insert() throws ClassNotFoundException {
		
		int numNews, choice;
		boolean isCorrectAnswer = true;
		String type = null;
		
		System.out.println("\nInserer marche");
		
		System.out.println("Combien de documents voulez-vous créer?");
		
		numNews = Lire.i();
		
		System.out.println("Indiquez le type de documents: 1. Article press; 2. Photo.");
		
		do {
			choice = Lire.i();
			
			if(choice == 1)
			{
				isCorrectAnswer = true;
				type = "Article press";
			}
			else if(choice == 2)
			{
				isCorrectAnswer = true;
				type = "Photo";
			}
			else
			{
				isCorrectAnswer = false;
				System.out.print("Incorrect réponse. Essayez encore une fois svp.");
			}
		} while(isCorrectAnswer == false);
		
		News[] n = new News[numNews];

		for(int i = 0; i < n.length; i++){
			System.out.println("\nCreation d'objet # " + (i+1));
			
			switch(type){
			case "Article press":
				n[i] = new ArticlePresse();
				break;
			case "Photo":
				n[i] = new Photo();
				break;
			default:
				System.out.println("Error type.");
				break;
			}

			n[i].saisir();
			bdn.ajoute(n[i]);
		}
	}
	
	public static void show(){
		bdn.afficher();
	}
	
	public static void delete() {
		
		String titreToRemove;
		
		System.out.println("\nSupprimer marche");
		
		System.out.println("\nPréciser le news ce que vous voulez supprimer?");
		
		titreToRemove = Lire.S();
		
		bdn.supprimer(titreToRemove);
	}
	
	public static void open() {
		System.out.println("Ouvrir marche");
		bdn.ouvrir("ts_BaseDeNews.txt");
	}

	public static void save() {
		System.out.println("Sauvegarder marche");
		
		bdn.sauvegarder("ts_BaseDeNews.txt");
	}

	public static void addToIndex(String index_dir, String dir_to_index)
	{
		String[] args = {"-index", index_dir, "-docs", dir_to_index};

		IndexFiles.indexMain(args);
	}
	
	public static void searchInIndex(String index_dir, String query_str)
	{

		String[] args = {"-index", index_dir, "-query", query_str, "-interactive", "true"};

		try {
			SearchFiles.searchMain(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void rechercher() {
		System.out.println("Rechercher marche");
	}

	public static void quitter() {
		System.out.println("Quitter marche");
	}

}
