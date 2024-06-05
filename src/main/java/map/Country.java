package map;

public class Country {
    private String name;
    private String capital;
    private String imagePath;

    public Country(String name, String capital, String imagePath) {
        this.name = name;
        this.capital = capital;
        this.imagePath = imagePath;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}