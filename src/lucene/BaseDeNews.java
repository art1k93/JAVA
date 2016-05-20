package lucene;

import java.util.Iterator;
import java.util.TreeSet;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BaseDeNews implements Serializable {

	private TreeSet<News> ts = null;

	public void initialise() {
		ts = new TreeSet<News>();
	}

	public TreeSet<News> getTs() {
		return ts;
	}

	public void setTs(TreeSet<News> ts) {
		this.ts = ts;
	}

	public void ajoute(News n) {
		ts.add(n);
	}

	public void afficher() {
		Iterator itr = ts.iterator();

		while (itr.hasNext()) {
			News myN = (News) itr.next();
			System.out.println(myN);
		}
	}

	public void supprimer(String titreToRemove) {
		int comp;

		for (News n : ts) {
			comp = titreToRemove.compareTo(n.getTitre());
			if (comp == 0) {
				ts.remove(n);
				break;
			}
		}
	}

	public void sauvegarder(String nomDeFichier) {
		try {
			FileOutputStream w = new FileOutputStream(nomDeFichier);
			ObjectOutputStream o = new ObjectOutputStream(w);
			o.writeObject(ts);
			o.close();
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ouvrir(String nomDeFichier) {
		try {
			FileInputStream r = new FileInputStream(nomDeFichier);
			ObjectInputStream o = new ObjectInputStream(r);
			Object lu = o.readObject();
			setTs((TreeSet<News>) lu);
			o.close();
			r.close();
		} catch (Exception e) {
			System.out.println("Erreur d’entrée-sortie");
		}
	}

}
