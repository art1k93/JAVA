/**
 * 
 */
package lucene;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 


/**
 * @author Sheiko Artem
 *
 */
public abstract class News implements Comparable<News>, Serializable  {

	protected String titre, auteur;
	protected String date;
	protected String classInfo;

	public String toString() {
		
		String classInfo;
		
		classInfo = "Titre: " + titre + "\nDate : " + date + "\nAuteur : " + auteur;
		
		return classInfo;
	}
	
	News() {
		
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void saisir() {

		LocalDate d;

		System.out.print("Titre :");
		setTitre(Lire.S());

		System.out.print("Date :");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			d = LocalDate.parse(Lire.S(), formatter);
			setDate(d.format(formatter));
		} catch (DateTimeParseException e) {
			System.out.println("Error!");
		}

		System.out.print("Auteur :");
		setAuteur(Lire.S());
		
	}

	@Override
	public int compareTo(News n) {
		int comp = this.titre.compareTo(n.titre);
		if (comp < 0) {
			// System.out.println("titre is smaller than n.titre");
		} else if (comp > 0) {
			// System.out.println("titre is greater than n.titre");
		} else {
			// System.out.println("titre is equal to n.titre");
		}
		return comp;
	}

}
