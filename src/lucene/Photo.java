/**
 * 
 */
package lucene;

import java.io.Serializable;

/**
 * @author admin
 *
 */
public class Photo extends News implements Serializable {

	private String path, format;
	private int resolutionX, resolutionY;
	private boolean isColoured;
	
	public Photo() {
		super();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getResolutionX() {
		return resolutionX;
	}

	public void setResolutionX(int resolutionX) {
		this.resolutionX = resolutionX;
	}
	
	public int getResolutionY() {
		return resolutionY;
	}

	public void setResolutionY(int resolutionY) {
		this.resolutionY = resolutionY;
	}

	public boolean isColoured() {
		return isColoured;
	}

	public void setColoured(boolean isColoured) {
		this.isColoured = isColoured;
	}

	public void saisir() {

		String choice;
		boolean isCorrectAnswer = true;
		
		super.saisir();

		System.out.print("Path :");
		setPath(Lire.S());
		
		System.out.print("Resolution X :");
		setResolutionX(Lire.i());
		
		System.out.print("Resolution Y :");
		setResolutionY(Lire.i());
		
		System.out.print("Photo en couleur? Y/N :");

		do {
			choice = Lire.S();
			if(choice.equals("Y") || choice.equals("y"))
			{
				isCorrectAnswer = true;
				isColoured = true;
			}
			else if(choice.equals("N") || choice.equals("n"))
			{
				isCorrectAnswer = true;
				isColoured = false;
			}
			else
			{
				isCorrectAnswer = false;
				System.out.print("Incorrect réponse. Essayez encore une fois svp.");
			}
		} while(isCorrectAnswer == false);
	}
	
	@Override
	public String toString() {

		classInfo += super.toString() + "\n Path : " + path + "\nResolution X :" +
						resolutionX + "\nResolution Y :" + resolutionY + "\n En couleur? " + isColoured;
		
		return classInfo;
	}
}
